package com.itproger;

public class ConcertTest {
    public static boolean canEnterConcert(int age, boolean hasTicet, boolean isVIP) {
        return (age >= 18 && hasTicet) || (age >= 16 && isVIP);

    }

    public static void main(String[] args) {
        int[] ages = {17, 17, 19, 19, 16};
        boolean[] tickets = {false, true, true, false, false};
        boolean[] vip = {true, false, false, false, true};
        boolean[] expected = {true, false, true, false, true};

        int passed = 0;
        int failed = 0;

        for (int i = 0; i < ages.length; i++) {
            boolean result = canEnterConcert(ages[i], tickets[i], vip[i]);
            System.out.println(); // пустая строка для красоты
            if (result == expected[i]) {
                System.out.println("✅ Тест " + (i + 1) + " пройден");
                passed++;
            } else {
                System.out.println("❌ Тест " + (i + 1) + " провален. Ожидалось: " + expected[i] + ", получено: " + result);
                failed++;
            }
        }

// <-- вот это уже ВНЕ цикла
        System.out.println("\n=== Итог ===");
        System.out.println("Пройдено: " + passed + " / " + ages.length);
        System.out.println("Провалено: " + failed + " / " + ages.length);

    }
}