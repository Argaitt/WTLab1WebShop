package com.mysitename.functionspackage;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import com.mysitename.mainpackage.Product;;

/**
 * @author Timafei Slavinsky
 * @version 1.0
 * Класс, реализующий методы для чтения и записи структуры Product в .txt файл
 */
public class TXTReader {
	public static ArrayList Read(String filePath) 
	{
		ArrayList products = new ArrayList();
		
		
		try(FileReader reader = new FileReader(filePath))
        {
           Scanner scan = new Scanner(reader);
           String buffer, delimeter = "/";
           String[] subStr;
           while (scan.hasNextLine()) 
           {
        	   Product prod = new Product();
        	   buffer = scan.nextLine();
        	   subStr = buffer.split(delimeter);
        	   prod.category = subStr[0];
        	   prod.model = subStr[1];
        	   prod.cost = subStr[2];
        	   products.add(prod);
           }
			
        }
        catch(IOException ex){
             
            
        }   
		
		return products;
	}
	public static void Write(String FilePath, ArrayList<Product> productList) {
		String str;
		try(FileWriter writer = new FileWriter(FilePath, false)) {
			for (Product product : productList) {
				str = product.category + "/" + product.model + "/" +product.cost + "\n" ;
				writer.write(str);
			}
		} catch (IOException e) {
			
		}
	}
}
