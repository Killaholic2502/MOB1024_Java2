package Lab1_2;

import java.util.Scanner;



public class NhanVien {
	private String id;
	private String ten;
	private double luongcb;
	double thunhap;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		do {
			this.id = id;	
		} while (id == null || id== "");
		
	}
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getLuongcb() {
		return luongcb;
	}
	public void setLuongcb(double luongcb) {
		do {
			this.luongcb = luongcb;
		} while (luongcb<0);
	}
	public NhanVien(String id, String ten, double luongcb) {
		this.id = id;
		this.ten = ten;
		this.luongcb = luongcb;
	}
	public NhanVien() {
	}
	
	public double setthunhap() {
		 return luongcb;
	}
	
	public double getThuNhap() {
		return thunhap;
	}

	public void xuat() {
		System.out.println("NhanVien [id=" + getId() + ", ten=" + ten + ", thunhap=" + thunhap + "]");
		
	}
 public void nhap() {
	 Scanner sc =  new Scanner(System.in);
	 System.out.println("Nhap id: ");
	 this.setId(sc.nextLine());
	 System.out.println("Nhap ten: ");
	 this.setTen(sc.nextLine());
//	 System.out.println("Nhap luong: ");
//	 this.setLuongcb(sc.nextDouble());
//	 sc.close();
 }
	
	
	
	
}
