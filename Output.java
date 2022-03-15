 import java.util.*;


interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicle();
}

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
     ArrayList<String> str = new ArrayList<String>();
    

    public void add(String part) {
        str.add(part);
    }

    public void show() {
        System.out.println(" Product of the Vehicle is implemented as below :");

        for(int i = 0; i < str.size(); i++)
            System.out.println(str.get(i));
    }
}
class Car implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("Body of a Car is constructed");
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
        product.add("Body of a Motorcycle is constructed");
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

public class Output{
    public static void main(String [] args) {

        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorBuilder = new MotorCycle();

        
        director.construct(carBuilder);
        Product c = carBuilder.getVehicle();
        c.show();

        System.out.println("------------------------------");

        director.construct(motorBuilder);
        Product m = motorBuilder.getVehicle();
        m.show();
    }
}