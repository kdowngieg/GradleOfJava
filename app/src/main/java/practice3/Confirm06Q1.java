package practice3;

public class Confirm06Q1 {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		int z;
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("入れ替え後のx：" + x);
		System.out.println("入れ替え後のy：" + y);
	}

	public int conQ1() {
		int x = 5;
		int y = 10;
		int z = x;
		
		x = y;
		y = z;
		
		return x;
	}
}
