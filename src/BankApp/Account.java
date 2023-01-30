package BankApp;

import java.math.BigDecimal;

public class Account {
    private static BigDecimal balance = BigDecimal.ZERO;
    private final String pin;

    public Account(String firstname, String accountNumber, String accountPin) {
        pin = accountPin;
    }

    public void deposit(BigDecimal deposit) {
        balance = balance.add(deposit);
    }

    public BigDecimal getBalance(String pin){
        validatePin(pin);
        return balance;
    }
    public void validatePin(String pins){
        if (!pins.equals(this.pin)){throw new IllegalArgumentException("invalid pin");}
    }

    public void withdrawMoney(BigDecimal amount, String pin) {
        validatePin(pin);
        balance = balance.subtract(amount);
    }


}
