import java.util.Arrays;
import java.util.Random;

public class Runner {

	public static int[] randomInts(int x) {
		int[] arr = new int [x];
		for(int i=0; i <x-1; i++) {
			arr[i] = (int) (Math.random()*x);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int [] randArr = randomInts(10000);
		Random r = new Random();
		return ((Object) r).challengeOne(randArr);
		System.out.println(Arrays.toString(randArr));
	}
	
}
