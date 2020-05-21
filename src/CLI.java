
import staff.*;
import animals.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {

	// Declaring and instantiating a Scanner and a userOption String
	private Scanner myScanner = new Scanner(System.in);
	private String userOption = "";
	
	protected void cli() {	
		
		// Conditional used to run the program based on the user input
		System.out.println("\nType the number of the option that you would like to run:\n");	
		System.out.println("1 - List all staff.");
		System.out.println("2 - List staff by categories.");
		System.out.println("3 - List all Admin staff performing a certain task.");
		System.out.println("4 - Search for a specific member of staff by name.");
		System.out.println("5 - List all animals.");
		System.out.println("6 - List animals by various types.");
		System.out.println("7 - Search for a specific animal by name.");
		System.out.println("8 - Quit.\n");
		
		// Scanning the user option
		userOption = myScanner.nextLine();

		// If the user types 1 
		if (userOption.contentEquals("1")) {
			System.out.println("\n######### STAFF #########\n-------------------------");
			// Calling the method
			printStaff();
			end();
		} 
		
		// If the user types 2 
		else if (userOption.contentEquals("2")) {
			
			// Conditional used to run the program based on the user input
			System.out.println("\nPlease, select which category that you would like to print:\n");
			System.out.println("1 - Vet.");
			System.out.println("2 - Nurse.");
			System.out.println("3 - Trainee.");
			System.out.println("4 - Receptionist.");
			System.out.println("5 - IT.\n");
			
			// Scanning the user option
			userOption = myScanner.nextLine();
			
			// If the user types 1 
			if (userOption.contentEquals("1")) {
				userOption = "Vet";
			}
			// If the user types 2 
			else if (userOption.contentEquals("2")) {
				userOption = "Nurse";
			}
			// If the user types 3
			else if (userOption.contentEquals("3")) {
				userOption = "Trainee";
			}
			// If the user types 4
			else if (userOption.contentEquals("4")) {
				userOption = "Receptionist";
			}
			// If the user types 5
			else if (userOption.contentEquals("5")) {
				userOption = "IT";
			}
			// All other inputs
			else {
				System.out.println("\nERROR. Your opption must be a number between 1 and 5.");
				end();

			}
			
			// Print the standard response
			System.out.println("\n" + userOption.toUpperCase() + " PEOLE\n------------------------");
			
			// Calling the method
			printStaffCategory(userOption);
			end();
		}
		
		// If the user types 3
		else if (userOption.contentEquals("3")) {
			// Conditional used to run the program based on the user input
			System.out.println("\nPlease, select which task would you like to filter:\n");
			System.out.println("1 - Working.");
			System.out.println("2 - On Holidays.");
			System.out.println("3 - On Break.");
			System.out.println("4 - Day Off.\n");
			
			// Scanning the user option
			userOption = myScanner.nextLine();
			
			// If the user types 1
			if (userOption.contentEquals("1")) {
				userOption = "Working";
			}
			// If the user types 1
			else if (userOption.contentEquals("2")) {
				userOption = "On Holidays";
			}
			// If the user types 3
			else if (userOption.contentEquals("3")) {
				userOption = "On Break";
			}
			// If the user types 4
			else if (userOption.contentEquals("4")) {
				userOption = "Day Off";
			}
			// All other inputs
			else {
				System.out.println("\nERROR. Your opption must be a number between 1 and 4.");
				end();
			}
			
			// Print the standard response
			System.out.println("\nADMINSTAFF " + userOption.toUpperCase() + "\n-------------------------");
			
			// Calling the method
			printStaffByTask(userOption);
			end();
		}
		
		// If the user type 4
		else if (userOption.contentEquals("4")) { 
			
			// Print the standard response
			System.out.println("\nEnter the name you are looking for:\n");
			
			// Scanning the user option
			userOption = myScanner.nextLine();
			
			// Print the standard response
			System.out.println("\nRESULTS FOR: " + userOption + "\n-------------------------");
			
			// Calling the method
			staffByName(userOption);
			end();
		}
		
		// If the user types 5
		else if (userOption.contentEquals("5")) { 
			
			// Print the standard response
			System.out.println("\n############ ANIMALS ############\n---------------------------------");
			
			// Calling the method
			printAnimals();
			end();

		}
		
		// If the user types 6
		else if (userOption.contentEquals("6")) { 
			
			// Conditional used to run the program based on the user input
			System.out.println("\nPlease, select which type of animal that you would like to print:");
			System.out.println("1 - Cat.");
			System.out.println("2 - Dog.");
			System.out.println("3 - Rabbit.\n");
			
			// Scanning the user option
			userOption = myScanner.nextLine();
			
			// If the user types 1
			if (userOption.contentEquals("1")) {
				userOption = "Cat";
			}
			// If the user types 2
			else if (userOption.contentEquals("2")) {
				userOption = "Dog";
			}
			// If the user types 3
			else if (userOption.contentEquals("3")) {
				userOption = "Rabbit";
			}
			// All other inputs
			else {
				System.out.println("\nERROR. Your opption must be a number between 1 and 3. Try again:");
				end();
			}
			
			// Print the standard response
			System.out.println("\n" + userOption.toUpperCase() + "S\n---------------------------------");
			
			// Calling the method
			printAnimalsSpecie(userOption);
			end();

		}
		
		// If the user types 7
		else if (userOption.contentEquals("7")) { 
			
			// Print the standard request
			System.out.println("\nEnter the name of the animals you are looking for:\n");
			
			// Scanning the user option
			userOption = myScanner.nextLine();
			
			// Print the standard response
			System.out.println("\nRESULTS FOR: " + userOption + "\n---------------------------------");
			
			// Calling the method
			animalsByName(userOption);
			end();
		}
		
		// If the user types 8
		else if (userOption.contentEquals("8")) {
			
			// Print the standard response
			System.out.println("\nThank you, have a nice day.");
		}
		
		// All other inputs
		else { 
			
			// Print the standard response
			System.out.println("\nERROR. Your opption must be a number from 1 to 8.");
			
			// Calling the method
			end();
			}	
		
	}
	
	
	// OPTION 1 METHOD: PRINT ALL THE STAFF
	private static ArrayList<Staff> printStaff() {		 
		for (int i = 0; i < creatorhelper.CreatorHelper.myStaff.size(); i++)  {
			System.out.println(creatorhelper.CreatorHelper.myStaff.get(i).toString());
			System.out.println("-------------------------");
		}	
		return null;		
	}

	// OPTION 2 METHOD: PRINT STAFF BY CATEGORY
	private static ArrayList<Staff> printStaffCategory(String category) {		
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
		return null;	
	}
	
	// OPTION 3 METHOD: PRINT ADMINSTAFF BY TASK
	private static ArrayList<Staff> printStaffByTask(String task) {		
		ArrayList<Staff> printStaffByTask = new ArrayList<Staff>();
		
		for (int i = 0; i < creatorhelper.CreatorHelper.myAdminStaff.size(); i++)  {
			if (creatorhelper.CreatorHelper.myAdminStaff.get(i).getTask().equalsIgnoreCase(task)) {
				printStaffByTask.add(creatorhelper.CreatorHelper.myAdminStaff.get(i));
			}
		}
		
		for (int i = 0; i < printStaffByTask.size(); i++) {
			System.out.println(printStaffByTask.get(i).toString());
			System.out.println("-------------------------");
		}			
		return null;	
	}
 
	
	// OPTION 4 METHOD: PRINT STAFF BY NAME
	private ArrayList<Staff> staffByName(String name) {
		ArrayList<Staff> printStaffName = new ArrayList<Staff>();

		for (int i=0 ; i < creatorhelper.CreatorHelper.myStaff.size() ; i++) {
			if (creatorhelper.CreatorHelper.myStaff.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
				printStaffName.add(creatorhelper.CreatorHelper.myStaff.get(i));
			}
		}
		
		if ( printStaffName.size() == 0 ) {
			System.out.println("No results found.");
		} else {
			
			for (int i = 0; i < printStaffName.size(); i++) {
				System.out.println(printStaffName.get(i).toString());
				System.out.println("------------------------");
			}
		}			
		return null;	
	}
	
	// OPTION 5 METHOD: PRINT ALL THE ANIMALS
	private static ArrayList<Staff> printAnimals() {		 
		for (int i = 0; i < creatorhelper.CreatorHelper.myAnimals.size(); i++)  {
			System.out.println(creatorhelper.CreatorHelper.myAnimals.get(i).toString());
			System.out.println("---------------------------------");
		}	
		return null;		
	}
	
	// OPTION 6 METHOD: PRINT ANIMALS BY SPECIE
	private static ArrayList<Animal> printAnimalsSpecie(String specie) {		
		ArrayList<Animal> printAnimalsSpecie = new ArrayList<Animal>();
		
		for (int i = 0; i < creatorhelper.CreatorHelper.myAnimals.size(); i++)  {
			if (creatorhelper.CreatorHelper.myAnimals.get(i).getSpecie().equalsIgnoreCase(specie)) {
				printAnimalsSpecie.add(creatorhelper.CreatorHelper.myAnimals.get(i));
			}
		}
		
		for (int i = 0; i < printAnimalsSpecie.size(); i++) {
			System.out.println(printAnimalsSpecie.get(i).toString());
			System.out.println("---------------------------------");
		}
		return null;	
	}
	
	// OPTION 7 METHOD: PRINT ANIMALS BY NAME
	private ArrayList<Animal> animalsByName(String name) {
		ArrayList<Animal> printAnimalsName = new ArrayList<Animal>();
		
		for (int i=0 ; i < creatorhelper.CreatorHelper.myAnimals.size() ; i++) {
			if (creatorhelper.CreatorHelper.myAnimals.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
				printAnimalsName.add(creatorhelper.CreatorHelper.myAnimals.get(i));
			}
		}
		
		if ( printAnimalsName.size() == 0 ) {
			System.out.println("No results found.");
		} else {
		
			for (int i = 0; i < printAnimalsName.size(); i++) {
				System.out.println(printAnimalsName.get(i).toString());
				System.out.println("---------------------------------");
			}	
		}
		return null;	
	}
	
	// END METHOD
	private void end() {
		System.out.println("\nWould you like to do anything else? Type your answer:\n");
		System.out.println("1 - Yes.");
		System.out.println("2 - Quit.\n");
		userOption = myScanner.nextLine();
		
		// If the user types 1 
		if (userOption.contentEquals("1")) {
			cli();
		} 
		// If the user types 2 
		else if (userOption.contentEquals("2")) {
			System.out.println("Thank you, have a nice day.");
		}
		else {
			System.out.println("\nERROR. Your opption must be 1 or 2. Please, try again:");
			end();

		}
	}

}
