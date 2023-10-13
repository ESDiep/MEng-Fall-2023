package myLibrary.Sort;

public class InsertionSort {

	public void X_Sort(int[] array) {
		
		int key, j;
		
		for (int i = 1 ; i < array.length; i++) {
			key = array[i];
			j = i - 1;
			while(j >= 0 && array[j] >  key) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
	}
}
