package Lab2_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	ArrayList<Student> ds = new ArrayList<Student>();
	
	public void chucnang3() {

		int inter=0,part=0,reg=0;

		for(Student sv: ds) {
			if(sv.getType()==StudentType.INTERNATIONAL) {
				inter++;
			} else if(sv.getType()==StudentType.REGULAR) {
				reg++;
			} else if(sv.getType()==StudentType.PART_TIME) {
				part++;
			}
		}
		
		System.out.println("Sinh vien International: "+inter);
		System.out.println("Sinh vien Regular: "+reg);
		System.out.println("Sinh vien Part_Time: "+part);
		
	}
	
	
	public void chucnang1() {
		for(Student sv: ds) {
			sv.display();
		}
		
	}
	
	public void chucnang2() {
		System.out.println();
		System.out.println("Sinh vien Regular");
		for(Student sv:ds) {
			if(sv.getType()==StudentType.REGULAR) {
				sv.display();
			}
		}
		
		System.out.println();
		System.out.println("Sinh vien Part Time");
		for(Student sv:ds) {
			if(sv.getType()==StudentType.PART_TIME) {
				sv.display();
			}
		}
		
		System.out.println();
		System.out.println("Sinh vien International");
		for(Student sv:ds) {
			if(sv.getType()==StudentType.INTERNATIONAL) {
				sv.display();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
	Main m = new Main();
	m.ds.add(new Student("SV01", "Anh", StudentType.REGULAR));
	m.ds.add(new Student("SV02", "Binh", StudentType.PART_TIME));
	m.ds.add(new Student("SV03", "Chi", StudentType.INTERNATIONAL));
	m.ds.add(new Student("SV04", "Dung", StudentType.REGULAR));
	m.ds.add(new Student("SV05", "Hanh", StudentType.PART_TIME));
	m.ds.add(new Student("SV06", "Khanh", StudentType.INTERNATIONAL));
	do {
		
	System.out.println("Chon chuc nang 1,2,3");
	choice = sc.nextInt();
	
	switch (choice) {
	case 1: {
		m.chucnang1();
		break;
	}
	case 2:{
		m.chucnang2();
		break;
	}
	case 3:{
		m.chucnang3();
		break;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + choice);
	}

	} while (choice!=0);
}

}
