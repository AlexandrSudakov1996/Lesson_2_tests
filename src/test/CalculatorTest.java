package test;

import demo.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sumTest() {
        assertEquals(4, Calculator.sum(2, 2));
        assertNotEquals(5, Calculator.sum(2, 2));

        assertEquals(-1, Calculator.sum(-2, 1));
        assertNotEquals(0, Calculator.sum(-2, 1));
    }

    @Test
    void subTest() {
        assertEquals(0, Calculator.sub(2, 2));
        assertNotEquals(1, Calculator.sub(2, 2));

        assertEquals(-3, Calculator.sub(2, 5));
        assertNotEquals(0, Calculator.sub(2, 5));
    }

    @Test
    void mulTest() {
        assertEquals(6, Calculator.mul(2, 3));
        assertNotEquals(5, Calculator.mul(2, 3));

        assertEquals(0, Calculator.mul(10, 0));
        assertNotEquals(1, Calculator.mul(10, 0));
    }

    @Test
    void divTest() {
        assertEquals(2.0, Calculator.div(4, 2),0.1);
        assertNotEquals(3.0, Calculator.div(4, 2),0.1);

        assertEquals(3.5, Calculator.div(7, 2),0.1);
        assertNotEquals(4.0, Calculator.div(7, 2),0.1);

        assertTrue(Double.isNaN(Calculator.div(5, 0)));
    }

}