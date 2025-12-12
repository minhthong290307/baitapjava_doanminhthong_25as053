package thithugk;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<NhanVien> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm (Mã hoặc Tên)");
            System.out.println("4. Cập nhật lương cơ bản");
            System.out.println("5. Xóa nhân viên");
            System.out.println("6. Bảng lương & Công việc");
            System.out.println("7. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch(choice) {

                case 1: {
                    System.out.println("Chọn chức vụ (1=LTV, 2=KTV, 3=TDA): ");
                    int type = Integer.parseInt(sc.nextLine());

                    System.out.print("Mã NV: ");
                    String ma = sc.nextLine();

                    System.out.print("Họ tên: ");
                    String ten = sc.nextLine();

                    System.out.print("Lương cơ bản: ");
                    double luong = Double.parseDouble(sc.nextLine());

                    if(type == 1) {
                        System.out.print("Số giờ OT: ");
                        int ot = Integer.parseInt(sc.nextLine());
                        list.add(new LapTrinhVien(ma, ten, luong, ot));
                    }
                    else if(type == 2) {
                        System.out.print("Số lỗi phát hiện: ");
                        int loi = Integer.parseInt(sc.nextLine());
                        list.add(new KiemThuVien(ma, ten, luong, loi));
                    }
                    else {
                        System.out.print("Số năm kinh nghiệm: ");
                        int nam = Integer.parseInt(sc.nextLine());
                        list.add(new TruongDuAn(ma, ten, luong, nam));
                    }
                    break;
                }

                case 2: {
                    System.out.println("\n=== DANH SÁCH NHÂN VIÊN ===");
                    for(NhanVien nv : list) {
                        nv.inThongTin();
                        System.out.println("Lương thực lĩnh: " + nv.tinhLuong());
                    }
                    break;
                }

                case 3: {
                    System.out.print("Nhập mã hoặc tên cần tìm: ");
                    String key = sc.nextLine().toLowerCase();

                    for(NhanVien nv : list) {
                        if(nv.getMaNV().toLowerCase().contains(key) ||
                                nv.getHoTen().toLowerCase().contains(key)) {

                            nv.inThongTin();
                            System.out.println("Lương: " + nv.tinhLuong());
                            System.out.println();
                        }
                    }
                    break;
                }

                case 4: {
                    System.out.print("Nhập mã nhân viên cần sửa lương: ");
                    String ma = sc.nextLine();

                    for(NhanVien nv : list) {
                        if(nv.getMaNV().equalsIgnoreCase(ma)) {
                            System.out.print("Nhập lương mới: ");
                            nv.setLuongCoBan(Double.parseDouble(sc.nextLine()));
                            System.out.println("Cập nhật thành công!");
                        }
                    }
                    break;
                }

                case 5: {
                    System.out.print("Nhập mã cần xóa: ");
                    String ma = sc.nextLine();

                    list.removeIf(nv -> nv.getMaNV().equalsIgnoreCase(ma));
                    System.out.println("Đã xóa nếu tồn tại!");
                    break;
                }

                case 6: {
                    System.out.println("\n=== BẢNG LƯƠNG & CÔNG VIỆC ===");
                    for(NhanVien nv : list) {
                        nv.inThongTin();
                        nv.lamViec();
                        System.out.println("Lương: " + nv.tinhLuong());
                        System.out.println();
                    }
                    break;
                }
            }

        } while(choice != 7);

        System.out.println("Thoát chương trình!");
    }
}
