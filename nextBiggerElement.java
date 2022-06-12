/* From a given array of integer print the next bigger element in the array

Examples:
Input: {8,4,1,9,6,2}
Output: {8->9,4->6,1->2.9->,6->8,2->4}

Input{4,5,2,25}
Output:{4->5,5->25,2->4,25->}

Input{16,17,4,3,5,2}
Output:{16->17,17->,4->5,3->4,5->16,2->3} */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class nextBiggerElementInArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array....");
		int n = sc.nextInt();
		int unsortedArray[] = new int[n];
		int array_2[] = new int [n];
		System.out.println("Enter the elements of the array...");
		for(int i=0;i< n;i++) {
			unsortedArray[i] = sc.nextInt();
			array_2[i] = unsortedArray[i];
		}
		sc.close();
		Arrays.sort(array_2);
		HashMap<Integer,Integer> hMap = new HashMap();
		for(int i=0;i<n;i++) {
			if(i!=n-1)
				hMap.put(array_2[i], array_2[i+1]);
			else
				hMap.put(array_2[i], array_2[i]);
		}
		for(int i=0;i<n;i++) {
			if(unsortedArray[i] != hMap.get(unsortedArray[i])) {
				System.out.print(unsortedArray[i] + "->" + hMap.get(unsortedArray[i]));
			}
			else
				System.out.print(unsortedArray[i] + "->");
			if(i!=n-1)
				System.out.print(",");
		}
	}
}
