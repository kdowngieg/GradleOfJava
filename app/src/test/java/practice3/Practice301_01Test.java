package practice3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Practice301_01Test {

	@Test
	void test() {
		Practice301_01 pra = new Practice301_01();
		
		assertSame("Hello", pra.sayHello());
	}

}
