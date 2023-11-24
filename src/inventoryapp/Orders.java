

package inventoryapp;

import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Orders extends javax.swing.JFrame {

  
    public Orders() {
        initComponents();
        ProdFetch();
    }
public void ProdFetch(){ 
        PreparedStatement ps; 
        try{ 
                String sql = "select * from products";  
                ps = ConnectionClass.getConnection().prepareStatement(sql); 
                ResultSet rs = ps.executeQuery(sql); 
                while(rs.next()){ 
                    String Prodid = String.valueOf(rs.getInt("petnumber")); 
                    
                    String Name = rs.getString("petname"); 
                    String Quantity = rs.getString("petqnty");
                    String Price = rs.getString("petdesc");
                    String Category1 = rs.getString("petcat"); 
                    
                  
                    String tdata[] = {Prodid,Name,Quantity,Price,Category1}; 
                    DefaultTableModel tblmodel = (DefaultTableModel) producttable.getModel(); 
                    tblmodel.addRow(tdata); 
                } 
            } 
            catch(Exception e){ 
                System.out.println(e); 
            } 
    }
     public void BillFetch(){ 
         int id = Integer.parseInt(custid.getText());
        PreparedStatement ps; 
        try{ 
                String sql = "select * from customer where custid ='"+id+"'";  
                ps = ConnectionClass.getConnection().prepareStatement(sql); 
                ResultSet rs = ps.executeQuery(sql);
                while(rs.next()){ 
                    String Prodid = String.valueOf(rs.getInt("custid")); 
                    
                    String Name = rs.getString("billid"); 
                    String Quantity = rs.getString("eprice");
                    String pname = rs.getString("petname");
                   
                  String amt = rs.getString("tamount");
                      String    number = rs.getString("phone"); 
                   
                    
                  
                    String tdata[] = {Name,Prodid,pname,Quantity,amt,number}; 
                    DefaultTableModel tblmodel = (DefaultTableModel) billtable.getModel(); 
                    tblmodel.addRow(tdata); 
                    
                }
            } 
            catch(Exception e){ 
                System.out.println(e); 
            } 
     }
      public void clear(){ 
       billid.setText("");
       custid.setText("");
       phone.setText("");
       epricetf.setText("");
       qnty.setText("");
      }
  
   Connection Con = null;
   Statement St = null;
   ResultSet Rs = null;
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        billid = new javax.swing.JTextField();
        AddBin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        producttable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        billtable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        epricetf = new javax.swing.JTextField();
        qnty = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        AddBin2 = new javax.swing.JButton();
        custid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(0, 102, 51));
        jPanel4.setToolTipText("X");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PETS WORLD SYSTEM");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MANAGE ORDERS");

        mini.setBackground(new java.awt.Color(255, 255, 255));
        mini.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        mini.setForeground(new java.awt.Color(255, 255, 255));
        mini.setText("-");
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(494, 494, 494))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(423, 423, 423))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(414, 414, 414)))
                .addComponent(mini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(mini)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("CUSTID");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 20));

        billid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billidActionPerformed(evt);
            }
        });
        jPanel3.add(billid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 134, 25));

        AddBin.setBackground(new java.awt.Color(153, 0, 0));
        AddBin.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        AddBin.setForeground(new java.awt.Color(255, 255, 255));
        AddBin.setText("ADD TO BILL");
        AddBin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBinMouseClicked(evt);
            }
        });
        AddBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBinActionPerformed(evt);
            }
        });
        jPanel3.add(AddBin, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        producttable.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        producttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PETID", "NAME", "QUANTITY", "Description", "Category"
            }
        ));
        producttable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        producttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(producttable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1010, 213));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 204, 204));
        jButton4.setText("BACK");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 51));
        jLabel12.setText("MANAGE PETS");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, 31));

        billtable.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        billtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BILLID", "CUSTID", "PET", "EPRICE", "AMOUNT", "PHONE"
            }
        ));
        billtable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        billtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billtableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(billtable);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 310, 720, 280));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("T.AMOUNT");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, -1, 20));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel3.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 134, 25));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("PRICE");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 40, 20));
        jPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 600, 97, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, -1, -1));

        epricetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epricetfActionPerformed(evt);
            }
        });
        jPanel3.add(epricetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 134, 25));

        qnty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qntyActionPerformed(evt);
            }
        });
        jPanel3.add(qnty, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 134, 25));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("QUANTITY");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 70, 20));

        AddBin2.setBackground(new java.awt.Color(255, 204, 204));
        AddBin2.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        AddBin2.setText("DELETE");
        AddBin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBin2MouseClicked(evt);
            }
        });
        AddBin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBin2ActionPerformed(evt);
            }
        });
        jPanel3.add(AddBin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, -1, -1));

        custid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custidActionPerformed(evt);
            }
        });
        jPanel3.add(custid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 134, 25));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("PHONE");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, 20));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("BILLID");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
