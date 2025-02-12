package practice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Confirm02Q3Test {

	@Test
	void testConQ3() {
		Confirm02Q3 con = new Confirm02Q3();
		assertSame("Javaの勉強頑張ります!!", con.conQ3());
	}

}
