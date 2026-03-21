package Lab2_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
public static void main(String[] args) {
	ArrayList<Product> list = new ArrayList<Product>();
	list.add(new Product("P01", "Com chien", 3000, ProductCategory.FOOD));
	list.add(new Product("P02", "Tra sua", 2500, ProductCategory.FOOD));

	list.add(new Product("P03", "Laptop", 1500000, ProductCategory.ELECTRONIC));
	list.add(new Product("P04", "Tai nghe", 50000, ProductCategory.ELECTRONIC));
	list.add(new Product("P05", "Dien thoai", 800000, ProductCategory.ELECTRONIC));

	list.add(new Product("P06", "Ao thun", 15000, ProductCategory.CLOTHING));
	list.add(new Product("P07", "Quan jean", 30000, ProductCategory.CLOTHING));
	list.add(new Product("P08", "Giay sneaker", 70000, ProductCategory.CLOTHING));
//	list.add(new Product("", "Ao loi", -1000, null));
	
	
	for (Product product : list) {
		System.out.println(product);
	}
	
	Map<ProductCategory, Integer> map = new HashMap<ProductCategory, Integer>();
	
	for (Product p : list) {
		ProductCategory abc = p.getCategory();
		
		if (map.containsKey(abc)) {
			map.put(abc, map.get(abc)+1);
		}else {
			map.put(abc, 1);
		}
	}
	
	 for (ProductCategory type : map.keySet()) {
	        System.out.println(type + ": " + map.get(type));
	    }
	 
	 
	 
	 
	 Map<ProductCategory, Double> map2 = new HashMap<ProductCategory, Double>();
	 for (Product p : list) {
		ProductCategory abc = p.getCategory();
		
		if (map2.containsKey(abc)) {
			map2.put(abc,map2.get(abc)+p.getPrice());
		}
		else {
			map2.put(abc,p.getPrice());
		}
	}
	 
	 for (ProductCategory product : map2.keySet()) {
		 System.out.println(product + ": " + map2.get(product));
	}
}
}
