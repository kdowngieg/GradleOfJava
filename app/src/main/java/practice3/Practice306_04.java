package practice3;

public class Practice306_04 {

	public static void main(String[] args) {
		
		System.out.println(Practice306_04.pra());
	}

	public static int pra() {
		int total = 0;
		
		for (int times = 1; times <= 100; times++) {
			total = total + times;
		}
		
		return total;
	}
}
