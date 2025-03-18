package com.karamach.rev;

public class TariffLT extends Tariff {
    private int creditAmount;

    public TariffLT(String name, int withdrawLimit, String country, int creditAmount) {
        super(name, withdrawLimit, country);
    }

    public int getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(int creditAmount) {
        this.creditAmount = creditAmount;
    }

    @Override
    public void listAllProducts() {
        super.listAllProducts();
        System.out.println("Credit: " + creditAmount);
    }
}
