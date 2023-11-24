
package inventoryapp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Splash extends javax.swing.JFrame {
    
    public Splash() {
        initComponents();
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pbar = new javax.swing.JProgressBar();
        txtpin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pbar.setBackground(new java.awt.Color(0, 204, 204));
        pbar.setForeground(new java.awt.Color(102, 0, 0));
        jPanel1.add(pbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 344, 700, 10));

        txtpin.setBackground(new java.awt.Color(255, 255, 255));
        txtpin.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtpin.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(txtpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 40, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("PETS WORLD MANAGEMENT SYSTEM ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryapp/home icon1.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 102, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("PETS WORLD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        Splash p = new Splash();
         
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               p.setVisible(true);
            }
        });
      Login n = new Login();
        try{
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(100);
                p.pbar.setValue(i);
                p.txtpin.setText(String.valueOf(i)+"%");
                if(i==100)
                {
                    p.setVisible(false);
                   p.dispose();
                }
            }
        }catch (InterruptedException ex)
        {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null,ex);
        }
        n.setVisible(true);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar pbar;
    private javax.swing.JLabel txtpin;
    // End of variables declaration//GEN-END:variables
}
