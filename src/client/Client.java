package client;

import java.util.ArrayList;
import java.util.Random;

import animals.*;
import staff.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd = new Random();
		StaffNumber staffNumber = new StaffNumber();
		ArrayList<Animal> myAnimals = new ArrayList<Animal>();
		//Dog names:
		String[] names = {"Gigi", "Nibby", "Meggie", "Lacey", "Nana", "Wrigley", "Joy", "Shadow", "Wizard", "Apollo", "Chevy", "Muffin", "BJ", "Nikki", "Munchkin", "sabelle", "Tinker", "Moose", "Clifford", "Porky", "Pooch", "Lexi", "Dylan", "Norton", "Misha", "Barker", "Harley", "Cobweb", "Cyrus", "Michael", "Happyt", "Furball", "Nemo", "Pepe", "Nibbles", "Billie", "Laddie", "Simon", "Erin", "Tinkerbell", "Hudson", "Chance", "Athena", "Skeeter", "Silvester", "Kelly", "Elliot", "Ebony", "Waldo", "Violet", "Romeo", "June", "Daffy", "Charlie", "Kid", "Joe", "Bits", "Pinta", "Kallie", "Macintosh", "Roxanne", "Stinky", "Napoleon", "Gasby", "Monkey", "Pooh Bear", "Hercules", "Kismet", "Yaka", "Pixie", "Rexy", "Poochie", "Lexie", "Birdie", "Woofie", "Barley", "Westie", "Queenie", "Ozzy", "Tally", "Tiny", "Sage", "Maddy", "Maggie-mae", "Holly", "Schotzie", "Bonnie", "Josie", "Miasy", "Midnight", "Bacchus", "Louis", "Rover", "Kelsey", "Goldie", "Peppy", "Aldo", "Brit", "Cosmo", "Freckles"};
		String[] condition = {"fine", "sick", "dead"};
		
		//Create 50 animals
		for (int i = 0; i < 1; i++) {
			Cat newCat = new Cat(names[rd.nextInt(names.length)], rd.nextInt(14), condition[rd.nextInt(condition.length)]);
			Dog newDog = new Dog(names[rd.nextInt(names.length)], rd.nextInt(14), condition[rd.nextInt(condition.length)]);
			Rabbit newRabbit = new Rabbit(names[rd.nextInt(names.length)], rd.nextInt(14), condition[rd.nextInt(condition.length)]);
			myAnimals.add(newCat);
			myAnimals.add(newDog);
			myAnimals.add(newRabbit);
		}
		
		System.out.println(myAnimals);
		System.out.println(myAnimals.get(1).age);
		System.out.println(myAnimals.size());


		
	}

	private static void printArray(Animal[] myAnimals) {
			
			String toPrint = "[ ";
			for (int i = 0; i < myAnimals.length; i++) {
				toPrint += myAnimals[i] + " ";
				
			}
			toPrint += "]";
			System.out.println(toPrint);
	}
			
	private static void printArray(Staff[] myStaff) {
		
		String toPrint = "[ ";
		for (int i = 0; i < myStaff.length; i++) {
			toPrint += myStaff[i] + " ";
			
		}
		toPrint += "]";
		System.out.println(toPrint);		
		
	}
		
}

//ArrayList<Animal> myAnimals = new ArrayList<Animal>();
//Animal[] myAnimals;
//myAnimals = new Animal[4];
//Staff[] myStaff;
//myStaff = new Staff[10];





//for(int i = 0; i < myAnimals.length; i++) {
//	myAnimals[i] = new Cat(names[rd.nextInt(names.length)], rd.nextInt(14), condition[rd.nextInt(condition.length)]);
//	//myAnimals[i] = new Dog(names[rd.nextInt(names.length)], rd.nextInt(14), condition[rd.nextInt(condition.length)]);


//}
//printArray(myAnimals);
	

//for(int i = 0; i < myStaff.length; i++) {
//	myStaff[i] = new Vet(names[rd.nextInt(names.length)], staffNumber.getStaffNumber(), 1);
	//myAnimals[i] = new Dog(names[rd.nextInt(names.length)], rd.nextInt(14), condition[rd.nextInt(condition.length)]);
//}
//printArray(myStaff);
	



