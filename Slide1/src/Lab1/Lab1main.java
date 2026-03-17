package Lab1;

import java.util.ArrayList;

public class Lab1main {
public static void main(String[] args) {
	ArrayList<SanPham> dssp = new ArrayList<SanPham>();
	for (int i = 1; i < 3; i++) {
		SanPham sp = new SanPham();
		sp.nhap();
		dssp.add(sp);
	}
	
	for (int i = 1; i < 4; i++) {
		ImportProduct sp = new ImportProduct();
		sp.nhap();
		dssp.add(sp);
	}
		
	for(SanPham sanPham : dssp) {
		sanPham.xuat();
	}
	
	
}
}
