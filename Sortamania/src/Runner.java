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
	
	public static String[] randomStrings(int x) {
		String[] arr = new String [x];
		return arr;
	}
	
	public static void main(String[] args) {
		
		int [] randArr = randomInts(10000);
		String [] randString = randomStrings(10000);
		
		long start = System.nanoTime();
		long end = System.nanoTime();
		long time = end - start;
		Team9SortCompetition x = new Team9SortCompetition();
		x.challengeOne(randArr);
		System.out.println("Challenge one took: " + time + " nanoseconds");
		System.out.println(randArr[4999]);
		
		start = System.nanoTime();
		end = System.nanoTime();
		time = end - start;
		x.challengeTwo(randString, "abcde");
		System.out.println("Challenge one took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(randString));
	
	
	}
	
}
