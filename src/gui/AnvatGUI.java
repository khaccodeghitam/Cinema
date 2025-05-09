
package gui;
import DTO.LichSuDTO;
import BUS.AnVatBUS;
import BUS.LichSuBUS;
import DTO.AnVatDTO;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import static javax.swing.text.html.HTML.Attribute.ID;
public class AnvatGUI extends javax.swing.JPanel {
    AnVatBUS bus = new AnVatBUS();
    ArrayList<AnVatDTO> danhSach = bus.getDanhSachAnVat();
    AnVatDTO x = new AnVatDTO();
    private JButton selectedButton = null;
    private static int pos=0;


    public AnvatGUI() {
        initComponents();
        GiaodienAnvat.setLayout(new CardLayout());
        GiaodienAnvat.add(View, "View");
        GiaodienAnvat.add(Xemtong, "Xemtong");
        GiaodienAnvat.add(Lichsu, "Lichsu");
        
        JTableHeader header = tbAnvat.getTableHeader(); 
        header.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        JTableHeader headerXem = tbXemtong.getTableHeader(); 
        headerXem.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        JTableHeader headerLichsu = tbLichsu.getTableHeader(); 
        headerXem.setFont(new Font("Times New Roman", Font.BOLD, 16));
        Viewtable();
        Viewtable1();
    }
    private String chuyenTrangThaiSangChuoi(int trangThai) {
    return trangThai == 1 ? "Còn Chương Trình" : " Đã Hết ";
}
     public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            javax.swing.JFrame frame = new javax.swing.JFrame("Quản lý ăn vặt");
            frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 600); // điều chỉnh kích thước theo ý bạn
            frame.setLocationRelativeTo(null); // hiển thị giữa màn hình
            
           AnvatGUI gui = new AnvatGUI();
            frame.setContentPane(gui);
            frame.setVisible(true);
        }
    });

}
public  void Viewtable(){
     DefaultTableModel model = (DefaultTableModel) tbAnvat.getModel();
      model.setRowCount(0); // Xoá hết dữ liệu cũ nếu có

ArrayList<AnVatDTO> danhSach = bus.getDanhSachAnVat();

for (AnVatDTO av : danhSach) {
    if(av.getTrangThai()==1){
    model.addRow(new Object[] {
                    av.getMaAnVat(),
                    av.getTenAnVat(),
                    av.getSoLuongHienTai(),
                     av.getSoLuongThem(),
                    av.getTongSoLuong(),
                    chuyenTrangThaiSangChuoi(av.getTrangThai())
                   
    
    });
}}
 }
  
public void Viewtable1() {
    DefaultTableModel model = (DefaultTableModel) tbXemtong.getModel();
    model.setRowCount(0); // Xoá hết dữ liệu cũ nếu có

    AnVatBUS bus = new AnVatBUS();
    ArrayList<AnVatDTO> danhSach = bus.getDanhSachAnVat();

    // Đảm bảo cập nhật tổng số lượng trước khi hiển thị
    for (AnVatDTO av : danhSach) {
        av.setTongSoLuong(av.getSoLuongThem());  // Đảm bảo tổng số lượng được cộng dồn từ số lượng thêm
    }

    // Thêm các dòng mới vào bảng
    for (AnVatDTO av : danhSach) {
        model.addRow(new Object[] {
            av.getMaAnVat(),
            av.getTenAnVat(),
            av.getSoLuongHienTai(),
            av.getTongSoLuong(),
            chuyenTrangThaiSangChuoi(av.getTrangThai()),
            av.getSoLuongThem()
        });
    }

    tbXemtong.setVisible(true);
}

private ArrayList<LichSuDTO> danhSachLichSu = new ArrayList<>();

