create database cnm; 

CREATE TABLE cnm.NhaPhanPhoi (
    ma_nha_phan_phoi VARCHAR(10) PRIMARY KEY,
    ten_nha_phan_phoi VARCHAR(255) NOT NULL,
    toa_cnmc VARCHAR(255),
    email VARCHAR(255),
    so_luong_phim INT DEFAULT 0 CHECK (so_luong_phim >= 0),
    so_phim_da_thau INT DEFAULT 0 CHECK (so_phim_da_thau >= 0),
    trang_thai VARCHAR(50)
);


CREATE TABLE cnm.NhanVien (
    ma_nhan_vien VARCHAR(10) PRIMARY KEY,
    ten_nhan_vien VARCHAR(255) NOT NULL,
    tuoi INT CHECK (tuoi >= 18),
    gioi_tinh VARCHAR(10),
    ngay_vao_cnmm DATE NOT NULL,
    ngay_nghi_viec DATE,
    trang_thai VARCHAR(50)
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
    FOREIGN KEY (nguoi_ki) references Nhanvien(ma_nhan_vien)
);


CREATE TABLE cnm.Phim (
    ma_phim VARCHAR(10) primary key,
    ten_phim VARCHAR(255) unique,
    thoi_luong INT CHECK (thoi_luong > 0),
    the_loai VARCHAR(100),
    do_tuoi VARCHAR(10),
    ngay_chieu DATE,
    suat_da_chieu INT DEFAULT 0,
    trang_thai VARCHAR(50),
    constraint lienket1 foreign key (ten_phim) references Hopdong(ten_phim)
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
    ngay_ket_thuc DATE NOT NULL,
    dieu_kien TEXT,
    trang_thai VARCHAR(50)
);

CREATE TABLE cnm.PhongChieu (
    ma_phong_chieu VARCHAR(10) PRIMARY KEY,
    suc_chua INT CHECK (suc_chua > 0),
    loai_chieu VARCHAR(50),
    gia_ve int CHECK (gia_ve >= 0), 
    trang_thai VARCHAR(50)
);


CREATE TABLE cnm.LichChieu (
    ma_lich_chieu VARCHAR(10) PRIMARY KEY,
    ten_phim VARCHAR(200),
    ngay_chieu DATE NOT NULL,
    gio_chieu TIME NOT NULL,
    phong_chieu VARCHAR(10),
    tong_ve INT CHECK (tong_ve >= 0),
    ve_da_ban INT DEFAULT 0 CHECK (ve_da_ban >= 0),
    trang_thai VARCHAR(50),
    FOREIGN KEY (ten_phim) REFERENCES Phim(ten_phim),
    FOREIGN KEY (phong_chieu) REFERENCES PhongChieu(ma_phong_chieu)
);

create table cnm.phim_npp(
	ten_phim varchar(255), 
    ma_nha_phan_phoi varchar(10),
    gia_thau_phim int,
    the_loai varchar(100),
    thoi_luong int check (thoi_luong>0),
    trang_thai boolean,
    primary key (ten_phim, ma_nha_phan_phoi),
    constraint npp_phim foreign key (ma_nha_phan_phoi) references Nhaphanphoi(ma_nha_phan_phoi)
);


INSERT INTO cnm.UuDai (ma_uu_dai, ten_uu_dai, phan_tram_giam, ngay_bat_dau, ngay_ket_thuc, dieu_kien, trang_thai) VALUES
('UD001', 'Giảm 20% cho thanh thiếu niên', 20, '2024-04-01', '9999-12-31', 'Khách hàng dưới 25 tuổi', 'Đang áp dụng'),
('UD002', 'Giảm 70% cho lễ 30/4-1/5', 70, '2025-04-29', '2025-03-05', 'Áp dụng cho tất cả khi mua vé', 'Đang áp dụng'),
('UD003', 'Giảm 30% khi mua combo', 30, '2025-03-10', '2025-03-25', 'Áp dụng cho tất cả khi mua vé', 'Đã kết thúc');


INSERT INTO cnm.Anvat (ma_an_vat, ten_an_vat, so_luong_hien_tai, tong_so_luong, trang_thai, so_luong_them) VALUES
('AV001', 'Bánh mì', 100, 100, 'Còn hàng', 0),
('AV002', 'Nước ngọt', 150, 150, 'Còn hàng', 0),
('AV003', 'Bắp rang bơ', 50, 50, 'Còn hàng', 0),
('AV004', 'Kẹo cao su', 200, 200, 'Còn hàng', 0),
('AV005', 'Popcorn caramel', 80, 80, 'Ngừng bán', 0);


