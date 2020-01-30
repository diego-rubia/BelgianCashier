/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belgianwaffleorderingsystem;
import java.sql.*;
import java.util.*;

/**
 *
 * @author ddieg
 */
class Order<E> extends ArrayList<E>{
    Product mp;
    int mqty;
    int mtotal;
    public Order(Product p,int qty){
        mp = p;
        mqty = qty;
        mtotal = qty * p.getmPrice();
    }

    public Product getMp() {
        return mp;
    }

    @Override
    public boolean equals(Object o) {
        if(mp.getmProductName()==((Product)o).getmProductName()){
            return true;
        }else{
            return false;
        }
       
    }

   
   
    
    public String getStringFormat(){
        return Integer.toString(mqty)+"pcs. "+mp.getmProductName()+"     "+Integer.toString(mtotal)+".00";
    }
}
public class BelgianWaffle {
  
  
  private ArrayList<Product>mWaffle;
  private ArrayList<Product>mCoffee;
  
  private ArrayList<Order>mOrders;
  
  private double mTransactionTotal;
  private double mChange;
  private double mTenderedCash;
  
  private BelgianDatabaseHandler mDb;
  
  public BelgianWaffle(ArrayList<Product>waffle,ArrayList<Product>coffee,BelgianDatabaseHandler db) {
      mWaffle = waffle;
      mCoffee = coffee;
      mOrders = new ArrayList<Order>();
      mDb = db;
      
  }


  public void addOrder ( int waffleIndex,
                                        int coffeeIndex,
                                        int waffleQuantity,
                                        int coffeeQuantity)
  {
     if(mOrders.indexOf(mWaffle.get(waffleIndex))==-1){
         mOrders.add(new Order(mWaffle.get(waffleIndex),waffleQuantity));
         if(coffeeQuantity>0){
            mOrders.add(new Order(mCoffee.get(coffeeIndex),coffeeQuantity));
         }
     }else{
         
     }
     
      
    
  }
  public ArrayList<Order> getOrders(){
   
      return mOrders;
  }
  
  
  
  
  
  

} // end of class BelgianWaffle
