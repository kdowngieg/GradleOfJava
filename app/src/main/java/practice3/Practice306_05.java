package practice3;

public class Practice306_05 {

	public static void main(String[] args) {
		var pra = new Practice306_05();
		
		System.out.println(pra.sum());
	}
	
	public static int sum() {
		int total = 0;
		int times = 1;
		
		while(times <= 100) {
			total = total + times;
			times++;
		}
		
		return total;
	}
}
