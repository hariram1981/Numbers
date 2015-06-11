/**
 * 
 */
package com.hariram.numerology;

/**
 * @author hariram
 *
 */
public class NumberUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	public static int getSingleValue(int number) {
		int sum = 0;
		int input = number;
		
		while(input != 0) {
			int lastdigit = input % 10;
			sum += lastdigit;
			input = input / 10;
		}
		
		if(sum > 9) {
			sum = getSingleValue(sum);
		}
		
		return sum;
	}

}
