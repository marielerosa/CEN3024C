import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;

public class ArrayOperations {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("How many integers do you want to store? ");

			int n = Integer.parseInt(sc.nextLine());

			int arr[] = createArray(n);

			System.out.print("\nBefore sorting array elements are: ");
			
			printArray(arr);
	
			int arr1[] = sortArray(arr);

			System.out.print("\nAfter sorting array elements are: ");

			printArray(arr);
			
			System.out.print("\n\nEnter an integer to find: ");

			int find = Integer.parseInt(sc.nextLine());

			searchElement(find, arr);

			System.out.println("\nFrequencies of all the numbers: ");

			findFrequecy(arr);

			System.out.println();

			System.out.println("Average of the numbers in the array: " + averageOfArray(arr));

			System.out.println("Highest of the numbers is: " + arr1[0]);

			System.out.println("Lowest of the numbers is : " + arr1[n-1]);
		} catch (NumberFormatException e) {
		
			e.printStackTrace();
		}

		}

		private static int[] sortArray(int[] arr) {

			int temp = 0;
	
			for(int i=0; i<arr.length; i++) {
	
				for(int j=0; j<arr.length-1; j++) {
		
					if(arr[i]>arr[j]) {
			
						temp = arr[i];
				
						arr[i] = arr[j];
				
						arr[j] = temp;
			
					}

				}

			}
	
			return arr;

		}
		
		private static int[] createArray (int number ) {
			
			Random random = new Random();

			int arr[] = new int[number];

			for(int i=0; i<number; i++) {

				arr[i] = 1+random.nextInt(100);

			}

			return arr;
			
		}
		
		private static void printArray (int[] arr) {
			
			for(int i=0; i<arr.length; i++) {
	
				System.out.print(arr[i]+" ");

			}

		}
		
		private static double averageOfArray (int [] arr) {
			
			int sum = 0;
			
			for(int i=0; i<arr.length; i++) {
				
				sum += arr[i];
				
			}

			double average = Double.valueOf(sum) / arr.length;
			
			return average;
		}
		
		private static void searchElement(int find, int[] arr) {

		boolean found = false;

		int index = 0;

		for(int i=0; i<arr.length; i++) {

		if(arr[i]==find) {

		found = true;

		index = i;

		}

		}

		if(found) {

		System.out.println("Element found at index: "+index);

		}

		else{

		System.out.println("Element not found in the array!!!");

		}

		}

		private static void findFrequecy(int[] arr) {

		HashMap<Integer, Integer> hm = new HashMap<>();

		for(int i=0; i<arr.length; i++) {

		if(hm.containsKey(arr[i])) {

		hm.put(arr[i], hm.get(arr[i])+1);

		}

		else {

		hm.put(arr[i], 1);

		}

		}

		System.out.println(hm);

		}
}
