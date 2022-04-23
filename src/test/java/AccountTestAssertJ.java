import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTestAssertJ {

    @Test
    void getName() {
        //given
        Account account = new Account();
        //when
        account.setName("Konto Premium");
        //then
        assertThat(account.getName())
                .isNotNull()
                .isEqualTo("Konto Premium");

    }

    @Test
    void getBalance() {
        //given
        Account account = new Account();
        //when
        account.deposit(10);
        //then
        assertThat(account.getBalance())
                .isEqualTo(10);
    }

}