package ch10.pe_09;

/**
   A coin with a monetary value.
*/
public class Coin implements Comparable
{
   private double value;
   private String name;

   /**
      Constructs a coin.
      @param aValue the monetary value of the coin
      @param aName the name of the coin
   */
   public Coin(double aValue, String aName) 
   { 
      value = aValue; 
      name = aName;
   }

   /**
      Gets the coin value.
      @return the value
   */
   public double getValue() 
   {
      return value;
   }

   /**
      Gets the coin name.
      @return the name
   */
   public String getName() 
   {
      return name;
   }

   @Override
   public int compareTo(Object other) {
      Coin otherCoin = (Coin) other;
      if(value < otherCoin.value) return  -1;
      if(value > otherCoin.value) return  1;
      return 0;
   }
}

