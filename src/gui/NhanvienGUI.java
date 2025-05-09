
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import BUS.NhanVienBUS;
import DTO.NhanVienDTO;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.text.html.HTML.Attribute.ID;
import java.sql.SQLException;
public class NhanvienGUI extends javax.swing.JPanel {
NhanVienBUS bus = new NhanVienBUS();
ArrayList<NhanVienDTO> danhSach = bus.getDanhSachNhanVien();
NhanVienDTO x = new NhanVienDTO();
    private JButton selectedButton = null;
     //private static int pos=0;
    public NhanvienGUI() {
        initComponents();
        GiaodienNhanvien.setLayout(new CardLayout());
        GiaodienNhanvien.add(View, "View");
        GiaodienNhanvien.add(Xemtong, "Xemtong");
     
        JTableHeader header = tbNhanvien.getTableHeader(); 
        header.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        JTableHeader headerXem = tbXemtong.getTableHeader(); 
        headerXem.setFont(new Font("Times New Roman", Font.BOLD, 16));
        Viewtable();
        Viewtable1();
        //view();
    }
     private String chuyenTrangThaiSangChuoi(int trangThai) {
    return trangThai == 1 ? "Đang làm" : " Đã Nghỉ ";
}
//     public void view(){
//         
//x = danhSach.get(pos);
//this.truyxuatManv.setText(x.getMaNhanVien());
//this.truyxuatTennv.setText(x.getTenNhanVien());
//this.truyxuatTuoi.setText(""+x.getTuoi());
//this.jComboBox1.setSelectedItem(x.getGioiTinh());
//
//
//     }
     public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            javax.swing.JFrame frame = new javax.swing.JFrame("Quản lý nhân viên");
            frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 600); // điều chỉnh kích thước theo ý bạn
            frame.setLocationRelativeTo(null); // hiển thị giữa màn hình
            
            NhanvienGUI gui = new NhanvienGUI();
            frame.setContentPane(gui);
            frame.setVisible(true);
        }
    });

}

      public  void Viewtable(){
     DefaultTableModel model = (DefaultTableModel) tbNhanvien.getModel();
      model.setRowCount(0); // Xoá hết dữ liệu cũ nếu có

NhanVienBUS bus = new NhanVienBUS();
ArrayList<NhanVienDTO> danhSach = bus.getDanhSachNhanVien();

for (NhanVienDTO nv : danhSach) {
    if (nv.getTrangThai() == 1) {
    model.addRow(new Object[] {
       nv.getMaNhanVien(),
        nv.getTenNhanVien(),
        nv.getTuoi(),
        nv.getGioiTinh()
    
    });
}}
 }
         public  void Viewtable1(){
     DefaultTableModel model = (DefaultTableModel) tbXemtong.getModel();
      model.setRowCount(0); 

NhanVienBUS bus = new NhanVienBUS();
ArrayList<NhanVienDTO> danhSach = bus.getDanhSachNhanVien();

for (NhanVienDTO nv : danhSach) {
    model.addRow(new Object[] {
       nv.getMaNhanVien(),
        nv.getTenNhanVien(),
        nv.getTuoi(),
        nv.getGioiTinh(),
        nv.getNgayVaoCnmm(),
         nv.getNgayNghiViec(),
        chuyenTrangThaiSangChuoi(nv.getTrangThai())
    });
}

    tbXemtong.setVisible(true);
 }   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnView = new javax.swing.JButton();
        btnXemtong = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        GiaodienNhanvien = new javax.swing.JPanel();
        View = new javax.swing.JPanel();
        Timkiem = new javax.swing.JLabel();
        TimkiemNhanvien = new javax.swing.JTextField();
        btnTimkiem = new testlib.RoundedButton();
        btnCapnhat = new javax.swing.JButton();
        btnSathai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanvien = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        txManv = new javax.swing.JLabel();
        truyxuatManv = new javax.swing.JTextField();
        txTennv = new javax.swing.JLabel();
        truyxuatTennv = new javax.swing.JTextField();
        txTuoi = new javax.swing.JLabel();
        truyxuatTuoi = new javax.swing.JTextField();
        txGioitinh = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Xemtong = new javax.swing.JPanel();
        TimkiemTong = new javax.swing.JLabel();
        txtTimkiemTong = new javax.swing.JTextField();
        btnTimkiemTong = new testlib.RoundedButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbXemtong = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(153, 153, 153));
        btnView.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnView.setText("Xem");
        btnView.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnView.setContentAreaFilled(false);
        btnView.setFocusPainted(false);
        btnView.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnView.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View(evt);
            }
        });

        btnXemtong.setBackground(new java.awt.Color(153, 153, 153));
        btnXemtong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnXemtong.setText("Xem tổng");
        btnXemtong.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnXemtong.setContentAreaFilled(false);
        btnXemtong.setFocusPainted(false);
        btnXemtong.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXemtong.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXemtong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });
        btnXemtong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Xemtong(evt);
            }
        });

        btnExport.setBackground(new java.awt.Color(153, 153, 153));
        btnExport.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnExport.setText("Export");
        btnExport.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnExport.setContentAreaFilled(false);
        btnExport.setFocusPainted(false);
        btnExport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnImport.setBackground(new java.awt.Color(153, 153, 153));
        btnImport.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnImport.setText("Import");
        btnImport.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnImport.setContentAreaFilled(false);
        btnImport.setFocusPainted(false);
        btnImport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        GiaodienNhanvien.setLayout(new java.awt.CardLayout());

        View.setBackground(new java.awt.Color(153, 153, 153));

        Timkiem.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Timkiem.setText("Tìm kiếm:");

        TimkiemNhanvien.setBackground(new java.awt.Color(204, 204, 204));
        TimkiemNhanvien.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        TimkiemNhanvien.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TimkiemNhanvien.setText(" Nhập nhân viên.....");
        TimkiemNhanvien.setToolTipText("");
        TimkiemNhanvien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TimkiemNhanvien.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TimkiemNhanvienNhapchu(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TimkiemNhanvienLammo(evt);
            }
        });
        TimkiemNhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimkiemNhanvienActionPerformed(evt);
            }
        });

        btnTimkiem.setBackground(new java.awt.Color(204, 204, 204));
        btnTimkiem.setForeground(new java.awt.Color(0, 0, 0));
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        btnCapnhat.setBackground(new java.awt.Color(153, 153, 153));
        btnCapnhat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnCapnhat.setText("Cập nhật");
        btnCapnhat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCapnhat.setContentAreaFilled(false);
        btnCapnhat.setFocusPainted(false);
        btnCapnhat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCapnhat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatActionPerformed(evt);
            }
        });

        btnSathai.setBackground(new java.awt.Color(153, 153, 153));
        btnSathai.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnSathai.setText("Sa thải");
        btnSathai.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSathai.setContentAreaFilled(false);
        btnSathai.setFocusPainted(false);
        btnSathai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSathai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSathai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSathaiActionPerformed(evt);
            }
        });

        tbNhanvien.setAutoCreateRowSorter(true);
        tbNhanvien.setBackground(new java.awt.Color(153, 153, 153));
        tbNhanvien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbNhanvien.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbNhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Tuổi", "Giới tính"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbNhanvien.setShowVerticalLines(true);
        tbNhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanvienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbNhanvienMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhanvien);

        btnThem.setBackground(new java.awt.Color(153, 153, 153));
        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnThem.setContentAreaFilled(false);
        btnThem.setFocusPainted(false);
        btnThem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        txManv.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txManv.setText("Mã nv:");

        truyxuatManv.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatManv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatManv.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatManv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        truyxuatManv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truyxuatManvActionPerformed(evt);
            }
        });

        txTennv.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txTennv.setText("Tên nv:");

        truyxuatTennv.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatTennv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatTennv.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatTennv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txTuoi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txTuoi.setText("Độ tuổi: ");

        truyxuatTuoi.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatTuoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatTuoi.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatTuoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txGioitinh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txGioitinh.setText("Giới tính:");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Và thêm trực tiếp nhân viên ở trang này luôn");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        javax.swing.GroupLayout ViewLayout = new javax.swing.GroupLayout(View);
        View.setLayout(ViewLayout);
        ViewLayout.setHorizontalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewLayout.createSequentialGroup()
                        .addComponent(Timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimkiemNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewLayout.createSequentialGroup()
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txManv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txTennv, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(truyxuatTennv, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(truyxuatManv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txTuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txGioitinh, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ViewLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(truyxuatTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(35, 35, 35)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSathai, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        ViewLayout.setVerticalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Timkiem)
                    .addComponent(TimkiemNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txManv)
                            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(truyxuatManv, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txTuoi)
                                .addComponent(truyxuatTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txTennv)
                            .addComponent(truyxuatTennv, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txGioitinh)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSathai, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        GiaodienNhanvien.add(View, "View");

        Xemtong.setBackground(new java.awt.Color(153, 153, 153));

        TimkiemTong.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TimkiemTong.setText("Tìm kiếm:");

        txtTimkiemTong.setBackground(new java.awt.Color(204, 204, 204));
        txtTimkiemTong.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        txtTimkiemTong.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTimkiemTong.setText(" Nhập nhân viên.....");
        txtTimkiemTong.setToolTipText("");
        txtTimkiemTong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTimkiemTong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimkiemTongNhapchu(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimkiemTongLammo(evt);
            }
        });

        btnTimkiemTong.setBackground(new java.awt.Color(204, 204, 204));
        btnTimkiemTong.setForeground(new java.awt.Color(0, 0, 0));
        btnTimkiemTong.setText("Tìm kiếm");
        btnTimkiemTong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnTimkiemTong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemTongActionPerformed(evt);
            }
        });

        tbXemtong.setAutoCreateRowSorter(true);
        tbXemtong.setBackground(new java.awt.Color(153, 153, 153));
        tbXemtong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbXemtong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbXemtong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Tuổi", "Giới tính", "Ngày vào làm", "Ngày nghỉ việc", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbXemtong.setShowVerticalLines(true);
        tbXemtong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbXemtongMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbXemtong);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout XemtongLayout = new javax.swing.GroupLayout(Xemtong);
        Xemtong.setLayout(XemtongLayout);
        XemtongLayout.setHorizontalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemtongLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(XemtongLayout.createSequentialGroup()
                        .addComponent(TimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        XemtongLayout.setVerticalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemtongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimkiemTong)
                    .addComponent(txtTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        GiaodienNhanvien.add(Xemtong, "Xemtong");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(764, Short.MAX_VALUE)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXemtong, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GiaodienNhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXemtong, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GiaodienNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TimkiemNhanvienNhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemNhanvienNhapchu
        if(TimkiemNhanvien.getText().equals(" Nhập nhân viên.....")){
            TimkiemNhanvien.setText("");
            TimkiemNhanvien.setForeground(Color.BLACK);
        }
        else
        TimkiemNhanvien.selectAll();
    }//GEN-LAST:event_TimkiemNhanvienNhapchu

    private void TimkiemNhanvienLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemNhanvienLammo
        if(TimkiemNhanvien.getText().trim().isEmpty()){
            TimkiemNhanvien.setText(" Nhập nhân viên.....");
            TimkiemNhanvien.setForeground(Color.black);
        }
    }//GEN-LAST:event_TimkiemNhanvienLammo

    private void Change_Border(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_Border
        JButton clickedButton = (JButton) evt.getSource();

        if (selectedButton != null && selectedButton != clickedButton) {
            selectedButton.setBorder(UIManager.getBorder("Button.border"));
        }

        selectedButton = clickedButton;
        selectedButton.setBorder(BorderFactory.createLineBorder(Color.black, 3));
    }//GEN-LAST:event_Change_Border

    private void View(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View
        CardLayout card = (CardLayout) GiaodienNhanvien.getLayout();
        card.show(GiaodienNhanvien, "View");
        Viewtable();
       
    }//GEN-LAST:event_View

    private void Xemtong(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xemtong
        CardLayout card = (CardLayout) GiaodienNhanvien.getLayout();
        card.show(GiaodienNhanvien, "Xemtong");
        capNhatBangXemTong();       
    }//GEN-LAST:event_Xemtong
