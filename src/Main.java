package com.itproger;

import java.util.LinkedList;

public class Main {

    // Метод, который проверяет корректность координат
    public static boolean isValid(double latitude, double longitude) {

        // Проверяем, входит ли широта в диапазон -90..90
        if (latitude < -90 || latitude > 90) {
            return false;
        }

        // Проверяем, входит ли долгота в диапазон -180..180
        if (longitude < -180 || longitude > 180) {
            return false;
        }

        // Если обе проверки прошли — координаты корректны
        return true;
    }

    public static void main(String[] args) {

        // Проверим несколько наборов координат
        System.out.println("Result 1: " + isValid(55.75, 37.61));   // Москва
        System.out.println("Result 2: " + isValid(-91.0, 45.0));   // Ошибка по широте
        System.out.println("Result 3: " + isValid(60.0, 181.0));   // Ошибка по долготе
    }
}
