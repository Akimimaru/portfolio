package com.itproger;

public class isSpeedValid {
    //метод которым проверяется скорость
    public static boolean isValid(double speed) {
        if(speed < 0 || speed > 250) {
            return false;
        }

        //если скорость не входит в диапозон
        return true;
    }

    public static void main(String[] args){
        System.out.println("скорость -123 " + isValid(123));
        System.out.println("скорость 15 " + isValid(15));
        System.out.println("скорость 250 " + isValid(250));
        System.out.println("скорость 356 " + isValid(356));
    }
}