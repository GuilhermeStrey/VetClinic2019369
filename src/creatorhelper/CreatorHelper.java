package creatorhelper;

import java.util.ArrayList;
import java.util.Random;

import adminstaff.*;
import medicalstaff.*;
import animals.*;
import staff.*;

public class CreatorHelper {
	
	// Declaring and instantiating ArrayLists to store informations
	public static ArrayList<Animal> myAnimals = new ArrayList<Animal>();
	public static ArrayList<Staff> myStaff = new ArrayList<Staff>();
	public static ArrayList<MedicalStaff> myMedicalStaff = new ArrayList<MedicalStaff>();
	public static ArrayList<AdminStaff> myAdminStaff = new ArrayList<AdminStaff>();
	
	// Declaring and instantiating staffNumber
	StaffNumber staffNumber = new StaffNumber();
	
	// Declaring and instantiating random function
	Random rd = new Random();

	// Generates all the Staff and Animals
	public void generate() {

		// Generate random numbers for each species
		int numberAnimals = 1000;
		int numberDogs = numberAnimals - rd.nextInt(numberAnimals);
		int numberCats = numberAnimals - numberDogs - rd.nextInt(numberAnimals - numberDogs);
		int numberRabbits = numberAnimals - numberDogs - numberCats;
		
		// Generates animals based on the numbers above
		for (int i = 0; i < numberAnimals; i++) {
			if (i < numberCats) {
				Cat newCat = new Cat(petName(), animalAge(), medicalCondition());
				myAnimals.add(newCat);
			}
			if (i < numberDogs) {
				Dog newDog = new Dog(petName(), animalAge(), medicalCondition());
				myAnimals.add(newDog);
			}
			if (i < numberRabbits) {
				Rabbit newRabbit = new Rabbit(petName(), animalAge(), medicalCondition());
				myAnimals.add(newRabbit);
			}
		}
		
		// Generate random numbers for MedicalStaff.
		int numberMedicalStaff = 30;
		int numberVet = 5;
		int numberNurse = numberMedicalStaff - numberVet - rd.nextInt(numberMedicalStaff - numberVet);
		int numberTrainee = numberMedicalStaff - numberVet - numberNurse;

		// Generates MedicalStaff based on the numbers above
		for (int i = 0; i < numberMedicalStaff; i++) {
			if (i < numberVet) {
				Vet newVet = new Vet(humanName(), staffNumber.getStaffNumber(), salaryGenerator() );
			    myMedicalStaff.add(newVet);
			    myStaff.add(newVet);
			}
			if (i < numberNurse) {
				Nurse newNurse = new Nurse(humanName(), staffNumber.getStaffNumber(), salaryGenerator() );
			    myMedicalStaff.add(newNurse);
			    myStaff.add(newNurse);

			}
			if (i < numberTrainee) {
				Trainee newTrainee = new Trainee(humanName(), staffNumber.getStaffNumber(), salaryGenerator() );
			    myMedicalStaff.add(newTrainee);
			    myStaff.add(newTrainee);
			}
		}
		
		// Generate random numbers for AdminStaff.
		int numberAdminStaff = 10;
		int numberReceptionist = numberAdminStaff - rd.nextInt(numberAdminStaff);
		int numberIT = numberAdminStaff - numberReceptionist;

		// Generates AdminStaff based on the numbers above
		for (int i = 0; i < numberAdminStaff; i++) {
			if (i < numberReceptionist) {
				Receptionist newReceptionist = new Receptionist(humanName(), staffNumber.getStaffNumber(), salaryGenerator(), taskGenerator() );
				myAdminStaff.add(newReceptionist);
			    myStaff.add(newReceptionist);

			}
			if (i < numberIT) {
				IT newIT = new IT(humanName(), staffNumber.getStaffNumber(), salaryGenerator(), taskGenerator() );
				myAdminStaff.add(newIT);
			    myStaff.add(newIT);
			}
		}

	}
	
	// Generates a random age for the pets making sure it is not zero
	// Max age is 16 years
	private int animalAge() {
		int age;
		age = rd.nextInt(16);
			if (age == 0) {
				do {
					age = rd.nextInt(16);
				} while (age == 0);
			}
		return age;
	}
	
