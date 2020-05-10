
import creatorhelper.*;
import staff.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {

	public void cli() {
		
		Scanner myScanner = new Scanner(System.in);
		String userOption = "";

		System.out.println("Welcome to Guilherme Strey Vets.\nType the number of the option that you would like to run:\n");
		
		// Conditional used to run the program based on the user input
		System.out.println("1 - List all staff.");
		System.out.println("2 - List staff by categories.");
		System.out.println("3 - List all Admin staff performing a certain task.");
		System.out.println("4 - Search for a specific member of staff by name.");
		System.out.println("5 - List all animals.");
		System.out.println("6 - List animals by various types.");
		System.out.println("7 - Search for a specific animal by name.");
		
		// Scanning the user option
		userOption = myScanner.nextLine();

		
		// If the user type 1 
		if (userOption.contentEquals("1")) {
			printStaff();
		} 
		
		// If the user type 2 
		else if (userOption.contentEquals("2")) {
			System.out.println("Please, select which category that you would like to print:");
			System.out.println("1 - Vet.");
			System.out.println("2 - Nurse.");
			System.out.println("3 - Trainee.");
			System.out.println("4 - Receptionist.");
			System.out.println("5 - IT.");
			userOption = myScanner.nextLine();
			if (userOption.contentEquals("1")) {
				userOption = "Vet";
			}
			else if (userOption.contentEquals("2")) {
				userOption = "Nurse";
			}
			else if (userOption.contentEquals("3")) {
				userOption = "Trainee";
			}
			else if (userOption.contentEquals("4")) {
				userOption = "Receptionist";
			}
			else if (userOption.contentEquals("5")) {
				userOption = "IT";
			}
			printStaffCategory(userOption);
		}
		
		// If the user type 3
		else if (userOption.contentEquals("3")) { 
			System.out.println("3");

		}
		
		// If the user type 4
		else if (userOption.contentEquals("4")) { 
			System.out.println("4");

		}
		
		// If the user type 5
		else if (userOption.contentEquals("5")) { 
			System.out.println("5");

		}
		
		// If the user type 6
		else if (userOption.contentEquals("6")) { 
			System.out.println("6");

		}
		
		// If the user type 7
		else if (userOption.contentEquals("7")) { 
			System.out.println("7");
		}
		else { 
			System.out.println("Error. Your opption must be a number from 1 to 7");
		}

		//CreatorHelper.printVetStaff();
        
        //CreatorHelper.printStaffCategory("Nurse");
        
        

	
	}
	
	public static ArrayList<Staff> printStaff() {
		 
		for (int i = 0; i < creatorhelper.CreatorHelper.myStaff.size(); i++)  {
			System.out.println(creatorhelper.CreatorHelper.myStaff.get(i).toString());
			System.out.println("------------------------");

		}	
		return creatorhelper.CreatorHelper.myStaff;
		
	}

	
	public static ArrayList<Staff> printStaffCategory(String category) {
		
		ArrayList<Staff> printStaffCategory = new ArrayList<Staff>();
		for (int i = 0; i < creatorhelper.CreatorHelper.myStaff.size(); i++)  {
		if (creatorhelper.CreatorHelper.myStaff.get(i).getType().equalsIgnoreCase(category)) {
			printStaffCategory.add(creatorhelper.CreatorHelper.myStaff.get(i));
			}
		}
		for (int i = 0; i < printStaffCategory.size(); i++) {
			System.out.println(printStaffCategory.get(i).toString());
			System.out.println("------------------------");
		}	
		
		return printStaffCategory;
		
	}

}
