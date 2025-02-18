package practice3;

public class Practice306_06 {

	public static void main(String[] args) {
		System.out.println(Practice306_06.sum());
	}

	public static int sum() {
		int times = 1;
		int total = 0;
		
		do {
			total += times;
			times++;
		}while (times <= 100);
		
		return total;
	}
}
