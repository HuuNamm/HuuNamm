/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLKSBuild.Form;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static QLKSBuild.ConnectSQLServer.getConnection;
import QLKSBuild.NhanVien;


/**
 *
 * @author khoa
 */
public class nhanvienform extends javax.swing.JFrame {

    private ResultSet rs;

    /**
     * Creates new form nhanvienform
     */
    public nhanvienform() {
        initComponents();
        getConnection();
        hienThiDanhSachNhanVien();
        setLocationRelativeTo(null);

    }
    Connection con= null;
    Statement st= null;
    
    public ArrayList<NhanVien> layDanhSachNhanVien() {
        ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
        Connection con = getConnection();
        try {
            st = (Statement) con.createStatement();
            String sql = "SELECT * FROM nhanvien";
            // Thưcj thi câu lệnh truy vấn
            ResultSet rs = st.executeQuery(sql);

            NhanVien nv;
            while (rs.next()) {
                nv = new NhanVien(rs.getString("MANV"), rs.getString("TENNV"), rs.getString("CHUCVU"), rs.getDouble("LUONGNV"), rs.getDate("NGAYSINH"), rs.getString("GIOITINH"), rs.getString("CHUTHICH") );

                //Thêm vào danh sách
                dsnv.add(nv);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
        return dsnv;
    }
    
    public void hienThiDanhSachNhanVien() {
        String colTieuDe1[] = new String[]{"Mã Nhân Viên", "Tên Nhân Viên", "Chức Vụ", "Lương", "Ngày Sinh", "Giới Tính", "Chú Thích"};
        ArrayList<NhanVien> dsnv = layDanhSachNhanVien();

        DefaultTableModel model = new DefaultTableModel(colTieuDe1, 0);

        Object[] row;

        for (int i = 0; i < dsnv.size(); i++) {

            row = new Object[7];

            // GÁN GIÁ TRỊ
            row[0] = dsnv.get(i).getMANV();
            row[1] = dsnv.get(i).getTENNV();
            row[2] = dsnv.get(i).getCHUCVU();
            row[3] = dsnv.get(i).getLUONGNV();
            row[4] = dsnv.get(i).getNGAYSINH();
            row[5] = dsnv.get(i).getGIOITINH();
            row[6] = dsnv.get(i).getCHUTHICH();

            model.addRow(row);
        }
        
        //    }catch(ArrayIndexOutOfBoundsException ex){

        jTableNhanvien.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldMANV = new javax.swing.JTextField();
        jTextFieldTENNV = new javax.swing.JTextField();
        jTextFieldCHUCVU = new javax.swing.JTextField();
        jTextFieldLUONG = new javax.swing.JTextField();
        jTextFieldNGAYSINH = new javax.swing.JTextField();
        jTextFieldGIOITINH = new javax.swing.JTextField();
        jTextFieldCHUTHICH = new javax.swing.JTextField();
        them = new javax.swing.JButton();
        sua = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        thoat = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNhanvien = new javax.swing.JTable();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLKSBuild/Form/HinhAnh/cogwheel.png"))); // NOI18N
        jLabel1.setText(" QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(344, 344, 344))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(102, 153, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Nhân Viên"));

        jLabel2.setText("Mã Nhân Viên");

        jLabel3.setText("Tên Nhân Viên");

        jLabel4.setText("Chức Vụ");

        jLabel5.setText("Lương");

        jLabel6.setText("Ngày Sinh");

        jLabel7.setText("Giới Tính");

        jLabel8.setText("Chú Thích");

        jTextFieldTENNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTENNVActionPerformed(evt);
            }
        });

        jTextFieldCHUCVU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCHUCVUActionPerformed(evt);
            }
        });

        jTextFieldLUONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLUONGActionPerformed(evt);
            }
        });

        jTextFieldNGAYSINH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNGAYSINHActionPerformed(evt);
            }
        });

        them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLKSBuild/Form/HinhAnh/THEM.png"))); // NOI18N
        them.setText("Thêm");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLKSBuild/Form/HinhAnh/SUA.png"))); // NOI18N
        sua.setText("Sửa");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });

        xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLKSBuild/Form/HinhAnh/XOA.png"))); // NOI18N
        xoa.setText("Xóa");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLKSBuild/Form/HinhAnh/THOAT.png"))); // NOI18N
        thoat.setText("Thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        jButtonclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLKSBuild/Form/HinhAnh/CLEAR.png"))); // NOI18N
        jButtonclear.setText("Clear");
        jButtonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMANV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLUONG, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldCHUTHICH)
                    .addComponent(jTextFieldTENNV, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNGAYSINH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCHUCVU, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGIOITINH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(them)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(sua)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonclear)
                        .addGap(18, 18, 18)
                        .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(thoat)))
                .addGap(124, 124, 124))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldMANV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldTENNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCHUCVU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldNGAYSINH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldLUONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldGIOITINH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCHUTHICH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(them)
                    .addComponent(sua)
                    .addComponent(jButtonclear)
                    .addComponent(xoa)
                    .addComponent(thoat))
                .addGap(42, 42, 42))
        );

        jTableNhanvien.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableNhanvien.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTableNhanvienAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTableNhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNhanvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNhanvien);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 762, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableNhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNhanvienMouseClicked

        // TODO add your handling code here:
        int i = jTableNhanvien.getSelectedRow();
        TableModel model = jTableNhanvien.getModel();
        jTextFieldMANV.setText(model.getValueAt(i, 0).toString());
        jTextFieldTENNV.setText(model.getValueAt(i, 1).toString());
        jTextFieldCHUCVU.setText(model.getValueAt(i, 2).toString());
        jTextFieldLUONG.setText(model.getValueAt(i, 3).toString());
        jTextFieldNGAYSINH.setText(model.getValueAt(i, 4).toString());
        jTextFieldGIOITINH.setText(model.getValueAt(i, 5).toString());
        jTextFieldCHUTHICH.setText(model.getValueAt(i, 6).toString());
    }//GEN-LAST:event_jTableNhanvienMouseClicked

    private void jTableNhanvienAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTableNhanvienAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableNhanvienAncestorAdded

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        // TODO add your handling code here:
        jTextFieldMANV.setText("");
        jTextFieldTENNV.setText("");
        jTextFieldCHUCVU.setText("");
        jTextFieldLUONG.setText("");
        jTextFieldNGAYSINH.setText("");
        jTextFieldGIOITINH.setText("");
        jTextFieldCHUTHICH.setText("");
        jTextFieldMANV.requestFocus();
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        // TODO add your handling code here:
        thoat.setToolTipText("Click để thoát chương trình ");
        int selected = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát chương"
            + " trình không", "Thông báo", JOptionPane.YES_NO_CANCEL_OPTION);
        if (selected == JOptionPane.YES_NO_OPTION) {
            this.dispose();

        }
    }//GEN-LAST:event_thoatActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection();
        try {
            // Tạo một đối tượng để thực hiện công việc
            st = (Statement) con.createStatement();
            String query = "DELETE FROM NhanVien WHERE MANV = '" + jTextFieldMANV.getText() + "'";
            st.executeUpdate(query);
            hienThiDanhSachNhanVien();

        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }//GEN-LAST:event_xoaActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        // TODO add your handling code here:

        if (jTableNhanvien.getSelectedRow()==-1) {
            if (jTableNhanvien.getRowCount()==0) {
                // lblError.setText("Table is empty");
            }
            else{
                //  lblError.setText("You must select a Tennis Player");
            }
        }
        else{
            DefaultTableModel model = (DefaultTableModel) jTableNhanvien.getModel();
            model.setValueAt(jTextFieldMANV.getText(), jTableNhanvien.getSelectedRow(), 0);
            model.setValueAt(jTextFieldTENNV.getText().toString(), jTableNhanvien.getSelectedRow(), 1);
            model.setValueAt(jTextFieldCHUCVU.getText(), jTableNhanvien.getSelectedRow(), 2);
            model.setValueAt(jTextFieldLUONG.getText(), jTableNhanvien.getSelectedRow(), 2);
            model.setValueAt(jTextFieldNGAYSINH.getText(), jTableNhanvien.getSelectedRow(), 2);
            model.setValueAt(jTextFieldGIOITINH.getText(), jTableNhanvien.getSelectedRow(), 2);
            model.setValueAt(jTextFieldCHUTHICH.getText(), jTableNhanvien.getSelectedRow(), 2);
        }
    }//GEN-LAST:event_suaActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
        Connection con = getConnection();
        try {
            // Tạo một đối tượng để thực hiện công việc
            st = (Statement) con.createStatement();
            String query = "INSERT INTO NhanVien(MANV,TENNV,CHUCVU, LUONGNV, NGAYSINH, GIOITINH, CHUTHICH) VALUES('" + jTextFieldMANV.getText() + "',"
            + "'" + jTextFieldTENNV.getText() + "','" + jTextFieldCHUCVU.getText() + "','" + jTextFieldLUONG.getText()
            + "','" + jTextFieldNGAYSINH.getText() + "','" + jTextFieldGIOITINH.getText() + "','" + jTextFieldCHUTHICH.getText() + "')";

            st.execute(query);
            hienThiDanhSachNhanVien();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_themActionPerformed

    private void jTextFieldNGAYSINHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNGAYSINHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNGAYSINHActionPerformed

    private void jTextFieldLUONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLUONGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLUONGActionPerformed

    private void jTextFieldCHUCVUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCHUCVUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCHUCVUActionPerformed

    private void jTextFieldTENNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTENNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTENNVActionPerformed

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
            java.util.logging.Logger.getLogger(nhanvienform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nhanvienform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nhanvienform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nhanvienform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nhanvienform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonclear;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableNhanvien;
    private javax.swing.JTextField jTextFieldCHUCVU;
    private javax.swing.JTextField jTextFieldCHUTHICH;
    private javax.swing.JTextField jTextFieldGIOITINH;
    private javax.swing.JTextField jTextFieldLUONG;
    private javax.swing.JTextField jTextFieldMANV;
    private javax.swing.JTextField jTextFieldNGAYSINH;
    private javax.swing.JTextField jTextFieldTENNV;
    private javax.swing.JButton sua;
    private javax.swing.JButton them;
    private javax.swing.JButton thoat;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables

   
}
