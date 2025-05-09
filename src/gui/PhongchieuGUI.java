
package gui;

import log_reg.UI;
import javax.swing.table.*;
import DTO.PhongChieuDTO;
import DAO.PhongChieuDAO;
import BUS.PhongChieuBUS; // Import lớp PhongChieuBUS mới
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import javax.swing.*;
import java.awt.Component;

public class PhongchieuGUI extends javax.swing.JPanel {
private PhongChieuBUS phongChieuBUS = new PhongChieuBUS();
    private JButton selectedButton = null;
    private PhongChieuDAO phongChieuDAO = new PhongChieuDAO();
    private String selectedMaPhong = null;
private java.util.List<PhongChieuDTO> danhSachPhongChieu;
private boolean updatePhongChieuInDB(String maPhongChieu, int sucChua, String loaiChieu, int giaVe) {
    return phongChieuDAO.updatePhongChieu(maPhongChieu, sucChua, loaiChieu, giaVe);
}

    public PhongchieuGUI() {
        initComponents();
        loadAllDataToXemTongTable();
        GiaodienPhongchieu.setLayout(new CardLayout());
        GiaodienPhongchieu.add(View, "View");
        GiaodienPhongchieu.add(ThemPhongchieu, "ThemPhongchieu");
        GiaodienPhongchieu.add(Xemtong, "Xemtong");
        
        
        JTableHeader header = tbPhongchieu.getTableHeader(); 
        header.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        JTableHeader headerXem = tbXemtong.getTableHeader(); 
        headerXem.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        
//        UI.addPlaceHolderEffect(txtMaPhong,"Nhập mã phòng");
         UI.addPlaceHolderEffect(txtSucchua,"Nhập sức chứa");
         UI.addPlaceHolderEffect(txtTheloai,"Nhập giá vé");
         UI.addPlaceHolderEffect(txNangCao,"Nhập tìm kiếm");
         // Gọi hàm loadDataToTable để hiển thị dữ liệu
    loadDataToTable();
      loadLoaiChieuToComboBox();
    // Thêm Action Listener cho nút tìm kiếm
    btnTimkiemPhongchieu.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            searchPhongChieu();
        }
    });
        
    btnThemPhong.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        themPhongChieuMoi();
    }
});

// Action Listener cho nút Hủy bỏ
btnHuybo.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        resetThemPhongChieuForm();
        CardLayout cardLayout = (CardLayout) GiaodienPhongchieu.getLayout();
        cardLayout.show(GiaodienPhongchieu, "View");
    }
});

// Thêm focus listeners cho các trường nhập liệu để cải thiện trải nghiệm người dùng
txtSucchua.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusGained(java.awt.event.FocusEvent evt) {
        if (txtSucchua.getText().trim().equals("Nhập sức chứa")) {
            txtSucchua.setText("");
        }
    }
    public void focusLost(java.awt.event.FocusEvent evt) {
        if (txtSucchua.getText().trim().isEmpty()) {
            txtSucchua.setText(" Nhập sức chứa");
        }
    }
});

