/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onlinebanking2;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Transfer extends javax.swing.JFrame {

    JDBC db;
    String SenderId;
    String Reciever;
    JFrame f=new JFrame();
    public Transfer(String id) {
        initComponents();
        this.setBounds(0,0,514,400);
        db=new JDBC();
        
        SenderId=id;
        String s2,s3;
       
        
        s2="select * from tb_signup ";
        try
        {
          db.rs=db.stm.executeQuery(s2);
          while(db.rs.next())
          {
              String name=db.rs.getString("fd_AccountId");
              jComboBox1.addItem(name);
              String amount=db.rs.getString("fd_Amount");
              jLabel5.setText(amount);
          }
        }
        
        catch(Exception ec)
        {
            System.out.println(ec);
        }
        
        s2="select * from tb_signup where fdSNo='"+SenderId+"'";
        try
        {
          db.rs=db.stm.executeQuery(s2);
          while(db.rs.next())
          {
              
              String amount=db.rs.getString("fd_Amount");
              jLabel5.setText(amount);
          }
        }
        
        catch(Exception ec)
        {
            System.out.println(ec);
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Account Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 120, 70, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Account" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(280, 120, 160, 29);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Amount");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(91, 201, 60, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(277, 201, 160, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Current Amount");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(91, 164, 100, 20);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 160, 150, 25);

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 300, 72, 23);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setText("Transfer Money");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(210, 60, 130, 20);

        jButton2.setText("cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 300, 72, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bb3d027efc8586606821a1c60c10a986.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 560, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        Reciever=jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

String amount, s8, s2, s20 = null;
int id;
amount = jTextField1.getText();

//Current date and time start//
Date date = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
String str = formatter.format(date);
//Current date and time End//



if (amount.equals("")) {
    JOptionPane.showMessageDialog(f, "Empty Field");
} else {


    String s11 = "Select * from tb_signup where fdSNo='" + SenderId + "'";

    try {
        db.rs = db.stm.executeQuery(s11);

        db.rs.next();

        s20 = db.rs.getString(12);

    } catch (Exception ec) {
        System.out.println(ec);
    }

    int amount11, s14;
    amount11 = Integer.parseInt(amount);
    s14 = Integer.parseInt(s20);
    if (s14 <= amount11) 
    {
        JOptionPane.showMessageDialog(f, "InSufficient Amount");
    } else {

        s8 = "INSERT INTO tb_transactions(fd_SenderId,fd_RecieverId,fd_Amount,fd_DateTime)VALUES('" + SenderId + "','" + Reciever + "','" + amount + "','" + str + "')";
        try {
            db.stm.executeUpdate(s8);

        } catch (Exception ec) {
            System.out.println(ec);
        }

        s2 = "select * from tb_signup where fd_AccountId='" + Reciever + "'";
        try {
            db.rs = db.stm.executeQuery(s2);
            db.rs.next();
            int Reciver_amount = db.rs.getInt(12);
            int amount1 = Integer.parseInt(amount);
            int Total_Amount = Reciver_amount + amount1;

            String s10 = "Update  tb_signup set fd_Amount='" + Total_Amount + "' where fd_AccountId='" + Reciever + "'";
            System.out.println(s10);
            try {
                db.stm.executeUpdate(s10);
            } catch (Exception ec) {
                System.out.println(ec);
            }
        } catch (Exception ec) {

            System.out.println(ec);
        }

        s2 = "select * from tb_signup where fdSNo='" + SenderId + "'";
        try {
            db.rs = db.stm.executeQuery(s2);
            db.rs.next();
            int Reciver_amount = db.rs.getInt(12);
            int amount1 = Integer.parseInt(amount);
            int Total_Amount = Reciver_amount - amount1;

            String s12 = "Update tb_signup set fd_Amount='" + Total_Amount + "' where fdSNo='" + SenderId + "'";
            System.out.println(s12);
            try {
                db.stm.executeUpdate(s12);
            } catch (Exception ec) {
                System.out.println(ec);
            }
        } catch (Exception ec) {
            System.out.println(ec);
        }

    }
    
    this.dispose();
}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
