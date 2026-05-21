package nilaiakhir;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class NilaiAkhirGUI extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NilaiAkhirGUI.class.getName());
    DefaultTableModel modelnilai;
    InputDataNilai datanilai;
    
    public NilaiAkhirGUI() {
        initComponents();
        datanilai = new InputDataNilai();
        viewDataTabel();         
     
        NilaiakhirTF.setEditable(false);
    }

    public final void viewDataTabel() {
        String[] namakolom = {"NPM", "Nama", "Alamat", "Mata Kuliah", "Nilai Akhir"};
        Object[][] objeknilai = new Object[datanilai.getALL().size()][5];
        
        int i = 0;
        for (DataNilai data : datanilai.getALL()) {
            Object[] arrayNilai = {
                data.getNpm(),
                data.getNama(),
                data.getAlamat(),
                data.getMatkul(),
                data.getNilaiAkhir()
            };
            objeknilai[i] = arrayNilai;
            i++;
        }
        
        modelnilai = new DefaultTableModel(objeknilai, namakolom);
        TableTB.setModel(modelnilai);
    }   
    
    public void ClearTextField() {
        npmTF.setText("");
        namaTF.setText("");
        alamatTF.setText("");
        matkulTF.setText("");
        NilaiTF.setText("");
        n2TF.setText("");
        n3TF.setText("");
        n4TF.setText("");
        n5TF.setText("");
        npmTF.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        npmTF = new javax.swing.JTextField();
        namaTF = new javax.swing.JTextField();
        alamatTF = new javax.swing.JTextField();
        matkulTF = new javax.swing.JTextField();
        n1TF = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        NilaiTF = new javax.swing.JTextField();
        n2TF = new javax.swing.JTextField();
        n3TF = new javax.swing.JTextField();
        n4TF = new javax.swing.JTextField();
        n5TF = new javax.swing.JTextField();
        NilaiakhirTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableTB = new javax.swing.JTable();
        simpanBT = new javax.swing.JButton();
        hapusBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("NPM");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Alamat");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Mata Kuliah");

        npmTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        npmTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        npmTF.addActionListener(this::npmTFActionPerformed);

        namaTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        namaTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        namaTF.addActionListener(this::namaTFActionPerformed);

        alamatTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        alamatTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        matkulTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        matkulTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        matkulTF.addActionListener(this::matkulTFActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(npmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alamatTF, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matkulTF, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(npmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(alamatTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(matkulTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        n1TF.setBackground(new java.awt.Color(255, 255, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Nilai 1 [10%]");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Nilai 2 [15%]");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Nilai 3 - UTS [25]");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Nilai 4 [15%]");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Nilai 5 [35%]");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Nilai Akhir");

        NilaiTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        n2TF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        n3TF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        n4TF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        n5TF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        NilaiakhirTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout n1TFLayout = new javax.swing.GroupLayout(n1TF);
        n1TF.setLayout(n1TFLayout);
        n1TFLayout.setHorizontalGroup(
            n1TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(n1TFLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(n1TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(n1TFLayout.createSequentialGroup()
                        .addGroup(n1TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, n1TFLayout.createSequentialGroup()
                                .addGroup(n1TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(40, 40, 40)
                                .addGroup(n1TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NilaiTF, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(n2TF)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, n1TFLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(39, 39, 39)
                                .addComponent(n5TF))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, n1TFLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(58, 58, 58)
                                .addComponent(NilaiakhirTF)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(n1TFLayout.createSequentialGroup()
                        .addGroup(n1TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, n1TFLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(n1TFLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(39, 39, 39)))
                        .addGroup(n1TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(n3TF, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(n4TF))
                        .addGap(100, 100, 100))))
        );
        n1TFLayout.setVerticalGroup(
            n1TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(n1TFLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(n1TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NilaiTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(n1TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(n2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(n1TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(n3TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(n1TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(n4TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(n1TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n5TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(n1TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(NilaiakhirTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        TableTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NPM", "Nama", "Alamat", "Mata Kuliah", "Nilai Akhir"
            }
        ));
        jScrollPane1.setViewportView(TableTB);

        simpanBT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        simpanBT.setText("SImpan");
        simpanBT.addActionListener(this::simpanBTActionPerformed);

        hapusBT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        hapusBT.setText("Hapus");
        hapusBT.addActionListener(this::hapusBTActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(simpanBT)
                                .addGap(113, 113, 113)
                                .addComponent(hapusBT)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(simpanBT)
                            .addComponent(hapusBT)))
                    .addComponent(n1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void npmTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npmTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_npmTFActionPerformed

    private void namaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTFActionPerformed

    private void matkulTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matkulTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matkulTFActionPerformed

    private void simpanBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBTActionPerformed
        String n1Str = NilaiTF.getText().trim();
        String n2Str = n2TF.getText().trim();
        String n3Str = n3TF.getText().trim();
        String n4Str = n4TF.getText().trim();
        String n5Str = n5TF.getText().trim();

        if (n1Str.isEmpty() || n2Str.isEmpty() || n3Str.isEmpty() || n4Str.isEmpty() || n5Str.isEmpty()) {

            JOptionPane.showMessageDialog(this, 
                "Terdeteksi kosong! Ini yang terbaca oleh sistem:\n" +
                "Nilai 1: [" + n1Str + "]\n" +
                "Nilai 2: [" + n2Str + "]\n" +
                "Nilai 3: [" + n3Str + "]\n" +
                "Nilai 4: [" + n4Str + "]\n" +
                "Nilai 5: [" + n5Str + "]\n\n" +
                "Kalau ada yang isinya cuma [], berarti nama Variable Textfield-nya salah!", 
                "Peringatan Debug", JOptionPane.WARNING_MESSAGE);
            return; 
        }

        try {
            // 2. Kalkulasi nilai
            double n1 = Double.parseDouble(n1Str) * 0.10;
            double n2 = Double.parseDouble(n2Str) * 0.15;
            double n3 = Double.parseDouble(n3Str) * 0.25;
            double n4 = Double.parseDouble(n4Str) * 0.15;
            double n5 = Double.parseDouble(n5Str) * 0.35;
            
            double nilaiAkhir = n1 + n2 + n3 + n4 + n5;
            
            NilaiakhirTF.setText(String.valueOf(nilaiAkhir));
            
            datanilai.insertData(
                npmTF.getText(),
                namaTF.getText(),
                alamatTF.getText(),
                matkulTF.getText(),
                nilaiAkhir
            );
            
            viewDataTabel();
            ClearTextField();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Gagal! Pastikan form nilai HANYA berisi angka.", "Error Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_simpanBTActionPerformed

    private void hapusBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBTActionPerformed
        int selectedRow = TableTB.getSelectedRow();
        if (selectedRow >= 0) {
            datanilai.deleteData(selectedRow);
            viewDataTabel();
        } else {
            JOptionPane.showMessageDialog(this, "Pilih baris pada tabel terlebih dahulu yang ingin dihapus.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_hapusBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new NilaiAkhirGUI().setVisible(true));    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NilaiTF;
    private javax.swing.JTextField NilaiakhirTF;
    private javax.swing.JTable TableTB;
    private javax.swing.JTextField alamatTF;
    private javax.swing.JButton hapusBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField matkulTF;
    private javax.swing.JPanel n1TF;
    private javax.swing.JTextField n2TF;
    private javax.swing.JTextField n3TF;
    private javax.swing.JTextField n4TF;
    private javax.swing.JTextField n5TF;
    private javax.swing.JTextField namaTF;
    private javax.swing.JTextField npmTF;
    private javax.swing.JButton simpanBT;
    // End of variables declaration//GEN-END:variables
}
