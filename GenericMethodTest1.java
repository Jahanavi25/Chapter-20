package com.exc20_5;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest {

	public static void main(String[] args) throws InvalidSubScriptException {
		
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
		Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
		
		System.out.println("Array integerArray contains: ");
		printArray(intArray);
		System.out.println("Array integerArray from 2 to 4 contains: ");
		printArray(intArray,2,4);
		System.out.println("Array doubleArray contains: ");
		printArray(doubleArray);
		System.out.println("Array doubleArray from 2 to 4 contains: ");
		printArray(doubleArray,2,4);
		System.out.println("Array characterArray contains: ");
		printArray(characterArray);
		System.out.println("Array characterArray from 2 to 4 contains: ");
		printArray(characterArray,2,4);
	}
	 public static <T> void printArray(T[] inputArray)
	 {
		 for(T element : inputArray)
		 {
			 System.out.printf("%s ",element);
		 }
		 System.out.println();
	 }
	 public static <T> void printArray(T[] inputArray,int lowSubScript, int highSubScript) throws InvalidSubScriptException
	 {
		 if(lowSubScript<0 || lowSubScript>=inputArray.length
				 || highSubScript<0 || highSubScript>=inputArray.length)
		 {
			 throw new InvalidSubScriptException("subScripts are out of range");
		 }
		 List<T> array = new ArrayList<T>();
		 for(int i=lowSubScript;i<=highSubScript;i++)
		 {
			array.add(inputArray[i]); 
		 }
		 for(T element : array)
		 {
			 System.out.printf("%s ",element);
		 }
		 System.out.println();
	 }
}
class InvalidSubScriptException extends Exception
{

	private static final long serialVersionUID = 1L;
	
	public InvalidSubScriptException(String ex)
	{
		super(ex);
	}
}
