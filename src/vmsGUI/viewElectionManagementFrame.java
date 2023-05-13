package vmsGUI;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vms.election;
import vms.electionCandidate;
import vms.electionCount;
import vms.electionManagement;
import vms.fileAdmin;
import vms.fileDatabase;
import vms.user;

public class viewElectionManagementFrame extends javax.swing.JFrame {

    user vo;
    
    public viewElectionManagementFrame() {
        initComponents();
    }
    
    public viewElectionManagementFrame(user vo) {
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

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        cbElectionName = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tableVotedStatus = new javax.swing.JTable();
        btnClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Election Management");
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

        cbElectionName.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cbElectionName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        cbElectionName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbElectionNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bebas", 1, 70)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View VoteD status");

        jLabel2.setFont(new java.awt.Font("Gontserrat Medium", 0, 24)); // NOI18N
        jLabel2.setText("Election Name");

        tableVotedStatus.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tableVotedStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Voter Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVotedStatus.setGridColor(new java.awt.Color(0, 0, 0));
        tableVotedStatus.setMinimumSize(new java.awt.Dimension(40, 0));
        tableVotedStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVotedStatusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableVotedStatus);
        if (tableVotedStatus.getColumnModel().getColumnCount() > 0) {
            tableVotedStatus.getColumnModel().getColumn(0).setResizable(false);
            tableVotedStatus.getColumnModel().getColumn(1).setResizable(false);
        }

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cbElectionName, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbElectionName, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableVotedStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVotedStatusMouseClicked

    }//GEN-LAST:event_tableVotedStatusMouseClicked

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
                        cbElectionName.addItem(el.getElectionName());
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

    private void cbElectionNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbElectionNameActionPerformed
        if(cbElectionName.getSelectedItem() == null){
            JOptionPane.showMessageDialog(this, "Empty Election Name", "Empty Election Name", JOptionPane.ERROR_MESSAGE);
        }
        else{
            election el = new election(cbElectionName.getSelectedItem().toString(), true);
            fileDatabase fd = new fileDatabase("ElectionManagement");
            Vector<Vector> temp = fd.recovery();
            if(temp != null){
                DefaultTableModel model = (DefaultTableModel) tableVotedStatus.getModel();
                for(int i = 0; i < model.getRowCount(); i++){
                    model.removeRow(i);
                    i--;
                }
                for(int i = 0; i < temp.size(); i++){
                    Vector row = temp.get(i);
                    electionManagement<String> em = new electionManagement(row.get(0).toString(), row.get(1), (boolean) row.get(2));
                    if(em.isSameElectionName(el.getElectionName())){
                        model.addRow(new Object[]{em.getVoterName(), em.getStatus()});
                    }
                }
            }
        }
    }//GEN-LAST:event_cbElectionNameActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        new electionManagementFrame(this.vo).setVisible(true);
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
        //</editor-fold>
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
                new viewElectionManagementFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JComboBox<String> cbElectionName;
    private javax.swing.JTable tableVotedStatus;
    // End of variables declaration//GEN-END:variables
}