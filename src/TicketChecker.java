package com.itproger;

public class TicketChecker {

    // проврка на возраст и права
    public static boolean canEnterConcert(int age, boolean hasTicket, boolean isVIP) {
        return (age >= 18 && hasTicket) || (age >= 16 && isVIP);

    }

    public static void main(String[] args) {

        System.out.println("Возраст: 17, VIP билет -> " + canEnterConcert(17, false, true));
        System.out.println("Возраст: 17, VIP нет, билет есть -> " + canEnterConcert(17, true, false));
        System.out.println("Возраст: 19, есть билет -> " + canEnterConcert(19, true, false));
        System.out.println("Возраст: 19, VIP билет -> " + canEnterConcert(19, false, true));
        System.out.println("Возраст: 16, VIP билет -> " + canEnterConcert(16, false, true));
    }

}