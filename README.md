**Virtual Pet Project**

	*Has a VirtualPet class
	*VirtualPetApp class with main method
	*Has a tick() method to represent passage of time. This would update instance variables of hunger, boredom, sleepiness and age. 

	How it works: 
		Loop runs while the pet is alive. Pet dies when health is less than or equal to two and hunger is greater than or equal to ten. 
		It asks the user what they want to do: Feed, Sing, Play with, Take to vet, Do nothing, Quit.

	*Attributes*
		*Hunger
		*Sleepiness
		*Boredom
		*Age
		*Health

	*Matching instance variables*
		*Feed - Decreases hunger based on nutritional value of food. If the value is zero, pet's health decreases. 
		*Sleep - makes boredom go down and increases health of pet. 
		*Vet - make sickness go down unless no medication is chosen, then health goes down. 
		*Play - Losing decreases health, increases sleepiness and boredom. 

