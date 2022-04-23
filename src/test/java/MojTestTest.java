import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MojTestTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("START TESTÓW");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("KONIEC TESTÓW");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Rozpoczynam test!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Kończę test!");
    }

    //        @Disabled //adnotacja wylaczajac test
    @Test
    @DisplayName("Test poprawności dzielenia")
    void dzielenie() {
        //given
        MojTest m = new MojTest();
        double a = 10, b = 3;
        //when
        double result = m.dzielenie(a, b);
        //then
        assertEquals(3.33,result);
    }

    @Test
    @DisplayName("Porównanie obiektów")
    void dzielenie2() {
        //given
        MojTest m1 = new MojTest();
        MojTest m2 = new MojTest();
        MojTest m3 = m1;
        //when

        //then
        assertNotSame(m1,m2,"obiekty są takie same.");
        assertSame(m1,m3,"obiekty nie są takiesame.");
    }

    @Test
    @DisplayName("Test assertNotNull")
    void assertNotNullTest() {
        //given
        String text = "sdacademy";
        //when

        //then
        assertNotNull(text,"text nie może być pusty");
    }

    @Test
    @DisplayName("Test assertArrayEquals")
    void bothArraysShouldBeEqual() {
        final int[] intsA = { 1, 2, 3 };
        final int[] intsB = { 1, 2, 3 };

        assertArrayEquals(intsA, intsB, "Elementy tablicy nie są takie same");

    }
}