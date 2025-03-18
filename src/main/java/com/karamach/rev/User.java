package com.karamach.rev;

import java.util.Objects;

public class User {
    private int id;
    private String country;
    private Tariff tariff;

    public User(int id, String country, Tariff tariff) {
        this.id = id;
        this.country = country;
        this.tariff = tariff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(country, user.country) && Objects.equals(tariff, user.tariff);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, country, tariff);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", country='").append(country).append('\'');
        sb.append(", tariff=").append(tariff);
        sb.append('}');
        return sb.toString();
    }
}