public void capNhatBangXemTong() {
    DefaultTableModel model = (DefaultTableModel) tbXemtong.getModel(); 
    model.setRowCount(0);

    ArrayList<NhanVienDTO> danhSach = bus.getDanhSachNhanVien();

    for (NhanVienDTO nv : danhSach) {
        model.addRow(new Object[]{
            nv.getMaNhanVien(),
            nv.getTenNhanVien(),
            nv.getTuoi(),
            nv.getGioiTinh(),
            nv.getNgayVaoCnmm(),
            nv.getNgayNghiViec() != null ? new SimpleDateFormat("dd/MM/yyyy").format(nv.getNgayNghiViec()) : "",
            nv.getTrangThai() == 1 ? "Đang làm" : "Đã nghỉ"
        });
    }
}

    private void txtTimkiemTongNhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemTongNhapchu
        if(txtTimkiemTong.getText().equals(" Nhập nhân viên.....")){
            txtTimkiemTong.setText("");
            txtTimkiemTong.setForeground(Color.BLACK);
        }
        else
        txtTimkiemTong.selectAll();
    }//GEN-LAST:event_txtTimkiemTongNhapchu

    private void txtTimkiemTongLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemTongLammo
        if(txtTimkiemTong.getText().trim().isEmpty()){
            txtTimkiemTong.setText(" Nhập nhân viên.....");
            txtTimkiemTong.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtTimkiemTongLammo

    private void tbNhanvienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanvienMouseEntered
        
    }//GEN-LAST:event_tbNhanvienMouseEntered

    private void tbNhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanvienMouseClicked
