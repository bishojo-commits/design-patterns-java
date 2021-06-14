package com.bishojo.principles.open_closed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {
    private final AreaCalculator calculator = new AreaCalculator();

    @Test
    public void testCalculateCircleArea() {
        Shape circle = new Circle(5.00);
        double area = Math.round(calculator.calculateArea(circle));

        Assertions.assertEquals(79.0, area);
    }

    @Test
    public void testCalculateRectangleArea() {
        Shape rectangle = new Rectangle(5.00, 6.00);
        double area = calculator.calculateArea(rectangle);

        Assertions.assertEquals(30.0, area);
    }
}
