package test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MyTest {

    @BeforeAll
    static void setBefore() {
        System.out.println("@ Before All");
    }

    @BeforeEach
    void setUp() {
        System.out.println("@ Before each");
    }

    @AfterEach
    void tearDown(){
        System.out.println("@ After Each");
    }

    @AfterAll
    static void testAfterAll(){
        System.out.println("@ Test After All");
    }

    @Test
    void testEquals() {
        assertEquals(4, 2 + 2);
        assertNotEquals(4, 2 + 3);
        System.out.println("equals");
    }

    @Test
        //@Disabled
        // если надо пропустить
    void testEqualsDouble() {
        double x = 2.51;
        double y = 2.5;

        assertEquals(x, y, 0.01);
        assertNotEquals(x, y, 0.001);
        System.out.println("double");
    }

    @Test
    void testBoolean() {
        assertTrue(2 + 2 == 4);
        assertFalse(2 + 2 != 4);
        System.out.println("boolean");
    }

    @Test
    void testNull() {
        assertNull(null);
        assertNotNull("Hello");
        System.out.println("null");
    }

    @Test
    void testSame() {
        String str = new String("Hello");
        String str1 = new String("Hello");
        String str3 = str;
        String str4 = "hello";
        String str5 = "hello";

        assertSame(str, str3);
        assertNotSame(str, str1);
        assertSame(str4, str5);
        System.out.println("reference");
    }

    @Test
    void testArray() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        assertEquals(arr2.length, arr2.length);
        assertArrayEquals(arr2, arr1);
        System.out.println("arrays");
    }

    @Test
    void testVoid() {
        System.out.println("Void method");
    }
}


