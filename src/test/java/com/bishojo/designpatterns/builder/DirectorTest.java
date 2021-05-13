package com.bishojo.designpatterns.builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class DirectorTest {
    private final BuilderInterface builder = mock(BuilderInterface.class);
    private final Director director = new Director();

    @BeforeEach
    public void setUp() {
        director.construct(builder);
    }

    @Test
    public void testBuilderMethodsHaveBeenCalled() {
        verify(builder, times(1)).buildBody();
        verify(builder, times(1)).addHeadlights();
        verify(builder, times(1)).insertWheels();
    }
}
