import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @Test
    void should_return_zero_balance_for_new_account() {
        //given
        Account account = new Account();
        //then
        assertEquals(0, account.getBalance());
    }

    @Test
    void should_return_balance_of_100_after_deposit_of_100() {
        //given
        Account account = new Account();
        //when
        account.deposit(100);
        //then
        assertEquals(100, account.getBalance());
//        assertTrue(100 == account.getBalance()); nie idzmy ta droga
    }

    //moje rozwiązania
    @Test
    void should_return_valid_amount_after_withdraw() {
        //given
        Account account = new Account();
        //when
        account.deposit(5000);
        account.withdraw(2999);
        //then
        assertEquals(2001,account.getBalance());
    }

    @Test
    void should_not_complete_transaction_exceeding_maximus_debit_of_1000() {
        //given
        Account account = new Account();
        //when
        account.withdraw(1001);
        //then
        assertEquals(0, account.getBalance());
    }



    @Test
    void should_not_complete_transaction_with_negative_amount() {
        //given
        Account account = new Account();
        //when
        account.deposit(-500);
        //then
        assertEquals(0, account.getBalance());

    }

    @Test
    void should_transfer_money_between_accounts() {
        //given
        Account account1 = new Account();
        Account account2 = new Account();
        //when
        account1.deposit(1500);
        account1.transfer(account2,300);
        //then
        assertEquals(1200, account1.getBalance());
        assertEquals(300, account2.getBalance());

    }

}