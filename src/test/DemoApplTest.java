package test;

import demo.DemoAppl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoApplTest {
    int[] numbers = {10, 20, 30, 40, 50};
    int[] single = {100};
    int[] negative = {-10, -20, -30, -40, -50};
    int[] empty = {};

    @BeforeAll
    static void setBefore() {
        System.out.println("@ Before All");
    }

    @BeforeEach
    void setUp() {
        System.out.println("@ Before each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@ After Each");
    }

    @AfterAll
    static void testAfterAll() {
        System.out.println("@ Test After All");
    }


    @Test
    void sumArrayPositiveCase() {
        assertEquals(150, DemoAppl.sumArray(numbers));
        assertEquals(100, DemoAppl.sumArray(single));
        assertEquals(-150, DemoAppl.sumArray(negative));
        assertEquals(0, DemoAppl.sumArray(empty));
    }

    @Test
    void sumArrayNegativeCase() {
        assertThrows(NullPointerException.class, () -> DemoAppl.sumArray(null));
        assertNotEquals(100, DemoAppl.sumArray(numbers));
        assertNotEquals(1, DemoAppl.sumArray(single));
        assertNotEquals(150, DemoAppl.sumArray(negative));
        assertNotEquals(100, DemoAppl.sumArray(empty));
    }

    @Test
    void averagePositiveCase() {
        double avg1 = DemoAppl.average(numbers);
        double avg2 = DemoAppl.average(single);
        double avg3 = DemoAppl.average(negative);

        assertEquals(30., avg1, 0.001);
        assertEquals(100., avg2, 0.001);
        assertEquals(-30., avg3, 0.001);

    }

    @Test
    void averageBugPositiveCase() {

        assertEquals(28.0, DemoAppl.averageBug(numbers), 0.001);
        assertEquals(0.0, DemoAppl.averageBug(single), 0.001);
        assertEquals(-28.0, DemoAppl.averageBug(negative), 0.001);
    }

    @Test
    void averageBugNegativeCase() {
        assertNotEquals(30.0, DemoAppl.averageBug(numbers));
        assertNotEquals(100.0, DemoAppl.averageBug(single));
        assertNotEquals(-30.0, DemoAppl.averageBug(negative));

        assertThrows(NullPointerException.class, () -> DemoAppl.averageBug(null));
    }

@Test
void maxValuePositiveCase() {
    assertEquals(50, DemoAppl.maxValue(numbers));
    assertEquals(100, DemoAppl.maxValue(single));
    assertEquals(-10, DemoAppl.maxValue(negative));
}

    @Test
    void maxValueNegativeCase() {
        assertNotEquals(40, DemoAppl.maxValue(numbers));
        assertNotEquals(-50, DemoAppl.maxValue(negative));

        // пустой массив должен падать
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> DemoAppl.maxValue(empty));
    }

}