INSERT INTO cnm.NhanVien (ma_nhan_vien, ten_nhan_vien, tuoi, gioi_tinh, ngay_vao_cnmm, ngay_nghi_viec, trang_thai) VALUES
('NV001', 'Nguyen Minh Tu', 25, 'Nam', '2023-01-15', NULL, 'Đang làm'),
('NV002', 'Le Thi cnmn', 30, 'Nữ', '2022-03-10', NULL, 'Đang làm'),
('NV003', 'Tran Bao Ngoc', 28, 'Nữ', '2021-07-20', '2025-01-01', 'Đã nghỉ'),
('NV004', 'Phan Quang Hieu', 35, 'Nam', '2020-09-05', NULL, 'Đang làm');


INSERT INTO cnm.NhaPhanPhoi (ma_nha_phan_phoi, ten_nha_phan_phoi, toa_cnmc, email, so_luong_phim, so_phim_da_thau, trang_thai) VALUES 
('NPP01', 'CJ Entertainment', 'Việt Nam', 'info@cj.vn', 5, 3, 'Đang hoạt động'),	
('NPP02', 'Beta Media', 'Mỹ', 'beta@beta.vn', 4, 2, 'Đang hoạt động'),
('NPP03', 'MegaStar', 'Trung Quốc', 'support@megastar.vn', 5, 2, 'Đang hoạt động');

INSERT INTO cnm.phim_npp (ten_phim, ma_nha_phan_phoi, gia_thau_phim, the_loai, thoi_luong, trang_thai) VALUES
-- Việt Nam (NPP01)
('Địa đạo: Mặt trời trong bóng tối', 'NPP01', 12000, 'Hành động', 110, true),
('Bộ tứ báo thủ', 'NPP01', 9500, 'Hài', 105, true),
('Tiệc trăng máu phần 2', 'NPP01', 10500, 'Tâm lý', 115, true),
('Rừng thiêng nước độc', 'NPP01', 8500, 'Tâm lý', 102, false),
('Vượt Ngục Sài Gòn', 'NPP01', 8800, 'Hành động', 110, false),

-- Mỹ (NPP02)
('Minecraft', 'NPP02', 18000, 'Hành động', 130, true),
('Mật vụ phụ hồ', 'NPP02', 9900, 'Hành động', 100, true),
('Bóng tối Gotham', 'NPP02', 16000, 'Hành động', 145, false),
('Siêu Nhân Chùm Nho', 'NPP02', 14500, 'Hài', 98, false),

-- Trung Quốc (NPP03)
('Tân Anh hùng xạ điêu', 'NPP03', 13000, 'Cổ trang', 125, true),
('Trường An mộng', 'NPP03', 9500, 'Tâm lý', 118, true),
('Long Hổ Hội ngộ', 'NPP03', 11200, 'Hành động', 122, false),
('Thiếu Lâm Truyền Nhân', 'NPP03', 10100, 'Cổ trang', 128, false),
('Thiên Nhai Khách: Hồi Sinh', 'NPP03', 9900, 'Cổ trang', 124, false);


INSERT INTO cnm.HopDong (ma_hop_dong, ten_phim, gia_thau, ngay_ki, so_suat_chieu, suat_da_chieu, ma_nha_phan_phoi, nguoi_ki) VALUES  
('HD001', 'Địa đạo: Mặt trời trong bóng tối', 12000, '2025-01-15', 25, 5, 'NPP01', 'NV001'),
('HD002', 'Bộ tứ báo thủ', 9500, '2025-01-20', 20, 4, 'NPP01', 'NV001'),
('HD003', 'Tiệc trăng máu phần 2', 10500, '2025-02-01', 30, 6, 'NPP01', 'NV001'),
('HD004', 'Mật vụ phụ hồ', 9900, '2025-02-05', 22, 2, 'NPP02', 'NV001'),
('HD005', 'Bóng tối Gotham', 16000, '2025-03-01', 28, 8, 'NPP02', 'NV001'),
('HD006', 'Tân Anh hùng xạ điêu', 13000, '2025-01-22', 18, 4, 'NPP03', 'NV001'),
('HD007', 'Trường An mộng', 9500, '2025-02-12', 24, 6, 'NPP03', 'NV001');


