package virtualpet;

public class VirtualPet {
	 
	private String petName = "";
	private int hunger;
	private int sleepiness;
	private int boredom;
	private int age;
	private int health;

	public VirtualPet( String petName,int hunger, int sleepiness, int boredom, int age, int health) {
		this.petName = petName;
		this.hunger = hunger;
		this.sleepiness = sleepiness;
		System.out.println("Hi! I'm " + petName + " the Dragon!");
		System.out.println("Your pet's stats are: ");
		System.out.println("Hunger: " + hunger + "\nSleepiness " + sleepiness + "\nBoredom " + boredom + "\nAge " + age
				+ "\nHealth " + health);
	}
	
	public int getHunger() {
		return hunger;
	}

	public void feed(int nutritionValue) {
		hunger = hunger + (nutritionValue);
		
		 if (nutritionValue==-1) {
			 System.out.println("Disgusting!!!");
		 }
		 else if (nutritionValue==-5) {
			 System.out.println("Yumm!!!");
			 age = age + 1;
		 }
		 else if(nutritionValue == 0) {
			 System.out.println("Whatever.");
			 health = health -1;
			 
		 }
		 else System.out.println("Thanks for the meal I guess");
		 
		if (hunger <0) {
				System.out.println("I can't eat no more!!");
				hunger = 0;
			}
//		health = health + nutritionValue-sleepiness;
	}

	public void action() {
		System.out.println("What do you want to do? ");
		System.out.println("1. Feed " + petName);
		System.out.println("2. Sing " + petName + " a lullaby");
		System.out.println("3. Play with " + petName);
		System.out.println("4. Do nothing");
		System.out.println("5. Check my stats");
	}

	public int tick() {
			hunger = hunger +2;
			if (hunger>8&& hunger<10) {
				System.out.println("I'm going to go eat a bird or something.");
				hunger = hunger +1;
			}
			boredom = boredom +1;
			sleepiness = sleepiness + 1;
			return hunger;
		
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
		if(hunger>10) {
		return false;
		}
		return true;
	}

}
