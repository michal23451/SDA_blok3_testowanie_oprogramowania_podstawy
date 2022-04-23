import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsOddValidatorTest {

    //        @Disabled //adnotacja wylaczajac test
    @DisplayName("Verification should pass for odd number")
    @Test
    void verificationShouldPassForOddNumber() {
        //arrange
        IsOddValidator validator = new IsOddValidator();
//        final int oddNumber = 11; mozemy psuc test i sprawdzic czy sie 'wywali'
        final int oddNumber = 12;
        //act
        boolean isOdd = validator.isOdd(oddNumber);
        //assert
//        Assertions.assertTrue(isOdd);
        assertTrue(isOdd);
    }

    @Test
    void verificationShouldFailForOddNumber() {
        //given
        IsOddValidator validator = new IsOddValidator();
        final int oddNumber = 11;
        //when
        boolean isOdd = validator.isOdd(oddNumber);
        //then
        assertFalse(isOdd);
    }


}