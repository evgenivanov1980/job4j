package ru.job4j.bank;

import org.junit.Test;

import java.util.Optional;

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
        User user = new User("3434", "Evgeny Ivanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertNull(bank.findByRequisite("34", "5546"));
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Evgeny Ivanov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "113").getBalance(), is(200D));

    }
    @Test
    public void transferMoneyOneUserToTwoUser() {
        User user = new User("3434", "Evgeny Ivanov");
        User user1 = new User("2121", "Aleksandr Petrov");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addUser(user1);
        bank.addAccount(user.getPassport(), new Account("7080", 30D));
        bank.addAccount(user1.getPassport(), new Account("1020", 150D));
        bank.transferMoney(user.getPassport(), "7080", user1.getPassport(), "1020", 30D);
        assertThat(bank.findByRequisite(user1.getPassport(), "1020").getBalance(), is(180D));

    }
}