package org.prog.session5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarOwnersMap {

    public static void main(String[] args) {
        Map<String, List<OwnedCar>> map = new HashMap<>();
        List<String> carOwner = List.of("Ivan", "Petro", "Zender" );


        map.put("Ivan", new ArrayList<>());
        map.put("Petro", new ArrayList<>());
        map.put("Zender", new ArrayList<>());

        map.get("Ivan").add(new OwnedCar("BMW",MapDemo.randomColor()));
        map.get("Petro").add(new OwnedCar("MINI",MapDemo.randomColor()));
        map.get("Zender").add(new OwnedCar("ZAZ",MapDemo.randomColor()));

        for (String owner : map.keySet()) {

            System.out.println(owner + " hawe " + map.get(owner));

        }











    }
}
