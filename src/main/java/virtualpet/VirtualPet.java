package virtualpet;

public class VirtualPet {

	private int hunger;
	private int sleepiness;
	private int boredom;
	private int age;
	private int health;
	public int gameScore;

	public VirtualPet(int hunger, int sleepiness, int boredom, int age, int health) {
		this.hunger = hunger;
		this.sleepiness = sleepiness;
		this.boredom = boredom;
		this.health = health;
	}

	public void feed(int nutritionValue) {

		hunger = hunger + (nutritionValue);

		if (nutritionValue == 0) {
			health = health - 2;
		}
		if (hunger < 0) {
			hunger = 0;
		}
	}

	public int getHunger() {
		if (hunger > 10) {
			hunger = 10;
		}
		return hunger;
	}

	public int getSleepiness() {
		if (sleepiness > 10) {
			sleepiness = 10;
		}
		if (sleepiness < 0) {
			sleepiness = 0;
		}
		return sleepiness;
	}

	public void playGame1(int choice, int petChoice) {
		// Rock Paper Scissors

		if (choice == petChoice) {

		}
		if (petChoice == 1) {
			if (choice == 2) {

				// gameScore--;
			} else if (choice == 3) {

				gameScore++;
			}
		}
		if (petChoice == 2) {
			if (choice == 1) {

				gameScore++;
			} else if (choice == 3) {

				// gameScore--;
			}
		}
		if (petChoice == 3) {
			if (choice == 1) {

				// gameScore--;
			} else if (choice == 2) {

				gameScore++;
			}
		}

	}

	public int getScore() {
		if (gameScore == 2) {
			health = health - 1;
			sleepiness = sleepiness + 2;
			boredom = boredom +1;
		}
		if (gameScore == 3) {
			health = health - 2;
			boredom = boredom +2;
		}
		if (gameScore < 2) {
			health = health + 2;
			boredom = boredom -4;
		}
		return gameScore;
	}

	public int getBoredom() {
		if (boredom > 10) {
			boredom = 10;
			boredom = boredom - 5;
		}
		
		if (boredom < 0) {
			boredom = 0;
		}
		return boredom;
	}

	public void singToSleep() {
		sleepiness = sleepiness - 5;
		boredom = boredom - 2;
		health = health + 1;
	}

	public int getAge() {
		return age;
	}

	public int getHealth() {
		if (health > 10) {
			health = 10;
		}
		if (hunger == 10) {
			health = health - 2;
		}
		return health;
	}

	public boolean notDead() {
		if (hunger == 10 && health <= 2) {
			return false;
		}
		return true;
	}

	public void getVet(int medChoice) {
		if (medChoice == 1) {
			health = health + 3;
		}
		if (medChoice == 2) {
			health = health + 2;
		}
		if (medChoice == 3) {
			health = health - 1;
		}
	}

	public void doNothing() {
		boredom = boredom + 1;
		sleepiness = sleepiness + 1;
		hunger = hunger +1;
	}

	public void tick() {
		hunger = hunger + 2;
		// if (hunger > 8 && hunger < 10) {
		// System.out.println("I'm going to go eat a bird or something.");
		// hunger = hunger - 1;
		// }
		boredom = boredom + 2;
		sleepiness = sleepiness + 1;
		age = age + 1;

	}
}
