package com.mysitename.functionspackage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import com.mysitename.mainpackage.Product;

/**
 * @author Timafei Slavinsky
 * @version 1.0
 * Класс реализует сортировку по категориям в алфавитном порядке, с помощью интерфейса Comparator
 */
public class Sort {
	/**
	 * @param productList -список товаров
	 * @param comparator -компоратор
	 * Метод запускает метод .sort объекта типа Arraylist<Product> с указанным объектом типа Comparator
	 */
	static void sortMethod(ArrayList<Product> productList, Comparator comparator) {
		productList.sort(comparator);
	}
	/**
	 * @param productList -список товаров
	 * Метод выбора категории сортировки.
	 */
	public static void selectSort(ArrayList<Product> productList){
		
		int num = 0;
		Scanner in = new Scanner(System.in);
		
		while (num != -1) {
			System.out.println("Sort by:");
			System.out.println("1.-->category");
			System.out.println("2.-->model");
			System.out.println("3.-->cost");
			System.out.println("4.Exit");
			System.out.print("Input a number: ");
	        num = in.nextInt();
	        
	    	switch (num) {
	    	case (1):
	    		Comparator<Product> comparator1 = new ProductCategoryComparator();
	    		sortMethod(productList, comparator1);
	    		break;
	    	case (2):
	    		Comparator<Product> comparator2 = new ProductModelComparator();
				sortMethod(productList, comparator2);
	    		break;
	    	case (3):
	    		Comparator<Product> comparator3 = new ProductCostComparator();
				sortMethod(productList, comparator3);
	    		break;
	    	case (4):
	    		num = -1;
				break;	
	    	}
	    	CRUD.Print(productList);
		}
	}
}

/**
 * @author Timafei Slavinsky
 * @version 1.0
 * Класс реализующий интерфейс Comparator
 */
class ProductCategoryComparator implements Comparator<Product>{
	public int compare(Product a, Product b) {
		return a.category.compareTo(b.category);
	}
}

/**
 * @author Timafei Slavinsky
 * @version 1.0
 * Класс реализующий интерфейс Comparator
 */
class ProductModelComparator implements Comparator<Product>{
	public int compare(Product a, Product b) {
		return a.model.compareTo(b.model);
	}
}

/**
 * @author Timafei Slavinsky
 * @version 1.0
 * Класс реализующий интерфейс Comparator
 */
class ProductCostComparator implements Comparator<Product>{
	public int compare(Product a, Product b) {
		return a.cost.compareTo(b.cost);
	}
}
