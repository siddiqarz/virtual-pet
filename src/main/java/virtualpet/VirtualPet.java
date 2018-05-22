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
		return hunger;
	}

	public void feed(int nutritionValue) {
		hunger = hunger + (nutritionValue);
		if (hunger < 0) {
			hunger = 0;
		}
		// if (nutritionValue == -1) {
		// System.out.println("Disgusting!!!");
		// } else if (nutritionValue == -5) {
		// System.out.println("Yumm!!!");
		// age = age + 1;
		// } else if (nutritionValue == 0) {
		// System.out.println("Sigh, this is junk.");
		// health = health - 1;
		//
		// } else
		// System.out.println("Thanks for the meal I guess");
		//
		// if (hunger < 0) {
		// System.out.println("I can't eat no more!!");
		// hunger = 0;
		// }
		// health = health + nutritionValue-sleepiness;
	}

	public void tick() {
		hunger = hunger + 2;
//		if (hunger > 8 && hunger < 10) {
//			System.out.println("I'm going to go eat a bird or something.");
//			hunger = hunger - 1;
//		}
		boredom = boredom + 3;
		sleepiness = sleepiness + 2;

	}
public int getScore() {
	if (gameScore<0){
		gameScore =0;
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
//			System.out.println("Draw!");
		}
		if (petChoice == 1) {
			if (choice == 2) {
//				System.out.println("I chose rock, you win!");
				gameScore--;
			} else if (choice == 3) {
//				System.out.println("Rawhahaha!");
				gameScore++;
			}
		}
		if (petChoice == 2) {
			if (choice == 1) {
//				System.out.println("I win!!! I chose paper!");
				gameScore++;
			} else if (choice == 3) {
				//System.out.println("Urgh!!!");
				gameScore--;
			}
		}
		if (petChoice == 3) {
			if (choice == 1) {
//				System.out.println("I will win next time!");
				gameScore--;
			} else if (choice == 2) {
				//System.out.println("Yes!!!");
				gameScore++;
			}
		}
		
//		if (win > loose) {
//			System.out.println("I AM THE CHAMPION, ROOAAAAR! *Burns your hair off in excitement* ^_^");
//		} else if (win < loose) {
//			System.out.println("I HATE this game~ T_T");
//			health = health - 2;
//		} else
//			System.out.println("Yay! we're both awesome!");
	}

}
