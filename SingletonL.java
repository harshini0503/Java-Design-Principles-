class Singleton {
  private static Singleton instance; 
  
  private Singleton(){}
  
  public static Singleton getInstance() {
    if(instance == null) {
      instance = new Singleton();
    }
    
    return instance;
  }
}

public class SingletonL{

  public static void main(String[] args) {
    Singleton instance = Singleton.getInstance();
    
    System.out.println(instance);
    
    Singleton instance1 = Singleton.getInstance();
    
    System.out.println(instance1);
  }
}