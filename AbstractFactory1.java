interface Mobile
{

    void brandName();
}
class Iphone implements Mobile
{
    
    @Override
    public void brandName() {
        System.out.println("The mobile brand is :Iphone");
    }
    
}
class Ipad implements Mobile
{
    
    @Override
    public void brandName() {
        System.out.println("It is a Ipad of brand :Iphone");
    }
    
}
class OnePlus implements Mobile
{
    @Override
    public void brandName() {
        System.out.println("The mobile brand is :OnePlus");
        
    }
}
class Sony implements Mobile
{
    @Override
    public void brandName() {
        System.out.println("The mobile brand is :Sony");
        
    }
}
abstract class AbstractFactory 
{
   abstract Mobile getMobile(String model) ;
}
 
 class AppleMobileFactory extends AbstractFactory {
       @Override
       public Mobile getMobile(String model){    
          if(model.equalsIgnoreCase("iphone")){
             return new Iphone();         
          } 
	else if(model.equalsIgnoreCase("ipad"))
		return new Ipad();
          return null;
       }
    }
 class AndroidMobileFactory extends AbstractFactory {
       @Override
       public Mobile getMobile(String mobile)
       {    
          if(mobile.equalsIgnoreCase("Oneplus"))
          {
             return new OnePlus();         
          }
          else if(mobile.equalsIgnoreCase("Sony"))
          {
             return new Sony();
          }     
          return null;
       }
    }
  class FactoryProducer 
  {
       public static AbstractFactory getFactory(boolean isApple)
       {   
          if(isApple)
          {
             return new AppleMobileFactory();         
          }
          else
          {
             return new AndroidMobileFactory();
          }
       }
    }
  
public  class AbstractFactory1
{
       public static void main(String[] args) 
       {
          AbstractFactory mobileFactory1 = FactoryProducer.getFactory(false);
          Mobile m = mobileFactory1.getMobile("Sony");
          m.brandName();
      
          AbstractFactory mobileFactory2 = FactoryProducer.getFactory(true);
          Mobile i = mobileFactory2.getMobile("ipad");
          i.brandName();
       }
}