//     pos = this.tbNhanvien.getSelectedRow();
//      view();       

int row = tbNhanvien.getSelectedRow();
    if (row != -1) {
        truyxuatManv.setText(tbNhanvien.getValueAt(row, 0).toString());
        truyxuatTennv.setText(tbNhanvien.getValueAt(row, 1).toString());
        truyxuatTuoi.setText(tbNhanvien.getValueAt(row, 2).toString());
        jComboBox1.setSelectedItem(tbNhanvien.getValueAt(row, 3).toString());
    }
   
    }//GEN-LAST:event_tbNhanvienMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String ma = truyxuatManv.getText();
        String ten= truyxuatTennv.getText();
        int tuoi =  Integer.parseInt(truyxuatTuoi.getText());
        String gioiTinh = (String) jComboBox1.getSelectedItem();
        NhanVienDTO nv = new NhanVienDTO();
        nv.setMaNhanVien(ma);
        nv.setTenNhanVien(ten);
        nv.setTuoi(tuoi);
        nv.setGioiTinh(gioiTinh);
//        nv.setNgayVao(new java.util.Date());
//        nv.setNgayNghi(null);    
        nv.setNgayVaoCnmm(new java.util.Date());
        nv.setNgayNghiViec(null);
        nv.setTrangThai(1);              

        NhanVienBUS bus = new NhanVienBUS();
        boolean thanhCong = bus.themNhanVien(nv);
    
    if (thanhCong) {
       JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!");
       Viewtable();
       capNhatBangXemTong();
      
    } else {
        JOptionPane.showMessageDialog(this, "Thêm thất bại!");
    }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSathaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSathaiActionPerformed
