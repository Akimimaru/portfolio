package com.itproger;

public class DriverChecker {

    // проврка на возраст и права
    public static boolean canDrive(int age, boolean hasLicense) {
        return age >= 18 && hasLicense ;

    }

    public static void main(String[] args){
        System.out.println("Возраст: 16, лицензия: true -> " + canDrive(16, true));
        System.out.println("Возраст: 20, лицензия: false -> " + canDrive(20, false));
        System.out.println("Возраст: 20, лицензия: true -> " + canDrive(20, true));
        System.out.println("Возраст: 17, лицензия: false -> " + canDrive(17, false));
        System.out.println("Возраст: 18, лицензия: true -> " + canDrive(18, true));

    }

}