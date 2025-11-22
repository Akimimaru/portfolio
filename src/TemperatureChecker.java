package com.itproger;

public class TemperatureChecker {
    // метод которым проверяем корректность температур
    public static boolean isValid(double temperature){
        // Проверяем, входит ли температура в диапазон -50..+50

        if (temperature < -50 || temperature>+50){
            return false;
        }
        //если не входят температуры в диапозон, значит не верно
        return true;
    }

    public static void main(String[] args) {
        System.out.println("результат 1: " + isValid(13));
        System.out.println("результат 2: " + isValid(-53));
        System.out.println("результат 3: " + isValid(+69));
    }

}