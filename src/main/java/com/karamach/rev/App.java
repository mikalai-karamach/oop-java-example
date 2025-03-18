package com.karamach.rev;

import java.util.Scanner;

/**
 * Hello world!
 * <p>
 * <p>
 * Яблоко - фрукт который123213
 * Банан - желтый фрукт которой
 * <p>
 * <p>
 * userId -> tariff
 * 12434123 -> Metal
 * 3123213 -> Regular
 * 2131232 -> Ban
 */
public class App {
    public static void main(String[] args) {
        RevolutApp revolutApp = new RevolutApp();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите страну:");
        String country = scanner.nextLine();

        User createUser = revolutApp.registerUser(country);
        revolutApp.getTariffList().getTariffs().forEach(tariff -> {
            System.out.println(tariff.getName() + ", список продуктов:");
            tariff.listAllProducts();
        });

        System.out.println("Какой тариф купить:");
        String tariffToBuy = scanner.nextLine();

        revolutApp.buyTariff(createUser.getId(), tariffToBuy);
        int money = revolutApp.withdrawMoney(createUser.getId());
        System.out.println("Снято: " + money);
    }
}
