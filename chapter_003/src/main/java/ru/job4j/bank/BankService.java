package ru.job4j.bank;

import java.util.*;

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
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        if (Objects.nonNull(user)){
            List<Account> accounts = users.get(user);
                for (Account account1: accounts) {
                    if (account1.getRequisite().equals(requisite)) {
                        account = account1;
                    }
                }

            }
        return Optional.ofNullable(account);
        }

        public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
            boolean result = false;
            Optional<Account> sender = findByRequisite(srcPassport, srcRequisite);
            Optional<Account> recipient = findByRequisite(destPassport, destRequisite);
            if (sender.isPresent() && recipient.isPresent()) {
                if (sender.get().getBalance() >= amount) {
                    recipient.get().setBalance(recipient.get().getBalance() + amount);
                    sender.get().setBalance(sender.get().getBalance() - amount);
                    result = true;

                }
            }
            return result;

        }


    }




