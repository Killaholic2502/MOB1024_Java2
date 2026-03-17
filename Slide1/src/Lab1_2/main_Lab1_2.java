package Lab1_2;

import java.util.ArrayList;

public class main_Lab1_2 {
	public static void main(String[] args) {
		ArrayList<NhanVien> ds = new ArrayList<NhanVien>();
		
		System.out.println("Nhap NV FT");
		for (int i = 0; i < 2; i++) {
			NhanVien nv = new Fulltime();
			nv.nhap();
			ds.add(nv);
		}

		System.out.println("Nhap NV PT");
		for (int i = 0; i < 3; i++) {
			NhanVien nv = new Parttime();
			nv.nhap();
			ds.add(nv);
		}
		
		System.out.println("Danh sach: ");
		for(NhanVien nv : ds) {
			nv.xuat();
		}
		
	}
}
