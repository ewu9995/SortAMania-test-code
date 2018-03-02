import java.util.Arrays;

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
		mergeSort(arr1);
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
		int[] arr1 = arr;
		quickSort(arr1, 0, arr1.length-1);
		return arr1[(arr1.length/2)-1];
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
	
	public void quickSort(int[] list1, int front, int back)
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
	
	public static String[] mergeSort(String[] list) 
	{
		//Base case
		if(list.length == 1)
			return list;
		//Recursive step
		
		//two arrays left and right since merge sort is splitting up arrays by half then combining it back together sorted
		//left is 0 to to 1/2
		//right is 1/2 to end
		String[] left = Arrays.copyOfRange(list, 0, list.length/2);
		String[] right = Arrays.copyOfRange(list, list.length/2 , list.length); 
		return(merge(mergeSort(left), mergeSort(right)));
		
	}
	
	//Sourced from: https://stackoverflow.com/questions/5958169/how-to-merge-two-sorted-arrays-into-a-sorted-array

	public static String[] merge(String[] list1 , String[] list2) {

			String [] combinedArray = new String[list1.length + list2.length]; //new array must be length of both arrays combined
			int x=0; //list1 indexes
			int y=0; //list2 indexes
			int z=0; //new array (combinedArray)
			boolean a = false;
			  while (x < list1.length && y < list2.length) //both arrays must be less than their intended length (any longer with break the code)
		        {
		            if (list1[x].compareTo(list2[y]) <= 0) //compares the values in the 2 arrays and see which is smaller
		            {
		               combinedArray[z] = list1[x]; //since the value in list1 is smaller in this case, list1[x] becomes part of the sorted array before list2[y]
		                x++; //x will count up as the values are placed into the merged array
		                z++; //z is the merged array index so it counts up as it fills in its slots
		            }
		            else  
		            {
		            	combinedArray[z] = list2[y]; //since list2[y] is smaller, it is placed before list1[x]
		                y++; //y counts up as values are placed into merged array
		                z++;
		            }
		            
		        	}
			  		
			  	
			  		//loops through the arrays to find values
			  		while (x < list1.length)
			  		{
			  			combinedArray[z] = list1[x];
			  			x++;
			  			z++;
			  		}

			  		while (y < list2.length)
			  		{
			  			combinedArray[z] = list2[y];
			  			y++; 
			  			z++;
			  		}
			  	

			    return combinedArray; //returns the merged sorted array 
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
