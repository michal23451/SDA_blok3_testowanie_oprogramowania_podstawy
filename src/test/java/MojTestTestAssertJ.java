import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MojTestTestAssertJ {

    @Test
    @DisplayName("Test AssertJ")
    void testAssertJ() {
        String test = "Testowy tekst";
        assertThat(test).startsWith("Te").endsWith("tekst");
    }

    @Test
    @DisplayName("Test JUnit")
    void testJUnit() {
        //given
        String test = "Testowy tekst";
        //when
        //then
        assertEquals(true,test.startsWith("Te") && test.endsWith("tekst"));
    }
}