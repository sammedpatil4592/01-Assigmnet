package com.practice.Assigment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssigmentApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(AssigmentApplication.class, args);
		
		ArrayAssingment obj = new ArrayAssingment();
		
		/*
		 * System.out.println("find duplicate elements in given Array"); int []
		 * inputArray = {1, 2, 5, 5, 6, 6, 7, 2}; System.out.print("Input :");
		 * AssigmentApplication.printArray(inputArray); System.out.println();
		 * System.out.print("Output :"); obj.findDuplicate(inputArray);
		 * System.out.println();
		 * 
		 * System.out.println("");
		 * System.out.println("remove duplicate elements in given Array"); int []
		 * inputArray2 = {1, 2, 5, 5, 6, 6, 7, 2}; System.out.print("Input :");
		 * AssigmentApplication.printArray(inputArray2); int[] result =
		 * obj.removeDuplicates(inputArray2); System.out.println();
		 * System.out.print("Output :"); AssigmentApplication.printArray(result);
		 * 
		 * System.out.println("");
		 * System.out.println("find sum of unique elements in given Array"); int []
		 * inputArray3 = {1, 6, 4, 3, 2, 2, 3, 8, 1}; System.out.print("Input :");
		 * AssigmentApplication.printArray(inputArray3); int sum =
		 * obj.sumOfUniqueElement(inputArray3); System.out.println();
		 * System.out.print("Output  Sum ="+ sum);
		 * 
		 * 
		 * System.out.println("");
		 * System.out.println("find third largest number in given Array"); //int []
		 * inputArray4 = { 6, 8, 1, 9, 2, 1, 10}; //int [] inputArray4 = { 6, 8, 1, 9,
		 * 2, 1, 10, 12}; int [] inputArray4 = { 6}; System.out.print("Input :");
		 * AssigmentApplication.printArray(inputArray4); int largeNumber =
		 * obj.thirdLargestElemnt(inputArray4); System.out.println(""); if(largeNumber
		 * != 0) System.out.print("Output 3rd largest number:"+ largeNumber); else
		 * System.out.print("Invalid Input, array size is less than 3");
		 */
		
		/*
		 * System.out.println(""); System.out.
		 * println("find maximum difference between two elements in given Array"); //int
		 * [] inputArray5 = { 2, 5, 1, 7, 3, 9, 5}; int [] inputArray5 = { 9, 2, 12, 5,
		 * 4, 7, 3, 19, 5}; System.out.print("Input :");
		 * AssigmentApplication.printArray(inputArray5); int maxDiffNumber =
		 * obj.findMaxDifference(inputArray5); System.out.println("");
		 * System.out.print("Output maximum difference between two elements:"+
		 * maxDiffNumber);
		 */
		
		
		/*
		 * System.out.println(""); System.out.println("");
		 * System.out.println("find Min and Max elements in given Array"); int []
		 * inputArray6 = {1, 2, 5, 5, 6, 6, 7, 2}; System.out.print("Input :");
		 * AssigmentApplication.printArray(inputArray6); System.out.println("");
		 * System.out.println("output:"); obj.findMaxAndMinElement(inputArray6);
		 */
		
		
		/*
		 * System.out.println(""); System.out.println("");
		 * System.out.println("find common elements among below 3 Arrays"); int ar1[] =
		 * {1, 5, 10, 20, 40, 80}; int ar2[] = {6, 7, 20, 80, 100}; int ar3[] = {3, 4,
		 * 15, 20, 30, 70, 80, 120}; System.out.print("Input :");
		 * System.out.println(""); AssigmentApplication.printArray(ar1);
		 * System.out.println(""); AssigmentApplication.printArray(ar2);
		 * System.out.println(""); AssigmentApplication.printArray(ar3);
		 * System.out.println(""); System.out.println("output:");
		 * obj.findUniqueElement(ar1, ar2, ar3);
		 * 
		 * 
		 * System.out.println(""); System.out.println(""); System.out.
		 * println("find element Pairs in given Array whose sum is equal to given number"
		 * ); System.out.print("Input :"); int[] inputArray10 = {3, 6, 8, -8, 10, 8 };
		 * int sum=16; AssigmentApplication.printArray(ar1); System.out.println("Sum :"
		 * + sum); System.out.println(""); System.out.println("output:");
		 * obj.findSumforTwoElement(inputArray10, sum);
		 */
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("find smallest pair sum in given Array");
		System.out.print("Input :");
		int[] inputArray11 = {1, 7, 2, 9, 6};
		AssigmentApplication.printArray(inputArray11);
		System.out.println("");
		System.out.println("output:");
		obj.findsamllestSumfromArray(inputArray11);
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("find second Min and Second Max elements in given Array");
		System.out.print("Input :");
		int[] inputArray12 = {1, 2, 5, 9, 6, 4, 7, 2};
		AssigmentApplication.printArray(inputArray12);
		obj.findSecondSmallAndLargeElenemt(inputArray12);
		
		
		
		
		
	}
	
	public static void printArray(int [] array)
	{
		for(int i=0;i<=array.length-1;i++)
			System.out.print(array[i] + ",");
	}
	
	public static void sortArray(int [] inputArray)
	{
		int sizeArray = inputArray.length;
		int [] input = new int[sizeArray];
		input = inputArray;
		for(int i=0;i<sizeArray; i++)
		{
			for(int j=i+1;j<sizeArray;j++)
			{
				if(input[i] > input[j])
				{
					int tmp = input[i];
					input[i] = input[j];
					input[j] = tmp;
				}
			}
		}
	}
	

}
