package virtualpet;

import java.util.Random;
import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// ask user to name their pet
		System.out.println("Choose a name for your Dragon: ");
		// Store pet name
		String petName = input.nextLine();

		// create random numbers to assign to initialize pet stats
		Random rand = new Random();
		int hunger = rand.nextInt(5) + 1;
		int sleepiness = rand.nextInt(10) + 1;
		int boredom = rand.nextInt(10) + 1;
		int age = 0;
		int health = 10;
		
		//call out initial stats
		VirtualPet dragon = new VirtualPet(petName, hunger, sleepiness, boredom, age, health);
		
		
		//loops while pet is alive
		while (hunger != 10 && health != 0) {
			dragon.action();
			int newAction = input.nextInt();
			int nutritionValue;
			int foodType = 0;
			
			if (newAction == 1) {
				System.out.println("What would you like to give " + petName);
				System.out.println("1. Apple\n2. Sheep\n3. Grass\n4. Fish\n5. Rice\n6. Candy ");
				foodType = input.nextInt();
			switch (foodType) {
			case 1:
				nutritionValue = -1;
				break;
			case 2:
				nutritionValue = -5;
				break;
			case 3:
				nutritionValue = -1;
				break;
			case 4:
				nutritionValue = -3;
				break;
			default:
				nutritionValue = 0;
			}
			dragon.feed(nutritionValue);
			System.out.println("My hunger level is now: " + dragon.getHunger());
			}
			if(newAction == 4) {
				if(dragon.getHunger()>5) {
			System.out.println("I'm hungry");
				}
				else if (dragon.getBoredom()>5) {
					System.out.println("So boooring, my buddy!");
				}
				else if (dragon.getSleepiness()>8) {
					System.out.println("*Yawn!*, I can't keep my eyes open.");
				}
				else System.out.println("*Takes off and burns everything to a crisp*");
			}
		dragon.tick();
		if(newAction == 5) {
			System.out.println("Updated Pet Stats: " + "\nHunger: " + dragon.getHunger() + "\nSleepiness: " + 
					dragon.getSleepiness()+ "\nBoredom: " + dragon.getBoredom() + "\nAge: " + dragon.getAge() + "\nHealth: " + dragon.getHealth() );
		}
		
		}
	}

}
