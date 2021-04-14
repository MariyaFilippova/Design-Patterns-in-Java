package singleton;

public class Singleton {
    private static final Singleton entity = new Singleton();

    private Singleton() {}

    static Singleton getEntity() {
        return entity;
    }

}