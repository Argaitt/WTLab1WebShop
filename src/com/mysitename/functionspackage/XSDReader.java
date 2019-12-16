package com.mysitename.functionspackage;
import javax.xml.parsers.*; 

public class XSDReader {
	public static void XSDParse(String filePath) 
	{
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
	}
}
