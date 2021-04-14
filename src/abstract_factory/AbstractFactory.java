package abstract_factory;

public class AbstractFactory {
    Factory createFactory(String factoryType) {
        switch (factoryType) {
            case "CarFactory": return new CarFactory();
            case "TankFactory": return new TankFactory();
            default: return null;
        }
    }
}

interface Car {
    void drive();
}

interface Tank {
    void drive();
}

class Toyota implements Car {

    @Override
    public void drive() {
        System.out.println("I am driving toyota");
    }
}

class Audi implements Car {

    @Override
    public void drive() {
        System.out.println("I am driving audi");
    }
}

class T51 implements Tank {

    @Override
    public void drive() {
        System.out.println("I am driving t51");
    }
}

class T52 implements Tank {

    @Override
    public void drive() {
        System.out.println("I am driving t52");
    }
}

interface Factory {

}

class CarFactory implements Factory {
    Car create(String type) {
        switch (type) {
            case "Toyota": return new Toyota();
            case "Audi": return new Audi();
            default: return null;
        }
    }
}

class TankFactory implements Factory {
    Tank create(String type) {
        switch (type) {
            case "T51": return new T51();
            case "T52": return new T52();
            default: return null;
        }
    }
}
