package com.practice.Assigment;


public class ArrayAssingment 
{
   
	public void findDuplicate(int [] input)
	{
		for(int i=0; i<= input.length-1; i++)
		{
			for(int j=i+1;j<=input.length-1;j++)
			{
				if(input[i] == input[j])
				{
					System.out.print(input[i] + ",");
				}
			}
		}
		
	}
	
	public int[] removeDuplicates(int[] arrayWithDuplicates)
    {

        int noOfUniqueElements = arrayWithDuplicates.length;
         
        for (int i = 0; i < noOfUniqueElements; i++) 
        {
            for (int j = i+1; j < noOfUniqueElements; j++)
            {
                if(arrayWithDuplicates[i] == arrayWithDuplicates[j])
                {
                     
                    arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];
                    noOfUniqueElements--;
                    j--;
                }
            }
        }
        
        //int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);
        //return arrayWithoutDuplicates;
        return arrayWithDuplicates;
    }
	
	
	public int sumOfUniqueElement(int[] input)
	{
		int sum=0;
		int[] newArray = new int[input.length];
		newArray = input;
		int arraySize = input.length;
		
		for(int i=0;i<arraySize;i++)
		{
			for(int j=i+1;j<arraySize;j++)
			{
				if(newArray[i] == newArray[j])
				{
					newArray[j] = newArray[arraySize-1];
					arraySize--;
					j--;
				}
			}
				
		}
		
		for(int i=0;i<arraySize;i++)
		{
			//System.out.println(newArray[i]);
			sum+= newArray[i];
		}
		
		
		return sum;
	}

	
	public int thirdLargestElemnt(int [] input)
	{
		int number=0;
		int length = input.length;
		if(length < 3)
			return number;
		
		AssigmentApplication.sortArray(input);
		System.out.println("");
		ArrayAssingment obj = new ArrayAssingment();
		int [] data = obj.removeDuplicates(input);
		number = data[data.length -3];
        
		return number;
	}
	
	
	public int findMaxDifference(int [] input)
	{
		int maxDiffNumber =0;
		
		for(int i=0; i<input.length; i++)
		{
			for(int j=i+1;j<input.length; j++)
			{
				int tmp =0;
				if(input[i] > input[j])
				{
					tmp = input[i] -input[j];
				}
				else {
					tmp = input[j] -input[i];
				}
				
				if(maxDiffNumber < tmp)
					maxDiffNumber = tmp;
			}
		}
		
		
		return maxDiffNumber;
		
	}

	public void findMaxAndMinElement(int [] input)
	{
	  
	  if(input.length ==1)
	  {
		  System.out.println("Array have only one element then max and min element is same " + input[0]);
	  }
	  else if(input.length <=0)
	  {
		  System.out.println(" Array is not valid");
	  }
	  else
	  {
		  int min=input[0];
		  int max= input[0];
		  for(int i=1; i< input.length; i++)
		  {
			    if(input[i] > max)
			    	max = input[i];
			    if (input[i] < min)
			    	min = input[i];
			    			
		  }
		  System.out.println("MAX value:"+ max);
		  System.out.println("MAX value:"+ min);
	  }
	  
	}

	public void findSecondSmallAndLargeElenemt(int[] arr)
	{
		int max = arr[0];
        int secondmax = arr[0];
        int min = arr[0];
        int secondmin = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
                if (arr[i] > max)
                {
                        secondmax = max;
                        max = arr[i];
                }
                else if (arr[i] > secondmax)
                {
                        secondmax = arr[i];
                }
        }
        for (int i = 0; i < arr.length; i++)
        {
                if (arr[i] < min)
                {
                        secondmin = min;
                        min = arr[i];
                }
                else if (arr[i] < secondmin)
                {
                        secondmin = arr[i];
                }
       
        }
        
        System.out.println("\nSecond maximum number is: " + secondmax);
        System.out.println("\nSecond minimum number is: " + secondmin);
	}
	
	public void findUniqueElement(int[] a1, int[] a2, int[] a3)
	{
		
		
		for(int i=0;i<a1.length;i++)
		{
			boolean ele1 = false;
			boolean ele2 = false;
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i] == a2[j]) 
				{
					ele1 = true;
					break;
				}
			}
			for(int k=0;k<a3.length;k++)
			{
				if(a1[i] == a3[k]) 
				{
					ele2 = true;
					break;
				}
			}
			
			if(ele1 == true  && ele2 == true)
			{
				System.out.print(a1[i] + ",");
			}
		}
	}

	
	public void findSumforTwoElement(int [] arr, int sum)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(sum == arr[i] + arr[j])
				{
					System.out.println("Pairs with sum  " + sum + " are (" + arr[i]+ "," + arr[j] + ")" );
				}
			}
		}
	}

    public void findsamllestSumfromArray(int[] arr)
    {
    	
    	if(arr.length <=1)
    	{
    		System.out.println("Provided array have less than 2 element");
    		
    	}
    	else
    	{
    		int sum = arr[0] + arr[1];
    		for(int i=0;i<arr.length; i++)
    		{
    			for(int j=i+1;j<arr.length;j++)
    			{
    				if(sum > (arr[i] + arr[j]))
    				{
    					sum = (arr[i] + arr[j]);
    				}
    			}
    		}
    		
    		System.out.println("smallest pair sum in given Array:" + sum);
    	}
    }

}

