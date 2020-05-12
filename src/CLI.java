
import staff.*;
import animals.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {

	public Scanner myScanner = new Scanner(System.in);
	public String userOption = "";
	
	public void cli() {	
		System.out.println("\nType the number of the option that you would like to run:\n");
		
		// Conditional used to run the program based on the user input
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

		
		// If the user type 1 
		if (userOption.contentEquals("1")) {
			System.out.println("\n######### STAFF #########\n-------------------------");
			printStaff();
			end();
		} 
		
		// If the user type 2 
		else if (userOption.contentEquals("2")) {
			System.out.println("\nPlease, select which category that you would like to print:\n");
			System.out.println("1 - Vet.");
			System.out.println("2 - Nurse.");
			System.out.println("3 - Trainee.");
			System.out.println("4 - Receptionist.");
			System.out.println("5 - IT.\n");
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
			else {
				System.out.println("\nERROR. Your opption must be a number between 1 and 5.");
				end();

			}
			System.out.println("\n" + userOption.toUpperCase() + "S\n------------------------");
			printStaffCategory(userOption);
			end();
		}
		
		// If the user type 3
		else if (userOption.contentEquals("3")) { 
			System.out.println("\nPlease, select which task would you like to filter:\n");
			System.out.println("1 - Making Phone Calls.");
			System.out.println("2 - On Holidays.");
			System.out.println("3 - On Lunch.\n");
			userOption = myScanner.nextLine();
			if (userOption.contentEquals("1")) {
				userOption = "Making Phone Calls";
			}
			else if (userOption.contentEquals("2")) {
				userOption = "On Holidays";
			}
			else if (userOption.contentEquals("3")) {
				userOption = "On Lunch";
			}
			else {
				System.out.println("\nERROR. Your opption must be a number between 1 and 3.");
				end();
			}
			System.out.println("\nPEOPLE " + userOption.toUpperCase() + "\n-------------------------");

			printStaffByTask(userOption);
			end();
		

		}
		
		// If the user type 4
		else if (userOption.contentEquals("4")) { 
			System.out.println("\nEnter the name you are looking for:\n");
			userOption = myScanner.nextLine();
			System.out.println("\nRESULTS FOR: " + userOption + "\n-------------------------");
			staffByName(userOption);
			end();
		}
		
		// If the user type 5
		else if (userOption.contentEquals("5")) { 
			System.out.println("\n############ ANIMALS ############\n---------------------------------");
			printAnimals();
			end();

		}
		
		// If the user type 6
		else if (userOption.contentEquals("6")) { 
			System.out.println("\nPlease, select which type of animal that you would like to print:");
			System.out.println("1 - Cat.");
			System.out.println("2 - Dog.");
			System.out.println("3 - Rabbit.\n");
			userOption = myScanner.nextLine();
			if (userOption.contentEquals("1")) {
				userOption = "Cat";
			}
			else if (userOption.contentEquals("2")) {
				userOption = "Dog";
			}
			else if (userOption.contentEquals("3")) {
				userOption = "Rabbit";
			}
			else {
				System.out.println("\nERROR. Your opption must be a number between 1 and 3. Try again:");
				end();
			}
			System.out.println("\n" + userOption.toUpperCase() + "S\n---------------------------------");
			printAnimalsSpecie(userOption);
			end();

		}
		
		// If the user type 7
		else if (userOption.contentEquals("7")) { 
			System.out.println("\nEnter the name of the animals you are looking for:\n");
			userOption = myScanner.nextLine();
			System.out.println("\nRESULTS FOR: " + userOption + "\n---------------------------------");
			animalsByName(userOption);
			end();
		}
		
		// If the user type 8
		else if (userOption.contentEquals("8")) {
			System.out.println("\nThank you, have a nice day.");
		}
		
		else { 
			System.out.println("\nERROR. Your opption must be a number from 1 to 8.");
			end();
			}	
		
	}
	
	
	// OPTION 1 METHOD: PRINT ALL THE STAFF
	public static ArrayList<Staff> printStaff() {		 
		for (int i = 0; i < creatorhelper.CreatorHelper.myStaff.size(); i++)  {
			System.out.println(creatorhelper.CreatorHelper.myStaff.get(i).toString());
			System.out.println("-------------------------");
		}	
		return null;		
	}

	// OPTION 2 METHOD: PRINT STAFF BY CATEGORY
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
		return null;	
	}
	
	// OPTION 3 METHOD: PRINT ADMINSTAFF BY TASK
	public static ArrayList<Staff> printStaffByTask(String task) {		
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
	public ArrayList<Staff> staffByName(String name) {
		ArrayList<Staff> printStaffName = new ArrayList<Staff>();


		// Loop used to access all the data from arrayFeedItem and compare
		// to the given title. If it is present then return the title.
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
	public static ArrayList<Staff> printAnimals() {		 
		for (int i = 0; i < creatorhelper.CreatorHelper.myAnimals.size(); i++)  {
			System.out.println(creatorhelper.CreatorHelper.myAnimals.get(i).toString());
			System.out.println("---------------------------------");
		}	
		return null;		
	}
	
	// OPTION 6 METHOD: PRINT ANIMALS BY SPECIE
	public static ArrayList<Animal> printAnimalsSpecie(String specie) {		
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
	public ArrayList<Animal> animalsByName(String name) {
		ArrayList<Animal> printAnimalsName = new ArrayList<Animal>();


		// Loop used to access all the data from arrayFeedItem and compare
		// to the given title. If it is present then return the title.
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
	
	
	public void end() {
		System.out.println("\nWould you like to do anything else? Type your answer:\n");
		System.out.println("1 - Yes.");
		System.out.println("2 - Quit.\n");
		userOption = myScanner.nextLine();
		
		// If the user type 1 
				if (userOption.contentEquals("1")) {
					cli();
				} 
				// If the user type 2 
				else if (userOption.contentEquals("2")) {
					System.out.println("Thank you, have a nice day.");
				}
				else {
					System.out.println("\nERROR. Your opption must be 1 or 2. Please, try again:");
					end();

				}
	}

}
