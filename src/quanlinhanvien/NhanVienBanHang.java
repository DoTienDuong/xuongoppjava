/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlinhanvien;

/**
 *
 * @author duong
 */
public class NhanVienBanHang extends NhanVien{
    private double hoaHong;
    private int doanhSo;

    public NhanVienBanHang() {
    }

    public NhanVienBanHang(double hoaHong, int doanhSo) {
        this.hoaHong = hoaHong;
        this.doanhSo = doanhSo;
    }

    public NhanVienBanHang(double hoaHong, int doanhSo, String maNhanVien, String hoTen, int tuoi, String diaChi, double luongCoBan) {
        super(maNhanVien, hoTen, tuoi, diaChi, luongCoBan);
        this.hoaHong = hoaHong;
        this.doanhSo = doanhSo;
    }
    
    public void Nhap(){
        super.Nhap();
        System.out.println("Moi ban nhap doanh so");
        doanhSo = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap hoa hong : " + "%");
    }
    
    public double getThueThuNhap(){
        return super.getThueThuNhap();
    }
    
    public double getThuNhap(){
        return super.getThuNhap() + (doanhSo * hoaHong /100);
    }
    
    public void Xuat(){
        super.Xuat();
    }
}