int selectedRow = tbNhanvien.getSelectedRow();

    if (selectedRow != -1) {
        String maNhanVien = tbNhanvien.getValueAt(selectedRow, 0).toString(); // Cột 0 là mã nhân viên
             java.time.LocalDate ngayNghi = java.time.LocalDate.now();
            String ngayNghiStr = ngayNghi.toString(); 
        int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn sa thải nhân viên này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            if (bus.xoaNhanVien(maNhanVien)) {
                JOptionPane.showMessageDialog(null, "Đã sa thải nhân viên thành công!");

              capNhatBangXemTong();
                Viewtable();

            } else {
                JOptionPane.showMessageDialog(null, "Không thể sa thải nhân viên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên cần sa thải!");
    }

    }//GEN-LAST:event_btnSathaiActionPerformed

    private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatActionPerformed
        String maNV = truyxuatManv.getText().trim();
NhanVienDTO nvGoc = null; // khong tao NhanVienBUS = new NhanVienBUS vì dữ liệu sẽ không câp nhật
for (NhanVienDTO nv : bus.getDanhSachNhanVien()) {
    if (nv.getMaNhanVien().equalsIgnoreCase(maNV)) {
        nvGoc = nv;
        break;
    }
}


    if (nvGoc == null) {
        JOptionPane.showMessageDialog(null, "Không tìm thấy nhân viên có mã: " + maNV);
        return;
    }

    // 3. Cập nhật các trường được phép sửa
    nvGoc.setTenNhanVien(truyxuatTennv.getText().trim());
    nvGoc.setTuoi(Integer.parseInt(truyxuatTuoi.getText().trim()));
    nvGoc.setGioiTinh(jComboBox1.getSelectedItem().toString());

    // 4. Gọi BUS để sửa nhân viên
    boolean thanhCong = bus.suaNhanVien(nvGoc);

    // 5. Phản hồi kết quả lên UI
    if (thanhCong) {
        JOptionPane.showMessageDialog(null, "Sửa nhân viên thành công!");
//        capNhatBangNhanVien();
        capNhatBangXemTong();
        Viewtable();
               
    } else {
        JOptionPane.showMessageDialog(null, "Sửa nhân viên thất bại!");
    }

    
    }//GEN-LAST:event_btnCapnhatActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
          //  NhanVienBUS nhanVienBUS = new NhanVienBUS();
           
                        
    try {
        String tuKhoa = TimkiemNhanvien.getText().trim();

        ArrayList<NhanVienDTO> ketQua;

        if (!tuKhoa.isEmpty()) {
            // Nếu có nhập từ khóa thì tìm theo từ khóa chung
            ketQua = bus.timKiemTheoTuKhoa(tuKhoa);
        } else {
            // Ngược lại thì tìm theo từng tiêu chí
            String maNV = truyxuatManv.getText().trim();
            String tenNV = truyxuatTennv.getText().trim();
            String tuoi = truyxuatTuoi.getText().trim();
            
            String gioiTinh = "";
            if (jComboBox1.getSelectedItem() != null) {
                gioiTinh = jComboBox1.getSelectedItem().toString().trim();
                if (gioiTinh.equalsIgnoreCase("Tất cả")) {
                    gioiTinh = "";
                }
            }

            ketQua = bus.timKiemNhanVien(maNV, tenNV, tuoi, gioiTinh);
        }

        Viewtable2(ketQua);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Lỗi tìm kiếm: " + e.getMessage());
        e.printStackTrace();
    }

    }//GEN-LAST:event_btnTimkiemActionPerformed

