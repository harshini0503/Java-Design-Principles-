class SingletonSynchronized {
  private static SingletonSynchronized instance; 
  
  private SingletonSynchronized(){}
  
  public static SingletonSynchronized getInstance() {
    if(instance == null) {
      synchronized (SingletonSynchronized.class) {
        if(instance == null) {
          instance = new SingletonSynchronized();
        }
      }
    }
    return instance;
  }
}

public class SingletonDouble {

  public static void main(String[] args) {
    SingletonSynchronized instance = SingletonSynchronized.getInstance();
    
    System.out.println(instance);
    
    SingletonSynchronized instance1 = SingletonSynchronized.getInstance();
    
    System.out.println(instance1);
  }
}