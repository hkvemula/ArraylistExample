package MergeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {

	static int[] sortArray(int result[], int Size) {
		for (int i = 0; i < Size; i++) {
			for (int j = i + 1; j < Size; j++) {
				if (result[i] < result[j]) {
					int Temp = result[i];
					result[i] = result[j];
					result[j] = Temp;
				}
			}
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter the size of the first array:");
		int n = sn.nextInt();
		System.out.println("Enter the elements of the first array in descending order:");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			int numb = sn.nextInt();
			arr[i] = numb;
		}

		System.out.print("Enter the size of the second array:");
		int m = sn.nextInt();
		System.out.println("Enter the elements of the second array in descending order:");
		int arr1[] = new int[m];
		for (int i = 0; i < m; i++) {
			int numb = sn.nextInt();
			arr1[i] = numb;
		}
		sn.close();

		System.out.println("The elements of the first array : "
				+ Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", " "));

		System.out.println("The elements of the second array : "
				+ Arrays.toString(arr1).replace("[", "").replace("]", "").replace(",", " "));
		int Size = m + n;
		int[] result = new int[m + n];
		System.arraycopy(arr, 0, result, 0, n);
		System.arraycopy(arr1, 0, result, n, m);
		result = sortArray(result, Size);
		System.out.println("The elements of the third array : "
				+ Arrays.toString(result).replace("[", "").replace("]", "").replace(",", " "));

	}

}