public void Viewtable2(ArrayList<NhanVienDTO> danhSach) {
    DefaultTableModel model = (DefaultTableModel) tbNhanvien.getModel();
    model.setRowCount(0); // Xoá dữ liệu cũ

    for (NhanVienDTO nv : danhSach) {
        if (nv.getTrangThai() == 1) {
            model.addRow(new Object[]{
                nv.getMaNhanVien(),
                nv.getTenNhanVien(),
                nv.getTuoi(),
                nv.getGioiTinh()
            });
        }
    }
}
public void Viewtable3(ArrayList<NhanVienDTO> danhSach) {
    DefaultTableModel model = (DefaultTableModel) tbXemtong.getModel();
    model.setRowCount(0); 

    for (NhanVienDTO nv : danhSach) {
        
            model.addRow(new Object[]{
                nv.getMaNhanVien(),
                nv.getTenNhanVien(),
                nv.getTuoi(),
                nv.getGioiTinh(),
                   nv.getNgayVaoCnmm(),
         nv.getNgayNghiViec(),
                nv.getTrangThai()
            });
        }
    
}
    private void TimkiemNhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimkiemNhanvienActionPerformed
        // 
    }//GEN-LAST:event_TimkiemNhanvienActionPerformed

    private void truyxuatManvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truyxuatManvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_truyxuatManvActionPerformed

    private void tbXemtongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbXemtongMouseClicked
   int row = tbXemtong.getSelectedRow();
        if (evt.getClickCount() == 2) { 
         
            if (row != -1) {
                String maNV = tbXemtong.getValueAt(row, 0).toString(); // Lấy mã nhân viên từ cột 0

                NhanVienBUS bus = new NhanVienBUS();
                NhanVienDTO nv = bus.timTheoMa(maNV); 

                if (nv != null) {
                
                    String thongTin = 
                        "Mã nhân viên: " + nv.getMaNhanVien() + "\n" +
                        "Tên nhân viên: " + nv.getTenNhanVien() + "\n" +
                        "Tuổi: " + nv.getTuoi() + "\n" +
                        "Giới tính: " + nv.getGioiTinh() + "\n" +
                        "Ngày vào: " +    nv.getNgayVaoCnmm() + "\n" +
                        "Ngày nghỉ: " +   nv.getNgayNghiViec()+ "\n" +
                        "Trạng thái: " + (nv.getTrangThai() == 1 ? "Đang làm" : "Đã nghỉ");

                    JOptionPane.showMessageDialog(null, thongTin, "Thông tin nhân viên", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }        
    }//GEN-LAST:event_tbXemtongMouseClicked

    private void btnTimkiemTongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemTongActionPerformed
try {
        String tuKhoa = txtTimkiemTong.getText().trim();
        ArrayList<NhanVienDTO> ketQua;

        if (!tuKhoa.isEmpty()) {
            ketQua = bus.timKiemTheoTuKhoa1(tuKhoa);
        } else {
            String maNV = truyxuatManv.getText().trim();
            String tenNV = truyxuatTennv.getText().trim();
            String tuoi = truyxuatTuoi.getText().trim();

            String gioiTinh = "";
            if (jComboBox1.getSelectedItem() != null) {
                gioiTinh = jComboBox1.getSelectedItem().toString().trim();
                if (gioiTinh.equalsIgnoreCase("Tất cả")) {
                    gioiTinh = "";
                }
            }

            int row = tbXemtong.getSelectedRow(); 
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng trong bảng để lấy ngày vào, ngày nghỉ và trạng thái.");
                return;
            }

            String ngayVaoStr = "";
            String ngayNghiStr = "";
            String trangThaiStr = "";

            Object ngayVaoObj = tbXemtong.getValueAt(row, 4);
            Object ngayNghiObj = tbXemtong.getValueAt(row, 5);
            Object trangThaiObj = tbXemtong.getValueAt(row, 6);

            if (ngayVaoObj != null) {
                ngayVaoStr = ngayVaoObj.toString().trim();
            }
            if (ngayNghiObj != null) {
                ngayNghiStr = ngayNghiObj.toString().trim();
            }

            if (trangThaiObj != null) {
                String trangThaiBang = trangThaiObj.toString().trim();
                if (trangThaiBang.equalsIgnoreCase("Đang làm")) trangThaiStr = "1";
                else if (trangThaiBang.equalsIgnoreCase("Đã nghỉ")) trangThaiStr = "0";
            }

            ketQua = bus.timKiemNhanVien1(maNV, tenNV, tuoi, gioiTinh, ngayVaoStr, ngayNghiStr, trangThaiStr);
        }

        Viewtable3(ketQua);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Lỗi tìm kiếm: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnTimkiemTongActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
       JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(null);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                bus.nhapExcel(selectedFile.getAbsolutePath());
                JOptionPane.showMessageDialog(null, "Nhập Excel thành công!");
             
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Lỗi khi nhập Excel: " + ex.getMessage());
            }
        }
    
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
         JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn nơi lưu file Excel");
        
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();

            if (!filePath.toLowerCase().endsWith(".xlsx")) {
                filePath += ".xlsx";
            }
