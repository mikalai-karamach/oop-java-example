package com.karamach.rev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Metal, Regular, Blablabla
public class TariffList {
    public static final Tariff DEFAULT_TARIFF = new Tariff("REGULAR", 1, "BY");
    private final List<Tariff> tariffs;

    public List<Tariff> getTariffs() {
        return tariffs;
    }

    public TariffList() {
        tariffs = new ArrayList<>();
        addTariff(new Tariff("METAL", 15, "BY"));
        addTariff(DEFAULT_TARIFF);
        addTariff(new TariffLT("METAL_LT", 20, "LT", 15));
    }

    public void addTariff(Tariff tariff) {
        tariffs.add(tariff);
    }

    public String listAllTariffs() {
        return Arrays.toString(tariffs.toArray());
    }

    public Tariff findTariff(String tariffName) {
        for (Tariff tariff : tariffs) {
            if (tariff.getName().equals(tariffName)) {
                return tariff;
            }
        }
        return null;
    }
}
