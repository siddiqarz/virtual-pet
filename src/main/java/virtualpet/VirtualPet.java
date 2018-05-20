package virtualpet;

public class VirtualPet {
	// long startTime = System.nanoTime();
	// long estimatedTime = System.nanoTime()-startTime;
	private String petName = "";
	public int hunger;
	public int sleepiness;
	public int boredom;
	public int age;
	public int health;

	public VirtualPet(String petName) {
		this.petName = petName;
		System.out.println(petName + " the Dragon");
	}

	public void petStats(int hunger, int sleepiness, int boredom, int age, int health) {
		this.hunger = hunger;
		this.sleepiness = sleepiness;
		this.boredom = boredom;
		this.age = age;
		this.health = health;
		System.out.println("Your pet's stats are: ");
		System.out.println("hunger: " + hunger + "\nsleepiness " + sleepiness + "\nboredom " + boredom + "\nage " + age
				+ "\nhealth " + health);
	}
public void hunger(int foodType) {
	System.out.println("What would you like to give " + petName);
	System.out.println("1. Apple\n2. Sheep\n3. Grass\n4. Fish\n5. Rice ");
}
	public int feed(int nutritionValue) {
		 hunger = hunger + nutritionValue;
		 if (nutritionValue<0) {
			 System.out.println("Disgusting!");
		 }
		 else if (nutritionValue<5) {
			 System.out.println("Thanks for the meal. I guess.");
		 }
		 else if(nutritionValue == 0) {
			 System.out.println("Whatever.");
			 
		 }
		 else System.out.println("Yuum!!!");
		 return hunger;
//		health = health + nutritionValue-sleepiness;
	}

	public void action() {
		System.out.println("What do you want to do? ");
		System.out.println("1. Feed " + petName);
		System.out.println("2. Sing " + petName + " a lullaby");
		System.out.println("3. Play with " + petName);
		System.out.println("4. Do nothing");
	}

}
