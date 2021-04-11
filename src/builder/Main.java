package builder;

class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilderImpl();
        builder.setName("Ivan");
        Person person = builder.build();
        person.print();

    }
}

class Person {
    String name;
    int age;
    double salary;

    void print() {
        System.out.println(name + " " + age + " " + salary);
    }

}

interface PersonBuilder {
    PersonBuilder setName(String name);
    PersonBuilder setSalary(double salary);
    PersonBuilder setAge(int age);
    Person build();
}

class PersonBuilderImpl implements PersonBuilder {
    Person person = new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setSalary(double salary) {
        person.salary = salary;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}