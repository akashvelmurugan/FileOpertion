package com.filecreation;

import java.io.File;

public class MultipleFolderCreation {
	public static void main(String[] args) {
		File file= new File("D:\\fileoperation\\MultipleFile");
		boolean mkdirs = file.mkdirs();
		System.out.println(mkdirs);
	}

}
