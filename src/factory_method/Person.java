package factory_method;

public class Person {
    private Person() {}

    static public Person create() {
        return new Person();
    }
}
