
package inventoryapp;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ADMIN extends javax.swing.JFrame {

    
    public ADMIN() {
        initComponents();
    }

    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Password = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        ViewPassword = new javax.swing.JCheckBox();
        password = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Password.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin Login");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("-");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Password.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 80));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Password");
        Password.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Admin id");
        Password.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        username.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Password.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 170, -1));

        jButton1.setForeground(new java.awt.Color(0, 51, 153));
        jButton1.setText("CLEAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        Password.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 90, 30));

        jButton2.setForeground(new java.awt.Color(0, 51, 153));
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Password.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Manikandan\\Desktop\\admin.png")); // NOI18N
        Password.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 110));

        jTextField3.setBackground(new java.awt.Color(51, 0, 51));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        Password.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 470, 10));

        ViewPassword.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        ViewPassword.setText("View password");
        ViewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewPasswordActionPerformed(evt);
            }
        });
        Password.add(ViewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        Password.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 170, -1));

        jButton4.setBackground(new java.awt.Color(51, 0, 51));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("HOME");
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
        Password.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ViewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewPasswordActionPerformed
if(ViewPassword.isSelected()){
          password.setEchoChar((char)0);
        }
        else
            password.setEchoChar('*');        
    }//GEN-LAST:event_ViewPasswordActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();       
    }//GEN-LAST:event_jLabel2MouseClicked
private char [] con = null;
    
    private boolean checkIfCorrect(char [] pswd){
                boolean isCorrect;
        isCorrect = false;
                    if(pswd.length == con.length){
                        isCorrect = Arrays.equals(pswd, con);
                    }
                    Arrays.fill(con,'0');
                
                return isCorrect;
	}
    private void getpswd(){ 
		PreparedStatement ps;
                try{
                    String sql = "select * from user_details";
                    ps = ConnectionClass.getConnection().prepareStatement(sql);
                    ResultSet rs = ps.executeQuery(sql);
                    while(rs.next()){                       
                        con = rs.getString("password").toCharArray();
                    }
                }
catch(SQLException ae){
                    System.out.println(ae);
                }

	}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String user = username.getText();
        char [] pswd = password.getPassword();
        boolean flag = false;
        
        PreparedStatement ps;
        try {
            String sql = "select * from user_details";
            ps = ConnectionClass.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
                while(rs.next()){
                String username = rs.getString("username");
                 con = rs.getString("password").toCharArray();
                if(checkIfCorrect(pswd) && user.equals("admin")){
                    flag = true;  
		}
                }
        }
        catch(HeadlessException | SQLException ae){
            System.out.println(ae);
        }
            
if(flag){
                 JOptionPane.showMessageDialog(null,"Login Successful");
                 User app = new User();
                 app.setVisible(true);
                 this.dispose();
            }
else
                 JOptionPane.showMessageDialog(null,"Incorrect Admin id Or Password");   
            
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       username.setText("");
       password.setText("");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        HomeFrom hf=new HomeFrom();
        hf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
  
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jPanel2MouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Password;
    private javax.swing.JCheckBox ViewPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
