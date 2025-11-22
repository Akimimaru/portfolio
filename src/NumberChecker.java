package com.itproger;

public class NumberChecker {

    public static boolean isInRange(int number) {
        // допустимый диапазон: от 10 до 100 включительно
        if (number < 10 || number > 100) {
            return false;
        }
        //если число не входит в диапозон
        return true;
    }

    public static void main(String[] args){
        System.out.println("число 5 " + isInRange(5));
        System.out.println("число 10 " + isInRange(10));
        System.out.println("число 50 " + isInRange(50));
        System.out.println("число 100 " + isInRange(100));
        System.out.println("число 101 " + isInRange(101));
        System.out.println("число -3 " + isInRange(-3));
    }

}