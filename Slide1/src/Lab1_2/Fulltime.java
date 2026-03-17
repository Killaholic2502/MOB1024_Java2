package Lab1_2;

import java.util.Scanner;

public class Fulltime extends NhanVien{
private double bonus;
private double pen;


public double getBonus() {
	return bonus;
}
public void setBonus(double bonus) {
	do {
		this.bonus = bonus;	
	} while (bonus<0);
	
}
public double getPen() {
	return pen;
}
public void setPen(double pen) {
	
	do {
		this.pen = pen;	
	} while (pen<0);
}

@Override
public double setthunhap() {
	return super.getLuongcb()+bonus-pen;
}

@Override
public void nhap() {
	Scanner sc = new Scanner(System.in);
	super.nhap();
	System.out.println("Nhap luong: ");
	super.setLuongcb(sc.nextDouble());
	System.out.println("Nhap thuong: ");
	setBonus(sc.nextDouble());
	System.out.println("Nhap phat: ");
	setPen(sc.nextDouble());
	setthunhap();
	
}
	
}
