package thithugk;

public class TruongDuAn extends NhanVien {
    private int soNamKinhNghiem;

    public TruongDuAn(String ma, String ten, double luong, int soNamKinhNghiem) {
        super(ma, ten, luong);
        this.soNamKinhNghiem = soNamKinhNghiem;
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() + soNamKinhNghiem * 1_000_000;
    }

    @Override
    public void lamViec() {
        System.out.println("Quản lý tiến độ team");
    }
}
