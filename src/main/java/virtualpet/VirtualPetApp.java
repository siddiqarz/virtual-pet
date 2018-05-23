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

		// pass in initial stats
		VirtualPet dragon = new VirtualPet(hunger, sleepiness, boredom, age, health);

		System.out.println("Hi! I'm " + petName + " the Dragon!");
		// loops while pet is alive

		while (dragon.notDead()) {
			// call updated stats everytime loop runs from beginning
			System.out.println("Your pet's stats are: ");
			System.out.println("Hunger: " + dragon.getHunger() + "\nSleepiness " + dragon.getSleepiness() + "\nBoredom "
					+ dragon.getBoredom() + "\nAge " + dragon.getAge() + "\nHealth " + dragon.getHealth());

			System.out.println("What do you want to do?\n1. Feed " + petName + "\n2. Sing " + petName
					+ " a lullaby\n3. Play with " + petName + "\n4. Take " + petName + " to vet\n5. Do nothing");
			int newAction = input.nextInt();

			while (newAction < 1 || newAction > 5) {
				System.out.println("Please choose from the following numbers: ");
				System.out.println("What do you want to do?\n1. Feed " + petName + "\n2. Sing " + petName
						+ " a lullaby\n3. Play with " + petName + "\n4. Take " + petName + " to vet\n5. Do nothing");
				newAction = input.nextInt();
			}

			int nutritionValue;
			int foodType = 0;
			// feeding pet
			if (newAction == 1) {
				System.out.println("What would you like to give " + petName);
				System.out.println("1. Apple\n2. Sheep\n3. Grass\n4. Fish\n5. Rice\n6. Candy ");
				foodType = input.nextInt();

				while (foodType < 1 || foodType > 6) {
					System.out.println("Please choose from the provided options: ");
					System.out.println("What would you like to give " + petName);
					System.out.println("1. Apple\n2. Sheep\n3. Rice\n4. Fish\n5. Grass\n6. Candy ");
					foodType = input.nextInt();
				}
				// Nutritional value of each food type.
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

				// makes changes to new hunger level based on nutrition value.
				dragon.feed(nutritionValue);

				if (nutritionValue == -1) {
					System.out.println("Disgusting!!!");
				} else if (nutritionValue == -5) {
					System.out.println("Yumm!!!");

				} else if (nutritionValue == 0) {
					System.out.println("Sigh, this is junk.");

				} else
					System.out.println("Thanks for the meal I guess");

				// continues to loop if user insists on feeding pet while pet is full.
				while (dragon.getHunger() == 0 && newAction == 1) {
					System.out.println("My hunger level is now: " + dragon.getHunger());
					System.out.println("Please don't feed me anymore.");
					System.out.println("What do you want to do?\n1. Feed " + petName + "\n2. Sing " + petName
							+ " a lullaby\n3. Play with " + petName + "\n4. Take " + petName
							+ " to vet\n5. Do nothing");

					newAction = input.nextInt();
				}

			}
			if (newAction == 2) {
				if ((dragon.getSleepiness()) <= 0) {
					System.out.println("I am not sleepy. Shut it or I will burn your face off.");
				} else {
					System.out.println("Twinkle Twinkle little star...");
					dragon.singToSleep();
				}
			}

			if (newAction == 3) {
				System.out.println("What game do you want to play?\n1. Rock, Paper, Scissors \n2. Battle another Pet");
				int gamePick = input.nextInt();
				if (gamePick == 1) {
					int i = 0;
					int choice;
					int petChoice;
					System.out.println("Let's play a game of 3!");
					while (i < 3) {

						System.out.println("Choose your weapon:\n1. Rock\n2. Paper\n3. Scissors");

						// Stores user input
						choice = input.nextInt();
						petChoice = rand.nextInt(3) + 1;

						while (choice > 3 || choice < 1) {
							System.out.println("You need to choose between 1 and 3");
							System.out.println("1. Rock\n2. Paper\n3. Scissors");
							choice = input.nextInt();
						}

						dragon.playGame1(choice, petChoice);
						i++;
					}

					System.out.println("Your score out of 3 is " + dragon.getScore());
					if (dragon.getScore() < 2) {
						System.out.println("Rawhaha!!! I win!");
					} else {
						System.out.println("I hate this game!");
					}
				} else {
					System.out.println("Ok, let's battle then!");
					// dragon.playGame2();
				}
			}
			if (newAction == 4) {
				System.out.println("Pick your poison:\n1. Injection\n2. Pills\n3. No medication");
				int medChoice = input.nextInt();

				while (medChoice > 3 || medChoice < 1) {
					System.out.println("Please pick from the listed choices");
					System.out.println("Pick your poison: \n1. Injection\2. Pills\3. No medication");
					medChoice = input.nextInt();
				}
				dragon.getVet(medChoice);
				if (medChoice == 1) {
					System.out.println("Nooooo!!!! *Gets poked, burns vet, goes on a rampage*");
				} else if (medChoice == 2) {
					System.out.println("These taste gross, but I feel better.");
				} else {
					System.out.println("I.AM.GOING.TO.DIE.");
				}

			}
			if (newAction == 5) {
				dragon.doNothing();
		if (dragon.getBoredom() == 10) {
					System.out.println("So boooring, I'm going to take a nap");
				} else if (dragon.getSleepiness() > 8 && dragon.getHunger() <8) {
					System.out.println("*Yawn!*, I can't keep my eyes open.");
				} else
					System.out.println(petName + "*Takes off and burns everything to a crisp*");
			}

	
			if (dragon.getHunger() == 8) {
				System.out.println("I'm hungry! I'll go roast a bird.");
				dragon.feed(-1);
			}
			if (dragon.getBoredom()>7) {
				System.out.println("Why don't you play with me?");
			}
			if (dragon.getHealth() > 2 && dragon.getHealth() < 5 && dragon.getSleepiness() > 5) {
				System.out.println("*Coughs sparks* I feel hot.");
				if (dragon.getHunger() > 6) {
					System.out.println("Feed me. Maybe?");
				}
				if (dragon.getSleepiness() > 5 && dragon.getHunger() < 6) {
					System.out.println("I think I need to rest.");
				}
			}
			dragon.getHunger(); 
			dragon.getHealth();
			dragon.tick();
		}
		System.out.println("You murderer! R.I.P " + petName);
	}

}
