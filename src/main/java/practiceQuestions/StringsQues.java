package practiceQuestions;

import java.nio.channels.MulticastChannel;
import java.nio.file.ClosedWatchServiceException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.print.DocFlavor.INPUT_STREAM;

import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class StringsQues {

	public static void main1(String[] args) {// reverse string

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String: ");
		String myString = scanner.nextLine();
		String reverseString = "";
		//		StringTokenizer stringTokenizer = new StringTokenizer(myString, " ");
		//		while (stringTokenizer.hasMoreTokens()) {
		//			String str = (String) stringTokenizer.nextToken();
		//			reverseString = str + " "+reverseString;
		//		}

		//		myString += " ";
		//		String newWord = "";
		//		for(Character myChar: myString.toCharArray()) {
		//			if (!Character.isWhitespace(myChar)) {
		//				newWord += myChar;
		//			}else {
		//				reverseString = newWord + " " + reverseString;
		//				newWord = "";
		//			}
		//		}

		myString += " ";
		String newWord = "";
		for(int i=0; i<myString.length();i++){
			Character myChar = myString.charAt(i);
			if(Character.isLetter(myChar)) {
				newWord += myChar;
			}else if (Character.isWhitespace(myChar)) {
				reverseString = newWord +" "+ reverseString;
				newWord= "";
			}
		}

		System.out.println("Reverse string: "+ reverseString);
		scanner.close();
	}


	public static void main2(String[] args) {//reverse each words
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter string to reverse");
		String myString = scanner.nextLine();

		String newWord = "";
		String reverseString = "";
		String[] strArr = myString.split(" ");
		for(String string : strArr) {
			for (int i = 0; i < string.length(); i++) {
				Character myCharacter = string.charAt(i);
				reverseString = myCharacter + reverseString;
			}
			newWord = newWord + " "+ reverseString;
			reverseString= "";
		}

		System.out.println("Reverse each word:  "+newWord);
		scanner.close();
	}

	public static void main3(String[] args) {//duplicate character in string
		String myString = "Learn Java Programming";
		Map<Character, Integer> charCounts = new TreeMap<>();
		for(Character myChar : myString.toCharArray()) {
			if(!Character.isWhitespace(myChar)) {
				if (!charCounts.containsKey(myChar)) {
					int initialCount = 1;
					charCounts.put(myChar, initialCount);
				}else {
					int count = charCounts.get(myChar);
					count++;
					charCounts.put(myChar, count);
				}
			}
		}

		charCounts.forEach((K,V) -> {
			if(V >1) {
				System.out.println("Key : "+K+" - Value: "+ V);
			}
		});
	}


	public static void main4(String[] args) {// find occurence of each words
		Map<String , Integer> myMap = new TreeMap<String, Integer>();
		String myString= "Test Automation Java Automation";
		StringTokenizer stringTokenizer =  new StringTokenizer(myString, " ");
		while (stringTokenizer.hasMoreElements()) {
			String str = (String) stringTokenizer.nextElement();
			if(!myMap.containsKey(str)) {
				myMap.put(str, 1);
			}else {
				myMap.put(str, myMap.get(str)+1);
			}
		}
		for(Map.Entry<String , Integer> entry: myMap.entrySet()) {
			System.err.println(entry.getKey()+ " - "+ entry.getValue());
		}
	}

	public static void main5(String[] args) {//count no of strings
		String myString = "Welcome to Java World";
		int strCount = 0;
		String[] strArr = myString.split(" ");
		for(String str: strArr) {
			strCount++;
		}
		System.out.println("Count of String : "+ strCount);
	}

	public static void main6(String[] args) {//palidrome word
		String myString= "malayalam";
		String reverseString = "";
		for(Character myChar: myString.toCharArray()) {
			reverseString = myChar + reverseString;
		}
		if (myString.equals(reverseString)) {
			System.out.println("String is a palindrome");
		}else
			System.out.println("String is not a palindrome");
	}

	public static void main7(String[] args) {
		String str1= "listen";
		String str2= "silents";

		if(str1.length() != str2.length()) {
			System.out.println("Strings are not anagrams");	
		}

		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Strings are anagrams");	
		}else {
			System.out.println("Strings are not anagrams");	
		}
	}

	public static void main8(String[] args) {//vowel and consonants count
		String string= "Hello World";
		int vowelCount=0;
		int consCount=0;
		for(Character myChar: string.toCharArray()) {
			char c = Character.toLowerCase(myChar);
			if (Character.isLetter(c)) {
				if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')) {
					vowelCount++;
				}else {
					consCount++;
				}
			}
		}
		System.out.println("Vowel Count: "+ vowelCount);
		System.out.println("Consonant Count: "+consCount);
	}


	public static void main9(String[] args) {
		String str = "Java Autoamtion";
		Set<Character> uniqueChars= new HashSet<Character>();
		for(Character myChar: str.toCharArray()) {
			if (!uniqueChars.contains(myChar)) {
				uniqueChars.add(myChar);
				System.out.println("Unique Chars: "+ myChar);
			}
		}
	}

	public static void main10(String[] args) {//print even indexed chars
		String myString= "Automation";
		for(int i=0; i<myString.length();i++) {
			if (i % 2 == 0) {
				System.out.print(myString.charAt(i));
			}
		}
	}
	public static void main11(String[] args) {//Remove space from between words
		String myString = "Welcome to Java World";
		//System.out.println(myString.replace(" ", ""));
		String newWord = "";
		for(Character myChar: myString.toCharArray()) {
			if (!Character.isWhitespace(myChar)) {
				newWord += myChar;
			}
		}
		System.err.println("string: "+ newWord);
	}

	public static void main12(String[] args) {//print each char twice
		String string= "Hello";
		StringBuffer sBuffer = new StringBuffer();
		for(Character myChar: string.toCharArray()) {
			sBuffer.append(myChar).append(myChar);			
		}
		System.out.println(sBuffer);
	}

	public static void main13(String[] args) {//swap two string without 3rd variable
		String str1= "Hello";
		String str2 = "World";

		str1 = str1+str2;
		//HelloWorld
		str2 = str1.substring(0,str1.length()- str2.length());

		str1 = str1.substring(str2.length());

		System.out.println("String 1: "+str1);
		System.out.println("String 2: "+str2);
	}

	public static void main14(String[] args) {//char + count
		String string = "aabbcccdd";
		int count=1;
		StringBuffer sb= new StringBuffer();
		for(int i=0; i<string.length();i++) {
			if(i+1< string.length() && string.charAt(i) == string.charAt(i+1)) {
				count++;
			}else {
				sb.append(string.charAt(i)).append(count);
				count =1;
			}
		}
		System.out.println("new String: "+ sb);
	}

	public static void main15(String[] args) {//move zeros to end
		String string = "32400121200";
		String zeros = "";
		String nonZeros = "";
		for (Character myChar : string.toCharArray()) {
			if (Character.isDigit(myChar)) {
				if (myChar == '0') { // Note: '0' as character, not 0 as number
					zeros += myChar;
				} else {
					nonZeros += myChar;
				}
			}
		}
		System.out.println("New String: " + nonZeros + zeros);
	}

	public static void main16(String[] args) {//longest unique substring
		String string = "abcabcbb";
		int maxLength=0;
		Set<Character> uniqueChars= new TreeSet<Character>();
		for(Character myChar:string.toCharArray()) {
			if (!Character.isWhitespace(myChar)) {
				uniqueChars.add(myChar);
				if (uniqueChars.size() > maxLength) {
					maxLength = uniqueChars.size();
				}
			}else {
				uniqueChars.clear();
			}
		}
		System.out.println("Longest Substring: "+ uniqueChars.toString());
	}
	
	public static void main(String[] args) {
		String string = "abc";
		permute(string, "");
	}

	public static void permute(String str, String prefix) {	
		if(str.length()==0) {
			System.out.println(prefix);
		}else {
			for(int i=0; i<str.length();i++) {
				String remString= str.substring(0,i)+ str.substring(i+1);
				permute(remString, prefix+ str.charAt(i));
			}
		}
	}
}
