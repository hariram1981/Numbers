package com.hariram.numerology;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Numbers {
	/**
	 * Input as dd-mm-yyyy
	 */
	public static Number getNumbers(String strDate) {
		//Convert string to date
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(strDate, dateFormatter);
		
		int date = dateTime.getDayOfMonth();
		int month = dateTime.getMonthValue();
		int year = dateTime.getYear();
		
		int total = date + month + year;
		
		int charNum = NumberUtil.getSingleValue(date);
		
		int fateNum = NumberUtil.getSingleValue(total);
		
		Number number = new Number();
		number.setCharNum(charNum);
		number.setFateNum(fateNum);

		return number;
	}
}
