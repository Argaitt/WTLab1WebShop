package com.mysitename.functionspackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import com.mysitename.mainpackage.Product;

/**
 * @author Timafei Slavinsky
 * @version 1.0
 * Класс который предстваляет собой объект для реализации поиска
 */
public class Seeker {
	/**
	 * @param productList - список товаров
	 * Метод реализует поиск в списке товаров по категориям.
	 */
	public static void seach(ArrayList<Product> productList) {
		ArrayList<Product> seachResult = new  ArrayList<Product>();
		int num = 0;
		String keyword;
		
		Scanner in = new Scanner(System.in);
		do{
			System.out.println("Seach by:");
			System.out.println("1.-->category");
			System.out.println("2.-->model");
			System.out.println("3.-->cost");
			System.out.println("4.Exit");
			System.out.print("Input a number: ");
	        num = in.nextInt();
	        in.nextLine();
	        System.out.print("Imput keyword: ");
	        keyword = in.nextLine();
	        
	    	switch (num) {
	    	case (1):
	    		Comparator comparator1 = new Compare();
	    		for (Product product : productList) {
	    			if (comparator1.compare(product.category, keyword) == 0) {
    					seachResult.add(product);
    				};
				}
	    		break;
	    	case (2):
	    		Comparator comparator2 = new Compare();
    			for (Product product : productList) {
    				if (comparator2.compare(product.model, keyword) == 0) {
    					seachResult.add(product);
    				};
    			}
	    		break;
	    	case (3):
	    		Comparator comparator3 = new Compare();
				for (Product product : productList) {
					if (comparator3.compare(product.cost, keyword) == 0) {
    					seachResult.add(product);
    				};
				}
	    		break;
	    	case (4):
	    		num = -1;
				break;	
	    	}
	    	System.out.println("Seach is done. Result: ");
	    	CRUD.Print(seachResult);
		}
		while (num != -1);
	}
}
/**
 * @author Timofei Slavinsky
 * Класс реализует метод Comparator
 */
class Compare implements Comparator<String>{
	public int compare(String a, String b) {
		return a.compareTo(b);
	}
}