txtTheloai.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusGained(java.awt.event.FocusEvent evt) {
        if (txtTheloai.getText().trim().equals("Nhập giá vé")) {
            txtTheloai.setText("");
        }
    }
    public void focusLost(java.awt.event.FocusEvent evt) {
        if (txtTheloai.getText().trim().isEmpty()) {
            txtTheloai.setText(" Nhập giá vé");
        }
    }
});
    
 btnXoa.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            deleteSelectedRoom();
        }
    });
 
 btnTimkiemTong.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        searchAllPhongChieu();
    }
});

 txtTimkiemTong.addFocusListener(new java.awt.event.FocusAdapter() {
    public void focusGained(java.awt.event.FocusEvent evt) {
        if (txtTimkiemTong.getText().trim().equals("Nhập mã phòng.....")) {
            txtTimkiemTong.setText("");
        }
    }
    public void focusLost(java.awt.event.FocusEvent evt) {
        if (txtTimkiemTong.getText().trim().isEmpty()) {
            txtTimkiemTong.setText("Nhập mã phòng.....");
        }
    }
    
    
    
});
 
  tbPhongchieu.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int selectedRow = tbPhongchieu.getSelectedRow();
            if (selectedRow >= 0) {
                // Lấy index thực của hàng trong model (quan trọng nếu bảng được sắp xếp)
                int modelRow = tbPhongchieu.convertRowIndexToModel(selectedRow);
                
                // Lấy dữ liệu từ hàng được chọn
                DefaultTableModel model = (DefaultTableModel) tbPhongchieu.getModel();
                selectedMaPhong = model.getValueAt(modelRow, 0).toString(); // Mã phòng
                
                // Hiển thị dữ liệu trong các trường truy xuất
                truyxuatSucchua.setText(model.getValueAt(modelRow, 1).toString()); // Sức chứa
                truyxuatLoaichieu.setText(model.getValueAt(modelRow, 2).toString()); // Loại chiếu
                truyxuatGiave.setText(model.getValueAt(modelRow, 3).toString()); // Giá vé
            }
        }
    });
  
   btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            updatePhongChieu();
        }
    });
 
   btnExport.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExportActionPerformed(evt);
    }
});
   
   btnNangCao.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        performAdvancedSearch();
    }
});
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnView = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnXemtong = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        GiaodienPhongchieu = new javax.swing.JPanel();
        View = new javax.swing.JPanel();
        btnCapnhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        Timkiem = new javax.swing.JLabel();
        TimkiemPhongchieu = new javax.swing.JTextField();
        btnTimkiemPhongchieu = new testlib.RoundedButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPhongchieu = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        txSucchua = new javax.swing.JLabel();
        truyxuatSucchua = new javax.swing.JTextField();
        txGiave = new javax.swing.JLabel();
        truyxuatLoaichieu = new javax.swing.JTextField();
        truyxuatGiave = new javax.swing.JTextField();
        txLoaichieu = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ThemPhongchieu = new javax.swing.JPanel();
        txtSucchua = new testlib.RoundedTextField();
        Succhua = new javax.swing.JLabel();
        Loaichieu = new javax.swing.JLabel();
        TheloaiPhim = new javax.swing.JLabel();
        txtTheloai = new testlib.RoundedTextField();
        btnHuybo = new testlib.RoundedButton();
        btnThemPhong = new testlib.RoundedButton();
        cbLoaichieu = new javax.swing.JComboBox<>();
        Xemtong = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbXemtong = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        TimkiemTong = new javax.swing.JLabel();
        txtTimkiemTong = new javax.swing.JTextField();
        btnTimkiemTong = new testlib.RoundedButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txNangCao = new javax.swing.JTextField();
        btnNangCao = new javax.swing.JButton();
        rMaPhong = new javax.swing.JRadioButton();
        rSucChua = new javax.swing.JRadioButton();
        rAll = new javax.swing.JRadioButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        btnView.setBackground(new java.awt.Color(153, 153, 153));
        btnView.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/view.png"))); // NOI18N
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

        btnThem.setBackground(new java.awt.Color(153, 153, 153));
        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnThem.setContentAreaFilled(false);
        btnThem.setFocusPainted(false);
        btnThem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemPhongchieu(evt);
            }
        });

        btnXemtong.setBackground(new java.awt.Color(153, 153, 153));
        btnXemtong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnXemtong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/view2.png"))); // NOI18N
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
                XemPhongchieu(evt);
            }
        });

        btnExport.setBackground(new java.awt.Color(153, 153, 153));
        btnExport.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/export.png"))); // NOI18N
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

        btnImport.setBackground(new java.awt.Color(153, 153, 153));
        btnImport.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/import.png"))); // NOI18N
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

        GiaodienPhongchieu.setBackground(new java.awt.Color(153, 153, 153));
        GiaodienPhongchieu.setLayout(new java.awt.CardLayout());

        View.setBackground(new java.awt.Color(153, 153, 153));

        btnCapnhat.setBackground(new java.awt.Color(153, 153, 153));
        btnCapnhat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnCapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/update.png"))); // NOI18N
        btnCapnhat.setText("Cập nhật");
        btnCapnhat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCapnhat.setContentAreaFilled(false);
        btnCapnhat.setFocusPainted(false);
        btnCapnhat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCapnhat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnXoa.setBackground(new java.awt.Color(153, 153, 153));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete_i.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnXoa.setContentAreaFilled(false);
        btnXoa.setFocusPainted(false);
        btnXoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Timkiem.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Timkiem.setText("Tìm kiếm:");

        TimkiemPhongchieu.setBackground(new java.awt.Color(204, 204, 204));
        TimkiemPhongchieu.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        TimkiemPhongchieu.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TimkiemPhongchieu.setText("Nhập mã phòng.....");
        TimkiemPhongchieu.setToolTipText("");
        TimkiemPhongchieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TimkiemPhongchieu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TimkiemPhongchieuNhapchu(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TimkiemPhongchieuLammo(evt);
            }
        });

        btnTimkiemPhongchieu.setBackground(new java.awt.Color(204, 204, 204));
        btnTimkiemPhongchieu.setForeground(new java.awt.Color(0, 0, 0));
        btnTimkiemPhongchieu.setText("Tìm kiếm");
        btnTimkiemPhongchieu.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        tbPhongchieu.setAutoCreateRowSorter(true);
        tbPhongchieu.setBackground(new java.awt.Color(153, 153, 153));
        tbPhongchieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbPhongchieu.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbPhongchieu.setModel(new javax.swing.table.DefaultTableModel(
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
                "Mã phòng", "Sức chứa", "Loại chiếu", "Giá vé"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Long.class
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
        tbPhongchieu.setRowHeight(30);
        tbPhongchieu.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tbPhongchieu);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txSucchua.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txSucchua.setText("Sức chứa:");

        truyxuatSucchua.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatSucchua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatSucchua.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatSucchua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txGiave.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txGiave.setText("Giá vé:");

        truyxuatLoaichieu.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatLoaichieu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatLoaichieu.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatLoaichieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        truyxuatGiave.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatGiave.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatGiave.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatGiave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txLoaichieu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txLoaichieu.setText("Loại chiếu:");

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout ViewLayout = new javax.swing.GroupLayout(View);
        View.setLayout(ViewLayout);
        ViewLayout.setHorizontalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewLayout.createSequentialGroup()
                        .addComponent(Timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimkiemPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimkiemPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txGiave, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txSucchua, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txLoaichieu, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(truyxuatGiave, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(truyxuatSucchua, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(truyxuatLoaichieu, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        ViewLayout.setVerticalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Timkiem)
                    .addComponent(TimkiemPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewLayout.createSequentialGroup()
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(truyxuatSucchua, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txSucchua))
                                .addGap(17, 17, 17)
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(truyxuatLoaichieu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txLoaichieu))
                                .addGap(14, 14, 14)
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(truyxuatGiave, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txGiave)))
                            .addGroup(ViewLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        GiaodienPhongchieu.add(View, "View");

        ThemPhongchieu.setBackground(new java.awt.Color(153, 153, 153));

        txtSucchua.setText(" Nhập sức chứa");

        Succhua.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Succhua.setText("Sức chứa:");

        Loaichieu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Loaichieu.setText("Loại chiếu:");

        TheloaiPhim.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TheloaiPhim.setText("Giá vé:");

        txtTheloai.setText(" Nhập giá vé");

        btnHuybo.setText("Hủy bỏ");
        btnHuybo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        btnThemPhong.setBackground(new java.awt.Color(204, 0, 0));
        btnThemPhong.setText("Thêm phòng");
        btnThemPhong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        cbLoaichieu.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        cbLoaichieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cơ bản", "Blazer", " ", " " }));
        cbLoaichieu.setBorder(null);

        javax.swing.GroupLayout ThemPhongchieuLayout = new javax.swing.GroupLayout(ThemPhongchieu);
        ThemPhongchieu.setLayout(ThemPhongchieuLayout);
        ThemPhongchieuLayout.setHorizontalGroup(
            ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThemPhongchieuLayout.createSequentialGroup()
                .addGroup(ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThemPhongchieuLayout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(btnHuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(btnThemPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ThemPhongchieuLayout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addGroup(ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TheloaiPhim)
                            .addComponent(Loaichieu)
                            .addComponent(Succhua))
                        .addGap(41, 41, 41)
                        .addGroup(ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSucchua, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbLoaichieu, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        ThemPhongchieuLayout.setVerticalGroup(
            ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThemPhongchieuLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ThemPhongchieuLayout.createSequentialGroup()
                        .addComponent(Succhua)
                        .addGap(37, 37, 37)
                        .addGroup(ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Loaichieu)
                            .addComponent(cbLoaichieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ThemPhongchieuLayout.createSequentialGroup()
                        .addComponent(txtSucchua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)))
                .addGap(30, 30, 30)
                .addGroup(ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TheloaiPhim)
                    .addComponent(txtTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(ThemPhongchieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        GiaodienPhongchieu.add(ThemPhongchieu, "ThemPhongchieu");

        Xemtong.setBackground(new java.awt.Color(153, 153, 153));

        tbXemtong.setAutoCreateRowSorter(true);
        tbXemtong.setBackground(new java.awt.Color(153, 153, 153));
        tbXemtong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbXemtong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbXemtong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã phòng", "Sức chứa", "Loại chiếu", "Giá vé", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbXemtong.setCellSelectionEnabled(true);
        tbXemtong.setRowHeight(30);
        tbXemtong.setShowGrid(false);
        tbXemtong.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tbXemtong);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        TimkiemTong.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TimkiemTong.setText("Tìm kiếm:");

        txtTimkiemTong.setBackground(new java.awt.Color(204, 204, 204));
        txtTimkiemTong.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        txtTimkiemTong.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTimkiemTong.setText("Nhập mã phòng.....");
        txtTimkiemTong.setToolTipText("");
        txtTimkiemTong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTimkiemTong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TimkiemTong(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimkiemTongLammo(evt);
            }
        });

        btnTimkiemTong.setBackground(new java.awt.Color(204, 204, 204));
        btnTimkiemTong.setForeground(new java.awt.Color(0, 0, 0));
        btnTimkiemTong.setText("Tìm kiếm");
        btnTimkiemTong.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

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
                    .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
                        .addComponent(jSeparator2)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        XemtongLayout.setVerticalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemtongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimkiemTong)
                    .addComponent(txtTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GiaodienPhongchieu.add(Xemtong, "Xemtong");

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tìm kiếm nâng cao");

        txNangCao.setBackground(new java.awt.Color(204, 204, 204));
        txNangCao.setForeground(new java.awt.Color(0, 0, 0));
        txNangCao.setText("jTextField2");

        btnNangCao.setBackground(new java.awt.Color(204, 204, 204));
        btnNangCao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNangCao.setForeground(new java.awt.Color(0, 0, 0));
        btnNangCao.setText("Tìm kiếm");

        buttonGroup1.add(rMaPhong);
        rMaPhong.setText("Mã phòng");

        buttonGroup1.add(rSucChua);
        rSucChua.setText("Sức chứa");

        buttonGroup1.add(rAll);
        rAll.setText("Tất cả");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txNangCao, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNangCao))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rMaPhong)
                                .addGap(27, 27, 27)
                                .addComponent(rSucChua)
                                .addGap(28, 28, 28))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(rAll)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXemtong, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GiaodienPhongchieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXemtong, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txNangCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNangCao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rMaPhong)
                            .addComponent(rSucChua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rAll)))
                .addGap(7, 7, 7)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(GiaodienPhongchieu, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void performAdvancedSearch() {
    // Get search text from txNangCao
    String searchText = txNangCao.getText().trim();
    
    // Check if search text is empty or default placeholder
    if (searchText.isEmpty() || searchText.equals("Nhập tìm kiếm")) {
        // Reset both tables to show all data
        loadDataToTable();
        loadAllDataToXemTongTable();
        return;
    }
    
    // Check if any radio button is selected
    if (!rMaPhong.isSelected() && !rSucChua.isSelected() && !rAll.isSelected()) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Vui lòng chọn loại tìm kiếm (Mã phòng, Sức chứa hoặc Tất cả)!",
            "Thông báo",
            javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Perform search based on the selected criteria
    if (rMaPhong.isSelected()) {
        searchByMaPhong(searchText);
    } else if (rSucChua.isSelected()) {
        searchBySucChua(searchText);
    } else if (rAll.isSelected()) {
        searchByAll(searchText);
    }
}

// Search by Room ID (Mã phòng)
private void searchByMaPhong(String searchText) {
    // Get all data
    List<PhongChieuDTO> allPhongChieu = phongChieuDAO.getAllPhongChieu();
    
    // Search in active rooms for tbPhongchieu
    DefaultTableModel modelActive = (DefaultTableModel) tbPhongchieu.getModel();
    modelActive.setRowCount(0);
    
    // Search in all rooms for tbXemtong
    DefaultTableModel modelAll = (DefaultTableModel) tbXemtong.getModel();
    modelAll.setRowCount(0);
    
    boolean foundActive = false;
    boolean foundAll = false;
    
    // Check each room
    for (PhongChieuDTO phongChieu : allPhongChieu) {
        String maPhong = phongChieu.getMaPhongChieu().toLowerCase();
        
        // Check if the room ID contains the search text
        if (maPhong.contains(searchText.toLowerCase())) {
            // Add to tbXemtong (all rooms)
            modelAll.addRow(new Object[]{
                phongChieu.getMaPhongChieu(),
                phongChieu.getSucChua(),
                phongChieu.getLoaiChieu(),
                phongChieu.getGiaVe(),
                phongChieu.getTrangThai()
            });
            foundAll = true;
            
            // Only add active rooms to tbPhongchieu
            if ("Đang hoạt động".equals(phongChieu.getTrangThai())) {
                modelActive.addRow(new Object[]{
                    phongChieu.getMaPhongChieu(),
                    phongChieu.getSucChua(),
                    phongChieu.getLoaiChieu(),
                    phongChieu.getGiaVe()
                });
                foundActive = true;
            }
        }
    }
    
    // Show message if no results found
    if (!foundAll && !foundActive) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Không tìm thấy phòng chiếu nào có mã phòng chứa \"" + searchText + "\"!",
            "Thông báo",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
        // Reset tables
        loadDataToTable();
        loadAllDataToXemTongTable();
    }
}

