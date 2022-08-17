package com.simpliLearning.project.phase1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Logic {
	Scanner sc= new Scanner(System.in);
	
//	Create New file
	public void create_File() throws IOException {

		String path="C:\\Users\\Public\\Documents\\";
		
		System.out.println("Enetr file name:");
		System.out.println();
		String f=sc.nextLine();
		path=path+f+".txt";
		
		File test= new File(path);
		if(test.createNewFile()) {
			System.out.println("File is Created\n");
		}
		else {
			System.out.println("File is already exists use different name.\n");
		}

	}
	
//	Delete file
	public void delete_File() {
		String path="C:\\Users\\Public\\Documents\\";
		System.out.println("Enetr file name  for delete:\n");
		String f=sc.nextLine();
		path=path+f+".txt";
		File test= new File(path);
		if(test.delete()) {
			System.out.println("File is deleted\n");
		}
		else {
			System.out.println("File not found.\n");
		}
	}
	
	
//	Display Existing file
	public void display_File() {
		
		File path= new File("C:\\Users\\Public\\Documents\\");
		
		String contants[]=path.list();
		System.out.println("List of existing files\n");
		for(int i=0;i<contants.length;i++) {
			System.out.println(contants[i]);
		}

	}
}

	
