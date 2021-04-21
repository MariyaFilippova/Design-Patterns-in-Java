package facade;

public class СarFacade {
    Key key;
    Pedals pedals;
    Wheel wheel;

    void startMoving() {
        key.turn();
        pedals.pushGas();
        wheel.align();
    }

    void stop() {
        pedals.pushStop();
    }

}

class Wheel {
    void align() {
        System.out.println("Wheel aligned");
    }
}

class Key {
    void turn() {
        System.out.println("Key turned");
    }
}


class Pedals {
    void pushGas() {
        System.out.println("Gas Pedal pushed");
    }

    void pushStop() {
        System.out.println("Stop Pedal pushed");
    }
}

