package virtualpet;

public class VirtualPet {
//long startTime = System.nanoTime();
//long estimatedTime = System.nanoTime()-startTime;
private String petName = "";
public VirtualPet(String petName){
	this.petName= petName;
	System.out.println(petName + " the Dragon");
}
public void petStats(int hunger, int sleepiness, int boredom,int age, int health) {
	System.out.println("Your pet's stats are: ");
	System.out.println("hunger: " + hunger+ "\nsleepiness " + sleepiness +
	"\nboredom " + boredom + "\nage " + age + "\nhealth " + health);
}
public void hunger() {
	
}
public void action() {
	System.out.println("What do you want to do? ");
	System.out.println("1. Feed " + petName);
	System.out.println("2. Sing " + petName + " a lullaby");
	System.out.println("3. Play with " + petName);
System.out.println("4. Do nothing");	
}

}
