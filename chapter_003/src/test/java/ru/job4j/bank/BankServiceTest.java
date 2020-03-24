package ru.job4j.bank;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;


public class BankServiceTest {
    @Test
    public void addUser() {
        User user = new User("3434", "Evgeny Ivanov");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434"), is(user));
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Evgeny Ivanov");
       BankService bank = new BankService();
       bank.addUser(user);
       bank.addAccount(user.getPassport(), new Account("5546", 150D));
       assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150D));


    }
    @Test
    public void whenEnterInvalidPassport() {
        User user =new User("3434", "Evgeny Ivanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertNull(bank.findByRequisite("34", "5546"));
    }




}