
class SingletonSynchronizedMethod {
  private static SingletonSynchronizedMethod instance; 
  
  private SingletonSynchronizedMethod(){}
  
  public static synchronized SingletonSynchronizedMethod getInstance() {
    if(instance == null) {
      instance = new SingletonSynchronizedMethod();
    }
    return instance;
  }
}

public class SingletonSyn {

  public static void main(String[] args) {
    SingletonSynchronizedMethod instance = SingletonSynchronizedMethod.getInstance();
    
    System.out.println(instance);
    
    SingletonSynchronizedMethod instance1 = SingletonSynchronizedMethod.getInstance();
    
    System.out.println(instance1);
  }
}