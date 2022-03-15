
import java.util.*;
class BasicCar implements Cloneable
{
    public String modelname;
    public int price;
    
    public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	
    public static int setPrice()
    {
        int price = 0;
        Random r = new Random();
        int p = r.nextInt(100000);
        price = p;
       return price;
    }
   public BasicCar clone() throws CloneNotSupportedException
	{
		return  (BasicCar)super.clone();
	}
	
}


 class Ford extends BasicCar 
{
    public Ford(String m)
    {
        modelname = m;
    }   

	@Override
	public BasicCar clone() throws CloneNotSupportedException 
	{
		 return super.clone();		
	}
}


class Nano extends BasicCar 
{
    public Nano(String m)
    {
        modelname = m;
    }   
	@Override	
	public BasicCar clone() throws CloneNotSupportedException 
	{
		 return super.clone();
		 
	}
}


public class Prototype
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
    	
    	BasicCar nano = new Nano("Green Nano") ;
        nano.price=8000;
        
        BasicCar ford = new Ford("Ford Yellow");
        ford.price=455000;        
       
        BasicCar bc;
        
        bc =nano.clone();
       
        bc.price = nano.price+BasicCar.setPrice();
        System.out.println("Car is: "+ bc.modelname+" and it's price is Rs."+bc.price);
        
                 
        bc =ford.clone();
        
        bc.price = ford.price+BasicCar.setPrice();
        System.out.println("Car is: "+ bc.modelname+" and it's price is Rs."+bc.price);

        
    }
}
