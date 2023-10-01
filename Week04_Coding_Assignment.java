package week04Assignment;

import java.util.Scanner;

public class Week04_Coding_Assignment {
	

	public static void main(String[] args) {
// 1. Create an Array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.	
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //array of ints with provided values
	
// 1.a. Programmatically subtract the value of the first element in the Array from the value in
//	the last element of the Array (i.e. do not use ages[7] in your code). Print the result to the
//	console.
	int firstValue = ages[0]; //container for first element
	int lastValue = ages[ages.length-1]; //container for last element
	System.out.println(lastValue - firstValue); //last element (93) - first element (3) = 90
	
// 1.b. Create a new Array with 9 elements (one more than the ages Array). Repeat the step
//	above to ensure it is dynamic (works for Arrays of different lengths).	
	int[] agesNew = {7, 14, 29, 11, 6, 75, 2, 91, 4}; //array of ints with 9 elements
	int firstValues = agesNew[0]; //container for first element
	int lastValues = agesNew[agesNew.length-1]; //container for last element
	System.out.println(lastValues - firstValues); //last element (4) - first element (7) = -3
	
// 1.c. Use a loop to iterate through the Array and calculate the average age. Print the result
//	to the console.
	double result = 0; //container for result initialized at zero
	for (int age : ages) { //enhanced loop for value of every element in array ages
		result += age;	//add value of age to result
	}
	double average = result/(ages.length); //outside for loop initialize average as the sum of the ages contained in result(230)divided by number of elements in array ages (8)
	System.out.println(average); //print average = 28.75
	
// 2. Create an Array of String called names that contains the following values: “Sam”, “Tommy”,
//	“Tim”, “Sally”, “Buck”, “Bob”.
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; //array of strings called names with provided values
	
// 2.a. Use a loop to iterate through the Array and calculate the average number of letters per
//	name. Print the result to the console.
	double total = 0; //container for total initialized at zero
	for (String name : names) { //enhanced for loop for value of every string in array names
		total += name.length(); //add value of length of each name to the total
	}
	System.out.println(total/(names.length)); //print out the total number of letters (23) divided by the number of elements in array (6) length to get the average = 3.83
	
// 2.b. Use a loop to iterate through the Array again and concatenate all the names together,
//	separated by spaces, and print the result to the console.
	StringBuilder concatNames = new StringBuilder(); //instantiate a stringBuilder 
	for (String name : names) { //enhanced for loop to iterate through every name in the array names
		concatNames.append(name + " "); //use append method to concatenate each name and a space
	}
	System.out.println(concatNames.toString()); //at the end of loop, print stringBuilder to string

// 3. How do you access the last element of any Array?
//  For the index, you would use the .length method to get the total number of elements and then minus one, since arrays are zero-indexed.
	 
// 4. How do you access the first element of any Array?
//  You would use zero as the index. 
	
// 5. Create a new Array of int called nameLengths. Write a loop to iterate over the previously
//	created names Array and add the length of each name to the nameLengths Array.
	int[] nameLengths = new int[names.length]; //instantiate a new array with the same length as the names array.
	for (int i = 0; i < names.length; i++) { //Write a for loop 
		nameLengths[i] = names[i].length(); //With each iteration, the value of nameLength becomes the length of the name at the corresponding index
	}
	for (int length : nameLengths) { //test this with a for loop by iterating through all the new values of nameLength
		System.out.println(length); //print values to console: Sam = 3, Tommy = 5, Tim = 3, Sally = 5, Buck = 4, Bob = 3
	}
	
// 6. Write a loop to iterate over the nameLengths Array and calculate the sum of all the elements in
//	the Array. Print the result to the console.
	int sum = 0; // initialize an integer to zero to hold the sum
	for (int nameLength : nameLengths) { //enhanced for loop to iterate through all the elements in array nameLength
		sum += nameLength; //add the value of each nameLength to the new total
	}
	System.out.println(sum); //print the total of the name lengths: 3+5+3+5+4=3 = 23
	
// 7. Test method repeatName:
	System.out.println(repeatName ("Hello", 3)); //pass in the arguments Hello and 3
	
// 8. Test method fullName:
	System.out.println(fullName ("Tom", "Smith")); //pass in the arguments Tom and Smith
	
// 9. Test method isOver100
	int[] test82 = {7, 25, 50}; //create an array whose elements have a sum of 82
	int[] test100 = {7, 25, 68}; //create an array whose elements have a sum of 100
	int[] test101 = {7,25, 69}; //create an array whose elements have a sum of 101
	System.out.println(isOver100 (test82)); //82 is not over 100 so it should evaluate to false
	System.out.println(isOver100 (test100)); //100 is equal to but not over 100 so it should evaluate to false
	System.out.println(isOver100 (test101)); //101 is over 100 so it should evaluate to true
	
	
//	10. Test the method returnTheAverage
	double[] doubleArray = {5, 8.6, 19, 11.3}; //initialize an array of doubles
	System.out.println(returnTheAverage (doubleArray)); //use the method to find the average of the array and print to console
	
//	11. Test the method isFirstArrayBigger
	double[] firstArray = {6, 19, 22.5, 6.3};// create a double array
	double[] secondArray = {2.3, 1, 7}; // create another double array whose average of elements is less than the first
	System.out.println(isFirstArrayBigger (firstArray, secondArray)); //since average of elements is large in the firt array, it should evaluate to true
	
//	12. Test the method willBuyDrink
	System.out.println(willBuyDrink (true, 11.23)); //pass in a boolean (true) and a double greater than 10.50 (11.23) that should evaluate to true
	
//	13. Test the method chooseMeal
	
	Scanner scanner = new Scanner(System.in);
	  System.out.print("For a Vegetarian option, PRESS 1; otherwise PRESS 2: ");
      int preferenceChoice = scanner.nextInt();
      
      String preference = "";
      if (preferenceChoice == 1) {
    	  preference = "Vegetarian";
      } else {
    	  preference = "Meat";
      }
      
      System.out.print("For a meal under 500 calories, PRESS 1, otherwise PRESS 2: ");
      int calorieChoice = scanner.nextInt();
      boolean under500Calories = calorieChoice == 1;
   ;
      System.out.println(chooseMeal(preference, under500Calories));
	

	}
// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word
//	concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to
//	return “HelloHelloHello”).
	public static String repeatName (String word, int n) { //method named repeatName that returns a String and has a Sting and int as parameters
		StringBuilder nameRepeater = new StringBuilder(); //instantiate a StringBuilder called nameRepeater
		for (int i = 0; i < n; i++) { //for loop that iterates the number of times passed to int n
			nameRepeater.append(word); //with each iteration the argument passed to String word is added to the String nameRepeater
		}
		return nameRepeater.toString(); //return a String by using .toString method
	}
	
// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the
//	full name should be the first and the last name as a String separated by a space). 
	public static String fullName (String firstName, String lastName) { //method named fullName that returns a String and has two Stings as its parameters
		StringBuilder concatNames = new StringBuilder(); //instantiate a StringBuilder called concatNames
		concatNames.append(firstName + " " + lastName); //use append method to concatenate firstName - space - lastName
		return concatNames.toString(); //return a Sting by using .toString method
	}
	
// 9. Write a method that takes an Array of int and returns true if the sum of all the ints in the Array is greater than 100.
	public static boolean isOver100 (int[] numbers) { //method named isOver100 that returns a boolean and takes an Array of ints called numbers
		int result = 0; // initialize a container called result
		for (int number : numbers ) { //use an enhanced for loop to iterate through every number in the Array numbers
			result += number; //with each iteration add the value of numbers to the result
		}
		return result > 100; //if result > 100, it will return true, otherwise it will return false
	}
	
// 10. Write a method that takes an Array of double and returns the average of all the elements in the Array.
	public static double returnTheAverage (double[] values) { //method named returnTheAverage that returns a double and takes an Array of double called values
		double sum = 0; // initialize a double to hold the sum
		for (double value : values) { //use an enhanced for loop to iterate through all the elements in the values Array
			sum += value; //with each iteration add the value of value to sum
		}
		return sum/(values.length); //return the value of sum divided by the number of elements in values to get the average
	}
	
//	11. Write a method that takes two Arrays of double and returns true if the average of the
//	elements in the first Array is greater than the average of the elements in the second Array.
	public static boolean isFirstArrayBigger (double[] firstArray, double[] secondArray) { //method called isFirstArrayBigger that returns a boolean and takes two Arrays of doubles
		double firstSum = 0; //Container to hold a sum for the firstArray
		for (double firstNumber : firstArray) { //enhanced for loop to iterate through the elements in firstArray
			firstSum += firstNumber; //add the value of each number to the sum
		}
		double secondSum = 0; //Container to hold a sum for the secondArray
		for (double secondNumber : secondArray) { //enhanced for loop to iterate through the elements in secondArray
			secondSum += secondNumber;	//add the value of each number to the sum
		}
		return firstSum/(firstArray.length) > secondSum/(secondArray.length); //evaluate if the average of the first array is larger than the second and return a boolean		
	}
	
//	12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double
//	moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && (moneyInPocket > 10.50);
	}
	
	
//	13. Create a method of your own that solves a problem. In comments, write what the method
//	does and why you created it.
	public static String chooseMeal(String preference, boolean under500Calories) { //this is a method to help decide what to order from a Chinese restaurant for someone like me that is a vegetarian and on a diet!
	    String recommendation = "You should order: "; //start a string
	    if (preference.contains("Vegetarian")) { //if the preference is vegetarian, then stay in this loop
	        if (under500Calories) {// if you want something less than 500 calories, 
	            recommendation += "Steamed Vegetables with Tofu"; // then the recommendation will be steamed vegetables with tofu
	        } else {
	            recommendation += "Vegetable Fried Rice"; //or if more than 500 hundred calories, code will recommend vegetable fried rice
	        }
	    } else {
	        if (under500Calories) { //if not vegetarion and under 500 calories
	            recommendation += "Steamed Vegetables with Chicken"; // order steamed vegetables with chicken
	        } else {
	            recommendation += "Kung Pao Chicken"; //or if over 500 calories order kung pao chicken
	        }
	    }
	    return recommendation;
	}
	

}
