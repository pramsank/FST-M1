package Activities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {
    @Test
    void notEnoughFunds() {
        //create an object for bank account class
        BankAccount bnk = new BankAccount(8);

        //exception assertion
        assertThrows(BankAccount.NotEnoughFundsException.class, () -> bnk.withdraw(10));
    }

    @Test
    void enoughFunds() {
        //create an object for bank account class
        BankAccount bnk = new BankAccount(100);

        //Assertion for notEnoughFunds where exception is not thrown
        assertDoesNotThrow(() -> bnk.withdraw(100));
    }
}
