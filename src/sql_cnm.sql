create database cnm; 

CREATE TABLE cnm.NhaPhanPhoi (
    ma_nha_phan_phoi VARCHAR(10) PRIMARY KEY,
    ten_nha_phan_phoi VARCHAR(255) NOT NULL,
    toa_lac VARCHAR(255),
    email VARCHAR(255),
    so_phim_da_thau INT,
    trang_thai int
);

create table cnm.phim_npp(
    ma_nha_phan_phoi varchar(10),
    ten_phim varchar(255), 
    gia_thau_phim int,
    the_loai varchar(100),
    thoi_luong int check (thoi_luong>0),
    trang_thai boolean,
    primary key (ten_phim, ma_nha_phan_phoi),
    constraint npp_phim foreign key (ma_nha_phan_phoi) references cnm.Nhaphanphoi(ma_nha_phan_phoi)
);

CREATE TABLE cnm.NhanVien (
    ma_nhan_vien VARCHAR(20) PRIMARY KEY,
    ten_nhan_vien VARCHAR(100) NOT NULL,
    tuoi INT CHECK (tuoi >= 0),
    gioi_tinh VARCHAR(10) CHECK (gioi_tinh IN ('Nam', 'Nữ', 'Khác')),
    ngay_sinh DATE,
    so_dien_thoai VARCHAR(20),
    email VARCHAR(100),
    ngay_vao_cnmm DATE,
    ngay_nghi_viec DATE,
    trang_thai INT DEFAULT 1 CHECK (trang_thai IN (0, 1))
);


CREATE TABLE cnm.HopDong (
    ma_hop_dong VARCHAR(10) primary key,
    ten_phim VARCHAR(255) unique,
    gia_thau int CHECK (gia_thau >= 0), 
    ngay_ki DATE NOT NULL,
    so_suat_chieu INT DEFAULT 0 CHECK (so_suat_chieu > 10),
    suat_da_chieu INT DEFAULT 0 CHECK (suat_da_chieu >= 0),
    ma_nha_phan_phoi VARCHAR(10) DEFAULT '0',
    nguoi_ki VARCHAR(255),
    FOREIGN KEY (ma_nha_phan_phoi) REFERENCES NhaPhanPhoi(ma_nha_phan_phoi),
    FOREIGN KEY (nguoi_ki) references Nhanvien(ma_nhan_vien),
    foreign key (ten_phim) references phim_npp(ten_phim)
);


CREATE TABLE cnm.Phim (
    ma_phim VARCHAR(10) primary key,
    ten_phim VARCHAR(255) unique,
    thoi_luong INT CHECK (thoi_luong > 0),
    the_loai VARCHAR(100),
    do_tuoi VARCHAR(10),
    ngay_chieu DATE,
--  so_suat_chieu int,
    suat_da_chieu INT DEFAULT 0,
    trang_thai VARCHAR(50),
    constraint lienket1 foreign key (ten_phim) references cnm.Hopdong(ten_phim)
);

CREATE TABLE cnm.Anvat (
    ma_an_vat VARCHAR(10) PRIMARY KEY,
    ten_an_vat VARCHAR(255) NOT NULL,
    so_luong_hien_tai INT DEFAULT 0 CHECK (so_luong_hien_tai >= 0),
    tong_so_luong INT DEFAULT 0 CHECK (tong_so_luong >= 0),
    trang_thai VARCHAR(50),
    so_luong_them INT DEFAULT 0 CHECK (so_luong_them >= 0)
);



CREATE TABLE cnm.UuDai (
    ma_uu_dai VARCHAR(10) PRIMARY KEY,
    ten_uu_dai VARCHAR(255) NOT NULL,
    phan_tram_giam INT CHECK (phan_tram_giam >= 0 AND phan_tram_giam <= 100),
    ngay_bat_dau DATE NOT NULL,
    ngay_ket_thuc DATE,
    dieu_kien TEXT,
    trang_thai int
);

