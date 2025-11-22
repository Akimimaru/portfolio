package com.itproger;

public class DiscountChecker {
    public static int getDiscount(boolean hasCard, int purchaseAmount) {
        int discount = 0;
        if (!hasCard && purchaseAmount < 1000) {
            discount = 0;
        } else if (hasCard && purchaseAmount < 5000) {
            discount = 10;
        } else if (!hasCard && purchaseAmount >= 5000) {
            discount = 15;
        } else if (hasCard && purchaseAmount >= 5000) {
            discount = 25;
        }
        return discount;
    }

    public static void main(String[] args) {
        int[] amounts = {36, 4520, 8521, 79564, 265, 3300};
        boolean[] hasCard = {true, true, false, true, false, true};

        // Пробегаем по покупателям
        for (int i = 0; i < amounts.length; i++) {
            int discount = getDiscount(hasCard[i], amounts[i]);
            System.out.println("Покупатель " + (i + 1) + ": сумма " + amounts[i] + ", карта: " + hasCard[i] + " → скидка " + discount + "%");
        }
    }

}