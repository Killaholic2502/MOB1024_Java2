package Lab2_3;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		EmployeeService nv = new EmployeeService();
		do {
		System.out.println("Hello");
		menu();
		System.out.println("Moi nhap chuong trinh muon chay: ");
	
		choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("1.Thêm một nhân viên vào danh sách");
			nv.nhap();
			break;	
		}
		
		case 2:{
			System.out.println("2.Hiển thị danh sách nhân viên");
			nv.xuat();
			break;
		}
		
		case 3: {
			System.out.println("3.Tìm nhân viên theo mã");
			nv.tim();
			break;
		}
		
		case 4: {
			System.out.println("4.Cập nhật lương nhân viên theo mã");
			nv.thayluong();
			break;
		}
		case 0:{
			System.out.println("0.Exit");
			System.out.println("Tam biet");
			break;
		}
		default:
			System.out.println("Nhap tu 0-4");
		}
		} while (choice!=0);
	}

	private static void menu() {
System.out.println("1.Thêm một nhân viên vào danh sách");
System.out.println("2.Hiển thị danh sách nhân viên");
System.out.println("3.Tìm nhân viên theo mã");
System.out.println("4.Cập nhật lương nhân viên theo mã");
System.out.println("0.Exit");





	}
}
