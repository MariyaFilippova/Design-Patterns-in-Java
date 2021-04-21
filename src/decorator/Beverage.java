package decorator;

class Decorator {
    public static void main(String[] args) {
        Beverage coffee = new Mocha(new Sugar(new Mocha(new Espresso())));
        System.out.println(coffee.getDescription() + " $" + coffee.cost());
    }
}

abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}

abstract class Beverage {
    String description = "Unknown Description";

    String getDescription() {
        return description;
    }

    public abstract double cost();
}

class Espresso extends Beverage {

    Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 9.99;
    }
}

class Cappuccino extends Beverage {

    Cappuccino() {
        description = "Cappuccino";
    }

    @Override
    public double cost() {
        return 10.25;
    }
}

class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}

class Sugar extends CondimentDecorator {
    Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}