/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlinhanvien;

/**
 *
 * @author duong
 */
public class TruongPhong extends NhanVien{
    private int kinhNghiem;

    public TruongPhong() {
    }

    public TruongPhong(int kinhNghiem, String maNhanVien, String hoTen, int tuoi, String diaChi, double luongCoBan) {
        super(maNhanVien, hoTen, tuoi, diaChi, luongCoBan);
        this.kinhNghiem = kinhNghiem;
    }
    
    public double getThueThuNhap(){
        return super.getThueThuNhap();
    }
    
    public double getThuNhap(){
        return super.getThuNhap() + kinhNghiem * 1000;
    }
    
    public void Nhap(){
        super.Nhap();
        System.out.println("Moi ban nhap kinh nghiem");
        kinhNghiem = Integer.parseInt(sc.nextLine());
    }
    
    public void Xuat(){
        super.Xuat();
    }
}
