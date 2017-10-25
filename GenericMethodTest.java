package com.exc20_6;

public class GenericMethodTest {

	public static void main(String[] args) {
		
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
		Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
		String[] stringArray = {"one","two","three","four","five","six","seven","eight"};
		
		System.out.println("Array integerArray contains: ");
		printArray(intArray);
		System.out.println("Array doubleArray contains: ");
		printArray(doubleArray);
		System.out.println("Array characterArray contains: ");
		printArray(characterArray);
		System.out.println("Array stringArray contains: ");
		printArray(stringArray);
		
	}
	 public static <T> void printArray(T[] inputArray)
	 {
		 for(T element : inputArray)
		 {
			 System.out.printf("%s ",element);
		 }
		 System.out.println();
	 }
	 public static void printArray(String[] inputArray)
	 {
		 int len=inputArray.length;
		 int i=0;
		 for(String element : inputArray)
		 {
			 System.out.printf("%-10s ",element);
			 i++;
			 if(i==len/2)
				 System.out.println();
		 }
		 System.out.println();
	 }
}
