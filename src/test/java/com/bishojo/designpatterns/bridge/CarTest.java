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

public class CarTest extends AbstractStreamTest {

    private final Workshop production = mock(Production.class);
    private final Workshop assembly = mock(Assembly.class);
    private final Vehicle car = new Car(production, assembly);

    @Test
    public void testSuperConstructorCalled() {
        Assertions.assertSame(car.assembly, assembly);
        Assertions.assertSame(car.production, production);
    }

    @Test
    public void testManufacture() {
        car.manufacture();

        verify(production, times(1)).work();
        verify(assembly, times(1)).work();

        Assertions.assertTrue(outContent.toString().trim().contains("Car is getting manufactured..."));
    }
}
