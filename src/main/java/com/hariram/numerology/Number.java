/**
 * 
 */
package com.hariram.numerology;

/**
 * @author hariram
 *
 */
public class Number {
	private int charNum = 0;
	private int fateNum = 0;
	
	/**
	 * Default constructor
	 */
	public Number() {
	}
	
	/**
	 * 
	 * @return
	 */
	public int getCharNum() {
		return charNum;
	}
	
	/**
	 * 
	 * @param charNum
	 */
	public void setCharNum(int charNum) {
		this.charNum = charNum;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getFateNum() {
		return fateNum;
	}
	
	/**
	 * 
	 * @param fateNum
	 */
	public void setFateNum(int fateNum) {
		this.fateNum = fateNum;
	}
	
	/**
	 * Overridden method of toString
	 * returns the value of the variables as string
	 */
	public String toString() {
		return "charNum: " + charNum +
				"fateNum: " + fateNum;
	}
}
