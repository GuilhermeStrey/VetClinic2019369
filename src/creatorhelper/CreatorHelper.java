package creatorhelper;

import java.util.ArrayList;
import java.util.Random;
import medicalstaff.*;
import animals.*;
import staff.*;

public class CreatorHelper {
	
	ArrayList<Animal> myAnimals = new ArrayList<Animal>();
	ArrayList<MedicalStaff> myMedicalStaff = new ArrayList<MedicalStaff>();



	public CreatorHelper() {
		
		// Declaring random function
		Random rd = new Random();
		
		// Generate random numbers of each species.
		int numberAnimals = 10;
		int numberDogs = numberAnimals - rd.nextInt(numberAnimals);
		int numberCats = numberAnimals - numberDogs - rd.nextInt(numberAnimals - numberDogs);
		int numberRabbits = numberAnimals - numberDogs - numberCats;

		System.out.println("Number of Dogs: " + numberDogs);
		System.out.println("Number of Cats: " + numberCats);
		System.out.println("Number of Rabits: " + numberRabbits);


		//Pet names:
		String[] petNames = {"Gigi", "Nibby", "Meggie", "Lacey", "Nana", "Wrigley", "Joy", "Shadow", "Wizard", "Apollo", "Chevy", "Muffin", "BJ", "Nikki", "Munchkin", "sabelle", "Tinker", "Moose", "Clifford", "Porky", "Pooch", "Lexi", "Dylan", "Norton", "Misha", "Barker", "Harley", "Cobweb", "Cyrus", "Michael", "Happyt", "Furball", "Nemo", "Pepe", "Nibbles", "Billie", "Laddie", "Simon", "Erin", "Tinkerbell", "Hudson", "Chance", "Athena", "Skeeter", "Silvester", "Kelly", "Elliot", "Ebony", "Waldo", "Violet", "Romeo", "June", "Daffy", "Charlie", "Kid", "Joe", "Bits", "Pinta", "Kallie", "Macintosh", "Roxanne", "Stinky", "Napoleon", "Gasby", "Monkey", "Pooh Bear", "Hercules", "Kismet", "Yaka", "Pixie", "Rexy", "Poochie", "Lexie", "Birdie", "Woofie", "Barley", "Westie", "Queenie", "Ozzy", "Tally", "Tiny", "Sage", "Maddy", "Maggie-mae", "Holly", "Schotzie", "Bonnie", "Josie", "Miasy", "Midnight", "Bacchus", "Louis", "Rover", "Kelsey", "Goldie", "Peppy", "Aldo", "Brit", "Cosmo", "Freckles"};
		String[] medicalCondition = {"Ear Mites", "Epilepsy", "Heartworm", "Arthritis", "Blindness", "Blood in Urine", "Deafness", "Eating Stool", "Fever", "Leg - Swollen", "Poisoning", "Vomiting"};
		
		//Create random number of animals
		for (int i = 0; i < numberAnimals; i++) {
			if (i < numberCats) {
				Cat newCat = new Cat(petName(), animalAge(), medicalCondition[rd.nextInt(medicalCondition.length)]);
				myAnimals.add(newCat);
			}
			if (i < numberDogs) {
				Dog newDog = new Dog(petName(), animalAge(), medicalCondition[rd.nextInt(medicalCondition.length)]);
				myAnimals.add(newDog);
			}
			if (i < numberRabbits) {
				Rabbit newRabbit = new Rabbit(petName(), animalAge(), medicalCondition[rd.nextInt(medicalCondition.length)]);
				myAnimals.add(newRabbit);
			}
		}
		
		System.out.println(myAnimals);
		//System.out.println(myAnimals.get(1).age);
		//System.out.println(myAnimals.size());
		//System.out.println(myAnimals.get(1).specie);
		
		
		StaffNumber staffNumber = new StaffNumber();
		
		
		int numberMedicalStaff = 30;
		int numberVet = 5;
		int numberNurse = numberMedicalStaff - numberVet - rd.nextInt(numberMedicalStaff - numberVet);
		int numberTrainee = numberMedicalStaff - numberVet - numberNurse;

		for (int i = 0; i < numberMedicalStaff; i++) {
			if (i < numberVet) {
				Vet newVet = new Vet(humanName(), staffNumber.getStaffNumber(), 0 );
			    myMedicalStaff.add(newVet);
			}
			if (i < numberNurse) {
				Nurse newNurse = new Nurse(humanName(), staffNumber.getStaffNumber(), 0 );
			    myMedicalStaff.add(newNurse);
			}
			if (i < numberTrainee) {
				Trainee newTrainee = new Trainee(humanName(), staffNumber.getStaffNumber(), 0 );
			    myMedicalStaff.add(newTrainee);
			}
		}
		System.out.println(myMedicalStaff);
		System.out.println(myMedicalStaff.get(0));
		System.out.println(myMedicalStaff.get(0).getType());
//		
	
	}
	
	// Generates a random age for the pets and make sure it is not zero
	// Max age is 14 years
	public int animalAge() {
		int age;
		Random rd = new Random();
		age = rd.nextInt(16);
			if (age == 0) {
				do {
					age = rd.nextInt(14);
				} while (age == 0);
			}
		return age;
	}
	// Generates a random name for the pets
	public String petName() {
		Random rd = new Random();
		String petName;
		String[] petNames = {"Gigi", "Nibby", "Meggie", "Lacey", "Nana", "Wrigley", "Joy", "Shadow", "Wizard", "Apollo", "Chevy", "Muffin", "BJ", "Nikki", "Munchkin", "sabelle", "Tinker", "Moose", "Clifford", "Porky", "Pooch", "Lexi", "Dylan", "Norton", "Misha", "Barker", "Harley", "Cobweb", "Cyrus", "Michael", "Happyt", "Furball", "Nemo", "Pepe", "Nibbles", "Billie", "Laddie", "Simon", "Erin", "Tinkerbell", "Hudson", "Chance", "Athena", "Skeeter", "Silvester", "Kelly", "Elliot", "Ebony", "Waldo", "Violet", "Romeo", "June", "Daffy", "Charlie", "Kid", "Joe", "Bits", "Pinta", "Kallie", "Macintosh", "Roxanne", "Stinky", "Napoleon", "Gasby", "Monkey", "Pooh Bear", "Hercules", "Kismet", "Yaka", "Pixie", "Rexy", "Poochie", "Lexie", "Birdie", "Woofie", "Barley", "Westie", "Queenie", "Ozzy", "Tally", "Tiny", "Sage", "Maddy", "Maggie-mae", "Holly", "Schotzie", "Bonnie", "Josie", "Miasy", "Midnight", "Bacchus", "Louis", "Rover", "Kelsey", "Goldie", "Peppy", "Aldo", "Brit", "Cosmo", "Freckles"};
		petName = petNames[rd.nextInt(petNames.length)];
		return petName;
	}
	
	public String humanName() {
		Random rd = new Random();
		String name;
		String[] firstNames = {"Guilherme", "João", "Paula", "Teste"};
		String[] secongNames = {"Strey", "Nascimento", "Muterle", "Pinto"};
		name = firstNames[rd.nextInt(firstNames.length)] + " " + secongNames[rd.nextInt(secongNames.length)];
		return name;
	}


}
