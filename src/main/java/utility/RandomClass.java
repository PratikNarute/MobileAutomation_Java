package utility;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomClass 
{
	public static String getRandomIntegers(int digit)
	{
		//   return "" + Math.round((Math.random()*999));	
//  =====================================================================================================
//		   Random rand = new Random();
//	       int randomNumber = rand.nextInt(1001);    	    // generate a random integer between 0 and 1000
//	       System.out.println(randomNumber);
//	=====================================================================================================
	   	String randomNumber=RandomStringUtils.randomNumeric(digit);  // generate a random integer of 3 digits
	
	       return "91"+randomNumber;
//    =====================================================================================================
	}
	public static String getRandomString(int digit)
	{
		String randomString=RandomStringUtils.randomAlphabetic(digit); // generate a random Strings of 3 digits
		return "ab"+randomString;
	}
	
	public static int getRandomDataUpTONumber(int number)
	{
		Random random = new Random();
		int randomNumber=random.nextInt(number);
	    return randomNumber;
	}


}
