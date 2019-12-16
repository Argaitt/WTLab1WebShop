package com.mysitename.functionspackage;
import com.mysitename.mainpackage.Product;
import java.io.*;
import java.util.*;

/**
 * @author Timafei Slavinsky
 * @version 1.0
 * Класс, который реализует функционал CRUD для данного приложения
 */
public class CRUD {
	/**
	 * @param productList - список товаров
	 * Метод который добавляет в список товаров новую позицию(товар)
	 */
	public static void Create(ArrayList<Product> productList)
	{
		Scanner scan = new Scanner(System.in);
		Product prod = new Product();
		
		System.out.print("category: ");
		prod.category = scan.nextLine();
		
		System.out.print("model: ");
		prod.model = scan.nextLine();
		
		System.out.print("cost: ");
		prod.cost = scan.nextLine();
		
		productList.add(prod);
	}
	
	/**
	 * @param productList -список товаров
	 * Метод реализует чтение списка товаров(в данной программе используется метод Print). Оставлен просто по приколу
	 */
	public static void Read(ArrayList<Product> productList)
	{
		//use print pls;
	}
	
	/**
	 * @param productList -список товаров
	 * Метод реализует выбор из списка элемента типа Product и изменение полей данного элемента
	 */
	public static void Update(ArrayList<Product> productList)
	{
		Scanner scan = new Scanner(System.in);
		Product prod = new Product();
		
		System.out.print("Selet element for Update(Edit): ");
		int i = scan.nextInt();
		scan.nextLine();
		
		System.out.print("category: ");
		prod.category = scan.nextLine();
		
		System.out.print("model: ");
		prod.model = scan.nextLine();
		
		System.out.print("cost: ");
		prod.cost = scan.nextLine();
		
		productList.set(i-1, prod);
	}
	
	/**
	 * @param productList - список товаров
	 * Реализует выбор и удаление элемента типа Product из списка товаров
	 */
	public static void Delete(ArrayList<Product> productList)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Selet element for delete(Edit): ");
		int i = scan.nextInt();
		scan.nextLine();
	}
	
	/**
	 * @param productList -список товаров
	 * Метод реализует чтение и вывод на консоль содержимого списка товаров(используется вместо метода Read)
	 */
	public static void Print(ArrayList productList)
	{
		for (int i = 0; i < productList.size(); i++) {
			Product prod = new Product();
			prod = (Product)productList.get(i);
			System.out.println(i+1 + " " + prod.category + " " + prod.model + " " + prod.cost);
		}
	}

}
