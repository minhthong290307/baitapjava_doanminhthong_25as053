package thithugk;

public class LapTrinhVien extends NhanVien {
    private int soGioOT;

    public LapTrinhVien(String ma, String ten, double luong, int soGioOT) {
        super(ma, ten, luong);
        this.soGioOT = soGioOT;
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() + soGioOT * 200000;
    }

    @Override
    public void lamViec() {
        System.out.println("Viết code và fix bug");
    }
}

