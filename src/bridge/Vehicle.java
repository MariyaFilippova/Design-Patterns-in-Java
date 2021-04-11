package bridge;

class Main {
    public static void main(String[] args) {
        Model audi = new Audi();
        Model toyota = new Toyota();
        Vehicle car = new Car(audi);
        Vehicle track = new Track(toyota);
        car.drive();
        track.drive();
    }
}

abstract class Vehicle {
    Model model;

    Vehicle(Model model) {
        this.model = model;
    }

    abstract void drive();
}

interface Model {
    void drive(String str);
}

class Car extends Vehicle {
    Car(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("drive car! ");
    }
}

class Track extends Vehicle {
    Track(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("drive track! ");
    }
}

class Audi implements Model {
    @Override
    public void drive(String str) {
        System.out.println(str + "This is Audi!");
    }
}


class Toyota implements Model {
    @Override
    public void drive(String str) {
        System.out.println(str + "This is Toyota!");
    }
}