INSERT INTO cnm.Phim (ma_phim, ten_phim, thoi_luong, the_loai, do_tuoi, ngay_chieu, suat_da_chieu, trang_thai) VALUES
('P001', 'Địa đạo: Mặt trời trong bóng tối', 110, 'Hành động', '16+', '2025-02-04', 5, 'Đã chiếu'),
('P002', 'Bộ tứ báo thủ', 105, 'Hài', '13+', '2025-01-25', 4, 'Đã chiếu'),
('P003', 'Tiệc trăng máu phần 2', 115, 'Tâm lý', '18+', '2025-02-05', 6, 'Đã chiếu'),
('P004', 'Mật vụ phụ hồ', 100, 'Hành động', '16+', '2025-02-10', 2, 'Đã chiếu'),
('P005', 'Bóng tối Gotham', 145, 'Hành động', '18+', '2025-03-05', 8, 'Đã chiếu'),
('P006', 'Tân Anh hùng xạ điêu', 125, 'Cổ trang', '16+', '2025-01-27', 4, 'Đã chiếu'),
('P007', 'Trường An mộng', 118, 'Tâm lý', '13+', '2025-02-15', 6, 'Đã chiếu');


INSERT INTO cnm.PhongChieu (ma_phong_chieu, suc_chua, loai_chieu, gia_ve, trang_thai) VALUES
('PC001', 100, '2D', 150, 'Đang hoạt động'),
('PC002', 120, '3D', 200, 'Đang hoạt động'),
('PC003', 80, 'IMAX', 300, 'Đang hoạt động'),
('PC004', 150, '2D', 180, 'Đang hoạt động'),
('PC005', 90, '4D', 250, 'Đang hoạt động');


INSERT INTO cnm.LichChieu (ma_lich_chieu, ten_phim, ngay_chieu, gio_chieu, phong_chieu, tong_ve, ve_da_ban, trang_thai) VALUES
-- Địa đạo: Mặt trời trong bóng tối
('LC001', 'Địa đạo: Mặt trời trong bóng tối', '2025-04-20', '14:00:00', 'PC001', 100, 20, 'Sắp chiếu'),
('LC002', 'Địa đạo: Mặt trời trong bóng tối', '2025-04-21', '19:30:00', 'PC002', 120, 40, 'Sắp chiếu'),

-- Bộ tứ báo thủ
('LC003', 'Bộ tứ báo thủ', '2025-01-26', '10:00:00', 'PC003', 80, 30, 'Đã chiếu'),
('LC004', 'Bộ tứ báo thủ', '2025-01-27', '16:00:00', 'PC004', 150, 50, 'Đã chiếu'),

-- Tiệc trăng máu phần 2
('LC005', 'Tiệc trăng máu phần 2', '2025-02-06', '11:30:00', 'PC005', 90, 25, 'Đã chiếu'),
('LC006', 'Tiệc trăng máu phần 2', '2025-02-07', '17:30:00', 'PC001', 100, 20, 'Đã chiếu'),

-- Mật vụ phụ hồ
('LC007', 'Mật vụ phụ hồ', '2025-02-11', '09:00:00', 'PC002', 120, 35, 'Đã chiếu'),
('LC008', 'Mật vụ phụ hồ', '2025-02-12', '18:00:00', 'PC003', 80, 18, 'Đã chiếu'),

-- Bóng tối Gotham
('LC009', 'Bóng tối Gotham', '2025-03-06', '13:00:00', 'PC004', 150, 60, 'Đã chiếu'),
('LC010', 'Bóng tối Gotham', '2025-03-07', '20:00:00', 'PC005', 90, 25, 'Đã chiếu'),

-- Tân Anh hùng xạ điêu
('LC011', 'Tân Anh hùng xạ điêu', '2025-01-28', '15:00:00', 'PC001', 100, 22, 'Đã chiếu'),
('LC012', 'Tân Anh hùng xạ điêu', '2025-01-29', '19:00:00', 'PC002', 120, 35, 'Đã chiếu'),

-- Trường An mộng
('LC013', 'Trường An mộng', '2025-02-16', '13:30:00', 'PC003', 80, 27, 'Đã chiếu'),
('LC014', 'Trường An mộng', '2025-02-17', '17:00:00', 'PC004', 150, 41, 'Đã chiếu');