// Search by Capacity (Sức chứa)
private void searchBySucChua(String searchText) {
    // Try to parse the search text as an integer
    int searchCapacity;
    try {
        searchCapacity = Integer.parseInt(searchText);
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Vui lòng nhập số nguyên cho tìm kiếm sức chứa!",
            "Lỗi",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Get all data
    List<PhongChieuDTO> allPhongChieu = phongChieuDAO.getAllPhongChieu();
    
    // Search in active rooms for tbPhongchieu
    DefaultTableModel modelActive = (DefaultTableModel) tbPhongchieu.getModel();
    modelActive.setRowCount(0);
    
    // Search in all rooms for tbXemtong
    DefaultTableModel modelAll = (DefaultTableModel) tbXemtong.getModel();
    modelAll.setRowCount(0);
    
    boolean foundActive = false;
    boolean foundAll = false;
    
    // Check each room
    for (PhongChieuDTO phongChieu : allPhongChieu) {
        int sucChua = phongChieu.getSucChua();
        
        // Check if the capacity matches
        if (sucChua == searchCapacity) {
            // Add to tbXemtong (all rooms)
            modelAll.addRow(new Object[]{
                phongChieu.getMaPhongChieu(),
                phongChieu.getSucChua(),
                phongChieu.getLoaiChieu(),
                phongChieu.getGiaVe(),
                phongChieu.getTrangThai()
            });
            foundAll = true;
            
            // Only add active rooms to tbPhongchieu
            if ("Đang hoạt động".equals(phongChieu.getTrangThai())) {
                modelActive.addRow(new Object[]{
                    phongChieu.getMaPhongChieu(),
                    phongChieu.getSucChua(),
                    phongChieu.getLoaiChieu(),
                    phongChieu.getGiaVe()
                });
                foundActive = true;
            }
        }
    }
    
    // Show message if no results found
    if (!foundAll && !foundActive) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Không tìm thấy phòng chiếu nào có sức chứa " + searchCapacity + "!",
            "Thông báo",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
        // Reset tables
        loadDataToTable();
        loadAllDataToXemTongTable();
    }
}

