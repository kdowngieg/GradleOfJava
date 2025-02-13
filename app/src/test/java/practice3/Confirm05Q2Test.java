package practice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Confirm05Q2Test {

	@Test
	void testConQ2() {
		int[] a = {100, 200, 300, 600};
		
		assertArrayEquals(a, Confirm05Q2.conQ2());
	}

}
