/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belgianwaffleorderingsystem;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairus
 */
public class BelgianDatabaseHandler {
    private String mDbname;
    private Connection mDb;
    private ArrayList<Product> mCoffeeMenu;
    private ArrayList<Product> mWaffleMenu;
    private ArrayList<Order>mOrders;
    public BelgianDatabaseHandler(String dbname) {
        //constructor trys to initialize the connection of mDb and uses it in the entire class to handle 
        //database information and transactions
        mDbname = "jdbc:sqlite:"+dbname;
        mDb = null;
        mCoffeeMenu = new ArrayList<Product>();
        mWaffleMenu = new ArrayList<Product>();
        mOrders = new ArrayList<Order>();
    }
    private Connection connect(){
        try{
            mDb = DriverManager.getConnection(mDbname);
//            JOptionPane.showMessageDialog(null, "Connection Established");
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return mDb;
        
        
    }
    
    public ArrayList<Product> getCoffeeMenu(){
       
        String query = "SELECT * FROM MenuPrice WHERE ProductType='Coffee'";
        try(Connection conn = this.connect();Statement stmt = conn.createStatement();ResultSet rs = stmt.executeQuery(query)){
           while(rs.next()){
               mCoffeeMenu.add(new Product(rs.getString("ProductCode"),rs.getString("ProductName"),rs.getInt("Price"),rs.getString("ProductType")));
           }
           if(conn!=null)
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()); 
        }
        return mCoffeeMenu;
    }
    public ArrayList<Product> getWaffleMenu(){
        String query = "SELECT * FROM MenuPrice WHERE ProductType='Waffle'";
        try(Connection conn = this.connect();Statement stmt = conn.createStatement();ResultSet rs = stmt.executeQuery(query)){
           while(rs.next()){
               mWaffleMenu.add(new Product(rs.getString("ProductCode"),rs.getString("ProductName"),rs.getInt("Price"),rs.getString("ProductType")));
           }
           if(conn!=null)
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()); 
        }
        return mWaffleMenu;
    }
    public void updateSales(ArrayList<Order> order){
        String query = "";
        
        for(int i =0;i<order.size();i++){
            query = "INSERT INTO Inventory (ProductName,Quantity,TotalPrice) "
                    + "VALUES ('"+order.get(i).getMp().getmProductName()+"',"+order.get(i).getQuantity()+","+order.get(i).getTotal()+")";
        }
        
        try(Connection conn = this.connect();Statement stmt = conn.createStatement()){
          stmt.executeUpdate(query);
           if(conn!=null)
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()); 
        }
    }
    public ArrayList<Order> getSales(){
        String query = "SELECT * FROM Inventory";
        try(Connection conn = this.connect();Statement stmt = conn.createStatement();ResultSet rs = stmt.executeQuery(query)){
           while(rs.next()){
               mOrders.add(new Order(rs.getString("ProductName"),rs.getInt("Quantity"),rs.getInt("TotalPrice")));
           }
           if(conn!=null)
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage()); 
        }
        return mOrders;
    }
}
