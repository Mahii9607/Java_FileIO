package com.IO;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Employee {

	public static void main(String[] args) throws IOException {
		
		
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\mahes\\OneDrive\\Documents\\Desktop\\ABCD.pdf");
		String p = "Java By Kiran";
		byte[] data = p.getBytes();
		fos.write(data);
		System.out.println("Data gaya");
	
		
		
		
		
		/*try {
			FileInputStream fis = new FileInputStream("C:\\Users\\mahes\\OneDrive\\Documents\\Desktop\\JBK.txt");
	     int i;
			while((i = fis.read()) != 0) {
				System.out.print((char)i);
			}
		
		}catch(FileNotFoundException e) {
			System.out.println("Ekda File Bhg...!");
			
		}*/
		
		
	}

}
