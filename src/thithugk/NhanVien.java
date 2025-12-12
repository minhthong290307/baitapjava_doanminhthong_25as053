package thithugk;

public abstract class NhanVien {
    private String maNV;
    private String hoTen;
    private double luongCoBan;

    public NhanVien(String maNV, String hoTen, double luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        setLuongCoBan(luongCoBan);
    }

    // Getters/Setters
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        if(luongCoBan >= 0)
            this.luongCoBan = luongCoBan;
        else
            this.luongCoBan = 0;
    }

    // In thông tin chung
    public void inThongTin() {
        System.out.println("Mã NV: " + maNV + ", Họ tên: " + hoTen);
    }

    // Abstract methods
    public abstract double tinhLuong();
    public abstract void lamViec();
}

