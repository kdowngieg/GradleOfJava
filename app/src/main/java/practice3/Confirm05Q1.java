package practice3;

public class Confirm05Q1 {

	public static void main(String[] args) {
		
		int[] array = new int[3];
		
		array[0] = 5;
		array[1] = 8;
		array[2] = array[0] + array[1];
		
		System.out.println(array[2]);
	}
	
	public static int conQ1() {
		int[] array = new int[3];
		
		array[0] = 5;
		array[1] = 8;
		array[2] = array[0] + array[1];
		
		return array[2];
	}

}
