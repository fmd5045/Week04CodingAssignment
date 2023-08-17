
package week04;

import java.util.Arrays;
import java.util.Scanner;

//import java.util.ArrayList;

public class Week04CodingAssignment {

	public static void main(String[] args) {
		//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
			System.out.println("Array of numbers :"+Arrays.toString(ages));
				
			
		//Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
			ages[ages.length-1] = ages[ages.length-1]-ages[0];

			System.out.println("New array of numbers :"+Arrays.toString(ages));

			
		//Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
			int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 45};
			ages2[ages2.length-1] = ages2[ages2.length-1]-ages2[0];
			System.out.println("Newest array of numbers :"+Arrays.toString(ages2));
		
		//Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			float sum=0;
			for(int i=0; i<ages2.length; i++) {
			sum+= ages2[i];
			}
			System.out.println("The average is: "+sum/ages2.length);
		
		//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			String[] someArray = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			float stringLength = 0;
			for(int i=0; i<someArray.length; i++) {
				stringLength+=someArray[i].length();
			}
			System.out.println("The average number of letters per name is: "+stringLength/someArray.length);
			
		//Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
			String concatenatedNames= "";
			for(int i=0; i<someArray.length; i++) {
				concatenatedNames+=someArray[i]+ " ";
			}
			System.out.println("The concatenated result is: "+concatenatedNames);
		
		//How do you access the last element of any array?
			//You access the last element of the array by calling on the last index ie:
			//array[array.length-1];
		
		//How do you access the first element of any array?
			//You access the first element of the array by calling the first index ie:
			//array[0];
		
		//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
			int[] nameLengths = new int[someArray.length];
			for(int i=0; i< someArray.length; i++) {
				nameLengths[i] = someArray[i].length();
			}
			
			System.out.println("Lengths of each name on the array are :"+Arrays.toString(nameLengths));
			
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
			float nameSum=0;
			for(int i=0; i< nameLengths.length; i++) {
				nameSum += nameLengths[i];
			}
			System.out.println("The sum of all name lengths is :"+nameSum);
			
		//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			String word = "Hola";
			int n = 5;
			
			System.out.println(concatenatedTimes(word, n));
		//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
			String firstName = "Michael";
			String lastNanme = "Jordan";
			System.out.println("The full name is : "+ fullName(firstName, lastNanme));
			
		//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
			int[] nums = {5,6,7,8,9,12,2,6,7};
			System.out.println("The sum of the array is greater than 100 :"+ greaterThan100(nums));
			
		//Write a method that takes an array of double and returns the average of all the elements in the array.
			double[] arrayOfDoubles = {5.02,6,7,8,33,9.11,12,2,6,7.55};
			System.out.println("The average of the array is :" + averageOfDoubles(arrayOfDoubles));
			
		//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
			double[] arrayOfDoubles2 = {10.02,3,1,9,22,2.11,0,2,3,4.55};
			System.out.println("The average of the first array is greater than the average of the second array :" + averageOfOneGreaterThanTwo(arrayOfDoubles,arrayOfDoubles));
			
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
			double moneyInPocket = 13.55;
			boolean isHotOutside = true;
			System.out.println("Today is hot and i will buy a drink: "+ willBuyDrink(isHotOutside, moneyInPocket));
		
		//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, lets check your BMI");
		System.out.print("What is your current weight in pounds :");
		double weight = sc.nextDouble();
		System.out.print("What is your current height in inches :");
		double height = sc.nextDouble();
		
		System.out.println(looseWeight(weight, height));
			
		
	}
	//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public static String concatenatedTimes(String word, int n) {
		String concatenatedWord = "";
		for(int i=0; i<n; i++) {
			concatenatedWord+= word;
		}
		return concatenatedWord;
	}
		
	//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String fullName(String firstName, String lastName){
		return (firstName+ " "+lastName);
	}
		
	//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean greaterThan100(int[] ints) {
		int sum = 0;
		for(int num: ints) {
			sum+= num;
		}
		return sum>100;
	}
		
	//Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double averageOfDoubles(double[] arrayOfDoubles) {
		double sum = 0;
		for(double num: arrayOfDoubles) {
			sum+= num;
		}
		return (sum/arrayOfDoubles.length);
	}
		
	//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean averageOfOneGreaterThanTwo(double[] arrayOfDoubles,double[] arrayOfDoubles2) {
		double sum1 = 0;
		double sum2 = 0;
		for(double num: arrayOfDoubles) {
			sum1+=num;
		}
		for(double num: arrayOfDoubles2) {
			sum2+=num;
		}
		return((sum1/arrayOfDoubles.length)>(sum2/arrayOfDoubles2.length));
	}
	
	//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket>10.5) {
			return true;
		}
		else {
			return false;
		}
	}
		
	//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	public static String looseWeight(double weight, double height) {
		double bmi = (703*(weight/(height*height)));
		double goodWeightLow = (18.5/703)*(height*height);
		double goodWeightHigh = (24.9/703)*(height*height);
		
		if (bmi< 18.5) {
			return("You dont need to loose weight you need to gain weight, your BMI is: "+(int)bmi+". It is recomended that you gain about "+(int)(goodWeightLow-weight)+" lbs.");
		}
		else if(bmi>=18.5 && bmi<24.9) {
			return ("You dont need to loose weight, you have a healthy weight and your BMI is: "+ bmi);
		}
		else if(bmi>=24.9 && bmi<29.9){
			return("You need to loose weight. Your BMI is :"+(int)bmi+". It is recommended that you loose about "+(int)(weight-goodWeightHigh)+" lbs.");
		}
		else {
			return("You need to loose weight. Your BMI is :"+(int)bmi+". It is cruicial that you loose about "+(int)(weight-goodWeightHigh)+" lbs.");
		}
	}



}


/*
 * GitHub Repository URL: https://github.com/fmd5045/Week04CodingAssignment
 * Public video link: https://youtu.be/E7ZhWt9aoHY
 */
