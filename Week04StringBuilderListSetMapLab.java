//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		System.out.println("Prompt 1");
		StringBuilder sb = new StringBuilder();
		
		String num0  = "0";
		String num1  = "1";
		String num2  = "2";
		String num3  = "3";
		String num4  = "4";
		String num5  = "5";
		String num6  = "6";
		String num7  = "7";
		String num8  = "8";
		String num9  = "9";
		String dash = "-";
		sb.append(num0);
		sb.append(dash);
		sb.append(num1);
		sb.append(dash);
		sb.append(num2);
		sb.append(dash);
		sb.append(num3);
		sb.append(dash);
		sb.append(num4);
		sb.append(dash);
		sb.append(num5);
		sb.append(dash);
		sb.append(num6);
		sb.append(dash);
		sb.append(num7);
		sb.append(dash);
		sb.append(num8);
		sb.append(dash);
		sb.append(num9);
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder();
		String[] numbers = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		int i = 9;
		for (String number : numbers) {
				do {
					sb2.append(number);
					sb2.append(dash);
					i++;
				}	while (i < (numbers.length -1));
			} 
		sb2.deleteCharAt(sb2.length()-1);
		System.out.println(sb2);
		
			
		
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		List<String> fiveStrings = new ArrayList<>(Arrays.asList("12345678", "three", "four", "eleven", "fifteen"));
//		fiveStrings.add("one");
//		fiveStrings.add("three");
//		fiveStrings.add("four");
//		fiveStrings.add("seven");
//		fiveStrings.add("eleven");
	
		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
System.out.println("Prompt 3");
		System.out.println(smallestWord(fiveStrings));

		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
System.out.println("Prompt 4");
	System.out.println(switchElements(fiveStrings));
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
System.out.println("Prompt 5");
		System.out.println(listToString(fiveStrings));

		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
System.out.println("Prompt 6");
//		System.out.println(listOptions(fiveStrings, "add : "));
System.out.println(searchList(fiveStrings, "t"));

		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
System.out.println("Prompt 7");
List<Integer> testNum = new ArrayList<Integer>();
testNum.add(1);
testNum.add(2);
testNum.add(3);
testNum.add(4);
testNum.add(5);
testNum.add(6);
testNum.add(7);
System.out.println(fourList(testNum));
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
System.out.println("Prompt 8");
System.out.println(wordsToNum(fiveStrings));

		
		// 9. Create a set of strings and add 5 values
Set<String> fiveStrings2 = new HashSet<String>();
fiveStrings2.add("ten");
fiveStrings2.add("eleven");
fiveStrings2.add("twelve");
fiveStrings2.add("thirteen");
fiveStrings2.add("fourteen");

		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
System.out.println("Prompt 10");
System.out.println(checkChar(fiveStrings2, 'l'));

		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
System.out.println("Prompt 11");
System.out.println(intoList(fiveStrings2));
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
Set<Integer> numSet = new HashSet<Integer>();
numSet.addAll(testNum);
System.out.println(evenSet(numSet));
		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
Map<String, String> dictionary = new HashMap<String, String>();
dictionary.put("sternutation", "the act of sneezing.");
dictionary.put("comprise", "to include or consist of (something).");
dictionary.put("forage", "to search for something");
	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
System.out.println("Prompt 14");
System.out.println(wordLookUp(dictionary, "forage"));
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
System.out.println("Prompt 15");		
Map<Character, Integer> counts = containsChar(fiveStrings);
for (Character chara : counts.keySet()) {
	System.out.println(chara + " - " + counts.get(chara));
}
	}
	
	
	// Method 15:
static Map<Character, Integer> containsChar(List<String> x){
Map<Character, Integer> y = new HashMap<Character, Integer>();
for (String z : x) {
	char w = z.charAt(0);
	if (y.get(w) == null) {
		y.put(w, 1);
	} else {
		y.put(w, y.get(w) + 1);
	}
}

return y;
}
	
	
	// Method 14:
