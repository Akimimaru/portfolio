package com.itproger;

public class Customer {

    // Метод для расчёта скидки
    public static int getDiscount(boolean hasCard, int purchaseAmount) {
        if (!hasCard && purchaseAmount < 1000) return 0;
        if (hasCard && purchaseAmount < 5000) return 10;
        if (!hasCard && purchaseAmount >= 5000) return 15;
        if (hasCard && purchaseAmount >= 5000) return 25;
        return 0;
    }

    public static void main(String[] args) {
        // Данные покупателей
        int[] amounts = {36, 4520, 8521, 79564, 265, 3300, 5000, 999, 5001, 10000};
        boolean[] hasCard = {true, true, false, true, false, true, false, true, true, false};
        int[] expectedDiscount = {10, 10, 15, 25, 0, 10, 15, 10, 25, 15};

        int passed = 0;
        int failed = 0;

        // Пробегаем по всем покупателям
        for (int i = 0; i < amounts.length; i++) {
            int discount = getDiscount(hasCard[i], amounts[i]);
            if (discount == expectedDiscount[i]) {
                passed++;
                System.out.println("✅ Тест " + (i + 1) + " пройден");
            } else {
                failed++;
                System.out.println("❌ Тест " + (i + 1) + " провален. Ожидалось: "
                        + expectedDiscount[i] + ", получено: " + discount);
            }
        }

        // Итог
        System.out.println("\n=== Итог ===");
        System.out.println("Пройдено: " + passed + " / " + amounts.length);
        System.out.println("Провалено: " + failed + " / " + amounts.length);
    }
}