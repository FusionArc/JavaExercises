package exercises;

public class Exercise_1 {
	public static String str1 = "yesterday it was raining";
	public static String str2 = "today it is sunny";
	public static String concatString = str2.toUpperCase() + ", " + str1.toUpperCase();
	public static String subString1 = concatString.substring(0, 11); 
	public static String subString2 = concatString.substring(35, 43);
}


/*Create two Strings where one string has a value of “yesterday it was raining” and the other string with a value of “today it is sunny” // Done
Concatenate both values, capitalise both strings and print out the result.
The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
Now use the substring method to print out: `TODAY IT IS RAINING`
*/