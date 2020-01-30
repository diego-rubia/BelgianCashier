/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belgianwaffleorderingsystem;
import java.util.*;

/**
 *
 * @author ddieg
 */
public class BelgianWaffle {
  // Array lists for waffle orders
  static ArrayList<String> waffleOrders = new ArrayList<String> ();
  static ArrayList<Integer> waffleQuantity = new ArrayList<Integer> ();
  
  // Array lists for coffee orders
  static ArrayList<String> coffeeOrders = new ArrayList<String> ();
  static ArrayList<Integer> coffeeQuantity = new ArrayList<Integer> ();
  
  private ArrayList<Product>mWaffle;
  private ArrayList<Product>mCoffee;
  private double mTransactionTotal;
  public BelgianWaffle(ArrayList<Product>waffle,ArrayList<Product>coffee) {
      mWaffle = waffle;
      mCoffee = coffee;
  }


  public static void addOrder ( int waffleIndex,
                                        int coffeeIndex,
                                        int waffleQuantity,
                                        int coffeeQuantity)
  {
    
      
    
  }
  
  public static void setWaffleOrder (String waffle)
  {
      waffleOrders.add (waffle);o 
  }
 
  public static void setCoffeeOrder (String coffee)
  {
       coffeeOrders.add (coffee);
  }
  
  public static void setWaffleQuantOrder (int qWaffle)
  {
       waffleQuantity.add (qWaffle);
  }
  
  public static void setCoffeeQuantOrder (int qCoffee)
  {
       coffeeQuantity.add (qCoffee);
  }
  
  public static int getPrice (String inpString)
  {
    int price = 0; // dummy value
    switch (inpString)
    {
        
      /*WAFFLE ORDER PRICES*/
      // PHP35
      case "PLA":
        price = 35;
        break;

      // PHP40
      case "CHO": case "CHE": case "PBU": case "CAR":
        price = 40;
        break;

      // PHP45
      case "STR": case "BLU": case "CUS": case "MPE": case "MFB":
        price = 45;
        break;

      // PHP50
      case "BCH": case "BCA": case "FBC": case "BPB":
        price = 50;
        break;

      // PHP55
      case "CCU": case "CCR": case "BBB": case "SBB": case "SBC":
        price = 55;
        break;
        
      // PHP65
      case "CHH": case "CHC": case "BBC":
        price = 65;
        break;
        
        
      /*COFFEE ORDER PRICES*/
      case "OCF": case "SCF": case "CCF":
        price = 45;
        break;
        
      /*INVALID FLAVOR CODE*/
      default:
        price = 0;
        break;
    }
    return price;
  }

  public static void showOrders ()
  {
    int totalCost = 0;
    for (String orders : waffleOrders)
    {
      int orderPrice = getPrice (orders);
      totalCost += orderPrice;  
      System.out.println(orders + "\t" + " - " + "\t" + orderPrice);
    }
    System.out.println("Total Cost: "+ "\t" + " - " + "\t" + totalCost);
  }
  
  public String getWaffleOrders ()
  {
      String waffleCart = String.join(",", waffleOrders);
      return waffleCart;
  }
  
  public String getCoffeeOrders ()
  {
      String coffeeCart = String.join(",", coffeeOrders);
      return coffeeCart;
  }
  
  public String getWaffleQuant ()
  {
      ArrayList<String> tempWaffleNum = new ArrayList<String> ();
      
      for (int waffNum : waffleQuantity)
          tempWaffleNum.add(Integer.toString(waffNum));
      
      String wQuant = String.join(",", tempWaffleNum);
      return wQuant;
  }
  
  public String getCoffeeQuant ()
  {
      ArrayList<String> tempCoffeeNum = new ArrayList<String> ();
      
      for (int coffNum : coffeeQuantity)
          tempCoffeeNum.add(Integer.toString(coffNum));
      
      String cQuant = String.join(",", tempCoffeeNum);
      return cQuant;
  }
  
  public static int getTotalPrice ()
  {
      int total = 0;
      for (int i = 0; i < waffleOrders.size(); i++) // The array lists will always be equal in size
          total += getPrice(waffleOrders.get(i)) * waffleQuantity.get(i);
      
      for (int j = 0; j < coffeeOrders.size(); j++) // The array lists will always be equal in size
          total += getPrice(coffeeOrders.get(j)) * coffeeQuantity.get(j);
      
      return total;
  }

  public static void clearOrders ()
  {
      // empty ArrayList for new orders
      waffleOrders.clear();
      coffeeOrders.clear();
  }

} // end of class BelgianWaffle
