package practice3;

public class Practice306_02 {

	public static void main(String[] args) {
		
		int x;
		int y;
		var pra = new Practice306_02();
		
		x = 10;
		y = x % 2;
		
		if(y == 0)
			System.out.println("xは偶数です!");
		else 
			System.out.println("xは奇数です。");
			System.out.println(pra.pra306_02());
	}

	public String pra306_02() {
		return "この行はいつ表示されますか？";
	}
}
