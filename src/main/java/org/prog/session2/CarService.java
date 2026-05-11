package org.prog.session2;

//TODO: Add polish car step to painting process

public class CarService {

    private CarPainter vova = new CarPainter();
    private CarPainter sasha = new CarPainter();


    public void paintCar(Car2 carToPaint, String newCarColor) {
        if ("black".equals(newCarColor)) {

            vova.prepareCarForPainting(carToPaint);



            sasha.paintCar(carToPaint, newCarColor);

            sasha.polishCars(carToPaint);
        } else {

            sasha.prepareCarForPainting(carToPaint);



            vova.paintCar(carToPaint, newCarColor);
            vova.polishCars(carToPaint);
        }
    }


}