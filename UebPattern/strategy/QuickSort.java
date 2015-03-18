package UebPattern.strategy;

public class QuickSort implements SortInterface {
    @Override
    public void sort(int[] a) {
        quicksort(a, 0, a.length - 1);
    }

    public void quicksort(int[] arr, int low, int high) {
    	 
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		//pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		//make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		//recursively sort two sub parts
		if (low < j)
			quicksort(arr, low, j);
 
		if (high > i)
			quicksort(arr, i, high);
	}
}
