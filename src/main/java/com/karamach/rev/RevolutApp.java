package com.karamach.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class RevolutApp {
    private final List<User> users = new ArrayList<>();
    private final TariffList tariffList = new TariffList();
    private final AtomicInteger count = new AtomicInteger(0);

    public TariffList getTariffList() {
        return tariffList;
    }

    public List<User> getUsers() {
        return users;
    }

    public User registerUser(String country) {
        User user = new User(count.getAndIncrement(), country, TariffList.DEFAULT_TARIFF);
        users.add(user);
        System.out.println("Успешно зарегистрировали пользователя: " + user);

        return user;
    }

    public void unregisterUser(User user) {
        users.remove(user);
    }

    public void buyTariff(int userId, String tariffName) {
        User user = findUser(users, userId);
        if (user != null) {
            Tariff tariffToBuy = tariffList.findTariff(tariffName);
            user.setTariff(tariffToBuy);
            System.out.println("Купили пользователю: " + user + ", тарифЖ: " + tariffToBuy);
        }
        else {
            System.err.println("User not found");
        }
    }

    public int withdrawMoney(int userId) {
        User user = findUser(users, userId);
        int moneyToWithdraw = user
                .getTariff()
                .getWithdrawLimit();
        System.out.println("Пользователь " + user + ", снял деньги: " + moneyToWithdraw);
        return moneyToWithdraw;
    }

    private User findUser(List<User> users, int userId) {
        return users.stream()
                .filter(user -> user.getId() == userId)
                .findFirst()
                .orElse(null);
    }
}
