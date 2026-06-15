package genericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

 /**
  * Thie method is used to generate random number from 1 to 100
  * @return random number
  */
	public int getRandomNumber() {
		
		Random random = new Random();
		return random.nextInt(100)+1;
	}
	/**
	 * This Method used to capture system's current date and time 
	 * @return return the value in string formate
	 */
	public String getSystemDate() {
		Date date=  new Date();
		return date.toString();
	}
	
	/**
	 *This Method used to capture system's current date and time in a formate 
	 * @return string value
	 */
	public String getSystemDateInFormate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH-MM-SS");
		Date date = new Date();
		return sdf.format(date);
		
	}
}
