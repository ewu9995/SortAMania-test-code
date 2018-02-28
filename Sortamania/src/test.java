import java.util.Arrays;

public class test extends SortCompetition{
	
	public static int[] randomInts(int x) {
		int[] arr = new int [x];
		for(int i=0; i <x-1; i++) {
			arr[i] = (int) (Math.random()*x);
		}
		return arr;
	}
	

	
	
	public static void main(String[] args) {
		int [] randArr = randomInts(10000);
		
	}
	


	public static void swap(int []arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void quickSort(int[] list1, int front, int back)
	{
		if(back>front) {
			int pivotPos = partition(list1, front, back);
			quickSort(list1, front, pivotPos-1); //values before pivot
			quickSort(list1, pivotPos, back); //values after pivot
		}
	}
	
	public static int partition(int[] list1, int front, int back) 
	{
		int pivot = list1[front];
		while (front < back) {
			while (list1[front] < pivot) {
				//since the value is less than the pivot then nothing happens and it counts up
				//until a grater value is found
				front++;
			}
			while (list1[back] > pivot) {
				//if the value is greater than the pivot nothing happens and it counts down
				//until smaller value is found
				back--;
			}
			if(front <= back) {
			//value swaps as conditions are met
			swap(list1, front, back);
			
			//everything continues on
			front++;
			back--;
			}
		}
		return front; //pivot index is returned
    }
	
	
	public  int challengeOne(int[] arr) {
		int[] arr1 = arr;
		quickSort(arr1, 0, arr1.length-1);
		return (int)arr1[4999];
		
	}

	@Override
	public int challengeTwo(String[] arr, String query) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int challengeThree(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int challengeFour(int[][] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int challengeFive(Comparable[] arr, Comparable query) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return null;
	}

}
