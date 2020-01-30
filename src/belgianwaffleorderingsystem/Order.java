/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belgianwaffleorderingsystem;
import java.util.*;
/**
 *
 * @author Jairus
 */
public class Order<E> extends ArrayList<E>{
    Product mp;
    int mqty;
    int mtotal;
    public Order(Product p,int qty){
        mp = p;
        mqty = qty;
        mtotal = qty * p.getmPrice();
    }
    public Order(String productName,int qty,int total){
        mtotal = total;
        mqty = qty;
        mp = new Product(productName);
    }
    public Product getMp() {
        return mp;
    }
    public int getQuantity(){
        return mqty;
    }
    @Override
    public boolean equals(Object o) {
         return (mp.getmProductName() == null ? ((Product)o).getmProductName() == null : mp.getmProductName().equals(((Product)o).getmProductName()));
       
    }
    public int getTotal(){
        return mtotal;
    }
   
   
    
    public String getStringFormat(){
        return Integer.toString(mqty)+"pcs. "+mp.getmProductName()+"     "+Integer.toString(mtotal)+".00";
    }
    
}
