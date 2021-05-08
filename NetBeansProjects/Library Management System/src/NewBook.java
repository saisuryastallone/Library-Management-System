import java.sql.*;
import javax.swing.JOptionPane;
public class NewBook extends javax.swing.JFrame {

    /**
     * Creates new form NewBook
     */
    public NewBook() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        save = new javax.swing.JButton();
        bn = new javax.swing.JTextField();
        bid = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        publisher = new javax.swing.JTextField();
        yp = new javax.swing.JTextField();
        pub = new javax.swing.JTextField();
        year1 = new javax.swing.JTextField();
        publisher1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(360, 300));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Year of Publication");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 170, 40));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Book Shelf");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 320, 50));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setText("Book ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 130, 40));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setText("Book Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 130, 40));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setText("Publisher");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 130, 40));

        close.setBackground(new java.awt.Color(251, 137, 111));
        close.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon("/home/sss/NetBeansProjects/Library Management System/src/Icons/red-x-mark-transparent-background-3.png")); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 110, 40));

        save.setBackground(new java.awt.Color(132, 255, 94));
        save.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon("/home/sss/NetBeansProjects/Library Management System/src/Icons/save-icon--1.png")); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 110, 40));

        bn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnActionPerformed(evt);
            }
        });
        getContentPane().add(bn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 300, 40));

        bid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidActionPerformed(evt);
            }
        });
        getContentPane().add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 300, 40));

        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 300, 40));

        publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisherActionPerformed(evt);
            }
        });
        getContentPane().add(publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 300, 40));

        yp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ypActionPerformed(evt);
            }
        });
        getContentPane().add(yp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 300, 40));

        pub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pubActionPerformed(evt);
            }
        });
        getContentPane().add(pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 300, 40));

        year1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year1ActionPerformed(evt);
            }
        });
        getContentPane().add(year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 300, 40));

        publisher1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisher1ActionPerformed(evt);
            }
        });
        getContentPane().add(publisher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 300, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon("/home/sss/NetBeansProjects/Library Management System/src/Icons/form_bg.png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String bookName = bn.getText();
        String bookID = bid.getText();
        String publisher = pub.getText();
        String year_published = yp.getText() ;

        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into bookshelf values('"+bookID+"','"+bookName+"','"+publisher+"','"+year_published+"')");
            JOptionPane.showMessageDialog(null, "New Added to the Book Shelf!");
            setVisible(false);
            new NewBook().setVisible(true);

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Book already exists in our library");
            setVisible(false);
            new NewBook().setVisible(true);

        }
    }//GEN-LAST:event_saveActionPerformed

    private void bnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnActionPerformed

    private void bidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bidActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void publisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisherActionPerformed

    private void ypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ypActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ypActionPerformed

    private void pubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pubActionPerformed

    private void year1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year1ActionPerformed

    private void publisher1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisher1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisher1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bid;
    private javax.swing.JTextField bn;
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField pub;
    private javax.swing.JTextField publisher;
    private javax.swing.JTextField publisher1;
    private javax.swing.JButton save;
    private javax.swing.JTextField year;
    private javax.swing.JTextField year1;
    private javax.swing.JTextField yp;
    // End of variables declaration//GEN-END:variables
}
