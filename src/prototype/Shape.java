package prototype;

import java.util.HashMap;
import java.util.Map;

abstract class Shape implements Cloneable {
    String shapeType;

    abstract void create();

    @Override
    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}

class Circle extends Shape {

    Circle() {
        this.shapeType = "circle";
    }

    @Override
    void create() {
        System.out.println("Circle created!");
    }
}

class Rectangle extends Shape {

    Rectangle() {
        this.shapeType = "rectangle";
    }

    @Override
    void create() {
        System.out.println("Rectangle created!");
    }
}

class ShapeStore {
    private static Map<String, Shape> map = new HashMap<String, Shape>();

    static
    {
        map.put("circle", new Circle());
        map.put("rectangle", new Rectangle());
    }

    public static Shape getColor(String colorName)
    {
        return (Shape) map.get(colorName).clone();
    }
}

class Prototype {
    public static void main(String[] args) {
        ShapeStore.getColor("circle").create();
    }
}