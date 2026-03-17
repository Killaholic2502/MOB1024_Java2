package Lab1;

import java.util.Scanner;

public class ImportProduct extends SanPham {
	private double importTaxRate;
	private double shippingFee;
	/**
	 * @return the importTaxRate
	 */
	public double getImportTaxRate() {
		return importTaxRate;
	}
	/**
	 * @param importTaxRate the importTaxRate to set
	 */
	public boolean setImportTaxRate(double importTaxRate) {
		if (importTaxRate>=0 && importTaxRate<=1) {
			this.importTaxRate = importTaxRate;
			return true;
		} else {
			return false;
		}
	}
	/**
	 * @return the shippingFee
	 */
	public double getShippingFee() {
		return shippingFee;
	}
	/**
	 * @param shippingFee the shippingFee to set
	 */
	public boolean setShippingFee(double shippingFee) {
		if (shippingFee>=0) {
			this.shippingFee = shippingFee;
			return true;
		}else {
			return false;
		}
	}
	
		@Override
		public double finalPrice() {
			return super.getBasePrice()+super.getBasePrice()*importTaxRate+shippingFee;
		}
		public ImportProduct(String id, String name, double basePrice, double importTaxRate, double shippingFee) {
			super(id, name, basePrice);
			this.importTaxRate = importTaxRate;
			this.shippingFee = shippingFee;
		}
		
		@Override
		public void nhap() {
			Scanner sc = new Scanner(System.in);
			super.nhap();
			System.out.println("Nhap thue: ");
			setImportTaxRate(sc.nextDouble());
			System.out.println("Nhap ship: ");
			setShippingFee(sc.nextDouble());
		}
		
		public ImportProduct() {
			
		}
	
	
}
