package deitelChapters.chapter8.BankApp;

import BankApp.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private Account jamesAccount;
    @BeforeEach
    public void startWithThis(){
        jamesAccount = new Account("james","1","1234");
    }

    @Test
    public void depositMoney(){
        jamesAccount.deposit(BigDecimal.valueOf(7_000));
        assertEquals(BigDecimal.valueOf(6_000),jamesAccount.getBalance("1234"));
    }
    @Test
    public void getBalanceWithWrongPin(){
    jamesAccount.deposit(BigDecimal.valueOf(2_000));
    assertThrows(IllegalArgumentException.class, ()-> jamesAccount.getBalance("1883"));
     }

     @Test
    public void withdrawMoney(){
        jamesAccount.withdrawMoney(BigDecimal.valueOf(1_000), "1234");
        assertThrows(IllegalArgumentException.class, ()-> jamesAccount.withdrawMoney(BigDecimal.valueOf(1_000),"4556"));
     }
}
