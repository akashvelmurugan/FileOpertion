package com.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrittinng {
	public static void main(String[] args) throws IOException {
		//		File file = new File("D:\\fileoperation\\MultipleFile.txt");
		//		boolean createNewFile = file.createNewFile();
		//		System.out.println(createNewFile);
		FileWriter fileWriter = new FileWriter("D:\\fileoperation\\MultipleFile.txt");
		fileWriter.write(" Java \n Class \n Today");
		fileWriter.close();
	}
}
