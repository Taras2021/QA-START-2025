package org.prog.session4;

import org.prog.session1.CarHomeWork1;

public class Session4 {

    /**
     *
     * ############################
     * ###############10###########
     * ############################
     * ############################
     * @param args
     */

    public static void main(String[] args) {
        CarHomeWork1 car1 = new CarHomeWork1();
        car1.color = "red";
        CarHomeWork1 car2 = new CarHomeWork1();
        car2.color = "red";

//        String s1 = "red";
//        String s2 = "red";
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());

        System.out.println(car1.equals(car2));
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        System.out.println(car1.toString());
        System.out.println(car2.toString());


    }
}
