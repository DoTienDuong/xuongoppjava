/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlinhanvien;

/**
 *
 * @author duong
 */
public class NhanVienIT extends NhanVien{
    private int soGioTangCa;
    private double luongTangCa = 300;

    public NhanVienIT() {
    }

    public NhanVienIT(int soGioTangCa, double luongTangCa) {
        this.soGioTangCa = soGioTangCa;
        this.luongTangCa = luongTangCa;
    }

    public NhanVienIT(int soGioTangCa, double luongTangCa, String maNhanVien, String hoTen, int tuoi, String diaChi, double luongCoBan) {
        super(maNhanVien, hoTen, tuoi, diaChi, luongCoBan);
        this.soGioTangCa = soGioTangCa;
        this.luongTangCa = luongTangCa;
    }

   public void Nhap(){
       super.Nhap();
       System.out.println("Moi ban nhap so gio tang ca");
       soGioTangCa = Integer.parseInt(sc.nextLine());
   }
   
   public double getThueThuNhap(){
       return super.getThueThuNhap();
   }
   
   public double getThuNhap(){
       return super.getThuNhap() + (soGioTangCa *luongTangCa);
   }
   public void Xuat(){
       super.Xuat();
   }
}
