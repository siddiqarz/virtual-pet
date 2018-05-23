import static org.junit.Assert.assertTrue;

import org.junit.Test;

import virtualpet.VirtualPet;

public class VirtualPetTest {
	@Test
	public void canCreatePet() {
		VirtualPet underTest = new VirtualPet(0, 0, 0, 0, 0);
	}

	@Test
	public void hasHunger() {
		VirtualPet underTest = new VirtualPet(0, 0, 0, 0, 0);
		int hunger = underTest.getHunger();
	}

	@Test
	public void getsHungryOverTime() {
		VirtualPet underTest = new VirtualPet(0, 0, 0, 0, 0);
		int hungerBefore = underTest.getHunger();
		underTest.tick();
		int hungerAfter = underTest.getHunger();
		assertTrue(hungerBefore < hungerAfter);
	}

	@Test
	public void isLessHungryWhenFed() {
		VirtualPet underTest = new VirtualPet(4, 0, 0, 0, 0);
		int hungerBefore = underTest.getHunger();
		underTest.feed(-1);
		int hungerAfter =underTest.getHunger();
		assertTrue(hungerBefore>hungerAfter);
	}
}
