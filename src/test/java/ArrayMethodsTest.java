import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ArrayMethodsTest {

    int[] array = {7,2,3,5};

    @Test
    @DisplayName("Test sumy elementów")
    void sumOfArrayElements() {
        //given
        //when
        int sum = ArrayMethods.sumOfArrayElements(array);
        //then
        assertEquals(17,sum);
    }

    @Test
    @DisplayName("Test średniej arytmetycznej")
    void avgOfArrayElements() {
        //given
        //when
        double avg = ArrayMethods.avgOfArrayElements(array);
        //then
        assertEquals(avg,4.25);
    }

    @Test
    @DisplayName("Test wyszukiwania elementów")
    void isElementInArray() {
        //given
        int element = 3;
        //when
        boolean check = ArrayMethods.isElementInArray(array, element);
        //then
        assertEquals(true, check);
        assertTrue(check);
        assertFalse(ArrayMethods.isElementInArray(array,999));
    }
}