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
	
	public static String[] mergeSort(String[] list) 
	{
	
		if(list.length == 1)
			return list;
	
		String[] left = Arrays.copyOfRange(list, 0, list.length/2);
		String[] right = Arrays.copyOfRange(list, list.length/2 , list.length); 
		
	}
	
	
	public static String[] merge(String[] list1 , String[] list2) {

			String [] combinedArray = new String[list1.length + list2.length]; 
			int x=0;
			int y=0; 
			int z=0; 
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
			  		if (x < list1.length)
			  		{
			  			combinedArray[z] = list1[x];
			  			x++;
			  			z++;
			  		}

			  		if (y < list2.length)
			  		{
			  			combinedArray[z] = list2[y];
			  			y++; 
			  			z++;
			  		}

			    return combinedArray; //returns the merged sorted array 
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
