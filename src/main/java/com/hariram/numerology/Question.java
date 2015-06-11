/**
 * 
 */
package com.hariram.numerology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author hariram
 *
 */
public class Question {
	public static void getNumber(String question) {
		//Split question by space and find length of each
		
		String[] words = question.split(" ");
		//int[] wordsLen = new int[words.length];
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < words.length; i++) {
			list.add(words[i].length());
		}
		
		System.out.println(list);
		
		int value = getSingleValue(list).get(0);
		value = NumberUtil.getSingleValue(value);
		System.out.println(value);
	}
	
	public static List<Integer> getSingleValue(List<Integer> inputList) {
		List<Integer> outputList = new ArrayList<Integer>();
		
		for(int i = 0; i < (inputList.size() - 1); i++) {
			int a = inputList.get(i);
			int b = inputList.get(i+1);
			outputList.add(a + b);
		}
		
		if(outputList.size() >= 2) {
			outputList = getSingleValue(outputList);
		}
		
		return outputList;
	}
}
