import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CalculatorTest {

    private Calculator calculator;

    //metoda, ktora inicjalizuje zmienne klasowe, moze np tworzyc strukture katalogu, tworzyc plik
    //nawiazywac polaczenie do bazy danych
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        //given
        int aa = 4;
        int b = 6;
        //when
        int result = calculator.add(aa, b);
        //then
//        assertEquals(10, result);
        assertNotNull(calculator); //czasami mamy kilka asercji
        assertEquals(10, result, "wrong result");
    }

}