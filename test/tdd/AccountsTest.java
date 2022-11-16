 package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountsTest {
    @Test
    public void depositTest(){
        //given that I have an account
        Accounts jamesAccount = new Accounts();
        //when i deposit 5000
        jamesAccount.setDeposit(5000);
        //check that balance is 5000
        int jamesAccountBalance = jamesAccount.getBalance();
        assertEquals(5000, jamesAccountBalance);
    }
    @Test //new test case
    public void depositTwiceTest(){
        //given that I have an account
        Accounts jamesAccount = new Accounts();
        //given that initial balance is 4000
        jamesAccount.setDeposit( 4000);
        //when I deposit 200
        jamesAccount.setDeposit(  2000);
        //check that the balance is 6000
        int jamesAccountBalance = jamesAccount.getBalance();
        assertEquals(6000, jamesAccountBalance);
        System.out.println("Balance is: "+ jamesAccountBalance);

    }
    @Test
    public void depositNegativeAmountTest(){
        //given that I have an account
        Accounts jamesAccount = new Accounts();
        //given that initial balance is 4000
        jamesAccount.setDeposit( 4000);
        //when I deposit -2000
        jamesAccount.setDeposit(-2000);
        //check that the balance is 4000
        int jamesAccountBalance = jamesAccount.getBalance();
        assertEquals(4000, jamesAccountBalance);
        System.out.println("Balance is "+ jamesAccountBalance);

    }
    @Test
    public void withdrawNegativeAmount(){
        //given that I have an account
        Accounts jamesAccount = new Accounts();
        //given that initial balance is 7000
        jamesAccount.setDeposit( 7000 );
        //when I deposit -2000
        jamesAccount.withdraw(-2000 );
        //check that the balance is 7000
        int jamesAccountBalance = jamesAccount.getBalance();
        assertEquals(7000, jamesAccountBalance);
        System.out.println("Balance is: " + jamesAccountBalance);

    }

}
