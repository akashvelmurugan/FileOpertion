package com.filecreation;

import java.io.File;

public class FolderCreation {
public static void main(String[] args) {

	
	File file = new File("D:\\fileoperation");
	boolean mkdir = file.mkdir();
	System.out.println(mkdir);
	
}
}
