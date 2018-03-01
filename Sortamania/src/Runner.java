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
	
	//https://stackoverflow.com/questions/4951997/generating-random-words-in-java
	public static String[] randomStrings(int x) {
		String[] arr = new String [x];
		Random r = new Random();
		    for(int i = 0; i < x; i++)
		    {
		        char[] word = new char[5]; 
		        for(int j = 0; j < word.length; j++)
		        {
		            word[j] = (char)('a' + r.nextInt(26));
		        }
		        arr[i] = new String(word);
		    }
		return arr;
	}
	
	public static void main(String[] args) {
		
		int [] randArr = randomInts(10000);
		String [] randStrings = randomStrings(10000);
		
		Team9SortCompetition x = new Team9SortCompetition();
		
		long start = System.nanoTime();
		long end = System.nanoTime();
		long time = end - start;
		x.challengeOne(randArr);
		System.out.println("Challenge one took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(randArr));
		System.out.println(x.challengeOne(randArr));
		System.out.println(randArr[4999]);
		
		start = System.nanoTime();
		end = System.nanoTime();
		time = end - start;
		x.challengeTwo(randStrings, "abcde");
		System.out.println("Challenge two took: " + time + " nanoseconds");
		System.out.println(x.challengeTwo(randStrings, "abcde"));
	
	
	}
	
}
