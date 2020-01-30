/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belgianwaffleorderingsystem;
import javax.swing.*; // used for notifications
import java.util.*;
import java.io.*;
/**
 *
 * @author ddieg
 */


public class OrderForm extends javax.swing.JFrame {

    // Creates object of the Belgian Waffle Class
    BelgianWaffle mbw;
    BelgianDatabaseHandler mbdb;
    String menuDbName = "menu.db";
    String dbpath = "./src/db/";
    private ArrayList<Product> mWaffleList;
    DefaultListModel model;
    private ArrayList<Product> mCoffeeList;
    /**
     * Creates new form OrderForm
     */
    public OrderForm() {
        initComponents();
        mWaffleList = new ArrayList<Product>();
        mCoffeeList = new ArrayList<Product>();
        mbdb = new BelgianDatabaseHandler(dbpath+menuDbName);
        resetQuantityBox();
        generateMenu();
        //if done generating menu
        //update orderhandler BelgianWaffle class for the items
        mbw = new BelgianWaffle(mWaffleList,mCoffeeList,mbdb);
        model = new DefaultListModel();
      
    }
    
    public void resetQuantityBox(){
        waffleQuantityTxt.setText("0");
        coffeeQuantityTxt.setText("0");
    }
    //generates Menu in Both Coffee and Waffle Combobox
    public void generateMenu () 
    {
      mCoffeeList = mbdb.getCoffeeMenu();
       for(int i =0;i<mCoffeeList.size();i++){
        coffeeTypeCombo.addItem(mCoffeeList.get(i).toString());
       }
       mWaffleList = mbdb.getWaffleMenu();
       for(int j =0;j<mWaffleList.size();j++){
        waffleTypeCombo.addItem(mWaffleList.get(j).toString());
       }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        addOrderBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        plusCoffeeBtn = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        waffleQuantityTxt = new javax.swing.JTextField();
        coffeeQuantityTxt = new javax.swing.JTextField();
        plusWaffleBtn = new javax.swing.JToggleButton();
        minusWaffleBtn = new javax.swing.JToggleButton();
        minusCoffeeBtn = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        coffeeTypeCombo = new javax.swing.JComboBox<>();
        waffleTypeCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        changeTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderListbox = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        totalTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Belgian Waffle Ordering System");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Belgian Waffle Ordering System");

