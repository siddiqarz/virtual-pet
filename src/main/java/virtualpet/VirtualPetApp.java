package virtualpet;

import java.util.Random;
import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		//ask user to name their pet 
		System.out.println("Please name your Dragon: ");
		//Store pet name
		String petName = input.nextLine();
		VirtualPet dragon = new VirtualPet(petName);
		
		//create random numbers to assign to initialize pet stats
		Random rand = new Random();
		int hunger = rand.nextInt(10) +1;
		int sleepiness = rand.nextInt(10) +1;
		int boredom = rand.nextInt(10) +1;
		int age = 0;
		int health = 10;
		
		//tick starts here?
		dragon.petStats(hunger, sleepiness, boredom, age, health);
		dragon.action();
		int newAction = input.nextInt();
		int foodValue;
		if (newAction == 1) {
			dragon.hunger(newAction);
			int foodType = input.nextInt();
			switch (foodType) {
			case 1: foodValue = -1;
			case 2: foodValue = 5;
			case 3: foodValue = -5;
			case 4: foodValue = 3;
			case 5: foodValue = 1;
			default: foodValue = 0;
			}
			dragon.feed(foodValue);
			dragon.petStats(hunger, sleepiness, boredom, age, health);
		}
	}

}
