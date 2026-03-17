package Slide;

public class Main {
public static void main(String[] args) {
	Xe xe = new Xe("Nissan",2024);
	Xe xe2 = new Xe();
//	xe.sethangXe("Toyota");
//	xe.setnamSanXuat(2025);
	xe.xuat();
	xe2.xuat();
	Xe xe3 = new Xe();
	xe3.nhap();
	xe3.xuat();
	System.out.println("2 PS48692 Mai Duy Anh ");
}
}
