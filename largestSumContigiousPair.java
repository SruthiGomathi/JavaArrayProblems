/* Given an unsorted array of integers, find the largest contigious pair sum in the array

Test case 1:

Enter the array size : 8
Input : 0 5 6 0 9 0 0 1
Output : 11
Explanation : 5 and 5 forms the largest sum.

Test case 2:
Enter the array size : 5
Input : 12 31 10 6 40
Output : 56
Explanation 6 and 40 forms the largest sum

Test case 3:
Enter the array size : 4
Input : 3 5 4 4
Output : 9 */

import java.util.Scanner;

public class ContiguousArrayLargestSum {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements in the array....");
			int n = sc.nextInt();
			int unsortedArray[] = new int[n];
			System.out.println("Enter the elements of the array...");
			for(int i=0;i< n;i++) {
				unsortedArray[i] = sc.nextInt();
			}
			sc.close();
//-------------------------------------------------------------------------------------------------------------------------------
			int largestSum = unsortedArray[0] + unsortedArray[1];
			for(int i = 1; i< n-1; i++) {
				if(largestSum < unsortedArray[i] + unsortedArray[i+1]) {
					largestSum = unsortedArray[i] + unsortedArray[i+1];
				}
			}
//-------------------------------------------------------------------------------------------------------------------------------
			System.out.println("The Largest Sum is " + largestSum);
		}
}
