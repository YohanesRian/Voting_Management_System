package vmsGUI;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vms.candidate;
import vms.election;
import vms.electionCandidate;
import vms.fileAdmin;
import vms.fileDatabase;
import vms.user;

public class candidateFrame extends javax.swing.JFrame {

    private user vo;
    
    public candidateFrame() {
        initComponents();
    }
    
    public candidateFrame(user vo) {
        initComponents();
        this.vo = vo;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JScrollPane tableHiddenScoreCandidate1 = new javax.swing.JScrollPane();
        tableHiddenCandidate = new javax.swing.JTable();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        tfTitle = new javax.swing.JTextField();
        javax.swing.JButton btnAdd = new javax.swing.JButton();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        tfContent = new javax.swing.JTextField();
        cbElectionName = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tableCandidate = new javax.swing.JTable();
        javax.swing.JButton btnDelete = new javax.swing.JButton();
        javax.swing.JButton btnUpdate = new javax.swing.JButton();
        btnClose = new javax.swing.JLabel();

        tableHiddenCandidate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tableHiddenCandidate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ElectionName", "Title", "Content", "Score"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHiddenCandidate.setGridColor(new java.awt.Color(0, 0, 0));
        tableHiddenCandidate.setMinimumSize(new java.awt.Dimension(40, 0));
        tableHiddenScoreCandidate1.setViewportView(tableHiddenCandidate);
        if (tableHiddenCandidate.getColumnModel().getColumnCount() > 0) {
            tableHiddenCandidate.getColumnModel().getColumn(0).setResizable(false);
            tableHiddenCandidate.getColumnModel().getColumn(1).setResizable(false);
            tableHiddenCandidate.getColumnModel().getColumn(2).setResizable(false);
            tableHiddenCandidate.getColumnModel().getColumn(3).setResizable(false);
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Candidate");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(16, 161, 157));

        jPanel2.setBackground(new java.awt.Color(250, 243, 227));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Bebas", 1, 62)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Candidate");

        jLabel2.setFont(new java.awt.Font("Gontserrat Medium", 0, 24)); // NOI18N
        jLabel2.setText("Election Name");

        tfTitle.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tfTitle.setToolTipText("");
        tfTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        tfTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTitleActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(79, 193, 132));
        btnAdd.setFont(new java.awt.Font("Bebas", 0, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(250, 243, 227));
        btnAdd.setText("ADD");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gontserrat Medium", 0, 24)); // NOI18N
        jLabel3.setText("Content");

        tfContent.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tfContent.setToolTipText("");
        tfContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        tfContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfContentActionPerformed(evt);
            }
        });

        cbElectionName.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cbElectionName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel4.setFont(new java.awt.Font("Gontserrat Medium", 0, 24)); // NOI18N
        jLabel4.setText("Title");

        tableCandidate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tableCandidate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ElectionName", "Title", "Content"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCandidate.setGridColor(new java.awt.Color(0, 0, 0));
        tableCandidate.setMinimumSize(new java.awt.Dimension(40, 0));
        tableCandidate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCandidateMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCandidate);
        if (tableCandidate.getColumnModel().getColumnCount() > 0) {
            tableCandidate.getColumnModel().getColumn(0).setResizable(false);
            tableCandidate.getColumnModel().getColumn(1).setResizable(false);
            tableCandidate.getColumnModel().getColumn(2).setResizable(false);
        }

        btnDelete.setBackground(new java.awt.Color(216, 84, 105));
        btnDelete.setFont(new java.awt.Font("Bebas", 0, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(250, 243, 227));
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(127, 186, 215));
        btnUpdate.setFont(new java.awt.Font("Bebas", 0, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(250, 243, 227));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Close.png"))); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfContent, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbElectionName, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbElectionName, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfContent, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTitleActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(cbElectionName.getSelectedItem() == null){
            tfTitle.setText("");
            tfContent.setText("");
            JOptionPane.showMessageDialog(this, "Please create new election name", "Empty Election Name", JOptionPane.ERROR_MESSAGE);
        }
        else{
            electionCandidate ec = new electionCandidate(cbElectionName.getSelectedItem().toString(), tfTitle.getText(), tfContent.getText(), 0);
            if(ec.isEmptyTitle() || ec.isEmptyContent()){
                JOptionPane.showMessageDialog(this, "Please enter text to all forms", "Empty Forms", JOptionPane.ERROR_MESSAGE);
            }
            else{
                DefaultTableModel model1 = (DefaultTableModel) tableCandidate.getModel();
                DefaultTableModel model2 = (DefaultTableModel) tableHiddenCandidate.getModel();
                boolean check = false;
                for(int i = 0; i < model1.getRowCount(); i++){
                    if(ec.isSameElectionName(model1.getValueAt(i, 0).toString()) && ec.isSameTitle(model1.getValueAt(i, 1).toString())){
                        check = true;
                        break;
                    }
                }
                if(check){
                    JOptionPane.showMessageDialog(this, (ec.getTitle()+ " already registered!"), "Title Already Registered", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    model1.addRow(new Object[]{ec.getElectionName(), ec.getTitle(), ec.getContent()});
                    model2.addRow(new Object[]{ec.getElectionName(), ec.getTitle(), ec.getContent(), ec.getSum()});
                    tfTitle.setText("");
                    tfContent.setText("");
                    fileDatabase fd = new fileDatabase(model2.getDataVector(), "Candidate");
                    fd.saveFile();
                    JOptionPane.showMessageDialog(this, "Add Candidate Success", "Add Candidate Success", JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tfContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContentActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = tableCandidate.getSelectedRow();
        if(row >= 0){
            DefaultTableModel model1 = (DefaultTableModel) tableCandidate.getModel();
            DefaultTableModel model2 = (DefaultTableModel) tableHiddenCandidate.getModel();
            model1.removeRow(row);
            model2.removeRow(row);
            tfTitle.setText("");
            tfContent.setText("");
            fileDatabase fd = new fileDatabase(model2.getDataVector(), "Candidate");
            fd.saveFile();
            JOptionPane.showMessageDialog(this, "Delete Success", "Delete Success", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, "No row is selected!", "No Selected row", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(this.vo == null){
            JOptionPane.showMessageDialog(this, "Illegal Trespassing", "Illegal Trespassing", JOptionPane.ERROR_MESSAGE);
            new loginFrame().setVisible(true);
            this.dispose();
        }
        else{
            fileAdmin fa = new fileAdmin();
            user<String, String, String> admin = fa.getObj(); 
            if(vo.isSameName(admin.getName()) && vo.isSameUname(admin.getUname()) && vo.isSamePass(admin.getPass())){
                fileDatabase fd = new fileDatabase("Election");
                Vector<Vector> temp = fd.recovery();
                if(temp != null){
                    for(int i = 0; i < temp.size(); i++){
                        Vector row = temp.get(i);
                        election el = new election(row.get(0).toString(), (boolean) row.get(1));
                        if(!el.getStatus()){
                            cbElectionName.addItem(el.getElectionName());
                        }
                    }
                }
        
                DefaultTableModel model1 = (DefaultTableModel) tableCandidate.getModel();
                DefaultTableModel model2 = (DefaultTableModel) tableHiddenCandidate.getModel();
                fd = new fileDatabase("Candidate");
                temp = fd.recovery();
                if(temp != null){
                    for(int i = 0; i < temp.size(); i++){
                    Vector row = temp.get(i);
                        model1.addRow(new Object[]{row.get(0), row.get(1), row.get(2)});
                        model2.addRow(new Object[]{row.get(0), row.get(1), row.get(2), row.get(3)});
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Illegal Trespassing", "Illegal Trespassing", JOptionPane.ERROR_MESSAGE);
                new loginFrame().setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(tableCandidate.getSelectedRowCount() == 1){
            DefaultTableModel model1 = (DefaultTableModel) tableCandidate.getModel();
            DefaultTableModel model2 = (DefaultTableModel) tableHiddenCandidate.getModel();
            int row = tableCandidate.getSelectedRow();
            electionCandidate ec = new electionCandidate(model2.getValueAt(row, 0).toString(), model2.getValueAt(row, 1).toString(), model2.getValueAt(row, 2).toString(), (int) model2.getValueAt(row,3));
            if(ec.isSameElectionName(cbElectionName.getSelectedItem().toString()) && ec.isSameTitle(tfTitle.getText())){
                if(!ec.isSameContent(tfContent.getText())){
                    model1.setValueAt(tfContent.getText(), row, 2);
                    model2.setValueAt(tfContent.getText(), row, 2);
                    tfTitle.setText("");
                    tfContent.setText("");
                    fileDatabase fd = new fileDatabase(model2.getDataVector(), "Candidate");
                    fd.saveFile();
                    JOptionPane.showMessageDialog(this, "Update Success", "Update Success", JOptionPane.PLAIN_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Content is same!", "Same Content", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Title not found!", "Title Not Found", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "No row is selected!", "No Selected row", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tableCandidateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCandidateMouseClicked
        int row = tableCandidate.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tableCandidate.getModel();
        Vector<Vector> temp = model.getDataVector();
        candidate ca = new candidate(model.getValueAt(row, 0).toString(), model.getValueAt(row, 1).toString(), model.getValueAt(row, 2).toString());
        cbElectionName.setSelectedItem(ca.getElectionName());
        tfTitle.setText(ca.getTitle());
        tfContent.setText(ca.getContent());
    }//GEN-LAST:event_tableCandidateMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        new adminDashboardFrame(this.vo).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new candidateFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JComboBox<String> cbElectionName;
    private javax.swing.JTable tableCandidate;
    private javax.swing.JTable tableHiddenCandidate;
    private javax.swing.JTextField tfContent;
    private javax.swing.JTextField tfTitle;
    // End of variables declaration//GEN-END:variables
}