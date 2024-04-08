/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlinhanvien;

/**
 *
 * @author duong
 */
public class NhanVienSanXuat extends NhanVien{
    private int soSanPham;
    private double thuongSanPham;

    public NhanVienSanXuat() {
    }

    public NhanVienSanXuat(int soSanPham, double thuongSanPham) {
        this.soSanPham = soSanPham;
        this.thuongSanPham = thuongSanPham;
    }

    public NhanVienSanXuat(int soSanPham, double thuongSanPham, String maNhanVien, String hoTen, int tuoi, String diaChi, double luongCoBan) {
        super(maNhanVien, hoTen, tuoi, diaChi, luongCoBan);
        this.soSanPham = soSanPham;
        this.thuongSanPham = thuongSanPham;
    }
    
    public void Nhap(){
        super.Nhap();
        System.out.println("Moi ban nhap so san pham");
        soSanPham = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap thuong san pham");
        thuongSanPham = Double.parseDouble(sc.nextLine());
    }
    
    public double getThueThuNhap(){
        return super.getThueThuNhap();
    }
    
    public double getThuNhap(){
        return super.getThuNhap() + (soSanPham * thuongSanPham);
    }
    
    public void Xuat(){
        super.Xuat();
    }
}
