package org.prog.session2;

import org.prog.session1.Car;

public class AutomationSession2 {



    public static void main(String[] args) {
        System.out.println(Car2.brand);

        CarService carService = new CarService();




        Car2 aliceCar = new Car2();
        Car2 myWifesCar = aliceCar;


        carService.paintCar(myWifesCar, "black");

        System.out.println("Alice: " + aliceCar.color);
        System.out.println("My Wife's Car: " + myWifesCar.color);
    }

}