this.dispose();     
    }//GEN-LAST:event_jLabel1MouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void custidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custidActionPerformed
       
    }//GEN-LAST:event_custidActionPerformed

    private void AddBin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBin2ActionPerformed
        DefaultTableModel tblmodel = (DefaultTableModel) billtable.getModel();
 int index = billtable.getSelectedRow();
 int id = Integer.parseInt(tblmodel.getValueAt(index,0).toString());

 PreparedStatement ps;

 try{
     String sql = "select tamount from customer where billid = '"+billid.getText()+"'";
            ps = ConnectionClass.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while(rs.next())
            {
                  String amt = rs.getString("tamount");  
                     tamt -=  Integer.parseInt(amt);
                     total.setText(Integer.toString(tamt));
            }
 int option = JOptionPane.showConfirmDialog(rootPane, "Are You Sure?", "DeleteConfirmation", JOptionPane.YES_NO_OPTION);
 if(option==0){
 ps = ConnectionClass.getConnection().prepareStatement("delete from customer where billid = ?");
 ps.setInt(1, id);
 boolean rs1 = ps.execute();
 }
 DefaultTableModel tblmodel1 = (DefaultTableModel) billtable.getModel();
 tblmodel1.setRowCount(0);
 BillFetch();
 clear();
 

 }
 catch(Exception e){
 System.out.println(e);
 }
    }//GEN-LAST:event_AddBin2ActionPerformed

    private void AddBin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBin2MouseClicked
       
    }//GEN-LAST:event_AddBin2MouseClicked

    private void qntyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qntyActionPerformed
       
    }//GEN-LAST:event_qntyActionPerformed

    private void epricetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epricetfActionPerformed
        
    }//GEN-LAST:event_epricetfActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
       
    }//GEN-LAST:event_phoneActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        HomeFrom hf=new HomeFrom();
        hf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void producttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producttableMouseClicked
        int index = producttable.getSelectedRow();
        TableModel model = producttable.getModel();
        petname = model.getValueAt(index,1).toString();
    }//GEN-LAST:event_producttableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tblmodel = (DefaultTableModel) billtable.getModel();
        int index = billtable.getSelectedRow();
        int Proid = Integer.parseInt(tblmodel.getValueAt(index,0).toString());
        String Pronumber = custid.getText();
        String Proname = billid.getText();
        String Proprice = epricetf.getText();
        String Proqty = qnty.getText();
        String Phone = phone.getText();
         amount = Integer.toString(Integer.parseInt(Proqty)*Integer.parseInt(Proprice));
        tamt +=  Integer.parseInt(amount);
        PreparedStatement ps;
        
        try{
            String sql = "select tamount from customer where billid = '"+billid.getText()+"'";
            ps = ConnectionClass.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while(rs.next())
            {
                  String amt = rs.getString("tamount");  
                     tamt -=  Integer.parseInt(amt);
            }
              String tamount = Integer.toString(tamt);
            ps = ConnectionClass.getConnection().prepareStatement("update customer set custid = ?,eprice = ?,qnty = ?,phone = ?,tamount = ?,petname = ? where billid = ?");
            ps.setString(1, Pronumber);                    
            ps.setString(2, Proprice);   
            ps.setString(3, Proqty); 
            ps.setString(4, Phone);
             ps.setString(5, tamount);
              ps.setString(6, petname);
             ps.setString(7, Proname);
            int rs1 = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Bill Updated Succesfully");
            DefaultTableModel tblmodel1 = (DefaultTableModel) billtable.getModel();
            tblmodel1.setRowCount(0);
            BillFetch();
             total.setText(tamount);
             clear();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
  int oldid = 0;   
    private void AddBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBinActionPerformed
        String uid = custid.getText();
        String username = billid.getText();
        String description = qnty.getText();
        String price = epricetf.getText();
        String number = phone.getText();
        amount = Integer.toString(Integer.parseInt(description)*Integer.parseInt(price));     
         if(oldid != Integer.parseInt(uid))
         {
         tamt = 0;
         }             
tamt +=  Integer.parseInt(amount);
        String tamount = Integer.toString(tamt);
        PreparedStatement ps;
        try{
            String sql = "insert into customer(custid,billid,eprice,qnty,phone,tamount,petname) values ('"+uid+"','"+username+"','"+price+"','"+description+"','"+number+"','"+amount+"','"+petname+"')";

            ps = ConnectionClass.getConnection().prepareStatement(sql);
            int rs = ps.executeUpdate(sql);
            DefaultTableModel tblmodel1 = (DefaultTableModel) billtable.getModel();
            tblmodel1.setRowCount(0);
            BillFetch();
            total.setText(tamount);
            clear();
            oldid = Integer.parseInt(uid);
            if(rs == 1)
            JOptionPane.showMessageDialog(this,"Added Successfully");
            else
            JOptionPane.showMessageDialog(this,"NO Added");

        }catch(HeadlessException | SQLException ae)
        {
            System.out.println(ae);
        }

    }//GEN-LAST:event_AddBinActionPerformed

    private void AddBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBinMouseClicked

    }//GEN-LAST:event_AddBinMouseClicked

    private void billidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billidActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    
    private void billtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billtableMouseClicked
int index = billtable.getSelectedRow();
 TableModel model = billtable.getModel();
 billid.setText(model.getValueAt(index,0).toString());
 custid.setText(model.getValueAt(index,1).toString());
epricetf.setText(model.getValueAt(index,3).toString());
 phone.setText(model.getValueAt(index,5).toString());          
    }//GEN-LAST:event_billtableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed
String amount;
int tamt = 0;
String petname;
int tamount = 0 ;

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
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBin;
    private javax.swing.JButton AddBin2;
    private javax.swing.JTextField billid;
    private javax.swing.JTable billtable;
    private javax.swing.JTextField custid;
    private javax.swing.JTextField epricetf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel mini;
    private javax.swing.JTextField phone;
    private javax.swing.JTable producttable;
    private javax.swing.JTextField qnty;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables

}
