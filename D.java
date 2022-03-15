import java.lang.*;

class Singleton extends MyClone {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}

public class D {

    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton instance = Singleton.getInstance();

        System.out.println(instance);

        Singleton instance1 = (Singleton) instance.clone();

        System.out.println(instance1);

    }
}
 class MyClone implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
