/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlinhanvien;

import java.util.Scanner;

/**
 *
 * @author duong
 */
public class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private double luongCoBan;
    private double thuong;
    Scanner sc = new Scanner(System.in);
    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String hoTen, int tuoi, String diaChi, double luongCoBan, double thuong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.luongCoBan = luongCoBan;
        this.thuong = thuong;
    }
    
    
    public void Nhap(){
        System.out.println("Nhap thong tin nhan vien");
        System.out.println("Moi ban nhap ma nhan vien");
        maNhanVien = sc.nextLine();
        System.out.println("Moi ban nhap ho ten nhan vien");
        hoTen = sc.nextLine();
        System.out.println("Moi ban nhap tuoi");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap dia chi");
        diaChi = sc.nextLine();
        System.out.println("Moi ban nhap luong");
        luongCoBan = Double.parseDouble(sc.nextLine());
        System.out.println("Moi ban nhap so luong thuong");
        thuong = Double.parseDouble(sc.nextLine());
    }
    
  
    
    public double getThueThuNhap(){
        if(luongCoBan < 10000000){
            return 0.0;    
        }else if(luongCoBan > 10000000) {
            return luongCoBan * 0.5;
        }else{
            return luongCoBan * 0.10;
        }
    }
    
      public double getThuNhap(){
        return luongCoBan + thuong - getThueThuNhap();
    }
    
    public void Xuat(){
        
        System.out.println("---------------------");
        System.out.println("Ma nhan vien : " +maNhanVien);
        System.out.println("Ho va Ten : " +hoTen);
        System.out.println("Tuoi : " +tuoi);
        System.out.println("Dia chi : " +diaChi);
        System.out.println("Luong co ban : " +luongCoBan);
        System.out.println("Luong thuong : " +thuong);
        System.out.println("Thu Nhap :" +getThuNhap());
        System.out.println("Thue thu nhap :" +getThueThuNhap());
        System.out.println("----------------------");
    }
    
    
    public NhanVien(String maNhanVien, String hoTen, int tuoi, String diaChi, double luongCoBan) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.luongCoBan = luongCoBan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    
}
