package practice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Confirm04Q1Test {

	@Test
	void testConQ1() {
		Confirm04Q1 con = new Confirm04Q1();
		
		assertEquals("ね言ったとおりでしょ!!", con.conQ1());
	}

}