// Search by All Fields
private void searchByAll(String searchText) {
    String searchTextLower = searchText.toLowerCase();
    
    // Get all data
    List<PhongChieuDTO> allPhongChieu = phongChieuDAO.getAllPhongChieu();
    
    // Search in active rooms for tbPhongchieu
    DefaultTableModel modelActive = (DefaultTableModel) tbPhongchieu.getModel();
    modelActive.setRowCount(0);
    
    // Search in all rooms for tbXemtong
    DefaultTableModel modelAll = (DefaultTableModel) tbXemtong.getModel();
    modelAll.setRowCount(0);
    
    boolean foundActive = false;
    boolean foundAll = false;
    
    // Check each room
    for (PhongChieuDTO phongChieu : allPhongChieu) {
        // Convert all fields to strings for case-insensitive search
        String maPhong = phongChieu.getMaPhongChieu().toLowerCase();
        String sucChua = String.valueOf(phongChieu.getSucChua()).toLowerCase();
        String loaiChieu = phongChieu.getLoaiChieu().toLowerCase();
        String giaVe = String.valueOf(phongChieu.getGiaVe()).toLowerCase();
        String trangThai = phongChieu.getTrangThai().toLowerCase();
        
        // Check if any field contains the search text
        if (maPhong.contains(searchTextLower) || 
            sucChua.contains(searchTextLower) || 
            loaiChieu.contains(searchTextLower) || 
            giaVe.contains(searchTextLower) || 
            trangThai.contains(searchTextLower)) {
            
            // Add to tbXemtong (all rooms)
            modelAll.addRow(new Object[]{
                phongChieu.getMaPhongChieu(),
                phongChieu.getSucChua(),
                phongChieu.getLoaiChieu(),
                phongChieu.getGiaVe(),
                phongChieu.getTrangThai()
            });
            foundAll = true;
            
            // Only add active rooms to tbPhongchieu
            if ("Đang hoạt động".equals(phongChieu.getTrangThai())) {
                modelActive.addRow(new Object[]{
                    phongChieu.getMaPhongChieu(),
                    phongChieu.getSucChua(),
                    phongChieu.getLoaiChieu(),
                    phongChieu.getGiaVe()
                });
                foundActive = true;
            }
        }
    }
    
    // Show message if no results found
    if (!foundAll && !foundActive) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Không tìm thấy phòng chiếu nào chứa thông tin \"" + searchText + "\"!",
            "Thông báo",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
        // Reset tables
        loadDataToTable();
        loadAllDataToXemTongTable();
    }
}
    
    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {
        // Xác định component nào đang hiển thị
        Component visibleComponent = null;
        for (Component comp : GiaodienPhongchieu.getComponents()) {
            if (comp.isVisible()) {
                visibleComponent = comp;
                break;
            }
        }
        
        // Gọi phương thức exportToExcel từ PhongChieuBUS
        phongChieuBUS.exportToExcel(this, visibleComponent, tbPhongchieu, tbXemtong, View, Xemtong);
    }
    
    private void loadAllDataToXemTongTable() {
    // Lấy tất cả dữ liệu phòng chiếu từ DAO
    List<PhongChieuDTO> allPhongChieu = phongChieuDAO.getAllPhongChieu();
    
    // Tạo model cho bảng
    DefaultTableModel model = (DefaultTableModel) tbXemtong.getModel();
    model.setRowCount(0); // Xóa tất cả các hàng hiện có
    
    // Thêm dữ liệu vào model - hiển thị tất cả phòng chiếu
    for (PhongChieuDTO phongChieu : allPhongChieu) {
        model.addRow(new Object[]{
            phongChieu.getMaPhongChieu(),
            phongChieu.getSucChua(),
            phongChieu.getLoaiChieu(),
            phongChieu.getGiaVe(),
            phongChieu.getTrangThai()
        });
    }
}
    
    private void loadLoaiChieuToComboBox() {
    // Lấy danh sách loại chiếu từ cơ sở dữ liệu
    List<String> danhSachLoaiChieu = phongChieuDAO.getAllLoaiChieu();
    
    // Xóa các mục hiện tại trong ComboBox
    cbLoaichieu.removeAllItems();
    
    // Thêm các loại chiếu vào ComboBox
    for (String loaiChieu : danhSachLoaiChieu) {
        cbLoaichieu.addItem(loaiChieu);
    }
    
    // Thêm các loại chiếu mặc định nếu danh sách rỗng
    if (danhSachLoaiChieu.isEmpty()) {
        cbLoaichieu.addItem("Cơ bản");
        cbLoaichieu.addItem("Blazer");
    }
}
    
    private void loadDataToTable() {
    danhSachPhongChieu = phongChieuDAO.getAllPhongChieu();
    DefaultTableModel model = (DefaultTableModel) tbPhongchieu.getModel();
    model.setRowCount(0); // Xóa tất cả dữ liệu cũ
    
        for (PhongChieuDTO phongChieu : danhSachPhongChieu) {
        // Chỉ hiển thị các phòng đang hoạt động
        if ("Đang hoạt động".equals(phongChieu.getTrangThai())) {
            model.addRow(new Object[]{
                phongChieu.getMaPhongChieu(),
                phongChieu.getSucChua(),
                phongChieu.getLoaiChieu(),
                phongChieu.getGiaVe(),
                phongChieu.getTrangThai()
            });
        }
    }
}
    
    private void themPhongChieuMoi() {
    try {
        // Lấy dữ liệu từ form
        String maPhongChieu = phongChieuDAO.generateNewMaPhongChieu();
        
        // Lấy và xác thực sức chứa
        String sucChuaText = txtSucchua.getText().trim();
        if (sucChuaText.equals("Nhập sức chứa") || sucChuaText.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập sức chứa!");
            return;
        }
        int sucChua;
        try {
            sucChua = Integer.parseInt(sucChuaText);
            if (sucChua <= 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Sức chứa phải lớn hơn 0!");
                return;
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Sức chứa phải là số nguyên!");
            return;
        }
        
        // Lấy loại chiếu từ ComboBox
        String loaiChieu = cbLoaichieu.getSelectedItem().toString();
        
        // Lấy và xác thực giá vé
        String giaVeText = txtTheloai.getText().trim();
        if (giaVeText.equals("Nhập giá vé") || giaVeText.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Vui lòng nhập giá vé!");
            return;
        }
        int giaVe;
        try {
            giaVe = Integer.parseInt(giaVeText);
            if (giaVe < 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Giá vé không được âm!");
                return;
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Giá vé phải là số nguyên!");
            return;
        }
        
        // Tạo đối tượng PhongChieuDTO mới
        PhongChieuDTO phongChieuMoi = new PhongChieuDTO();
        phongChieuMoi.setMaPhongChieu(maPhongChieu);
        phongChieuMoi.setSucChua(sucChua);
        phongChieuMoi.setLoaiChieu(loaiChieu);
        phongChieuMoi.setGiaVe(giaVe);
        phongChieuMoi.setTrangThai("Đang hoạt động"); // Tự động thiết lập trạng thái
        
        // Thêm phòng chiếu mới vào cơ sở dữ liệu
        boolean success = phongChieuDAO.addPhongChieu(phongChieuMoi);
        
        if (success) {
            javax.swing.JOptionPane.showMessageDialog(this, "Thêm phòng chiếu thành công!");
            // Xóa dữ liệu trong form
            resetThemPhongChieuForm();
            // Cập nhật lại bảng
            loadDataToTable();
            // Chuyển về view chính
            CardLayout cardLayout = (CardLayout) GiaodienPhongchieu.getLayout();
            cardLayout.show(GiaodienPhongchieu, "View");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Thêm phòng chiếu thất bại!");
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
        e.printStackTrace();
    }
}

// Phương thức để reset form
private void resetThemPhongChieuForm() {
    txtSucchua.setText(" Nhập sức chứa");
    txtTheloai.setText(" Nhập giá vé");
    cbLoaichieu.setSelectedIndex(0);
}
 
private void updatePhongChieu() {
    // Kiểm tra xem có hàng nào được chọn không
    if (selectedMaPhong == null) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Vui lòng chọn phòng chiếu để cập nhật!", 
            "Thông báo", 
            javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    try {
        // Lấy dữ liệu từ các trường nhập liệu
        int sucChua = Integer.parseInt(truyxuatSucchua.getText().trim());
        String loaiChieu = truyxuatLoaichieu.getText().trim();
        int giaVe = Integer.parseInt(truyxuatGiave.getText().trim());
        
        // Validate dữ liệu
        if (sucChua <= 0) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Sức chứa phải lớn hơn 0!", 
                "Lỗi", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (giaVe < 0) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                "Giá vé không được âm!", 
                "Lỗi", 
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Cập nhật thông tin trong database
        if (updatePhongChieuInDB(selectedMaPhong, sucChua, loaiChieu, giaVe)) {
            // Nếu cập nhật thành công, reload dữ liệu
            loadDataToTable();
            
            // Reset các trường nhập liệu
            resetTruyXuatFields();
            
            // Thông báo thành công
            javax.swing.JOptionPane.showMessageDialog(this,
                "Cập nhật phòng chiếu thành công!",
                "Thông báo",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            // Reset mã phòng đang chọn
            selectedMaPhong = null;
        } else {
            // Thông báo lỗi nếu cập nhật thất bại
            javax.swing.JOptionPane.showMessageDialog(this,
                "Không thể cập nhật phòng chiếu!",
                "Lỗi",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        // Xử lý lỗi nếu người dùng nhập không phải số
        javax.swing.JOptionPane.showMessageDialog(this,
            "Sức chứa và giá vé phải là số!",
            "Lỗi",
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}

// Phương thức để reset các trường truy xuất
private void resetTruyXuatFields() {
    truyxuatSucchua.setText(" Truy xuất khi nhấp vào table trên");
    truyxuatLoaichieu.setText(" Truy xuất khi nhấp vào table trên");
    truyxuatGiave.setText(" Truy xuất khi nhấp vào table trên");
}

  private void searchPhongChieu() {
    String searchText = TimkiemPhongchieu.getText().trim();
    if (searchText.equals("Nhập mã phòng.....")) {
        searchText = "";
    }
    
    DefaultTableModel model = (DefaultTableModel) tbPhongchieu.getModel();
    model.setRowCount(0); // Xóa tất cả các hàng hiện có
    
    // Nếu không có từ khóa tìm kiếm, hiển thị tất cả các phòng đang hoạt động
    if (searchText.isEmpty()) {
        loadDataToTable();
        return;
    }
    
    // Tìm kiếm phòng chiếu theo mã
    for (PhongChieuDTO phongChieu : danhSachPhongChieu) {
        if (phongChieu.getMaPhongChieu().toLowerCase().contains(searchText.toLowerCase()) && 
            "Đang hoạt động".equals(phongChieu.getTrangThai())) {
            model.addRow(new Object[]{
                phongChieu.getMaPhongChieu(),
                phongChieu.getSucChua(),
                phongChieu.getLoaiChieu(),
                phongChieu.getGiaVe(),
                phongChieu.getTrangThai()
            });
        }
    }
    
    // Nếu không tìm thấy kết quả
    if (model.getRowCount() == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Không tìm thấy phòng chiếu nào phù hợp!", 
            "Thông báo", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
        loadDataToTable(); // Tải lại dữ liệu ban đầu
    }
}
    
  private void searchAllPhongChieu() {
    String searchText = txtTimkiemTong.getText().trim();
    
    // Nếu không có từ khóa tìm kiếm, hiển thị tất cả phòng chiếu
    if (searchText.isEmpty() || searchText.equals("Nhập mã phòng.....")) {
        loadAllDataToXemTongTable();
        return;
    }
    
    List<PhongChieuDTO> allPhongChieu = phongChieuDAO.getAllPhongChieu();
    DefaultTableModel model = (DefaultTableModel) tbXemtong.getModel();
    model.setRowCount(0); // Xóa tất cả hàng hiện có
    
    // Lọc phòng chiếu theo từ khóa tìm kiếm
    boolean found = false;
    for (PhongChieuDTO phongChieu : allPhongChieu) {
        if (phongChieu.getMaPhongChieu().toLowerCase().contains(searchText.toLowerCase())) {
            model.addRow(new Object[]{
                phongChieu.getMaPhongChieu(),
                phongChieu.getSucChua(),
                phongChieu.getLoaiChieu(),
                phongChieu.getGiaVe(),
                phongChieu.getTrangThai()
            });
            found = true;
        }
    }
    
    // Thông báo nếu không tìm thấy kết quả
    if (!found) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Không tìm thấy phòng chiếu nào phù hợp!", 
            "Thông báo", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
        loadAllDataToXemTongTable(); // Tải lại dữ liệu ban đầu
    }
}
  
    private void deleteSelectedRoom() {
    // Get the selected row from the table
    int selectedRow = tbPhongchieu.getSelectedRow();
    
    // Check if a row is selected
    if (selectedRow == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Vui lòng chọn phòng chiếu để xóa!", 
            "Thông báo", 
            javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // Get the table model and the selected row index in the model
    // (necessary if the table is sorted or filtered)
    int modelRow = tbPhongchieu.convertRowIndexToModel(selectedRow);
    DefaultTableModel model = (DefaultTableModel) tbPhongchieu.getModel();
    
    // Get the room ID from the selected row
    String maPhongChieu = model.getValueAt(modelRow, 0).toString();
    
    // Confirm deletion
    int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
        "Bạn có chắc chắn muốn xóa phòng chiếu " + maPhongChieu + "?",
        "Xác nhận xóa",
        javax.swing.JOptionPane.YES_NO_OPTION);
    
    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        // Update the status in the database
        boolean success = phongChieuDAO.updateTrangThaiToNgungHoatDong(maPhongChieu);
        
        if (success) {
            // Remove the row from the table
            model.removeRow(modelRow);
            
            // Update the room list
            loadDataToTable();
            
            javax.swing.JOptionPane.showMessageDialog(this,
                "Đã xóa phòng chiếu " + maPhongChieu + " thành công!",
                "Thông báo",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Không thể xóa phòng chiếu " + maPhongChieu + "!",
                "Lỗi",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    }
    private void TimkiemPhongchieuNhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemPhongchieuNhapchu
        if(TimkiemPhongchieu.getText().equals("Nhập mã phòng.....")){
            TimkiemPhongchieu.setText("");
            TimkiemPhongchieu.setForeground(Color.BLACK);
        }
        else
        TimkiemPhongchieu.selectAll();
    }//GEN-LAST:event_TimkiemPhongchieuNhapchu

    private void TimkiemPhongchieuLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemPhongchieuLammo
        if(TimkiemPhongchieu.getText().trim().isEmpty()){
            TimkiemPhongchieu.setText("Nhập mã phòng.....");
            TimkiemPhongchieu.setForeground(Color.black);
        }
    }//GEN-LAST:event_TimkiemPhongchieuLammo

    private void Change_Border(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_Border
        JButton clickedButton = (JButton) evt.getSource();


        if (selectedButton != null && selectedButton != clickedButton) {
            selectedButton.setBorder(UIManager.getBorder("Button.border"));
        }

        selectedButton = clickedButton;
        selectedButton.setBorder(BorderFactory.createLineBorder(Color.black, 3));
    }//GEN-LAST:event_Change_Border

    private void View(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View
        CardLayout card = (CardLayout) GiaodienPhongchieu.getLayout();
        card.show(GiaodienPhongchieu, "View");
    }//GEN-LAST:event_View

    private void ThemPhongchieu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemPhongchieu
        CardLayout card = (CardLayout) GiaodienPhongchieu.getLayout();
        card.show(GiaodienPhongchieu, "ThemPhongchieu");
    }//GEN-LAST:event_ThemPhongchieu

    private void XemPhongchieu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XemPhongchieu
        CardLayout card = (CardLayout) GiaodienPhongchieu.getLayout();
        card.show(GiaodienPhongchieu, "Xemtong");
         loadAllDataToXemTongTable();
    }//GEN-LAST:event_XemPhongchieu

    private void txtTimkiemTongLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemTongLammo
        if(txtTimkiemTong.getText().trim().isEmpty()){
            txtTimkiemTong.setText("Nhập mã phòng.....");
            txtTimkiemTong.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtTimkiemTongLammo

    private void TimkiemTong(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemTong
        if(txtTimkiemTong.getText().equals("Nhập mã phòng.....")){
            txtTimkiemTong.setText("");
            txtTimkiemTong.setForeground(Color.BLACK);
        }
        else
        txtTimkiemTong.selectAll();
    }//GEN-LAST:event_TimkiemTong


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GiaodienPhongchieu;
    private javax.swing.JLabel Loaichieu;
    private javax.swing.JLabel Succhua;
    private javax.swing.JLabel TheloaiPhim;
    private javax.swing.JPanel ThemPhongchieu;
    private javax.swing.JLabel Timkiem;
    private javax.swing.JTextField TimkiemPhongchieu;
    private javax.swing.JLabel TimkiemTong;
    private javax.swing.JPanel View;
    private javax.swing.JPanel Xemtong;
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnExport;
    private testlib.RoundedButton btnHuybo;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnNangCao;
    private javax.swing.JButton btnThem;
    private testlib.RoundedButton btnThemPhong;
    private testlib.RoundedButton btnTimkiemPhongchieu;
    private testlib.RoundedButton btnTimkiemTong;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnXemtong;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbLoaichieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rAll;
    private javax.swing.JRadioButton rMaPhong;
    private javax.swing.JRadioButton rSucChua;
    private javax.swing.JTable tbPhongchieu;
    private javax.swing.JTable tbXemtong;
    private javax.swing.JTextField truyxuatGiave;
    private javax.swing.JTextField truyxuatLoaichieu;
    private javax.swing.JTextField truyxuatSucchua;
    private javax.swing.JLabel txGiave;
    private javax.swing.JLabel txLoaichieu;
    private javax.swing.JTextField txNangCao;
    private javax.swing.JLabel txSucchua;
    private testlib.RoundedTextField txtSucchua;
    private testlib.RoundedTextField txtTheloai;
    private javax.swing.JTextField txtTimkiemTong;
    // End of variables declaration//GEN-END:variables
}
