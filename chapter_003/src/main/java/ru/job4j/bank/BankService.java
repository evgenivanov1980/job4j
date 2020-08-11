package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
       users.putIfAbsent(user, accounts);

    }
    public User findByPassport(String passport) {
        return users.keySet().stream().filter(user -> user
        .getPassport().equals(passport)).findFirst().orElse(null);
        }
    public void addAccount(String passport, Account account) {
    User user = findByPassport(passport);
    if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
    }
    }
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        List<Account> accounts = new ArrayList<>();
        if (user != null) {
            accounts = users.get(user);
        }
        return accounts.stream().filter(account -> account.getRequisite().equals(requisite)).findFirst()
                .orElse(null);
    }

        public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
            boolean result = false;
            Account sender = findByRequisite(srcPassport, srcRequisite);
            Account recipient = findByRequisite(destPassport, destRequisite);
            if (sender != null && recipient != null) {
                if (sender.getBalance() >= amount) {
                    recipient.setBalance(recipient.getBalance() + amount);
                    sender.setBalance(sender.getBalance() - amount);
                    result = true;

                }
            }
            return result;

        }


    }




