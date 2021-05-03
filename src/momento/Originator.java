package momento;

class Main {
    public static void main(String[] args) {
        Originator orig = new Originator();
        orig.setStatus("one");
        CareTaker careTaker = new CareTaker();
        careTaker.setMomento(orig.createMomento());
        orig.getDefaultMmento(careTaker.getMomento());
        System.out.println(orig.getStatus());
    }
}

public class Originator {
    String state;

    public String getStatus() {
        return state;
    }

    public void setStatus(String status) {
        this.state = status;
    }

    Momento createMomento() {
        return new Momento(state);
    }

    void getDefaultMmento(Momento momento) {
        this.state = momento.getState();
    }
}

class CareTaker {
    Momento momento;

    public Momento getMomento() {
        return momento;
    }

    public void setMomento(Momento momento) {
        this.momento = momento;
    }
}

class Momento {
    String state;

    Momento(String s) {
        state = s;
    }

    public String getState() {
        return state;
    }

}