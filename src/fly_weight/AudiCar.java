package fly_weight;

import java.util.HashMap;
import java.util.Map;

public class AudiCar {
    String color;
}

class FlyWeightGarage {
    Map<String, AudiCar> map = new HashMap<>();
    AudiCar getAudi(String color) {
        AudiCar car = map.get(color);
        if (car == null) {
            map.put(color, new AudiCar());
            car = map.get(color);
        }
        return car;
    }
}

class Main {
    public static void main(String[] args) {
        FlyWeightGarage garage = new FlyWeightGarage();
        System.out.println(garage.getAudi("green"));
        System.out.println(garage.getAudi("red"));
        System.out.println(garage.getAudi("green"));
    }
}