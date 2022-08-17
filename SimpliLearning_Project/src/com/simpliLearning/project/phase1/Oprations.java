package com.simpliLearning.project.phase1;
import java.io.IOException;
import java.util.Scanner;

public class Oprations {
	public void Opration_System() throws IOException {
		// TODO Auto-generated method stub
		Logic l=new Logic();
		Oprations o=new Oprations();
		MainManu m= new MainManu();
		Scanner sc= new Scanner(System.in);
		int ch;
	
		System.out.println("*****************	File Oprations 	*************************");
		System.out.println("");
		//System.out.println("*			*");
		System.out.println("*			1.Create new File 			*");
		System.out.println("*			2.Delete File 				*");
		System.out.println("*			3.Back To Main Manu 			*");
		System.out.println("");
		System.out.println("*****************	File Oprations 	*************************");
		
		
		System.out.println("Enter your choice:");
		
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			l.create_File();
			o.Opration_System();
			break;
		case 2:
			l.delete_File();
			o.Opration_System();
			break;
		case 3:
			m.File_System();
			break;
		default: 
			System.out.println("Invaild input.");
			o.Opration_System();
			break;
		}
		

	}

}
