package creatorhelper;

import java.util.ArrayList;
import java.util.Random;

import adminstaff.*;
import medicalstaff.*;
import animals.*;
import staff.*;

public class CreatorHelper {
	
	public static ArrayList<Animal> myAnimals = new ArrayList<Animal>();
	public static ArrayList<Staff> myStaff = new ArrayList<Staff>();
	public static ArrayList<MedicalStaff> myMedicalStaff = new ArrayList<MedicalStaff>();
	public static ArrayList<AdminStaff> myAdminStaff = new ArrayList<AdminStaff>();
	StaffNumber staffNumber = new StaffNumber();
	Random rd = new Random();


	public void generate() {

		// Generate random numbers of each species.
		int numberAnimals = 100;
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
		
		
		int numberAdminStaff = 10;
		int numberReceptionist = 5;
		int numberIT = 5;

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
	
	// Generates a random age for the pets and make sure it is not zero
	// Max age is 14 years
	private int animalAge() {
		int age;
		age = rd.nextInt(16);
			if (age == 0) {
				do {
					age = rd.nextInt(14);
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
		String[] firstNames = {"Guilherme", "Marnie", "Diogo", "Wilbur", "Keri", "Nikki", "Jonny", "Tomas", "Aoife", "Katerina", "Nancy", "Eryk", "Amy", "Alissa", "Micheal"};
		String[] secongNames = {"Strey", "Nascimento", "Muterle", "Watt", "Rose", "Gordon", "Burris", "Thompson", "Larsen", "McCartney", "Boyle"};
		name = firstNames[rd.nextInt(firstNames.length)] + " " + secongNames[rd.nextInt(secongNames.length)];
		return name;
	}
	
	//Generates a random medical condition
	private String medicalCondition() {
		String condition;
		String[] medicalCondition = {"Ear Mites", "Epilepsy", "Heartworm", "Arthritis", "Blindness", "Blood in Urine", "Deafness", "Eating Stool", "Fever", "Leg - Swollen", "Poisoning", "Vomiting"};
		condition = medicalCondition[rd.nextInt(medicalCondition.length)];
		return condition;
	}
	
	//Generates a random task
	private String taskGenerator() {
		String task;
		String[] tasks = {"Making Phone Calls", "On Holidays", "On Lunch"};
		task = tasks[rd.nextInt(tasks.length)];
		return task;
	
	}
	
	private String salaryGenerator() {
		String salary;
		String[] salaries = {"Level 1", "Level 2", "Level 3", "Level 4", "Level 5"};
		salary = salaries[rd.nextInt(salaries.length)];
		return salary;	
		
	}

}
