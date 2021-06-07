package com.bishojo.designpatterns.bridge;

import com.bishojo.designpatterns.bridge.workshop.Assembly;
import com.bishojo.designpatterns.bridge.workshop.Production;
import com.bishojo.designpatterns.bridge.workshop.Workshop;
import com.bishojo.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.*;

public class BikeTest extends AbstractStreamTest {

    private final Workshop production = mock(Production.class);
    private final Workshop assembly = mock(Assembly.class);
    private final Vehicle bike = new Bike(production, assembly);

    @Test
    public void testSuperConstructorCalled() {
        Assertions.assertSame(bike.assembly, assembly);
        Assertions.assertSame(bike.production, production);
    }

    @Test
    public void testManufacture() {
        bike.manufacture();

        verify(production, times(1)).work();
        verify(assembly, times(1)).work();

        Assertions.assertTrue(outContent.toString().trim().contains("Bike is getting manufactured..."));
    }
}
