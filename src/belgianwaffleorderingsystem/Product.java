/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belgianwaffleorderingsystem;

import java.util.ArrayList;

/**
 *
 * @author Jairus
 */
public class Product<E> extends ArrayList<E> {

   
    private String mProductName;
    private int mPrice;
    private String mProductType;
    private String mProductCode;

    public Product(String productCode,String productName,int price,String productType) {
        mProductName = productName;
        mProductCode = productCode;
        mPrice = price;
        mProductType = productType;
    }

    
    
    
    public String getmProductName() {
        return mProductName;
    }

    public void setmProductName(String mProductName) {
        this.mProductName = mProductName;
    }

    public int getmPrice() {
        return mPrice;
    }

    public void setmPrice(int mPrice) {
        this.mPrice = mPrice;
    }

    public String getmProductType() {
        return mProductType;
    }

    public void setmProductType(String mProductType) {
        this.mProductType = mProductType;
    }

    public String getmProductCode() {
        return mProductCode;
    }

    public void setmProductCode(String mProductCode) {
        this.mProductCode = mProductCode;
    }
    public String toString(){
        return mProductCode +" "+mProductName+" "+"(PHP "+Integer.toString(mPrice)+")";
    }
    
    
}