CREATE TABLE cnm.PhongChieu (
    ma_phong_chieu VARCHAR(10) PRIMARY KEY,
    suc_chua INT CHECK (suc_chua > 0),
    loai_chieu VARCHAR(50),
    gia_ve int CHECK (gia_ve >= 0), 
    trang_thai VARCHAR(50),
    ghe_a1 int default 0,
    ghe_a2 int default 0,
    ghe_a3 int default 0,
    ghe_b1 int default 0,
    ghe_b2 int default 0,
    ghe_b3 int default 0,
    ghe_c1 int default 0,
    ghe_c2 int default 0,
    ghe_c3 int default 0

);


CREATE TABLE cnm.LichChieu (
    ma_lich_chieu VARCHAR(10) PRIMARY KEY,
    ten_phim VARCHAR(200),
    ngay_chieu DATE NOT NULL,
    gio_chieu TIME NOT NULL,
    phong_chieu VARCHAR(10),
    tong_ve INT CHECK (tong_ve >= 0),
    ve_da_ban INT DEFAULT 0 CHECK (ve_da_ban >= 0),
    trang_thai int,
    FOREIGN KEY (ten_phim) REFERENCES cnm.Phim(ten_phim),
    FOREIGN KEY (phong_chieu) REFERENCES cnm.PhongChieu(ma_phong_chieu)
);


create table cnm.khachhang(
    sdt varchar(20) primary key,
    ma_kh varchar(10),
    ten_kh varchar(255)
    
);

CREATE TABLE cnm.ChucNang (
    ma_chuc_nang varchar(255) PRIMARY KEY,
    ten_chuc_nang VARCHAR(100) NOT NULL UNIQUE
);

INSERT INTO cnm.ChucNang (ma_chuc_nang, ten_chuc_nang) VALUES
('Q1', 'Quanlyphim'),
('Q2', 'Quanlylichchieu'),
('Q3', 'Quanlyphongchieu'),
('Q4', 'Quanlyanvat'),
('Q5', 'Quanlyuudai'),
('Q6', 'Quanlynhanvien'),
('Q7', 'Quanlykhachhang'),
('Q8', 'Quanlythongke'),
('Q9', 'Quanlyhopdong'),
('Q10', 'Quanlynpp'),
('Q11', 'Quanlytaikhoan'),
('Q12', 'Quanlyphanquyen');


CREATE TABLE cnm.PhanQuyen (
    ma_phan_quyen varchar(255),
    ten_phan_quyen varchar(255),
    ma_chuc_nang varchar(255),
  

    PRIMARY KEY (ma_phan_quyen, ma_chuc_nang),
    FOREIGN KEY (ma_chuc_nang) REFERENCES cnm.ChucNang(ma_chuc_nang)
);

INSERT INTO cnm.PhanQuyen (ma_phan_quyen, ten_phan_quyen, ma_chuc_nang, duoc_xem, duoc_cap_nhat, duoc_xoa) VALUES
('PQ1', 'Phân quyền cơ bản', 'Q1'),
('PQ1', 'Phân quyền cơ bản', 'Q2'),
('PQ1', 'Phân quyền cơ bản', 'Q8');

CREATE TABLE cnm.TaiKhoan (
    ma_tai_khoan VARCHAR(255) PRIMARY KEY,
    ten_dang_nhap VARCHAR(255) UNIQUE,
    mat_khau VARCHAR(255) DEFAULT '123456789',
    ma_phan_quyen VARCHAR(255),
    ma_nhan_vien VARCHAR(10),
    sdt VARCHAR(20),
    
    
    FOREIGN KEY (ma_phan_quyen) REFERENCES PhanQuyen(ma_phan_quyen),
    
    FOREIGN KEY (sdt) REFERENCES cnm.khachhang(sdt),
    FOREIGN KEY (ma_nhan_vien) REFERENCES cnm.NhanVien(ma_nhan_vien),
    
    CHECK ((ma_nhan_vien IS NOT NULL AND sdt IS NULL) OR (ma_nhan_vien IS NULL AND sdt IS NOT NULL))
);
