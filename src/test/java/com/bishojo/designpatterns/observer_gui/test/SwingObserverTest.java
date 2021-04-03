package com.bishojo.designpatterns.observer_gui.test;

import com.bishojo.designpatterns.observer_gui.SwingObserver;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.fixture.JButtonFixture;
import org.assertj.swing.junit.testcase.AssertJSwingJUnitTestCase;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SwingObserverTest extends AssertJSwingJUnitTestCase {

    private FrameFixture window;
    protected final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    protected final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Override
    protected void onSetUp() {
        SwingObserver example = GuiActionRunner.execute(SwingObserver::new);
        window = new FrameFixture(robot(), example);
        window.show();
    }

    @Override
    protected void onTearDown() {
        window.cleanUp();
    }

    @Test
    @DisplayName("testActionListenersWork")
    public void testActionListenersWork() {
        JButtonFixture sidiButton = window.button("sidiButton");
        sidiButton.click();
        Assertions.assertEquals(
                "No, don't do it. It's better.Yes, do it.",
                outContent.toString().trim()
        );
    }
}
