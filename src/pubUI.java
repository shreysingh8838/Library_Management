

import java.sql.*;
import javax.swing.JOptionPane;

public class pubUI extends javax.swing.JFrame {

    /** Creates new form pubUI */
    public pubUI() {
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

        cmdExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtPno = new javax.swing.JTextField();
        cmdNew = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPName = new javax.swing.JTextField();
        txtPAdd = new javax.swing.JTextField();
        txtPh1 = new javax.swing.JTextField();
        txtPh2 = new javax.swing.JTextField();
        cmdSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        cmdClear = new javax.swing.JButton();
        cmdEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Publisher Console - Library Management System");
        setBounds(new java.awt.Rectangle(200, 70, 0, 0));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        cmdExit.setText("Exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel1.setText("Publisher No./ID");

        cmdNew.setText("New");
        cmdNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNewActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel4.setText("Phone/Mobile");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel5.setText("Pbone/Mobile");

        txtPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNameActionPerformed(evt);
            }
        });
        txtPName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtPNamePropertyChange(evt);
            }
        });
        txtPName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPNameKeyPressed(evt);
            }
        });

        cmdSave.setText("Save");
        cmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("VAGRounded BT", 1, 14));
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PUBLISHER INFORMATION");

        cmdClear.setText("Clear");
        cmdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClearActionPerformed(evt);
            }
        });

        cmdEdit.setText("Edit");
        cmdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(cmdNew)
                .addGap(18, 18, 18)
                .addComponent(cmdSave)
                .addGap(18, 18, 18)
                .addComponent(cmdEdit)
                .addGap(18, 18, 18)
                .addComponent(cmdClear)
                .addGap(18, 18, 18)
                .addComponent(cmdExit)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPName, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addComponent(txtPno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtPh2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPh1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdNew)
                    .addComponent(cmdSave)
                    .addComponent(cmdEdit)
                    .addComponent(cmdClear)
                    .addComponent(cmdExit))
                .addGap(40, 40, 40))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-416)/2, (screenSize.height-365)/2, 416, 365);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
    new MainUI ().setVisible(true);
        dispose();
    }//GEN-LAST:event_cmdExitActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        txtPno.setEditable(false);
        // Deactivate the Save button when form loads
        cmdSave.setEnabled(false);
    }//GEN-LAST:event_formWindowGainedFocus

    private void cmdNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNewActionPerformed
        // Activate the Save button when New button clicked
        cmdSave.setEnabled(true);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","joker9810");
            Statement stmt = null;
            ResultSet rs = null;        // ResultSet for publisher table.
            String SQL = "SELECT * FROM publisher";
            stmt = con.createStatement();   // Connection string for  ResultSet - rs.
            rs = stmt.executeQuery(SQL);
            int pno = 1;
            int PID=0;
            while (rs.next()) {
                PID = rs.getInt("pub_id");
                pno++;
            }
            PID++;
            pno = PID;
            txtPno.setText(Integer.toString(pno));
            txtPName.setFocusable(true);
            con.close();
            rs.close();
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmdNewActionPerformed

    private void txtPNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtPNamePropertyChange
        
    }//GEN-LAST:event_txtPNamePropertyChange

    private void txtPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNameActionPerformed
        
    }//GEN-LAST:event_txtPNameActionPerformed

    private void txtPNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPNameKeyPressed
        
    }//GEN-LAST:event_txtPNameKeyPressed

    private void cmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","joker9810");
            Statement stmt = null;
            ResultSet rs = null;
            String SQL = "SELECT * FROM publisher";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);

            int Pno = Integer.parseInt(txtPno.getText());
            String PName = txtPName.getText();
            String PAdd = txtPAdd.getText();
            String Pph1 = txtPh1.getText();
            String Pph2 = txtPh2.getText();
            char PStatus = 'Y';
            int code = JOptionPane.showConfirmDialog(this, "Are you sure to add?", "Confirmation Dialog Box", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (code == JOptionPane.YES_OPTION) {
                String strSQL = "INSERT INTO Publisher(pub_id, pub_name, pub_address, pub_phone1, pub_phone2, status) VALUES ("+(Pno)+", '"+(PName)+"', '"+(PAdd)+"', '"+(Pph1)+"', '"+(Pph2)+"', '"+(PStatus)+"')";
                int rowsEffected = stmt.executeUpdate(strSQL);
                JOptionPane.showMessageDialog(this, "Record added successfully into Publisher table");
            }
            con.close();
            stmt.close();
            rs.close();
            cmdSave.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_cmdSaveActionPerformed

    private void cmdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearActionPerformed
        txtPno.setText("");
        txtPName.setText("");
        txtPAdd.setText("");
        txtPh1.setText("");
        txtPh2.setText("");
        cmdSave.setEnabled(false);
    }//GEN-LAST:event_cmdClearActionPerformed

    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditActionPerformed
        this.setVisible(false);
        new PubEditUI().setVisible(true);
    }//GEN-LAST:event_cmdEditActionPerformed

    /**
    * @param args the command line arguments
    */
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pubUI().setVisible(true);
                new pubUI().setSize(500, 500);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdClear;
    private javax.swing.JButton cmdEdit;
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdNew;
    private javax.swing.JButton cmdSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtPAdd;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtPh1;
    private javax.swing.JTextField txtPh2;
    private javax.swing.JTextField txtPno;
    // End of variables declaration//GEN-END:variables
}