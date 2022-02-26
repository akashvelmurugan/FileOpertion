package com.filecreation;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) throws IOException {
		File file= new File("D:\\fileoperation\\MultipleFile.txt");
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
	}	
}
