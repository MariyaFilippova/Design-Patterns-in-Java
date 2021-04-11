package adapter;

class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        AmericanSocketImpl american = new AmericanSocketImpl();
        radio.listenToMusic(new SocketAdapter(american));
    }
}

interface EuroSocket {
    void getPower();
}

interface AmericanSocket {
    void getPower();
}

class AmericanSocketImpl implements  AmericanSocket {
    @Override
    public void getPower() {
        System.out.print("get 110 volt");
    }
}

class SocketAdapter implements EuroSocket {
    AmericanSocket americanSocket;

    SocketAdapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }
}

class Radio {
    void listenToMusic(EuroSocket euroSocket) {
        euroSocket.getPower();
        System.out.println("This is a nice song!");
    }
}
