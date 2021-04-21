package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Filter {
    public static void main(String[] args) {
        Car car1 = new Car(100, "black");
        Car car2 = new Car(200, "green");
        Car car3 = new Car(300, "red");
        Car car4 = new Car(180, "blue");
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        ColorFilter colorFilter = new ColorFilter();
        SpeedFilter speedFilter = new SpeedFilter();
        List<Car> filteredByColor = colorFilter.filter(cars);
        List<Car> filteredBySpeed = speedFilter.filter(cars);
    }

}

interface CarFilter {
    List<Car> filter(List<Car> cars);
}

class ColorFilter implements CarFilter {

    @Override
    public List<Car> filter(List<Car> cars) {
        return cars.stream().filter(x -> x.color.equals("black")).collect(Collectors.toList());
    }
}


class SpeedFilter implements CarFilter {

    @Override
    public List<Car> filter(List<Car> cars) {
        return cars.stream().filter(x -> x.maxSpeed >= 200).collect(Collectors.toList());
    }
}

class Car {

    public Car(int maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    int maxSpeed;
    String color;
}
