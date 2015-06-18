package com.hariram.numerology;

import org.junit.Test;

public class NumbersTest {

	@Test
	public void test() {
		//Numbers.getNumbers("1981-04-25 00:00");
		Number number = Numbers.getNumbers("25-04-1981 00:00");
		System.out.println(number);
	}

}
