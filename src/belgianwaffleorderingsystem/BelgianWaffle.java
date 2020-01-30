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
    public int getTotal(){
        return mtotal;
    }
   
   
    
    public String getStringFormat(){
        return Integer.toString(mqty)+"pcs. "+mp.getmProductName()+"     "+Integer.toString(mtotal)+".00";
    }
}
public class BelgianWaffle extends Exception {
  
  
  private ArrayList<Product>mWaffle;
  private ArrayList<Product>mCoffee;
  
  private ArrayList<Order>mOrders;
  
  private int mTransactionTotal;
  private int mChange;
  private int mTenderedCash;
  
  private BelgianDatabaseHandler mDb;
  
  public BelgianWaffle(ArrayList<Product>waffle,ArrayList<Product>coffee,BelgianDatabaseHandler db) {
      mWaffle = waffle;
      mCoffee = coffee;
      mOrders = new ArrayList<Order>();
      mDb = db;
      
  }

  public void setTenderedCash(int cash){
      mTenderedCash = cash;
      mChange = mTenderedCash - mTransactionTotal;
  }
  public int getChange(){
      return mChange;
  }
  public void addOrder( int waffleIndex,
                                        int coffeeIndex,
                                        int waffleQuantity,
                                        int coffeeQuantity) throws belgianwaffleorderingsystem.OrderException
  {
        
         if(waffleQuantity>0){
            if(mOrders.indexOf(mWaffle.get(waffleIndex).getmProductName())==-1){
                mOrders.add(new Order(mWaffle.get(waffleIndex),waffleQuantity));
                
            }else{
                throw new OrderException("Duplicate Order "+mWaffle.get(waffleIndex));
            }
         }
         if(coffeeQuantity>0){
            if(mOrders.indexOf(mCoffee.get(coffeeIndex).getmProductName())==-1){
                mOrders.add(new Order(mCoffee.get(coffeeIndex),coffeeQuantity));
            }
            else{
                throw new OrderException("Duplicate Order "+mCoffee.get(coffeeIndex));
            }
         }
         updateTotalPrice();
     
      
    
  }
  public void removeOrder(int index){
      mOrders.remove(index);
      updateTotalPrice();
  }
  public void updateTotalPrice(){
      mTransactionTotal = 0;
      for(int i =0;i<mOrders.size();i++){
          mTransactionTotal+=mOrders.get(i).getTotal();
      }
  }
  private void resetCashInfo(){
      mTenderedCash = 0;
      mChange=0;
      mTransactionTotal = 0;
  }
  public ArrayList<Order> getOrders(){
   
      return mOrders;
  }
  public int getTotalPrice(){
      return mTransactionTotal;
  }
  public void clearOrders(){
      mOrders.clear();
      resetCashInfo();
  }
  
  
  
  

} // end of class BelgianWaffle
