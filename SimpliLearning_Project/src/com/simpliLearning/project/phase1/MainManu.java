package com.simpliLearning.project.phase1;
import java.io.IOException;
import java.util.Scanner;
public class MainManu {
	
	public void File_System() throws IOException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		MainManu m= new MainManu();
		Oprations o=new Oprations();
		Logic l=new Logic();
		int ch;
		System.out.println("*****************	Welcome 	*************************");
		System.out.println("");
		//System.out.println("*			*");
		System.out.println("*			1.File Names 				*");
		System.out.println("*			2.File Oprations 			*");
		System.out.println("*			3.Exit 					*");
		System.out.println("");
		System.out.println("*****************	Welcome 	*************************");
		
		System.out.println("\nEnter your choice:");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			l.display_File();
			m.File_System();
			break;
		case 2:
			o.Opration_System();
			break;
		case 3:
			System.out.println("*****************	Thank You 	*************************");
			System.exit(0);
			break;
		default: 
			System.out.println("Invaild input.");
			m.File_System();
			break;
		}
		

	}

	

	

	

}
