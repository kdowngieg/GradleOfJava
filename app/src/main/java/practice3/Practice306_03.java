package practice3;

public class Practice306_03 {

	public static void main(String[] args) {
		var pra = new Practice306_03();
		
		System.out.println(pra.omikuji(88));
	}

	public String omikuji(int x) {
		switch(x) {
			case 99:
				return "大吉!";
				
			case 88:
				return "中吉!";
				
			case 77:
				return "小吉!";
				
			default:
				return "吉!";
		}
	}
}
