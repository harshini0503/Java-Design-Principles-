import java.lang.reflect.Constructor;
import java

class Singleton 
{
    
    public static Singleton instance = new Singleton();
      
    private Singleton() 
    {
        if(instance!=null)
	throw new IllegalStateException("Object can't be created");
    }
}
  
public class Reflection
{
  
    public static void main(String[] args)
    {
        Singleton instance1 = Singleton.instance;
        Singleton instance2 = null;
        try
        {
            Constructor[] constructors = 
                    Singleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) 
            {
                
                constructor.setAccessible(true);
                instance2 = (Singleton) constructor.newInstance();
                break;
            }
        }
      
        catch (Exception e) 
        {
            e.printStackTrace();
        }
          
    System.out.println("instance1.hashCode():- " 
                                      + instance1.hashCode());
    System.out.println("instance2.hashCode():- " 
                                      + instance2.hashCode());
    }
}