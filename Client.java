 import java.util.*;
class Director {
    BuilderInterface myBuilder;

    public void construct(BuilderInterface builder) {
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }
}


 class Product {
    private LinkedList<String> parts;

    public Product () {
        parts = new LinkedList<String>();
    }

    public void add(String part) {
        parts.addLast(part);
    }

    public void show() {
        System.out.println("\n Product completed as below");

        for(int i = 0; i < parts.size(); i++)
            System.out.println(parts.get(i));
    }
}


interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicle();
}

class Car implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("Body of a Car is implemented");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added to the Car");
    }

    @Override
    public void addHeadlights() {
        product.add("2 headlights are added to the Car");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}

class MotorCycle implements BuilderInterface
{
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("Body of a Motorcycle is implemented");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added to the MotorCycle ");
    }

    @Override
    public void addHeadlights()  {
        product.add("1 Headlight is added to the MotorCycle");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}

public class Client {
    public static void main(String [] args) {

        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorBuilder = new MotorCycle();

        
        director.construct(carBuilder);
        Product p1 = carBuilder.getVehicle();
        p1.show();

        
        director.construct(motorBuilder);
        Product p2 = motorBuilder.getVehicle();
        p2.show();
    }
}