System.out.println(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.class.getPackage().getImplementationVersion());

            bus.xuatExcel(filePath); // GỌI TỪ BUS

            JOptionPane.showMessageDialog(null, "Xuất file Excel thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    
    }//GEN-LAST:event_btnExportActionPerformed
//public void capNhatBangNhanVien() {
//    DefaultTableModel model = (DefaultTableModel) tbNhanvien.getModel();
//    model.setRowCount(0);
//    ArrayList<NhanVienDTO> danhSach = bus.getDanhSachNhanVien(); // lấy lại danh sách mới
//
//    for (NhanVienDTO nv : danhSach) {
//        if (nv.getTrangThai() == 1) { // chỉ hiển thị nhân viên còn làm
//            model.addRow(new Object[]{
//                nv.getMaNhanVien(),
//                nv.getTenNhanVien(),
//                nv.getTuoi(),
//                nv.getGioiTinh(),
//                nv.getNgayVao(),
//                nv.getNgayNghi(),
//               nv.getTrangThai()
//            });
//        }
//    }
//}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GiaodienNhanvien;
    private javax.swing.JLabel Timkiem;
    private javax.swing.JTextField TimkiemNhanvien;
    private javax.swing.JLabel TimkiemTong;
    private javax.swing.JPanel View;
    private javax.swing.JPanel Xemtong;
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnSathai;
    private javax.swing.JButton btnThem;
    private testlib.RoundedButton btnTimkiem;
    private testlib.RoundedButton btnTimkiemTong;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnXemtong;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbNhanvien;
    private javax.swing.JTable tbXemtong;
    private javax.swing.JTextField truyxuatManv;
    private javax.swing.JTextField truyxuatTennv;
    private javax.swing.JTextField truyxuatTuoi;
    private javax.swing.JLabel txGioitinh;
    private javax.swing.JLabel txManv;
    private javax.swing.JLabel txTennv;
    private javax.swing.JLabel txTuoi;
    private javax.swing.JTextField txtTimkiemTong;
    // End of variables declaration//GEN-END:variables
}
