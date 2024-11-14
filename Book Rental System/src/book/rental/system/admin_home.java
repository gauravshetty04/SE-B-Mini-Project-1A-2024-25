/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package book.rental.system;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shaily Gupta
 */
public class admin_home extends javax.swing.JFrame {

    /**
     * Creates new form admin_home
     */
    public admin_home() {
        initComponents();
        table_update();
        table_user();
        
    }
    
    Connection con;
    PreparedStatement insert;
     private void table_update(){
           int c;
           try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_rental_system" , "root" , "123456");
            insert = con.prepareStatement("SELECT * FROM admin_book");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            c = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
            df.setRowCount((0));
            
            while(rs.next()){
                Vector v2 = new Vector();
                for(int a=1;a<=c;a++){
                   v2.add(rs.getString("sr"));
                   v2.add(rs.getBlob("image"));
                   v2.add(rs.getString("name"));
                   v2.add(rs.getString("genres"));
                   v2.add(rs.getString("author"));
                   v2.add(rs.getString("rent_amt"));
                   
                }
                
                df.addRow(v2);
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(add_books.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         catch (SQLException ex) {
            Logger.getLogger(add_books.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
      private void table_user(){
           int c;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_rental_system" , "root" , "123456");
            insert = con.prepareStatement("SELECT * FROM usersignup");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            c = rss.getColumnCount();
            
            DefaultTableModel df = (DefaultTableModel)user.getModel();
            df.setRowCount((0));
            
             while(rs.next()){
                Vector v2 = new Vector();
                for(int a=1;a<=c;a++){
                   v2.add(rs.getString("id"));
                   v2.add(rs.getString("username"));
                   v2.add(rs.getString("email"));
                   v2.add(rs.getString("phone"));
                   
                }
                
                df.addRow(v2);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(admin_home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(admin_home.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtname = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_dash = new javax.swing.JPanel();
        btnhome = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        add_book = new javax.swing.JButton();
        edit_books = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        user = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 74));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BTB");

        txtname.setBackground(new java.awt.Color(0, 0, 0));
        txtname.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtname.setForeground(new java.awt.Color(255, 255, 255));
        txtname.setText("Welcome,Admin");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book (2).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-logout-30.png"))); // NOI18N
        jLabel1.setText("LOGOUT");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1002, Short.MAX_VALUE)
                .addComponent(txtname)
                .addGap(61, 61, 61)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1517, 80));

        panel_dash.setBackground(new java.awt.Color(102, 102, 102));
        panel_dash.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnhome.setBackground(new java.awt.Color(102, 102, 102));
        btnhome.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnhome.setForeground(new java.awt.Color(255, 255, 204));
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeicons2 (2)_1.png"))); // NOI18N
        btnhome.setText("HOME");
        btnhome.setBorder(null);
        btnhome.setBorderPainted(false);
        btnhome.setContentAreaFilled(false);
        btnhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usericons.png"))); // NOI18N
        jButton3.setText("USER PROFILE");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        add_book.setBackground(new java.awt.Color(102, 102, 102));
        add_book.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        add_book.setForeground(new java.awt.Color(255, 255, 204));
        add_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bookicon.png"))); // NOI18N
        add_book.setText("ADD BOOKS");
        add_book.setBorder(null);
        add_book.setBorderPainted(false);
        add_book.setContentAreaFilled(false);
        add_book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bookActionPerformed(evt);
            }
        });

        edit_books.setBackground(new java.awt.Color(102, 102, 102));
        edit_books.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        edit_books.setForeground(new java.awt.Color(255, 255, 204));
        edit_books.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editicons.png"))); // NOI18N
        edit_books.setText("EDIT BOOKS");
        edit_books.setBorder(null);
        edit_books.setBorderPainted(false);
        edit_books.setContentAreaFilled(false);
        edit_books.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_booksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_dashLayout = new javax.swing.GroupLayout(panel_dash);
        panel_dash.setLayout(panel_dashLayout);
        panel_dashLayout.setHorizontalGroup(
            panel_dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edit_books, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(add_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnhome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        panel_dashLayout.setVerticalGroup(
            panel_dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dashLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnhome)
                .addGap(36, 36, 36)
                .addComponent(add_book, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(edit_books, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(505, Short.MAX_VALUE))
        );

        getContentPane().add(panel_dash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 210, -1));

        jPanel4.setBackground(new java.awt.Color(224, 244, 224));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "SR NO.", "IMAGE", "BOOK NAME", "GENRES", "AUTHOR", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setDragEnabled(true);
        jTable1.setGridColor(new java.awt.Color(245, 238, 238));
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable1.setSelectionForeground(new java.awt.Color(0, 51, 255));
        jTable1.setShowGrid(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 620, 470));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel15.setText("USER DETAILS");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 180, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel16.setText("BOOK DETAILS");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 150, -1));

        user.setBackground(new java.awt.Color(202, 227, 227));
        user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Email", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(user);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 600, 470));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 1310, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhomeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        admin_userProfile obj1 = new admin_userProfile();
        obj1.setVisible(true);
        obj1.pack();        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void add_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bookActionPerformed
        // TODO add your handling code here:
        
        add_books obj1 = new add_books();
        obj1.setVisible(true);
        obj1.pack();
        //obj1.show();
        //dispose();
    }//GEN-LAST:event_add_bookActionPerformed

    private void edit_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_booksActionPerformed
        // TODO add your handling code here:
        edit_books obj1 = new edit_books();
        obj1.setVisible(true);
        obj1.pack();
        //obj1.show();
        //dispose();
    }//GEN-LAST:event_edit_booksActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        
            welcome obj1 = new welcome();
            obj1.show();
            dispose();
       
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        table_update();
        
    }//GEN-LAST:event_jTable1MouseClicked

    
        //database connection
         public void setUser(String name){
            txtname.setText(name);
        }
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
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_book;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton edit_books;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panel_dash;
    private javax.swing.JLabel txtname;
    private javax.swing.JTable user;
    // End of variables declaration//GEN-END:variables
}
