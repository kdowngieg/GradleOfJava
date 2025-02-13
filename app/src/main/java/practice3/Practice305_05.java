package practice3;

public class Practice305_05 {

	public static void main(String[] args) {
		
		int x;
		int y;
		boolean z;
		
		x = 10;
		y = 5;
		
		z = x > y;
		System.out.println(z);
		
		z = x < y;
		System.out.println(z);
		
		y = 10;
		z = x > y;
		System.out.println(z);
		
		z = x >= y;
		System.out.println(z);
		
		z = x == y;
		System.out.println(z);
		
		z = x != y;
		System.out.println(z);
	}

	public boolean pra305_05() {
		int x = 10;
		
		return x > 5;
	}
}
