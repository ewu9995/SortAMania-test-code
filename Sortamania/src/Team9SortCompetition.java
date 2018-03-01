
public class Team9SortCompetition extends SortCompetition{

	public int challengeOne(int[] arr) {
		int[] arr1 = arr;
		quickSort(arr1, 0, arr1.length-1);
		return arr1[(arr1.length/2)-1];
		
	}

	@Override
	public int challengeTwo(String[] arr, String query) {
		String[] arr1 = arr;
		String x = query;
		int y = 0;
		bubbleSort(arr1);
		for(int i =0; i < arr1.length; i++) {
			if(arr1[i].equals(x)) {
				y= i;
				return y;
			}
		}
		return  -1;
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
	
	public static void bubbleSort(String [] list1) {
		boolean swap = true;
		while(swap) { //while loop is used as there is a limited number of loops before everything gets sorted
			swap=false;
			for(int i = 0; i < list1.length-1; i++) { //loops through the loop; first value becomes current value i
				if(list1[i].compareTo(list1[i+1])>0) { // if the value to the right of a value is less than the current value
						bubbleSwap(list1, i, i+1);     // the values swap
						swap = true; //swap is true, so cycle repeats until everything is sorted
					}
				}
			}
		}
	
	public static void bubbleSwap(String []arr, int index1, int index2) {
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
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
}
