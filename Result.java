interface Movies
{

    void movieName();
}
class TAction implements Movies
{
    
    @Override
    public void movieName() {
        System.out.println("Bahubali movie is a Tollywood Action movie");
    }
    
}
class TComedy implements Movies
{
    
    @Override
    public void movieName() {
        System.out.println("Jathiratnalu is a Tollywood Comedy movie");
    }
    
}
class BAction implements Movies
{
    @Override
    public void movieName() {
        System.out.println("BangBang is Bollywood action movie");
        
    }
}
class BComedy implements Movies
{
    @Override
    public void movieName() {
        System.out.println("MunnaBhai is a Bollywood Comedy Movie");
        
    }
}
abstract class AbstractFactory 
{
   abstract Movies getMovie(String name) ;
}
 
 class TollywoodFactory extends AbstractFactory {
       @Override
       public Movies getMovie(String name){    
          if(name.equalsIgnoreCase("Bahubali")){
             return new TAction();         
          } 
	else if(name.equalsIgnoreCase("Jathiratnalu"))
		return new TComedy();
          return null;
       }
    }
 class BollywoodFactory extends AbstractFactory {
       @Override
       public Movies getMovie(String name)
       {    
          if(name.equalsIgnoreCase("BangBang"))
          {
             return new BAction();         
          }
          else if(name.equalsIgnoreCase("MunnaBhai"))
          {
             return new BComedy();
          }     
          return null;
       }
    }
  class FactoryProducer 
  {
       public static AbstractFactory getFactory(boolean istollywood)
       {   
          if(istollywood)
          {
             return new TollywoodFactory();         
          }
          else
          {
             return new BollywoodFactory();
          }
       }
    }
  
public  class Result
{
       public static void main(String[] args) 
       {
          AbstractFactory movieFactory1 = FactoryProducer.getFactory(false);
          Movies m1 = movieFactory1.getMovie("BangBang");
	  Movies m2 = movieFactory1.getMovie("MunnaBhai");
          m1.movieName();
	  m2.movieName();
      
          AbstractFactory movieFactory2 = FactoryProducer.getFactory(true);
          Movies i1 = movieFactory2.getMovie("Jathiratnalu");
	  Movies i2 = movieFactory2.getMovie("Bahubali");
          i1.movieName();
	  i2.movieName();
       }
}