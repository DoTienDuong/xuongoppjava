/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlinhanvien;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author duong
 */
public class QuanLiNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<NhanVien> lst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        QLNV qlnv = new QLNV();
               
        
        do{
            System.out.println("#####===MENU===#####");
            System.out.println("Chuc nang 1 : Nhap danh sach nhan vien");
            System.out.println("Chuc nang 2 : Xuat danh sach nhan vien");
            System.out.println("Chuc nang 3 : Tim kiem nhan vien theo ma nhan vien");
            System.out.println("Chuc nang 4 : Xoa nhan vien theo ma nhap vao");
            System.out.println("Chuc nang 5 : Tim kiem nhan vien theo ma so va cap nhat thong tin nhan vien");
            System.out.println("Chuc nang 6 : Tim kiem nhan vien theo khoang luong");
            System.out.println("Chuc nang 7 : Sap xep nhan vien theo ho ten");
            System.out.println("Chuc nang 8 : Sap xep nhan vien theo thu nhap");
            System.out.println("Chuc nang 9 : Xuat 5 nhan vien co thu nhap cao nhat");
            System.out.println("Chuc nang 10 : Tim gia tri lon nhat");
            System.out.println("#####===MENU===#####");
             System.out.println("Moi ban chon chuc nang");
            menu = Integer.parseInt(sc.nextLine());
          
            switch(menu){
                case 0 :
                    System.out.println("Thoat");
                    System.exit(0);
                    
                case 1 :
                    System.out.println("$$$$=== Chuc nang 1 ===$$$$");
                        qlnv.NhapDanhSachNhanVien();
                    break;
                    
                case 2 :
                    System.out.println("$$$$=== Chuc nang 2 ===$$$$");
                    qlnv.XuatDanhSachNhanVien();
                    
                   break;
                   
                case 3 :
                   System.out.println("$$$$=== Chuc nang 3 ===$$$$");
                   qlnv.Timkiemnhanvientheomanhanvien();
                   break;
                   
                case 4 :
                    System.out.println("$$$$=== Chuc nang 4 ===$$$$");
                    qlnv.XoaNhanVienTheoMaNhapVao();
                    break;
                    
                case 5 : 
                    System.out.println("$$$$=== Chuc nang 5 ===$$$$");
                    qlnv.TimKiemNhanVienTheoMaSoVaCapNhatThongTin();
                    break;
                    
                case 6 : 
                    System.out.println("$$$$=== Chuc nang 6 ===$$$$");
                    qlnv.TimKiemNhanVienTheoKhoangLuong();
                    break;
                    
                case 7 :
                    System.out.println("$$$$=== Chuc nang 7 ===$$$$");
                    qlnv.SapXepNhanVienTheoHoTen();
                    break;
                    
                case 8 :
                    System.out.println("$$$$=== Chuc nang 8 ===$$$$");
                    qlnv.SapXepNhanVienTheoThuNhap();
                    break;
                    
                case 9 :
                    System.out.println("$$$$=== Chuc nang 9 ===$$$$");
                    qlnv.Xuat5NhanVienCoMucLuongCaoNhat();
                    break;
                    
                case 10 :
                    System.out.println("$$$$=== Chuc nang 10 ===$$$$");
                    qlnv.TimKiemNhanVienTheoHoTen();
                    break;
                default :
                    System.out.println("Ban nhap nhap sai moi ban nhap lai");
                    
                    break;
                    
            }
        }while(menu !=0);
        
    }
    
}
