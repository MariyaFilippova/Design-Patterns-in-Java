package proxy;

public interface Car {
    void drive();
}

class Proxy implements Car {
    Car car;

    Proxy(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        System.out.println("This is proxy code");
        car.drive();
    }
}

class Reno implements Car {
    @Override
    public void drive() {
        System.out.println("Drive Reno");
    }
}