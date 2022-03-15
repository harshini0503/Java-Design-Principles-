interface Currency {
       String getName();
}
                                     
class India implements Currency {     
       @Override
       public String getName() {
              return "Rupee";
       }
}


class Usa implements Currency {     
       @Override
       public String getName() {
              return "Dollar";
       }
}


class Japan implements Currency {       
       @Override
       public String getName() {
              return "Yen";
       }
}


class CurrencyFactory {        

       public static Currency createCurrency (String country) {
       if (country. equalsIgnoreCase ("India"))
	{
              return new India();
        }
	else if(country. equalsIgnoreCase ("US")){
              return new Usa();
       }
	else if(country. equalsIgnoreCase ("Japan")){
              return new Japan();
        }
     
       throw new IllegalArgumentException("No such currency");
}
}

public class Factory {
       public static void main(String args[]) {
              String country = "Japan";
              Currency c= CurrencyFactory.createCurrency(country);
              System.out.println(c.getName());
       }
}

