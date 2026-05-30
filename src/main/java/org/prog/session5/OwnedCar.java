package org.prog.session5;

public class OwnedCar {
    String model;
    String color;
    public OwnedCar (String model, String color){
        this.model = model;
        this.color = color;


    }
    @Override
    public String toString() {
        return model + " " + color;
    }
}
