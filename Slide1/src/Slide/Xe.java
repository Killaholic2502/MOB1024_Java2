package Slide;

import java.util.Scanner;

public class Xe {
	private String hangXe;
	private int namSanXuat;
	private int id;
	
	public int getid() {
		return this.id;
	}
	public void setid(int id) {
		if (id < 0) {
			System.out.println("ID phải lớn hơn 0");
		}else {
		this.id = id;
	}}
	
	
	
	
	public String gethangXe() {
		return this.hangXe;
	}
	
	public void sethangXe(String hangXe) {
		this.hangXe = hangXe;
	}
	
	public int getnamSanXuat() {
		return this.namSanXuat;
	}
	
	public void setnamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	
	public void xuat() {
		System.out.println("ID xe: "+this.id+"Hang xe: "+ this.hangXe+" Nam san xuat: "+this.namSanXuat);
	}
	
	public Xe(String hangXe,int namSanXuat) {
		this.hangXe = hangXe;
		this.namSanXuat = namSanXuat;
	}
	
	public Xe() {
		
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap id: ");
		this.id = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap hang xe: ");
		this.hangXe = sc.nextLine();
		
		System.out.println("Nhap nam san xuat: ");
		this.namSanXuat = sc.nextInt();
		sc.close();
	}
}
