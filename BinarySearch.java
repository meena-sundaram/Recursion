package day5;

public class BinarySearch {
	// BinarySearch
	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		while (last >= first) {
			if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else if (key > arr[mid]) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}

	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int key = 30;
		int last = arr.length - 1;
		binarySearch(arr, 0, last, key);
	}
}

/*
 * public static void main(String args[]){ int arr[] = {10,20,30,40,50}; int key
 * = 30; int result = Arrays.binarySearch(arr,key); if (result < 0)
 * System.out.println("Element is not found!"); else
 * System.out.println("Element is found at index: "+result); }
 */
