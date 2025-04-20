package DTO;

public class NhaPhanPhoiDTO {
    private String maNhaPhanPhoi;
    private String tenNhaPhanPhoi;
    
    public NhaPhanPhoiDTO() {
    }
    
    public NhaPhanPhoiDTO(String maNhaPhanPhoi, String tenNhaPhanPhoi) {
        this.maNhaPhanPhoi = maNhaPhanPhoi;
        this.tenNhaPhanPhoi = tenNhaPhanPhoi;
    }
    
    public String getMaNhaPhanPhoi() {
        return maNhaPhanPhoi;
    }
    
    public void setMaNhaPhanPhoi(String maNhaPhanPhoi) {
        this.maNhaPhanPhoi = maNhaPhanPhoi;
    }
    
    public String getTenNhaPhanPhoi() {
        return tenNhaPhanPhoi;
    }
    
    public void setTenNhaPhanPhoi(String tenNhaPhanPhoi) {
        this.tenNhaPhanPhoi = tenNhaPhanPhoi;
    }
}