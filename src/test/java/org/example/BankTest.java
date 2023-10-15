package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {
    private Bank bank;
    private BankAccount account1;
    private BankAccount account2;

    @Before
    public void setUp() throws NegativeAmountException {
        bank = new Bank();
        account1 = bank.createAccount("Alice", 1000);
        account2 = bank.createAccount("Bob", 500);
    }

    @Test
    public void testDeposit() throws NegativeAmountException {
        account1.deposit(200);
        assertEquals(1200, account1.getBalance(), 0.01);
    }

    @Test
    public void testWithdraw() throws NegativeAmountException, InsufficientFundsException {
        account2.withdraw(200);
        assertEquals(300, account2.getBalance(), 0.01);
    }

    @Test
    public void testTransferMoney() throws NegativeAmountException, InsufficientFundsException, AccountNotFoundException {
        bank.transferMoney(account1.getAccountNumber(), account2.getAccountNumber(), 300);
        assertEquals(700, account1.getBalance(), 0.01);
        assertEquals(800, account2.getBalance(), 0.01);
    }
}
