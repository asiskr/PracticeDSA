package PracticeDSA;
import java.util.HashSet;

public class removeDuplicatesDSA {
	public void removeDuplicates(int[] arr) {
		HashSet<Integer> uniques = new HashSet<Integer>();
		System.out.println("\nUnique Elements:");

		for(int i =0; i<arr.length; i++) {
			if(!uniques.contains(arr[i])) {
				System.out.print(arr[i] + " ");
				uniques.add(arr[i]);
			}
		}
		System.out.println();
	}
}
