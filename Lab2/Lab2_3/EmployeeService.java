package Lab2_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeService {
	ArrayList<Employee> ds = new ArrayList<Employee>();
	Map<String, Employee> map1 = new HashMap<String, Employee>();

	public void nhap() {
		String choice;
		Scanner sc = new Scanner(System.in);
		do {
			
		
		Employee nv = new Employee();
		System.out.println("Nhap ID: ");
		nv.setId(sc.nextLine());
		System.out.println("Nhap Ten: ");
		nv.setName(sc.nextLine());
		System.out.println("Nhap Luong: ");
		nv.setSalary(sc.nextDouble());
		ds.add(nv);
		map1.put(nv.getId(),nv);
		sc.nextLine();
		System.out.println("Nhap them nua ?(Y/N)");
		choice = sc.nextLine();
		if(choice.equalsIgnoreCase("N")) {
			break;
		}
		} while (true);
	}
	
	public void xuat() {

//		for ( Employee nv : ds ) {
//		nv.display();
//	}
		
		for(Map.Entry<String, Employee> abc : map1.entrySet()) {
			String key = abc.getKey();
			Employee value = abc.getValue();
			
			System.out.println(key+" "+value.getName()+" "+value.getSalary());
		}
	}

	public void thayluong() {
		Scanner sc = new Scanner(System.in);
		int count=0;
		
		System.out.println("Nhap ma nhan vien muon thay luong: ");
		String tim = sc.nextLine();
		for(Map.Entry<String, Employee> danhsach : map1.entrySet()) {
			String matim = danhsach.getKey();
			Employee Luongthay = danhsach.getValue();
			if(matim.equalsIgnoreCase(tim)) {
			
				System.out.println("Nhap luong muon thay: ");
				Luongthay.setSalary(sc.nextDouble());
				count++;
			} 
			
		}
		if(count == 0)
		{
			System.out.println("Khong tim thay ma NV");
		}
	}

	public void tim() {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("Nhap ma nv muon tim: ");
		String tim = sc.nextLine();
		
		for(Map.Entry<String, Employee> ds: map1.entrySet()) {
			String matim = ds.getKey();
			Employee nv = ds.getValue();
			
			if(matim.equalsIgnoreCase(tim)) {
				nv.display();
				count++;
			}
			
		}
		
		if(count == 0) {
			System.out.println("Khong tim thay nhan vien");
		}
		
	}
	
	

}
