/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlinhanvien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
/**
 *
 * @author duong
 */
public class QLNV {

    ArrayList<NhanVien> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int soNV;

    public void NhapDanhSachNhanVien() {
        System.out.println("Moi ban nhap so nhan vien :");
        soNV = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < soNV; i++) {
            System.out.println("Nhap thong tin thu " + (i + 1) + "");
            System.out.println("1 - Nhan Vien  2 - Giam Doc 3 - Truong Phong 4 - Nhan Vien IT  5 - Nhan Vien Ban Hang  6 - Nhan Vien San Xuat");
            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    NhanVien nv = new NhanVien();
                    nv.Nhap();
                    list.add(nv);
                    break;
                    
                case 2:
                    GiamDoc gd = new GiamDoc();
                    gd.Nhap();
                    list.add(gd);
                    break;
                    
                case 3:
                    TruongPhong tp = new TruongPhong();
                    tp.Nhap();
                    list.add(tp);
                    break;
                case 4:
                    NhanVienIT nvit = new NhanVienIT();
                    nvit.Nhap();
                    list.add(nvit);
                    break;
                   
                    
                case 5:
                    NhanVienBanHang nvbh = new NhanVienBanHang();
                    nvbh.Nhap();
                    list.add(nvbh);
                    break;
                   
                    
                case 6:
                    NhanVienSanXuat nvsx = new NhanVienSanXuat();
                    nvsx.Nhap();
                    list.add(nvsx);
                    break;
                default:
                    System.out.println("Ban da chon sai moi ban chon lai");
                    break;
            }
        }
    }
    
    public void XuatDanhSachNhanVien(){
        System.out.println("---------Danh sach nhan vien--------");
        for (NhanVien nhanVien : list) {
            nhanVien.Xuat();
        }
    }
    
    public void Timkiemnhanvientheomanhanvien(){
        System.out.println("Moi ban nhap ma nhan vien can tim");
        String ma = sc.nextLine();
        System.out.println("---------Thong tin nhan vien can tim--------");
        for (NhanVien nvct : list) {
            list.indexOf(nvct);
            if(nvct.getMaNhanVien().equalsIgnoreCase(ma)){
                nvct.Xuat();
            }
        }
    }
    
    public void XoaNhanVienTheoMaNhapVao(){
        System.out.println("Moi ban nhap ma nhan vien muon xoa");
        String ma = sc.nextLine();
        for (NhanVien nvcx : list) {
            if(ma.equalsIgnoreCase(nvcx.getMaNhanVien())){
                list.remove(nvcx);
                break;
            }
        }
        XuatDanhSachNhanVien();
    }
    
    public void TimKiemNhanVienTheoMaSoVaCapNhatThongTin(){
        System.out.println("Moi ban nhap ma nhan vien can cap nhat");
        String maNVCN = sc.nextLine();
        for (NhanVien nvcn : list) {
            if(nvcn.getMaNhanVien().equalsIgnoreCase(maNVCN)){
                System.out.println("---------Cap nhat lai thong tin nhan vien--------");
                nvcn.Nhap();
            }
        }
        XuatDanhSachNhanVien();
    }
    
    public void TimKiemNhanVienTheoKhoangLuong(){
        System.out.println("Moi ban nhap khoang luong can tim");
        System.out.println("Nhap vao min luong");
        double min = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap vao max luong");
        double max = Double.parseDouble(sc.nextLine());
        System.out.println("---------Danh sach nhan vien co muc luong ban tim--------");
        for (NhanVien nvl : list) {
            if(nvl.getLuongCoBan() >= min && nvl.getLuongCoBan() <= max){
                nvl.Xuat();
            }
        }
    }
    
    public void SapXepNhanVienTheoHoTen(){
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getHoTen() .compareTo(o2.getHoTen());
        }
        };
        Collections.sort(list, comp);
        XuatDanhSachNhanVien();
    }
    
    public void SapXepNhanVienTheoThuNhap() {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.getThuNhap() < o2.getThuNhap()) 
                {
                    return 1;
                } 
                    return -1;
            }
        };
            Collections.sort (list, comp);
        }
         
    public void Xuat5NhanVienCoMucLuongCaoNhat(){
        SapXepNhanVienTheoThuNhap();
        System.out.println("---------5 nhan vien co thu nhap cao nhat--------");
        if(list.size() < 5){
            for (int i = 0; i < list.size(); i++) {
                list.get(i).Xuat();
            }
        }else{
            for (int i = 0; i < 5; i++) {
                list.get(i).Xuat();
            }
        }
    }
    
   public void TimKiemNhanVienTheoHoTen(){
    System.out.println("Moi ban nhap ho va ten can tim");
    String hvt = sc.nextLine();
    boolean found = false; 
    for (NhanVien nv : list) {
        if(nv.getHoTen().toLowerCase().contains(hvt.toLowerCase())){
            nv.Xuat();
            found = true;
        }
    }
    if (!found) {
        System.out.println("Khong tim thay nhan vien nao co ten '" + hvt + "'.");
    }
}
    
}
