import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
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
        sid = new javax.swing.JTextField();
        bkid = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        publisher = new javax.swing.JTextField();
        dd = new com.toedter.calendar.JDateChooser();
        isd = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(360, 300));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Due Date");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 130, 40));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Book Issue Form ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 340, 50));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setText("Book ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, 40));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setText("Student ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 130, 40));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setText("Issue Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 130, 40));

        close.setBackground(new java.awt.Color(251, 137, 111));
        close.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon("/home/sss/NetBeansProjects/Library Management System/src/Icons/red-x-mark-transparent-background-3.png")); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 110, 40));

        save.setBackground(new java.awt.Color(132, 255, 94));
        save.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon("/home/sss/NetBeansProjects/Library Management System/src/Icons/issue book.png")); // NOI18N
        save.setText("Issue");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 110, 40));

        sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidActionPerformed(evt);
            }
        });
        getContentPane().add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 300, 40));

        bkid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkidActionPerformed(evt);
            }
        });
        getContentPane().add(bkid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 300, 40));

        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 300, 40));

        publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisherActionPerformed(evt);
            }
        });
        getContentPane().add(publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 300, 40));
        getContentPane().add(dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 300, 40));
        getContentPane().add(isd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 300, 40));

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
        String bookID =bkid.getText();
        String studentID = sid.getText();

        SimpleDateFormat dFormat= new SimpleDateFormat("dd-MM-yyyy");
        String issueDate = dFormat.format(isd.getDate());
        String dueDate   = dFormat.format(dd.getDate());
        String returnBook="No";

        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from bookshelf where bookID="+bookID);
            if(rs.next()){
                ResultSet rs1 = st.executeQuery("select * from student where studentID="+studentID);
                if(rs1.next()){
                    st.executeUpdate("insert into issuebook values('"+bookID+"','"+studentID+"','"+issueDate+"','"+dueDate+"','"+returnBook+"')");
                    JOptionPane.showMessageDialog(null, "Book Issued Successfully!");
                    setVisible(false);
                    new IssueBook().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Student is not registered");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Book doesn't exist");
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Book cannot be Issued");
            setVisible(false);
            new IssueBook().setVisible(true);

        }
    }//GEN-LAST:event_saveActionPerformed

    private void sidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidActionPerformed

    private void bkidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bkidActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void publisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisherActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bkid;
    private javax.swing.JButton close;
    private com.toedter.calendar.JDateChooser dd;
    private com.toedter.calendar.JDateChooser isd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField publisher;
    private javax.swing.JButton save;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
