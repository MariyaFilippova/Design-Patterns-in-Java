package factory;

interface Car {
    void drive();
}

class Toyota implements Car {

    @Override
    public void drive() {

    }
}

class Audi implements Car {

    @Override
    public void drive() {

    }
}

public class Factory {
    public Car create(String type) {
        switch (type) {
            case "Toyota": return new Toyota();
            case "Audi": return new Audi();
            default: return null;
        }
    }
}
