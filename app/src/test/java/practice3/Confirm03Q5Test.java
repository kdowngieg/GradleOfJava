package practice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Confirm03Q5Test {

	@Test
	void testConQ3() {
		Confirm03Q5 con = new Confirm03Q5();
		
		assertEquals(12.5, con.conQ3(), 0.1);
	}

}