static String wordLookUp(Map<String, String> x, String y){
return x.get(y);
}

	
	// Method 12:
static Set<Integer> evenSet(Set<Integer> x)	{
Set<Integer> y = new HashSet<Integer>();
for (int z : x) {
	if (z % 2 == 0) {
		y.add(z);
	}
}
return y;
}

	
	// Method 11:
static List<String> intoList(Set<String> x) {
List<String> y = new ArrayList<String>();
y.addAll(x);
return y;
}


	// Method 10:
static Set<String> checkChar(Set<String> x, char y) {
Set<String> z = new HashSet<String>();
// Set<String> u = new HashSet<String>();
String u = String.valueOf(y);
List<String> w = new ArrayList<String>();
for (String v : x) {
	w.add(v);
	}
for (int i = 0; i < x.size(); i++) {
	if (w.get(i).contains(u)) {
		z.add(w.get(i));
	}
}
return z;	
}


	
	// Method 8:
	static List<Integer> wordsToNum(List<String> x) {
		List<Integer> y = new ArrayList<Integer>();
		for (int i = 0; i < x.size(); i++) {
			y.add(x.get(i).length());
		}
		return y;
	}

	
	// Method 7:
static List<List<Integer>> fourList(List<Integer> x) {
	List<List<Integer>> y = new ArrayList<List<Integer>>();
	List<Integer> r = new ArrayList<Integer>();
	List<Integer> t = new ArrayList<Integer>();
	List<Integer> u = new ArrayList<Integer>();
	List<Integer> v = new ArrayList<Integer>();
	for (int i = 0; i < x.size(); i++) {
		int i2 = x.get(i);
		if ((i2 % 2) == 0) {
			r.add(x.get(i));
		}
		if ((i2 % 3) == 0) {
			t.add(x.get(i));
		}
		if ((i2 % 5) == 0) {
			u.add(x.get(i));
		} else if (((i2 % 2) != 0) && ((i2 % 3) != 0) && ((i2 % 5) != 0)){
			v.add(x.get(i));
		}
	}
	y.add(t);
	y.add(t);
	y.add(u);
	y.add(v);
	return y;
}
	
	// Method 6:
//static List<String> listOptions(List<String> x, String y) {
	//StringBuilder xy = new StringBuilder();
//	List<String> xyz = new ArrayList<String>();
//	xy.append(y);
//	for (int i = 0; i < (x.size()); i++) {		
//			xy.append(x.get(i));
//			xyz.add(xy.toString());
//			xy.delete(y.length(), (y.length() + x.get(i).length()));
//	}
//	return xyz;
//}
	//misunderstood the prompt lol	
	static List<String> searchList(List<String> x, String y) {
	List<String> xyz = new ArrayList<String>();
	for (int i = 0; i < x.size(); i++) {
		if (x.get(i).contains(y)) {
			xyz.add(x.get(i));
	}
	}
	return xyz;
	}
	// Method 5:
// static String[] listToArray(List<String> x) {
//	String[] array = new String[x.size()];
//	for (int i = 0; i < (x.size() - 1); i++) {
//		array[i] = x.get(i);
//	}
//	return array;
// }
//misunderstood the prompt lol
	
static StringBuilder listToString(List<String> x) {
	StringBuilder newX = new StringBuilder();
	for (int i = 0; i < x.size(); i++) {
		newX.append(x.get(i));
		newX.append(", ");
	}
	newX.delete((newX.length()-2), (newX.length()-1));
	return newX;
}
	
	// Method 4:
static List<String> switchElements(List<String> x) {
Collections.swap(x, 0, ((x.size() - 1)));
return x;
}
	
	
	// Method 3:
static String smallestWord(List<String> x) {
	int minimum = x.get(0).length();
	 String minWord = x.get(0);
     for (int i = 1; i < x.size(); i++) {
    	 
    	 if (minimum > x.get(i).length()) {
    		 minimum = x.get(i).length();
    	 	 minWord = x.get(i);
    	 
    	 }
    	
     }
     return minWord;
}
			
		
	
	

}