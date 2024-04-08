/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlinhanvien;

/**
 *
 * @author duong
 */
public class GiamDoc extends NhanVien{
    private double luongLanhDao;

    public GiamDoc() {
    }
    
    

    public GiamDoc(double luongLanhDao) {
        this.luongLanhDao = luongLanhDao;
    }

    public GiamDoc(double luongLanhDao, String maNhanVien, String hoTen, int tuoi, String diaChi, double luongCoBan) {
        super(maNhanVien, hoTen, tuoi, diaChi, luongCoBan);
        this.luongLanhDao = luongLanhDao;
    }
    
    public double getThueThuNhap(){
        return super.getThueThuNhap();
    }
    
    public double getThuNhap(){
        return super.getThuNhap()*luongLanhDao;
    }
    
    public void Nhap(){
        super.Nhap();
        System.out.println("Moi ban nhap luong lanh dao");
        luongLanhDao = Double.parseDouble(sc.nextLine());
    }
    
    public void Xuat(){
        super.Xuat();
    }
}
