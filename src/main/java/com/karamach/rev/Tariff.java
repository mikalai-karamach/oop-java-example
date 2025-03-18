package com.karamach.rev;

import java.util.Objects;

public class Tariff {
    private final String name;
    private final String country;
    private int withdrawLimit;

    public Tariff(String name, int withdrawLimit, String country) {
        this.name = name;
        this.withdrawLimit = withdrawLimit;
        this.country = country;
    }

    public void listAllProducts() {
        System.out.println("Withdraw limit: " + withdrawLimit);
    }

    public String getName() {
        return name;
    }

    public int getWithdrawLimit() {
        return withdrawLimit;
    }

    public String getCountry() {
        return country;
    }

    public void setWithdrawLimit(int withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tariff tariff = (Tariff) o;
        return withdrawLimit == tariff.withdrawLimit && Objects.equals(name, tariff.name) && Objects.equals(country, tariff.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, withdrawLimit, country);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tariff{");
        sb.append("name='").append(name).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", withdrawLimit=").append(withdrawLimit);
        sb.append('}');
        return sb.toString();
    }
}
