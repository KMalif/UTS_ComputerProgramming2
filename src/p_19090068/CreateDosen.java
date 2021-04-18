/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_19090068;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mualif
 */
public class CreateDosen extends javax.swing.JFrame {

   int idBaris = 0;
   String role;
   DefaultTableModel model;
    
    public CreateDosen() {
        initComponents();
        
        aturModelTabel();
        pangkat();
        jafung();
        showForm(false);
        showData("");
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnTambah = new javax.swing.JButton();
        areaSplit = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        TxtNidn = new javax.swing.JTextField();
        TxtNama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtNohp = new javax.swing.JTextField();
        cmbJafung = new javax.swing.JComboBox<>();
        cmbPangkat = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        BtnTutup = new javax.swing.JButton();
        BtnSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableData = new javax.swing.JTable();
        BtnHapus = new javax.swing.JButton();
        TxtCari = new javax.swing.JTextField();
        BtnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        BtnTambah.setText("Tambah Data");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });

        TxtNidn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNidnActionPerformed(evt);
            }
        });

        TxtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nidn");

        jLabel2.setText("Nama");

        jLabel3.setText("Jabatan Fungsional");

        jLabel4.setText("Pangkat/Golongan");

        jLabel5.setText("No. Hp");

        cmbJafung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbPangkat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BtnTutup.setText("Tutup");
        BtnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTutupActionPerformed(evt);
            }
        });

        BtnSimpan.setText("Simpan");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtNidn)
                            .addComponent(TxtNohp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbJafung, 0, 155, Short.MAX_VALUE)
                            .addComponent(cmbPangkat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(BtnTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNidn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cmbJafung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbPangkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtNohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        areaSplit.setLeftComponent(jPanel1);

        TableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableData);

        areaSplit.setRightComponent(jScrollPane1);

        BtnHapus.setText("Hapus Data");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        TxtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtCariKeyReleased(evt);
            }
        });

        BtnCari.setText("Cari");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BtnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnCari)
                .addGap(23, 23, 23))
            .addComponent(areaSplit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCari))
                .addGap(18, 28, Short.MAX_VALUE)
                .addComponent(areaSplit, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaActionPerformed
        
    }//GEN-LAST:event_TxtNamaActionPerformed

    private void TxtNidnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNidnActionPerformed
        
    }//GEN-LAST:event_TxtNidnActionPerformed

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        role = "Tambah";
        BtnSimpan.setText("Simpan");
        idBaris = 0;
        resetForm();
        showForm(true);
        BtnHapus.setEnabled(false);
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        if(role.equals("Tambah")){
            simpanData();
        }else if(role.equals("Ubah")){
            ubahData();
        }
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTutupActionPerformed
        resetForm();
        showForm(false);
        BtnHapus.setEnabled(false);
        idBaris = 0;
    }//GEN-LAST:event_BtnTutupActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        if(idBaris == 0){
            JOptionPane.showMessageDialog(this,"Pilih Data Yang Akan Dihapus");
        }else{
            hapusData(idBaris);
        }
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void TxtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCariKeyReleased
        String key = TxtCari.getText();
        showData(key);
    }//GEN-LAST:event_TxtCariKeyReleased

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        areaSplit.setDividerLocation(0.3);
    }//GEN-LAST:event_formComponentResized

    private void TableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDataMouseClicked
        role = "Ubah";
        int row = TableData.getRowCount();
        if(row > 0){
            int sel= TableData.getSelectedRow();
            if(sel != -1){
                pilihData(TableData.getValueAt(sel, 0).toString());
                BtnSimpan.setText("Ubah Data");
            }
        }
    }//GEN-LAST:event_TableDataMouseClicked

    
    
    
    private void aturModelTabel(){
        Object[] kolom = {"No","NIDN","NAMA","JAFUNG","Golongan/Pangkat","No HP"};
        model = new DefaultTableModel(kolom,0) {
        
            boolean[] canEdit = new boolean [] {false, false, false, false, false, false
            };
    @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
            };
        TableData.setModel(model);
        TableData.setRowHeight(20);
        TableData.getColumnModel().getColumn(0).setMinWidth(0);
        TableData.getColumnModel().getColumn(0).setMaxWidth(0);
    }
    
    private void showForm(boolean b){
        areaSplit.setDividerLocation(0.3);
        areaSplit.getLeftComponent().setVisible(b);
    }
    
    private void resetForm(){
        TableData.clearSelection();
        TxtNidn.setText("");
        TxtNama.setText("");
        cmbJafung.setSelectedIndex(0);
        cmbPangkat.setSelectedIndex(0);
        TxtNohp.setText("");
        TxtNidn.requestFocus();
    }
    
    private void pangkat(){
        cmbPangkat.removeAllItems();
        cmbPangkat.addItem("Pilih Golongan/Pangkat");
        cmbPangkat.addItem("Belum ada");
        cmbPangkat.addItem("II/c (Pengatur)");
        cmbPangkat.addItem("II/d (Pengatur Tk. I)");
        cmbPangkat.addItem("III/a (Penata Muda)");
        cmbPangkat.addItem("III/b (Penata Muda Tk. I)");
        cmbPangkat.addItem("III/c (Penata)");
        cmbPangkat.addItem("III/d (Penata Tk. I)");
        cmbPangkat.addItem("IV/a (Pembina)");
        cmbPangkat.addItem("IV/b (Pembina Tk. I)");
        cmbPangkat.addItem("IV/c (Pembina Utama Muda)");
        cmbPangkat.addItem("IV/d (Pembina Utama Madya)");
        cmbPangkat.addItem("IV/e (Pembina Utama)");
    }
    
    private void jafung(){
        cmbJafung.removeAllItems();
        cmbJafung.addItem("Pilih Golongan/Pangkat");
        cmbJafung.addItem("Belum ada");
        cmbJafung.addItem("Asisten Ahli (100)"); 
        cmbJafung.addItem("Asisten Ahli (150)");
        cmbJafung.addItem("Lektor (200)");
        cmbJafung.addItem("Lektor (300)");
        cmbJafung.addItem("Lektor Kepala (400)");
        cmbJafung.addItem("Lektor Kepala (550)");
        cmbJafung.addItem("Lektor Kepala (700)");
        cmbJafung.addItem("Profesor (850)");
        cmbJafung.addItem("Profesor (1050)");
    }
    
    private void showData(String key){
        model.getDataVector().removeAllElements();
        String where = "";
        if(!key.isEmpty()){
            where += "WHERE nidn LIKE '%"+key+"%' "
                + "OR nama LIKE '%"+key+"%' "
                + "OR jabatan_fungsional LIKE '%"+key+"%' "
                + "OR pangkat_golongan LIKE '%"+key+"%' "
                + "OR no_hp LIKE '%"+key+"%'";
        }
            String sql = "SELECT * FROM data_dosen "+where;
            Connection con;
            Statement st;
            ResultSet rs;
            int baris = 0;
            try {
                con = Koneksi.MySQL();
                st = con.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    Object id = rs.getInt(1);
                    Object nidn = rs.getString(2);
                    Object nama = rs.getString(3);
                   Object jafung = rs.getString(4);
                    Object pangkat = rs.getString(5);
                    Object no_hp = rs.getString(6);
                   Object[] data = {id,nidn,nama,jafung,pangkat,no_hp};
                    model.insertRow(baris, data);
                   baris++;
                }
                st.close();
                con.close();
                TableData.revalidate();
                TableData.repaint();
        } catch (SQLException e) {
            System.err.println("showData(): "+e.getMessage());
            }
 }
    
    private void resetView(){
        resetForm();
        showForm(false);
        showData("");
        BtnHapus.setEnabled(false);
        idBaris = 0;
    }
    
    private void pilihData(String n){
        BtnHapus.setEnabled(true);

        String sql = "SELECT * FROM data_dosen WHERE id='"+n+"'";
        Connection con;
        Statement st;
        ResultSet rs;
        try {
            con = Koneksi.MySQL();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String nidn = rs.getString(2);
                String nama = rs.getString(3);
               Object jafung = rs.getString(4);
                Object pangkat = rs.getString(5);
                String no_hp = rs.getString(6);
               idBaris = id;
                TxtNidn.setText(nidn);
                TxtNama.setText(nama);
               cmbJafung.setSelectedItem(jafung);
                cmbPangkat.setSelectedItem(pangkat);
                TxtNohp.setText(no_hp);
            }
        st.close();
        con.close();
        showForm(true);
            } catch (SQLException e) {
            System.err.println("pilihData(): "+e.getMessage());
            }
    }
    
    private void simpanData(){
        String nidn = TxtNidn.getText();
        String nama = TxtNama.getText();
        int jafung = cmbJafung.getSelectedIndex();
        int pangkat = cmbPangkat.getSelectedIndex();
        String nohp = TxtNohp.getText();
        if(nidn.isEmpty() || nama.isEmpty() || jafung==0 || pangkat==0 ||
            nohp.isEmpty()){
            JOptionPane.showMessageDialog(this, "Mohon lengkapi data!");
        }else{
            String jafung_isi = cmbJafung.getSelectedItem().toString();
            String pangkat_isi = cmbPangkat.getSelectedItem().toString();

        String sql ="INSERT INTO data_dosen (nidn,nama,jabatan_fungsional,"
                    + "pangkat_golongan,no_hp) "
                    + "VALUES (\""+nidn+"\",\""+nama+"\","
                    + "\""+jafung_isi+"\",\""+pangkat_isi+"\",\"" +nohp+
                    "\")";

        Connection con;
        Statement st;
        try {
            con = Koneksi.MySQL();
           st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
           con.close();

            resetView();
           JOptionPane.showMessageDialog(this,"Data telah disimpan!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }

    private void ubahData(){
        String nidn = TxtNidn.getText();
        String nama = TxtNama.getText();
        int jafung = cmbJafung.getSelectedIndex();
        int pangkat = cmbPangkat.getSelectedIndex();
        String nohp = TxtNohp.getText();
        
        if(nidn.isEmpty() || nama.isEmpty() || jafung==0 || pangkat==0 ||
            nohp.isEmpty()){
            JOptionPane.showMessageDialog(this, "Mohon lengkapi data!");
        }else{
            String jafung_isi = cmbJafung.getSelectedItem().toString();
            String pangkat_isi = cmbPangkat.getSelectedItem().toString();
            String sql = "UPDATE data_dosen "
                    + "SET nidn=\""+nidn+"\","
                    + "nama=\""+nama+"\","
                    + "jabatan_fungsional=\""+jafung_isi+"\","
                    + "pangkat_golongan=\""+pangkat_isi+"\","
                    + "no_hp=\""+nohp+"\" WHERE id=\""+idBaris+"\"";
        Connection con;
        Statement st;
        try {
           con = Koneksi.MySQL();
           st = con.createStatement();
           st.executeUpdate(sql);
           st.close();
           con.close();

           resetView();
           JOptionPane.showMessageDialog(this,"Data telah diubah!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }
    
    private void hapusData(int baris){
        Connection con;
        Statement st;
        try {
            con = Koneksi.MySQL();
            st = con.createStatement();
            st.executeUpdate("DELETE FROM data_dosen WHERE id="+baris);
            st.close();
            con.close();

            resetView();
            JOptionPane.showMessageDialog(this, "Data telah dihapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }




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
            java.util.logging.Logger.getLogger(CreateDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateDosen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateDosen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCari;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JButton BtnTutup;
    private javax.swing.JTable TableData;
    private javax.swing.JTextField TxtCari;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JTextField TxtNidn;
    private javax.swing.JTextField TxtNohp;
    private javax.swing.JSplitPane areaSplit;
    private javax.swing.JComboBox<String> cmbJafung;
    private javax.swing.JComboBox<String> cmbPangkat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
