package com.mysitename.mainpackage;

import java.util.Scanner;
import com.mysitename.functionspackage.CRUD;
import com.mysitename.functionspackage.Sort;
import com.mysitename.functionspackage.TXTReader;
import com.mysitename.functionspackage.Seeker;
import java.util.ArrayList;


/**
 * @author Timafei Slavinsky 
 * @version 1.0
 * Главный класс программы, в котором находится точка входа(метод Main)
 */
public class MainClass {

 /**
 * @param args
 * Точка входа.
 */
public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList();
		int num = 0;
		System.out.println("Web_technology_lab_shop");
		String filePatch = "products.txt";
		productList = TXTReader.Read(filePatch);
		System.out.println("done!");
	
		Scanner in = new Scanner(System.in);
        
        while (num != -1) {
        	
        	CRUD.Print(productList);
        	System.out.println("1.Create");
    		System.out.println("2.Update");
    		System.out.println("3.Delete");
    		System.out.println("4.Seach");
    		System.out.println("5.Sort");
    		System.out.println("6.Exit");
    		
    		System.out.print("Input a number: ");
            num = in.nextInt();
            
        	switch (num) {
        	case (1):
        		CRUD.Create(productList);
        		break;
        	case (2):
        		CRUD.Update(productList);
        		break;
        	case (3):
        		CRUD.Delete(productList);
        		break;
        	case (4):
        		Seeker.seach(productList);
        		break;
        	case (5):
        		Sort.selectSort(productList);
        		break;
        	case (6):
        		TXTReader.Write(filePatch, productList);
        		num = -1;
        		break;
        	}
        }
        
	}

}
