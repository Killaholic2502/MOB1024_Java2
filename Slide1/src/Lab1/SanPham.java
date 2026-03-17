package Lab1;

import java.util.Scanner;

public class SanPham {
private String id;
private String name;
private double basePrice;
private double finalPrice;
/**
 * @return the id
 */
public String getId() {
	return id;
}
/**
 * @param id the id to set
 */
public boolean setId(String id) {
	if (id != "") {
		 this.id = id;
		 return true;
	} else {return false;}
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the basePrice
 */
public double getBasePrice() {
	return basePrice;
}
/**
 * @param basePrice the basePrice to set
 */
public boolean setBasePrice(double basePrice) {
	if (basePrice>=0) {
		this.basePrice = basePrice;
		return true;
	} else {
		return false;
}}
@Override
public String toString() {
	return "SanPham [id=" + id + ", name=" + name + ", basePrice=" + basePrice + "]";
}

public double finalPrice() {
	return this.finalPrice = this.basePrice;
}
public SanPham(String id, String name, double basePrice) {
	this.id = id;
	this.name = name;
	this.basePrice = basePrice;
}

public SanPham() {
	
}

public void nhap() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap id: ");
	setId(sc.nextLine());
	System.out.println("Nhap ten: ");
	setName(sc.nextLine());
	System.out.println("Nhap gia: ");
	setBasePrice(sc.nextDouble());
	sc.close();
	
	
}
public void xuat() {
	System.out.println("ID: "+getId()+" Ten: "+getName()+" Gia: " + finalPrice()  );
}



	
}


