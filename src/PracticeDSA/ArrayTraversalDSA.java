package PracticeDSA;

public class ArrayTraversalDSA {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 1};
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    public void insertionAtFront(int[] arr, int ele) {
		System.out.println("\nArray after Insertion at Front:");

		for (int i = arr.length - 1; i >=1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = ele;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
    
    public void insertionSpecificPosition(int[] arr, int n, int ele) {
		int newArr[]= new int[arr.length+1];
		for(int i=0; i<n; i++) {
			newArr[i]= arr[i];
		}
		newArr[n]=ele;
		for(int i=n; i<arr.length; i++) {
			newArr[i+1]= arr[i];
		}
		System.out.println("\nArray after insertion at specific location:");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
	}

    public void deletionionAtFront(int[] arr) {
		System.out.println("\nArray after Deletion at Front:");

		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public void deletionionAtLast(int[] arr) {
		System.out.println("\nArray after Deletion at Last:");

		for (int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void deletionAtSpecificPosition(int[] arr, int n) {
		System.out.println("\nArray after Deletion at Specific Position:");

		for (int i = n; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}

		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
