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

	public int getHunger() {
		if (hunger >8 && hunger <10) {
			hunger = hunger -1;
		}
		return hunger;
	}

	public void feed(int nutritionValue) {
		if (nutritionValue ==0) {
			health = health -2;
		}
		hunger = hunger + (nutritionValue);
		if (hunger < 0) {
			hunger = 0;
		}
		if (hunger>6) {
			health = health-2;
		}
	}

	public void tick() {
		hunger = hunger + 2;
		// if (hunger > 8 && hunger < 10) {
		// System.out.println("I'm going to go eat a bird or something.");
		// hunger = hunger - 1;
		// }
		boredom = boredom + 3;
		sleepiness = sleepiness + 2;
		age = age+1;

	}

	public int getScore() {
		if (gameScore == 2) {
			//health = health + 1;
		}
		if (gameScore ==3 ) {
	//
		}
		if (gameScore <2) {
			
		}
		return gameScore;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getSleepiness() {
		return sleepiness;
	}

	public int getAge() {
		return age;
	}

	public int getHealth() {
		if (health>10){
			health = 10;
		}
		return health;
	}

	public boolean notDead() {
		if (hunger > 10) {
			return false;
		}
		return true;
	}

	public void singToSleep() {
		sleepiness = sleepiness - 2;
		boredom = boredom - 1;
		health = health + 1;
	}

	public void playGame1(int choice, int petChoice) {
		// Rock Paper Scissors

		if (choice == petChoice) {

		}
		if (petChoice == 1) {
			if (choice == 2) {

				//gameScore--;
			} else if (choice == 3) {

				gameScore++;
			}
		}
		if (petChoice == 2) {
			if (choice == 1) {

				gameScore++;
			} else if (choice == 3) {

				//gameScore--;
			}
		}
		if (petChoice == 3) {
			if (choice == 1) {

				//gameScore--;
			} else if (choice == 2) {

				gameScore++;
			}
		}

	}

	public void doNothing() {
boredom = boredom +2;
sleepiness = sleepiness + 2;
	}

}
