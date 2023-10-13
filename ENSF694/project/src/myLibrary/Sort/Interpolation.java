package myLibrary.Sort;

import java.util.Arrays;

public class Interpolation {
	int interpolationSearchIterative(int[] array, int key)	{
		
		//int result = -1;
		
		int pos, high, low, mid;
		
		high = array.length - 1;
		low = 0;
		
		//sorting the array before doing interpolation search
		Arrays.sort(array);
		while(low < high) {
			pos = (key - array[low]) / (array[high] - array[low]);
			mid = low + (high - low) * pos;
			
			if(key < array[mid]) {
				high = mid -1;
			}
			else if ( key > array[mid])
				low = mid + 1;
			else 
				return mid;
			
		}
		
		return -1;
		
		

	}
}
