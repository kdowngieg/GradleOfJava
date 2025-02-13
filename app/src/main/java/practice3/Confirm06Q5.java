package practice3;

public class Confirm06Q5 {

	public static void main(String[] args) {
		
		int x = -64;
		
		System.out.println("xの4倍：" + (x << 2));
		System.out.println("xの1/8：" + (x >> 3));
	}
	
	public int conQ5() {
		int x = 64;
		
		return x << 2;
	}
}
