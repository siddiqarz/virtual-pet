import org.junit.Test;

import virtualpet.VirtualPet;

public class VirtualPetTest {
@Test
public void petGetsBoredAfter2mins() {
	VirtualPet underTest = new VirtualPet();
	long timeToGetBored = underTest.tick();
}
}
