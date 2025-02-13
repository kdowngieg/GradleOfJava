package practice3;

public class Confirm05Q2 {

	public static void main(String[] args) {
		int[] array = new int[4];
		
		array[0] = 100;
		array[1] = 200;
		array[2] = array[0] + array[1];
		array[3] = 2 * array[2];
		
		System.out.println(array[0] + "\n" + array[1] + "\n" + array[2] + "\n" + array[3]);
	}
	
	public static int[] conQ2() {
		int[] array = {100, 200, 300, 600};
		
		return array;
	}
}