	// Generates a random name for the pets
	private String petName() {
		String petName;
		String[] petNames = {"Gigi", "Nibby", "Meggie", "Lacey", "Nana", "Wrigley", "Joy", "Shadow", "Wizard", "Apollo", "Chevy", "Muffin", "BJ", "Nikki", "Munchkin", "sabelle", "Tinker", "Moose", "Clifford", "Porky", "Pooch", "Lexi", "Dylan", "Norton", "Misha", "Barker", "Harley", "Cobweb", "Cyrus", "Michael", "Happyt", "Furball", "Nemo", "Pepe", "Nibbles", "Billie", "Laddie", "Simon", "Erin", "Tinkerbell", "Hudson", "Chance", "Athena", "Skeeter", "Silvester", "Kelly", "Elliot", "Ebony", "Waldo", "Violet", "Romeo", "June", "Daffy", "Charlie", "Kid", "Joe", "Bits", "Pinta", "Kallie", "Macintosh", "Roxanne", "Stinky", "Napoleon", "Gasby", "Monkey", "Pooh Bear", "Hercules", "Kismet", "Yaka", "Pixie", "Rexy", "Poochie", "Lexie", "Birdie", "Woofie", "Barley", "Westie", "Queenie", "Ozzy", "Tally", "Tiny", "Sage", "Maddy", "Maggie-mae", "Holly", "Schotzie", "Bonnie", "Josie", "Miasy", "Midnight", "Bacchus", "Louis", "Rover", "Kelsey", "Goldie", "Peppy", "Aldo", "Brit", "Cosmo", "Freckles"};
		petName = petNames[rd.nextInt(petNames.length)];
		return petName;
	}
	

	// Generates a random name for people
	private String humanName() {
		String name;
		String[] firstNames = {	"Nannie", "Lizzie", "Wilburn", "Stacey", "Colton", "Theron", "Marilyn", "Eugene", "Etta", "Tamika", "Lula", "Rocco", "Fredrick", "Louisa", "Jerrold", "Javier", "Shawn", "Deborah", "Devon", "Lindsey", "Misty", "Ron", "Jefferey", "Mia", "Ethel", "Oscar", "Kevin", "Fannie", "Corinne", "Ronald", "Sebastian", "Gene", "Matthew", "Lenora", "Marla", "Estela", "Sidney", "Tracey", "Deena", "Adolph", "Eugenia", "Marcy", "Deanne", "Patrice", "Waylon", "Diego", "Barton", "Felecia", "Arlene", "Norman"};
		String[] secongNames = {"Burton", "Sims", "Lambert", "Lynn", "Barton", "Garrett", "Wilkerson", "Nunez", "Wilson", "Morgan", "Mccarthy", "Grant", "Everett", "Carney" ,"West", "Barber", "Spence", "Stevenson", "Gilmore", "Cisneros", "Grimes", "Dawson", "Strey", "Stanton", "Reynolds", "Bush", "Mosley", "Faulkner", "Andersen", "Travis", "Rhodes", "Wiley", "Wright", "Kidd", "Wagner", "Barajas", "Boyer", "Li", "Odom", "Norris", "Montgomery", "Hawkins", "Navarro", "Bond", "Hayden", "Puhl", "Mclaughlin", "Hughes", "Yoder"};
		name = firstNames[rd.nextInt(firstNames.length)] + " " + secongNames[rd.nextInt(secongNames.length)];
		return name;
	}
	
	// Generates a random medical condition
	private String medicalCondition() {
		String condition;
		String[] medicalCondition = {"Ear Mites", "Epilepsy", "Heartworm", "Arthritis", "Blindness", "Blood in Urine", "Deafness", "Eating Stool", "Fever", "Leg - Swollen", "Poisoning", "Vomiting"};
		condition = medicalCondition[rd.nextInt(medicalCondition.length)];
		return condition;
	}
	
	// Generates a random task
	private String taskGenerator() {
		String task;
		String[] tasks = {"Working", "On Holidays", "On Break", "Day Off"};
		task = tasks[rd.nextInt(tasks.length)];
		return task;
	}
	
	// Generates a random salary
	private String salaryGenerator() {
		String salary;
		String[] salaries = {"Level 1", "Level 2", "Level 3", "Level 4", "Level 5"};
		salary = salaries[rd.nextInt(salaries.length)];
		return salary;		
	}
	
}
