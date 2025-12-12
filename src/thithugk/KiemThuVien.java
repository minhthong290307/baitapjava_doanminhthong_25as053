package thithugk;
public class KiemThuVien extends NhanVien {
    private int soLoiPhatHien;

    public KiemThuVien(String ma, String ten, double luong, int soLoiPhatHien) {
        super(ma, ten, luong);
        this.soLoiPhatHien = soLoiPhatHien;
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() + soLoiPhatHien * 50000;
    }

    @Override
    public void lamViec() {
        System.out.println("Kiểm tra phần mềm");
    }
}
