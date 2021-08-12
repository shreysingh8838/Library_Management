

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.DefaultComboBoxModel;

public class LibEditUI1 extends javax.swing.JFrame {
    private Statement stmt;
    private ResultSet rs;
    private String SQL;

    /** Creates new form LibEditUI1 */
    public LibEditUI1() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPID = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        txtPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPages = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEdition = new javax.swing.JTextField();
        txtBTitle = new javax.swing.JTextField();
        txtAcno = new javax.swing.JTextField();
        txtPDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtAuth2 = new javax.swing.JTextField();
        txtAuth1 = new javax.swing.JTextField();
        cmdUpdate = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Book - Library Management System || www.ezindagi.in ||");
        setBounds(new java.awt.Rectangle(200, 70, 0, 0));

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel11.setText("Select a Book");

        jLabel3.setText("Authors");

        jLabel2.setText("Book Title");

        jLabel4.setText("Publisher");

        jLabel5.setText("Price");

        jLabel6.setText("Purchase Date");

        jLabel1.setText("Accession No.");

        jLabel12.setText("Pub ID.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("(YYYY-MM-DD)");

        jComboBox1.setModel(new DefaultComboBoxModel() );

        jLabel7.setText("Pages");

        jLabel8.setText("Edition");

        jLabel9.setText("Status");

        cmdUpdate.setText("Update");
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });

        cmdExit.setText("Exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(jLabel11))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel1))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txtPID, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPages, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAcno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPDate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAuth2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAuth1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdUpdate)
                        .addGap(59, 59, 59)
                        .addComponent(cmdExit)
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtAcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtBTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtAuth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAuth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(txtPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdExit)
                    .addComponent(cmdUpdate))
                .addGap(42, 42, 42))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-452)/2, (screenSize.height-397)/2, 452, 397);
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // getSelectedValue() method extracts the current cursor location value into a variable
        String MBook = (String) jList1.getSelectedValue();
        // Extract the first 4 characters as Accession number into a variable
        String Acno =MBook.trim().substring(0, 3);
        String query = "SELECT * FROM Lib WHERE acc_no = " + Acno + ";";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","joker9810");
            // Create SQL statement and execute query.
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                String bTitle = rs.getString("btitle");
                String Auth1 = rs.getString("author1");
                String Auth2 = rs.getString("author2");
                String PID = rs.getString("pub_id");
                String Price = rs.getString("price");
                String PDate = rs.getString("pdate");
                String pages = rs.getString("pages");
                String edition = rs.getString("edition");
                String PStatus = rs.getString("status");
                // Displaying the contents in respective text boxes.
                txtAcno.setText(Acno);
                txtBTitle.setText(bTitle);
                txtAuth1.setText(Auth1);
                txtAuth2.setText(Auth2);
                txtPID.setText(PID);
                txtPrice.setText(Price);
                txtPDate.setText(PDate);
                txtPages.setText(pages);
                txtEdition.setText(edition);
                txtStatus.setText(PStatus);
                // Close the operational object for Student
                con.close();
                stmt.close();
                rs.close();
            } else {
                JOptionPane.showMessageDialog(null, "Record does not found in Student table");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_jList1MouseClicked

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","joker9810");
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);

            int Acno = Integer.parseInt(txtAcno.getText().trim());

            String bTitle = txtBTitle.getText();
            String Auth1 = txtAuth1.getText();
            String Auth2 = txtAuth2.getText();

            // Creating a String object pName
            String pName = (String) jComboBox1.getSelectedItem();
            // Extract the first 4 characters as publisher number into a variable
            String NPubNo = String.valueOf(pName.substring(0, 3).trim());
            int Npno = Integer.parseInt(NPubNo);
            int PID = Integer.parseInt(txtPID.getText());
            if (Npno != PID)
                PID = Npno;
            float Price = Float.parseFloat(txtPrice.getText());
            int pages = Integer.parseInt(txtPages.getText());
            int edition = Integer.parseInt(txtEdition.getText());
            String Pdate = txtPDate.getText();
            String BStatus = txtStatus.getText();

            String strSQL = "Update Lib set btitle ='"+(bTitle)+"', author1 = '"+(Auth1)+"', author2 = '"+(Auth2)+"', pub_id = "+(PID)+", price = "+(Price)+", pdate = '"+(Pdate)+"', pages = "+(pages)+ ", edition = "+(edition)+", status = '"+(BStatus)+"' where acc_no = " + (Acno);
            int rowsEffected = stmt.executeUpdate(strSQL);
            if (rowsEffected == 0)
                JOptionPane.showMessageDialog(this, "Record does not exists");
            else
                JOptionPane.showMessageDialog(this,"Record modified");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_cmdUpdateActionPerformed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
      new MainUI ().setVisible(true);
        dispose();
}//GEN-LAST:event_cmdExitActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibEditUI1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAcno;
    private javax.swing.JTextField txtAuth1;
    private javax.swing.JTextField txtAuth2;
    private javax.swing.JTextField txtBTitle;
    private javax.swing.JTextField txtEdition;
    private javax.swing.JTextField txtPDate;
    private javax.swing.JTextField txtPID;
    private javax.swing.JTextField txtPages;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}