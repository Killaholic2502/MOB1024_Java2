package Lab1_2;

import java.util.Scanner;

public class Parttime extends NhanVien {
	private int giolam;
	private int luonggio;
	public int getGiolam() {
		return giolam;
	}
	public void setGiolam(int giolam) {
		do {

			this.giolam = giolam;
		} while (giolam<0);
	}
	public int getLuonggio() {
		return luonggio;
	}
	public void setLuonggio(int luonggio) {
		do {
			this.luonggio = luonggio;
		} while (luonggio<0);
	}
	
	@Override
	public double setthunhap() {
		return giolam*luonggio;
	}
	

@Override
public void nhap() {
	Scanner sc = new Scanner(System.in);
	super.nhap();
	System.out.println("Nhap gio lam: ");
	setGiolam(sc.nextInt());
	System.out.println("Luong gio: ");
	setLuonggio(sc.nextInt());
	setthunhap();
	
}

}
