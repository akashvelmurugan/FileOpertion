package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\fileoperation\\MultipleFile.txt");
		//		FileReader fileReader= new FileReader("D:\\fileoperation\\MultipleFile.txt");
		Scanner scanner= new Scanner(file);		
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		//		fileReader.close();
	}
}