public void Viewtable2() {
    DefaultTableModel model = (DefaultTableModel) tbLichsu.getModel();
    model.setRowCount(0); // Xoá hết dữ liệu cũ nếu có

    for (LichSuDTO lichSu : danhSachLichSu) {
        model.addRow(new Object[] {
            lichSu.getMaAnVat(),
            lichSu.getTenAnVat(),
            lichSu.getSoLuongThem(),
            lichSu.getThoiGianThem().toString() 
        });
    }

    tbLichsu.setVisible(true);
}
public void themLichSu(String maAnVat, String tenAnVat, int soLuongThem) {
    // Lưu vào danh sách lịch sử trong bộ nhớ
    LichSuDTO lichSu = new LichSuDTO(maAnVat, tenAnVat, soLuongThem, new java.util.Date());
    danhSachLichSu.add(lichSu);

    Viewtable2();
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Anvat = new javax.swing.JPanel();
        btnView = new javax.swing.JButton();
        btnLichsu = new javax.swing.JButton();
        btnxemAnvat = new javax.swing.JButton();
        btnexport = new javax.swing.JButton();
        btnimport = new javax.swing.JButton();
        GiaodienAnvat = new javax.swing.JPanel();
        View = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAnvat = new javax.swing.JTable();
        Timkiem = new javax.swing.JLabel();
        TimkiemAnvat = new javax.swing.JTextField();
        buttonTimkiemPhim = new testlib.RoundedButton();
        jSeparator1 = new javax.swing.JSeparator();
        txSucchua = new javax.swing.JLabel();
        truyxuatTencombo = new javax.swing.JTextField();
        txMota = new javax.swing.JLabel();
        truyxuatMota = new javax.swing.JTextField();
        btncapnhatAnvat = new javax.swing.JButton();
        btnxoaAnvat = new javax.swing.JButton();
        txSucchua1 = new javax.swing.JLabel();
        truyxuatTencombo1 = new javax.swing.JTextField();
        txMota1 = new javax.swing.JLabel();
        truyxuatMota1 = new javax.swing.JTextField();
        btnthemAnvat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Lichsu = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbLichsu = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        Xemtong = new javax.swing.JPanel();
        TimkiemTong = new javax.swing.JLabel();
        txtTimkiemTong = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbXemtong = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnTimkiemtong = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

        Anvat.setBackground(new java.awt.Color(153, 153, 153));

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

        btnLichsu.setBackground(new java.awt.Color(153, 153, 153));
        btnLichsu.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnLichsu.setText("Lịch sử");
        btnLichsu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLichsu.setContentAreaFilled(false);
        btnLichsu.setFocusPainted(false);
        btnLichsu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLichsu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLichsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });
        btnLichsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lichsu(evt);
            }
        });

        btnxemAnvat.setBackground(new java.awt.Color(153, 153, 153));
        btnxemAnvat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnxemAnvat.setText("Xem tổng");
        btnxemAnvat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnxemAnvat.setContentAreaFilled(false);
        btnxemAnvat.setFocusPainted(false);
        btnxemAnvat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnxemAnvat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnxemAnvat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });
        btnxemAnvat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Xemtong(evt);
            }
        });

        btnexport.setBackground(new java.awt.Color(153, 153, 153));
        btnexport.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnexport.setText("Export");
        btnexport.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnexport.setContentAreaFilled(false);
        btnexport.setFocusPainted(false);
        btnexport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnexport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnexport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });
        btnexport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportActionPerformed(evt);
            }
        });

        btnimport.setBackground(new java.awt.Color(153, 153, 153));
        btnimport.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnimport.setText("Import");
        btnimport.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnimport.setContentAreaFilled(false);
        btnimport.setFocusPainted(false);
        btnimport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnimport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnimport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Change_Border(evt);
            }
        });
        btnimport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimportActionPerformed(evt);
            }
        });

        GiaodienAnvat.setBackground(new java.awt.Color(153, 153, 153));
        GiaodienAnvat.setLayout(new java.awt.CardLayout());

        View.setBackground(new java.awt.Color(153, 153, 153));

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 153));

        tbAnvat.setBackground(new java.awt.Color(153, 153, 153));
        tbAnvat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbAnvat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbAnvat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã món ăn", "Tên món ăn", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbAnvat.setShowVerticalLines(true);
        tbAnvat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAnvatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAnvat);

        Timkiem.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Timkiem.setText("Tìm kiếm:");

        TimkiemAnvat.setBackground(new java.awt.Color(204, 204, 204));
        TimkiemAnvat.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        TimkiemAnvat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TimkiemAnvat.setText(" Nhập món ăn.....");
        TimkiemAnvat.setToolTipText("");
        TimkiemAnvat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TimkiemAnvat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TimkiemAnvatNhapchu(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TimkiemAnvatLammo(evt);
            }
        });

        buttonTimkiemPhim.setBackground(new java.awt.Color(204, 204, 204));
        buttonTimkiemPhim.setForeground(new java.awt.Color(0, 0, 0));
        buttonTimkiemPhim.setText("Tìm kiếm");
        buttonTimkiemPhim.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        buttonTimkiemPhim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTimkiemPhimActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txSucchua.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txSucchua.setText("Tên món ăn:");

        truyxuatTencombo.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatTencombo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatTencombo.setText(" Truy xuất khi nhấp vào table trên");
        truyxuatTencombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txMota.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txMota.setText("Số lượng:");

        truyxuatMota.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatMota.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatMota.setText("Truy suất trên table (ko đc cập nhật)");
        truyxuatMota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btncapnhatAnvat.setBackground(new java.awt.Color(153, 153, 153));
        btncapnhatAnvat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btncapnhatAnvat.setText("Cập nhật");
        btncapnhatAnvat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btncapnhatAnvat.setContentAreaFilled(false);
        btncapnhatAnvat.setFocusPainted(false);
        btncapnhatAnvat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncapnhatAnvat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncapnhatAnvat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapnhatAnvatActionPerformed(evt);
            }
        });

        btnxoaAnvat.setBackground(new java.awt.Color(153, 153, 153));
        btnxoaAnvat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnxoaAnvat.setText("Xóa");
        btnxoaAnvat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnxoaAnvat.setContentAreaFilled(false);
        btnxoaAnvat.setFocusPainted(false);
        btnxoaAnvat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnxoaAnvat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnxoaAnvat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaAnvatActionPerformed(evt);
            }
        });

        txSucchua1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txSucchua1.setText("Mã món ăn:");

        truyxuatTencombo1.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatTencombo1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatTencombo1.setText("Truy xuất khi nhấp vào table trên");
        truyxuatTencombo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        truyxuatTencombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truyxuatTencombo1ActionPerformed(evt);
            }
        });

        txMota1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txMota1.setText("Thêm:");

        truyxuatMota1.setBackground(new java.awt.Color(204, 204, 204));
        truyxuatMota1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        truyxuatMota1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        truyxuatMota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truyxuatMota1ActionPerformed(evt);
            }
        });

        btnthemAnvat.setBackground(new java.awt.Color(153, 153, 153));
        btnthemAnvat.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnthemAnvat.setText("Thêm");
        btnthemAnvat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnthemAnvat.setContentAreaFilled(false);
        btnthemAnvat.setFocusPainted(false);
        btnthemAnvat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnthemAnvat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnthemAnvat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemAnvatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Và có thể thêm món ăn ngay trong bảng này");

        javax.swing.GroupLayout ViewLayout = new javax.swing.GroupLayout(View);
        View.setLayout(ViewLayout);
        ViewLayout.setHorizontalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txSucchua1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txSucchua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(truyxuatTencombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(truyxuatTencombo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txMota1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txMota))
                .addGap(20, 20, 20)
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(truyxuatMota, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(truyxuatMota1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnthemAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncapnhatAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnxoaAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(ViewLayout.createSequentialGroup()
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ViewLayout.createSequentialGroup()
                                .addComponent(Timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TimkiemAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonTimkiemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ViewLayout.setVerticalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Timkiem)
                    .addComponent(TimkiemAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTimkiemPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ViewLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnxoaAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ViewLayout.createSequentialGroup()
                                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(truyxuatTencombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txSucchua1))
                                        .addGap(18, 18, 18)
                                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(truyxuatTencombo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txSucchua)))
                                    .addGroup(ViewLayout.createSequentialGroup()
                                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(truyxuatMota, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txMota))
                                        .addGap(18, 18, 18)
                                        .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(truyxuatMota1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txMota1)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnthemAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncapnhatAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        GiaodienAnvat.add(View, "View");

        Lichsu.setBackground(new java.awt.Color(153, 153, 153));

        tbLichsu.setAutoCreateRowSorter(true);
        tbLichsu.setBackground(new java.awt.Color(153, 153, 153));
        tbLichsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbLichsu.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tbLichsu.setModel(new javax.swing.table.DefaultTableModel(
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
                "Mã món ăn", "Tên món ăn", "Số lượng thêm", "Thời gian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbLichsu.setRowHeight(30);
        tbLichsu.setShowVerticalLines(true);
        jScrollPane3.setViewportView(tbLichsu);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout LichsuLayout = new javax.swing.GroupLayout(Lichsu);
        Lichsu.setLayout(LichsuLayout);
        LichsuLayout.setHorizontalGroup(
            LichsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LichsuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LichsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        LichsuLayout.setVerticalGroup(
            LichsuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LichsuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GiaodienAnvat.add(Lichsu, "Lichsu");

        Xemtong.setBackground(new java.awt.Color(153, 153, 153));

        TimkiemTong.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        TimkiemTong.setText("Tìm kiếm:");

        txtTimkiemTong.setBackground(new java.awt.Color(204, 204, 204));
        txtTimkiemTong.setFont(new java.awt.Font("Times New Roman", 2, 17)); // NOI18N
        txtTimkiemTong.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTimkiemTong.setText(" Nhập món ăn.....");
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
                "Mã món ăn", "Tên món ăn", "Số lượng hiện tại", "Tổng số lượng", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbXemtong.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tbXemtong);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Tổng số lượng thêm đó giờ cộng lại là tổng");

        btnTimkiemtong.setText("Tìm Kiếm");
        btnTimkiemtong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemtongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout XemtongLayout = new javax.swing.GroupLayout(Xemtong);
        Xemtong.setLayout(XemtongLayout);
        XemtongLayout.setHorizontalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemtongLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(XemtongLayout.createSequentialGroup()
                        .addComponent(TimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnTimkiemtong)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel2)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        XemtongLayout.setVerticalGroup(
            XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemtongLayout.createSequentialGroup()
                .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(XemtongLayout.createSequentialGroup()
                        .addGroup(XemtongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TimkiemTong)
                            .addComponent(txtTimkiemTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimkiemtong))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, XemtongLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        GiaodienAnvat.add(Xemtong, "Xemtong");

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout AnvatLayout = new javax.swing.GroupLayout(Anvat);
        Anvat.setLayout(AnvatLayout);
        AnvatLayout.setHorizontalGroup(
            AnvatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnvatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnxemAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLichsu, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(btnexport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnimport, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(AnvatLayout.createSequentialGroup()
                .addGroup(AnvatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GiaodienAnvat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AnvatLayout.setVerticalGroup(
            AnvatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnvatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AnvatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnxemAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnimport, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLichsu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(GiaodienAnvat, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Anvat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Anvat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TimkiemAnvatNhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemAnvatNhapchu
        if(TimkiemAnvat.getText().equals(" Nhập món ăn.....")){
            TimkiemAnvat.setText("");
            TimkiemAnvat.setForeground(Color.BLACK);
        }
        else
        TimkiemAnvat.selectAll();
    }//GEN-LAST:event_TimkiemAnvatNhapchu

    private void TimkiemAnvatLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TimkiemAnvatLammo
        if(TimkiemAnvat.getText().trim().isEmpty()){
            TimkiemAnvat.setText(" Nhập món ăn.....");
            TimkiemAnvat.setForeground(Color.black);
        }
    }//GEN-LAST:event_TimkiemAnvatLammo

    
    private void Change_Border(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Change_Border
        JButton clickedButton = (JButton) evt.getSource();

    
        if (selectedButton != null && selectedButton != clickedButton) {
            selectedButton.setBorder(UIManager.getBorder("Button.border"));
        }

        selectedButton = clickedButton;
        selectedButton.setBorder(BorderFactory.createLineBorder(Color.black, 3));
    }//GEN-LAST:event_Change_Border

    private void View(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View
        CardLayout card = (CardLayout) GiaodienAnvat.getLayout();
        card.show(GiaodienAnvat, "View");
    }//GEN-LAST:event_View

    private void Xemtong(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xemtong
        CardLayout card = (CardLayout) GiaodienAnvat.getLayout();
        card.show(GiaodienAnvat, "Xemtong");
    }//GEN-LAST:event_Xemtong

    private void txtTimkiemTongNhapchu(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemTongNhapchu
        if(txtTimkiemTong.getText().equals(" Nhập món ăn.....")){
            txtTimkiemTong.setText("");
            txtTimkiemTong.setForeground(Color.BLACK);
        }
        else
        txtTimkiemTong.selectAll();
    }//GEN-LAST:event_txtTimkiemTongNhapchu

    private void txtTimkiemTongLammo(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemTongLammo
        if(txtTimkiemTong.getText().trim().isEmpty()){
            txtTimkiemTong.setText(" Nhập món ăn.....");
            txtTimkiemTong.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtTimkiemTongLammo

    private void Lichsu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lichsu
        CardLayout card = (CardLayout) GiaodienAnvat.getLayout();
        card.show(GiaodienAnvat, "Lichsu");
        Viewtable2();
    }//GEN-LAST:event_Lichsu

    private void tbAnvatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAnvatMouseClicked
      int row = tbAnvat.getSelectedRow();
    if (row != -1) {
        truyxuatTencombo1.setText(tbAnvat.getValueAt(row, 0).toString());
        truyxuatTencombo.setText(tbAnvat.getValueAt(row, 1).toString());
        truyxuatMota.setText(tbAnvat.getValueAt(row, 2).toString());
        //truyxuatMota1.setText(tbAnvat.getValueAt(row, 3).toString());
    }
    }//GEN-LAST:event_tbAnvatMouseClicked

    private void truyxuatMota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truyxuatMota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_truyxuatMota1ActionPerformed
public void capNhatBangXemTong() {
    DefaultTableModel model = (DefaultTableModel) tbXemtong.getModel(); 
    model.setRowCount(0);

    ArrayList<AnVatDTO> danhSach = bus.getDanhSachAnVat();

    for (AnVatDTO av : danhSach) {
        model.addRow(new Object[]{
             av.getMaAnVat(),
                    av.getTenAnVat(),
                    av.getSoLuongHienTai(),
                    av.getTongSoLuong(),
                    chuyenTrangThaiSangChuoi(av.getTrangThai()),
                    av.getSoLuongThem()
            
        });
          }
}
    private void btnthemAnvatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemAnvatActionPerformed
String ma = truyxuatTencombo1.getText();
    String ten = truyxuatTencombo.getText();
    int soLuong = Integer.parseInt(truyxuatMota.getText());
    int themSoLuong = Integer.parseInt(truyxuatMota1.getText());
    
    AnVatDTO av = new AnVatDTO();
    av.setMaAnVat(ma);
    av.setTenAnVat(ten);
    av.setSoLuongHienTai(soLuong);
    av.setTongSoLuong(soLuong + themSoLuong);
    av.setTrangThai(1);
    av.setSoLuongThem(themSoLuong);

    AnVatBUS bus = new AnVatBUS();
    boolean thanhCong = bus.themAnVat(av);
    
    if (thanhCong) {
         themLichSu(ma, ten, themSoLuong);
        JOptionPane.showMessageDialog(this, "Thêm ăn vặt thành công!");
        
        // Cập nhật lại các bảng giao diện
        Viewtable();        // Cập nhật bảng ăn vặt
        capNhatBangXemTong();

    } else {
        JOptionPane.showMessageDialog(this, "Thêm thất bại!");
    }


    }//GEN-LAST:event_btnthemAnvatActionPerformed

    private void truyxuatTencombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truyxuatTencombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_truyxuatTencombo1ActionPerformed

    private void btncapnhatAnvatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapnhatAnvatActionPerformed
  String tencb = truyxuatTencombo1.getText().trim();
   AnVatDTO avGoc = null; 
for (AnVatDTO av : bus.getDanhSachAnVat()) {
    if (av.getMaAnVat().equalsIgnoreCase(tencb)) {
        avGoc = av;
        break;
    }
}


    if (avGoc == null) {
        JOptionPane.showMessageDialog(null, "Không tìm thấy ăn vặt có mã: " + tencb);
        return;
    }

    // 3. Cập nhật các trường được phép sửa
    avGoc.setTenAnVat(truyxuatTencombo.getText().trim());
//    avGoc.setSoLuongHienTai(Integer.parseInt(truyxuatMota.getText().trim()));
//    avGoc.setSoLuongThem(Integer.parseInt(truyxuatMota1.getText().trim()));
String slHienTaiStr = truyxuatMota.getText().trim();
String slThemStr = truyxuatMota1.getText().trim();

if (slHienTaiStr.isEmpty() || slThemStr.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ số lượng hiện tại và số lượng thêm!");
    return;
}

avGoc.setSoLuongHienTai(Integer.parseInt(slHienTaiStr));
avGoc.setSoLuongThem(Integer.parseInt(slThemStr));
avGoc.themSoLuong(Integer.parseInt(slThemStr));
    // 4. Gọi BUS để sửa ăn vặt
    boolean thanhCong = bus.suaAnVat(avGoc);

    // 5. Phản hồi kết quả lên UI
    if (thanhCong) {
String ma = avGoc.getMaAnVat();
        String ten = avGoc.getTenAnVat();
        int themSoLuong = avGoc.getSoLuongThem();
        
        // Lưu vào lịch sử trong bộ nhớ
        themLichSu(ma, ten, themSoLuong);
        JOptionPane.showMessageDialog(null, "Sửa ăn vặt thành công!");

        capNhatBangXemTong();
        Viewtable();
   
  
    } else {
        JOptionPane.showMessageDialog(null, "Sửa ăn vặt thất bại!");
    }
   
    }//GEN-LAST:event_btncapnhatAnvatActionPerformed


private void setupTableLichSu() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Mã món ăn");
    model.addColumn("Tên món ăn");
    model.addColumn("Số lượng thêm");
    model.addColumn("Thời gian");
    tbLichsu.setModel(model);
}

    private void btnxoaAnvatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaAnvatActionPerformed
  int selectedRow = tbAnvat.getSelectedRow();
if (selectedRow != -1) {
        String maAnvat = tbAnvat.getValueAt(selectedRow, 0).toString();
         int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa ăn vặt này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            if (bus.xoaAnVat(maAnvat)) {
                JOptionPane.showMessageDialog(null, "Đã xóa ăn vặt thành công!");

              capNhatBangXemTong();
              Viewtable();

            } else {
                JOptionPane.showMessageDialog(null, "Không thể xóa ăn vặt!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Vui lòng chọn ăn vặt để xóa!");
    }


       
    }//GEN-LAST:event_btnxoaAnvatActionPerformed

    private void buttonTimkiemPhimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTimkiemPhimActionPerformed
       try {
    String tuKhoa = TimkiemAnvat.getText().trim(); 

    ArrayList<AnVatDTO> ketQua;

    if (!tuKhoa.isEmpty()) {
        // Nếu có nhập từ khóa thì tìm theo từ khóa chung
        ketQua = bus.timKiemTheoTuKhoa(tuKhoa);
    } else {
        // Ngược lại thì tìm theo từng tiêu chí
        String maAnVat = truyxuatTencombo1.getText().trim();   // Giả sử truyxuatMaAnVat là trường nhập mã ăn vặt
        String tenAnVat = truyxuatTencombo.getText().trim(); // Giả sử truyxuatTenAnVat là trường nhập tên ăn vặt
        String soLuong = truyxuatMota.getText().trim();   // Giả sử truyxuatSoLuong là trường nhập số lượng

       

        ketQua = bus.timKiemAnVat(maAnVat, tenAnVat, soLuong);
    }

    Viewtable3(ketQua);  // Giả sử ViewtableAnVat là phương thức để hiển thị kết quả tìm kiếm trên JTable

} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Lỗi tìm kiếm: " + e.getMessage());
    e.printStackTrace();
}

    }//GEN-LAST:event_buttonTimkiemPhimActionPerformed

    private void btnimportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimportActionPerformed
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
    }//GEN-LAST:event_btnimportActionPerformed

    private void btnexportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportActionPerformed
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
    
    }//GEN-LAST:event_btnexportActionPerformed

    private void btnTimkiemtongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemtongActionPerformed
      
 try {
        // Lấy từ khóa tìm kiếm chung nếu có
        String tuKhoa = txtTimkiemTong.getText().trim();
        ArrayList<AnVatDTO> ketQua;

        if (!tuKhoa.isEmpty()) {
            // Nếu có nhập từ khóa thì tìm theo từ khóa chung
            ketQua = bus.timKiemTheoTuKhoa1(tuKhoa);  // Giả sử phương thức này tìm kiếm theo từ khóa
        } else {
            // Nếu không có từ khóa, tìm theo các tiêu chí cụ thể
                String maAnVat = truyxuatTencombo1.getText().trim();   // Giả sử truyxuatMaAnVat là trường nhập mã ăn vặt
      String tenAnVat = truyxuatTencombo.getText().trim(); // Giả sử truyxuatTenAnVat là trường nhập tên ăn vặt
     String soLuong = truyxuatMota.getText().trim();     // Lấy số lượng từ ô nhập liệu
            String trangThai = "";

            // Lấy trạng thái từ cột trong bảng tbXemtong (giả sử trạng thái nằm ở cột thứ 6)
            int row = tbXemtong.getSelectedRow(); 
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng trong bảng để lấy trạng thái.");
                return;
            }

            Object trangThaiObj = tbXemtong.getValueAt(row, 6);  // Giả sử trạng thái là cột thứ 6 trong bảng
            if (trangThaiObj != null) {
                trangThai = trangThaiObj.toString().trim();
                // Cập nhật giá trị trạng thái theo yêu cầu, ví dụ: "Đang bán", "Hết hàng", "Sắp hết"
            }

            // Kiểm tra ít nhất một trường tìm kiếm không rỗng
            if (maAnVat.isEmpty() && tenAnVat.isEmpty() && soLuong.isEmpty() && trangThai.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập ít nhất một tiêu chí tìm kiếm.");
                return;  // Dừng lại nếu không có tiêu chí tìm kiếm nào
            }

            // Tìm kiếm theo các tiêu chí cụ thể, bao gồm trạng thái lấy từ bảng
            ketQua = bus.timKiemAnVat1(maAnVat, tenAnVat, soLuong, trangThai);
        }

        // Hiển thị kết quả tìm kiếm lên JTable
        Viewtable4(ketQua);  

    } catch (Exception e) {
        // Xử lý ngoại lệ
        JOptionPane.showMessageDialog(null, "Lỗi tìm kiếm: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnTimkiemtongActionPerformed
public void Viewtable4(ArrayList<AnVatDTO> danhSach) {
    DefaultTableModel model = (DefaultTableModel) tbXemtong.getModel();
    model.setRowCount(0); // Xoá hết dữ liệu cũ nếu có

    AnVatBUS bus = new AnVatBUS();
 

    // Đảm bảo cập nhật tổng số lượng trước khi hiển thị
    for (AnVatDTO av : danhSach) {
        av.setTongSoLuong(av.getSoLuongThem());  // Đảm bảo tổng số lượng được cộng dồn từ số lượng thêm
    }

    // Thêm các dòng mới vào bảng
    for (AnVatDTO av : danhSach) {
        model.addRow(new Object[] {
            av.getMaAnVat(),
            av.getTenAnVat(),
            av.getSoLuongHienTai(),
            av.getTongSoLuong(),
            chuyenTrangThaiSangChuoi(av.getTrangThai()),
            av.getSoLuongThem()
        });
    }

    tbXemtong.setVisible(true);
}
    public  void Viewtable3(ArrayList<AnVatDTO> danhSach){
     DefaultTableModel model = (DefaultTableModel) tbAnvat.getModel();
      model.setRowCount(0); 
for (AnVatDTO av : danhSach) {
    if(av.getTrangThai()==1){
    model.addRow(new Object[] {
                    av.getMaAnVat(),
                    av.getTenAnVat(),
                    av.getSoLuongHienTai(),
                     av.getSoLuongThem(),
                    av.getTongSoLuong(),
                    chuyenTrangThaiSangChuoi(av.getTrangThai())
                   
    
    });
}}
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Anvat;
    private javax.swing.JPanel GiaodienAnvat;
    private javax.swing.JPanel Lichsu;
    private javax.swing.JLabel Timkiem;
    private javax.swing.JTextField TimkiemAnvat;
    private javax.swing.JLabel TimkiemTong;
    private javax.swing.JPanel View;
    private javax.swing.JPanel Xemtong;
    private javax.swing.JButton btnLichsu;
    private javax.swing.JButton btnTimkiemtong;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btncapnhatAnvat;
    private javax.swing.JButton btnexport;
    private javax.swing.JButton btnimport;
    private javax.swing.JButton btnthemAnvat;
    private javax.swing.JButton btnxemAnvat;
    private javax.swing.JButton btnxoaAnvat;
    private testlib.RoundedButton buttonTimkiemPhim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tbAnvat;
    private javax.swing.JTable tbLichsu;
    private javax.swing.JTable tbXemtong;
    private javax.swing.JTextField truyxuatMota;
    private javax.swing.JTextField truyxuatMota1;
    private javax.swing.JTextField truyxuatTencombo;
    private javax.swing.JTextField truyxuatTencombo1;
    private javax.swing.JLabel txMota;
    private javax.swing.JLabel txMota1;
    private javax.swing.JLabel txSucchua;
    private javax.swing.JLabel txSucchua1;
    private javax.swing.JTextField txtTimkiemTong;
    // End of variables declaration//GEN-END:variables
}
