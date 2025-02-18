package practice3;

public class Practice306_01 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		x = 11;
		y = x % 2;
		
		var pra = new Practice306_01();
		String ans = pra.pra306_01(y);
		
		System.out.println(ans);
	}
	
	public String pra306_01(int x) {
		if(x == 0) {
			return "xは偶数です。";
		}else {
			return "xは奇数です。";
		}
	}
}