        jButton1.setLabel("Clear Orders");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Finalize Orders");
        jButton2.setVerifyInputWhenFocusTarget(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        addOrderBtn.setText("Add Orders");
        addOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderBtnActionPerformed(evt);
            }
        });

        plusCoffeeBtn.setText("+");
        plusCoffeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusCoffeeBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Waffle Quantity:");

        jLabel6.setText("Coffee Quantity:");

        waffleQuantityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waffleQuantityTxtActionPerformed(evt);
            }
        });

        plusWaffleBtn.setText("+");
        plusWaffleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusWaffleBtnActionPerformed(evt);
            }
        });

        minusWaffleBtn.setText("-");
        minusWaffleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusWaffleBtnActionPerformed(evt);
            }
        });

        minusCoffeeBtn.setText("-");
        minusCoffeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusCoffeeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26)
                        .addComponent(minusWaffleBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minusCoffeeBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coffeeQuantityTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(waffleQuantityTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plusWaffleBtn)
                    .addComponent(plusCoffeeBtn))
                .addGap(154, 154, 154))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(plusWaffleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(waffleQuantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minusWaffleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(coffeeQuantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minusCoffeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusCoffeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        coffeeTypeCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        waffleTypeCombo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        waffleTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waffleTypeComboActionPerformed(evt);
            }
        });

        jLabel2.setText("Waffle Order:");

        jLabel3.setText("Coffee Order:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(waffleTypeCombo, 0, 352, Short.MAX_VALUE)
                        .addComponent(coffeeTypeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(waffleTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(coffeeTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Change");

        changeTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        changeTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        changeTxt.setText("0.00");

        orderListbox.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jScrollPane2.setViewportView(orderListbox);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setText("Tendered Cash");

        totalTxt.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        totalTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalTxt.setText("0.00");
        totalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(286, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(changeTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(271, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(20, 20, 20)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(148, Short.MAX_VALUE)
                    .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(393, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(292, 292, 292)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel8)
                    .addContainerGap(545, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(475, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(addOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 58, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderBtnActionPerformed
        // Method for Add Orders button
       
        int waffleqty = Integer.parseInt(waffleQuantityTxt.getText());
        int coffeeqty = Integer.parseInt(coffeeQuantityTxt.getText());
        try{
            if(waffleqty !=0 || coffeeqty !=0){
                int waffleIndex = waffleTypeCombo.getSelectedIndex();

                int coffeeIndex =  coffeeTypeCombo.getSelectedIndex();
                mbw.addOrder(waffleIndex, coffeeIndex, waffleqty, coffeeqty);
                String a= "";
                if(coffeeqty>0){
                    a = waffleqty+"pcs. Waffle: "+mWaffleList.get(waffleIndex).getmProductName()+"\n"+
                        coffeeqty+"pcs. Coffee: "+mCoffeeList.get(coffeeIndex).getmProductName();
                }else{
                    a = waffleqty+"pcs. Waffle: "+mWaffleList.get(waffleIndex).getmProductName();
                }
                JOptionPane.showMessageDialog(null, a);
                
                updateListBox();
            }else{
                JOptionPane.showMessageDialog(null, "Must Enter valid Quantity of Waffle or Coffee");
            }
        }catch(OrderException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_addOrderBtnActionPerformed

    private void updateListBox(){
        model.clear();
        for(int i =0;i<mbw.getOrders().size();i++){
            model.addElement(mbw.getOrders().get(i).getStringFormat());
        }
        orderListbox.setModel(model);
        
        
        
    }
    private void waffleQuantityTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waffleQuantityTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waffleQuantityTxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Code for finalize orders here
//        String wTemp = bw.getWaffleOrders();
//        String [] finWaffle = wTemp.split(",");
//        String wTempNum = bw.getWaffleQuant();
//        String [] wQuantity = wTempNum.split(",");
//        prevOrderWindow.append("Waffle:\n");
//        
//        if (finWaffle.length != 0)
//        {
//            for (int i = 0; i < finWaffle.length; i++)
//            {
//                int orderPriceWaff = Integer.parseInt(wQuantity[i])*bw.getPrice(finWaffle[i]);
//                prevOrderWindow.append(finWaffle[i] + "\tPHP " + orderPriceWaff + "\n"); 
//            }            
//        }
//        
//        else // no waffle orders
//        {
//            prevOrderWindow.append("Empty\n");
//        }
//        
//        String cTemp = bw.getCoffeeOrders();
//        String [] finCoffee = cTemp.split(",");
//        String cTempNum = bw.getCoffeeQuant();
//        String [] cQuantity = cTempNum.split(",");
//        prevOrderWindow.append("\nCoffee:\n");
//        if (finCoffee.length != 0)
//        {
//            for (int j = 0; j < finCoffee.length; j++)
//            {
//                int orderPriceCoff = Integer.parseInt(cQuantity[j])*bw.getPrice(finCoffee[j]);
//                prevOrderWindow.append(finCoffee[j] + "\t PHP"  + orderPriceCoff + "\n"); 
//            }
//        }
//        
//        else // no coffee orders
//        {
//            prevOrderWindow.append("Empty\n");
//        }
//        
//        // compute total cost
//        int totCost = bw.getTotalPrice();
//        prevOrderWindow.append ("\nTotal cost: \t PHP " + totCost);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void waffleTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waffleTypeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waffleTypeComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Code to clear orders
//        bw.clearOrders(); // empties contents of array list in BelgianWaffle class

    }//GEN-LAST:event_jButton1ActionPerformed

    private void minusCoffeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusCoffeeBtnActionPerformed
        // TODO add your handling code here:
        int tempCoffeeQuantity = Integer.parseInt(coffeeQuantityTxt.getText());
        if(tempCoffeeQuantity!=0)
            tempCoffeeQuantity--;
        coffeeQuantityTxt.setText(Integer.toString(tempCoffeeQuantity));
    }//GEN-LAST:event_minusCoffeeBtnActionPerformed

    private void plusWaffleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusWaffleBtnActionPerformed
        // TODO add your handling code here:
        int tempWaffleQuantity = Integer.parseInt(waffleQuantityTxt.getText());
        tempWaffleQuantity++;
        waffleQuantityTxt.setText(Integer.toString(tempWaffleQuantity));
    }//GEN-LAST:event_plusWaffleBtnActionPerformed

    private void minusWaffleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusWaffleBtnActionPerformed
        // TODO add your handling code here:
        int tempWaffleQuantity = Integer.parseInt(waffleQuantityTxt.getText());
        if(tempWaffleQuantity!=0)
            tempWaffleQuantity--;
        waffleQuantityTxt.setText(Integer.toString(tempWaffleQuantity));
    }//GEN-LAST:event_minusWaffleBtnActionPerformed

    private void plusCoffeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusCoffeeBtnActionPerformed
        // TODO add your handling code here:
        int tempCoffeeQuantity = Integer.parseInt(coffeeQuantityTxt.getText());
        tempCoffeeQuantity++;
        coffeeQuantityTxt.setText(Integer.toString(tempCoffeeQuantity));
    }//GEN-LAST:event_plusCoffeeBtnActionPerformed

    private void totalTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTxtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderForm().setVisible(true);
                

                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrderBtn;
    private javax.swing.JTextField changeTxt;
    private javax.swing.JTextField coffeeQuantityTxt;
    private javax.swing.JComboBox<String> coffeeTypeCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton minusCoffeeBtn;
    private javax.swing.JToggleButton minusWaffleBtn;
    private javax.swing.JList<String> orderListbox;
    private javax.swing.JToggleButton plusCoffeeBtn;
    private javax.swing.JToggleButton plusWaffleBtn;
    private javax.swing.JTextField totalTxt;
    private javax.swing.JTextField waffleQuantityTxt;
    private javax.swing.JComboBox<String> waffleTypeCombo;
    // End of variables declaration//GEN-END:variables
}
