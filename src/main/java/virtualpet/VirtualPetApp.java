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
		dragon.petStats(hunger, sleepiness, boredom, age, health);
		//tick starts here?
		dragon.action();
		
	}

}
