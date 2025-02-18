package practice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Practice306_03Test {

	@Test
	void testOmikuji() {
		var pra = new Practice306_03();
		
		assertEquals("大吉!", pra.omikuji(99));
		assertEquals("中吉!", pra.omikuji(88));
		assertEquals("小吉!", pra.omikuji(77));
		assertEquals("吉!", pra.omikuji(0));
	}

}
