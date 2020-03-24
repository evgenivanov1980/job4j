package ru.job4j.bank;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
       users.putIfAbsent(user, accounts);

    }
    public User findByPassport(String passport) {
        User user = null;
        for (User user1: users.keySet()) {
            if (user1.getPassport().equals(passport)) {
                user = user1;
            }
        }
        return user;
    }
    public void addAccount(String passport, Account account) {
    User user = findByPassport(passport);
    List<Account> accounts = users.get(user);
    if (!accounts.contains(account)) {
        accounts.add(account);
    }
    }
    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
        for (Account account1: accounts) {
            if (account1.getRequisite().equals(requisite)) {
                account = account1;

            }
        }
        return account;

    }




}

