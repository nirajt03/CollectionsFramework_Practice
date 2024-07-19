package justPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class StringPracticeQues {

	//	public static void main(String[] args) { //reverse string
	//		// input - maam
	//	    // output - maam 
	//		
	//		String myString = "maam";
	//		String reverseString = "";
	//		for (int i = 0; i < myString.length(); i++) {
	//			if(Character.isLetter(myString.charAt(i))) {
	//				reverseString = myString.charAt(i) + reverseString;
	//			}
	//		}
	////		StringBuilder sb = new StringBuilder(myString);
	////		reverseString	= sb.reverse().toString();
	//		
	//		if (reverseString.equals(myString)) {
	//			System.out.println("String is a palindrome");
	//		}else {
	//			System.out.println("String is not a palindrome");
	//		}		
	//	}

	//	public static void main(String[] args) { //remove white space 
	//		// input - " hello java programming ";
	//	    // output - "hellojavaprogramming"; 
	//		
	//		String myString = " hello java programming ";
	//		String newString = "";
	//		for(Character myCharacter : myString.toCharArray()) {
	//			if (!Character.isWhitespace(myCharacter)) {
	//				newString += myCharacter;
	//			}
	//		}
	//		System.out.println("New string without space1 : "+ newString);
	//		
	//		System.out.println("New string without space2 : "+ myString.replace(" ", ""));
	//	}

	//	public static void main(String[] args) { //count java word occurence
	//		// String - "Java is a programming language. Java is widely used in Software Testing";
	//		// input - "Java"    // output - 2; 
	//
	//		String myString = "Java is a programming language. Java is widely used in Software Testing";
	//		myString +=" ";
	//		String newWordString= "";
	//		int wordCount = 0;
	//		//		StringTokenizer stringTokenizer =  new StringTokenizer(myString, " ");
	//		//		while (stringTokenizer.hasMoreElements()) {
	//		//			String str = (String) stringTokenizer.nextElement();
	//		//			if (str.equalsIgnoreCase("Java")) {
	//		//				wordCount++;
	//		//			}
	//		//		}
	//
	//		//		for(Character myCharacter : myString.toCharArray()) {
	//		//			if (!Character.isWhitespace(myCharacter)) {
	//		//				newWordString += myCharacter;
	//		//			}else {
	//		//				if (newWordString.equalsIgnoreCase("Java")) {
	//		//					wordCount++;
	//		//				}
	//		//				newWordString= "";
	//		//			}
	//		//		}
	//
	//		String[] strArr = myString.split(" ");
	//		for (int i = 0; i < strArr.length; i++) {
	//			if(strArr[i].equalsIgnoreCase("Java")) {
	//				wordCount++;
	//			}
	//		}
	//		System.out.println("Java word count is : "+ wordCount);
	//	}

	//	public static void main(String[] args) { //count each word occurence
	//		// Input - "Alice is girl and Bob is boy";
	//		// output - {Bob=1, Alice=1, and=1, is=2,girl=1, boy=1} 
	//		
	//		Map<String , Integer> myMap = new TreeMap<>();
	//		String myString = "Alice is girl and Bob is boy";
	//		String[] myArr = myString.split(" ");
	//		for(String string : myArr) {
	//			if (!myMap.containsKey(string)) {
	//				int initialCount = 1;
	//				myMap.put(string, initialCount);
	//			}else {
	//				int wordCount = myMap.get(string);
	//				wordCount++;
	//				myMap.put(string, wordCount);
	//			}
	//		}
	//		for (Map.Entry<String,Integer> entry : myMap.entrySet()) {
	//			String key = entry.getKey();
	//			Integer val = entry.getValue();
	//			System.out.println("Count for word : "+key+" is : "+ val);
	//		}		
	//	}


	//	public static void main(String[] args) { //reverse entire sentence
	//		// String - "India is my country"
	//		// output - "country my is India"
	//		String revString = "";
	//		String myString = "India is my country";
	//		String[] words = myString.split(" ");
	//		for(String word : words) {
	//			revString = word + " "+revString ; 
	//		}		
	//		System.out.println("Reverse Sentence : "+ revString.trim());
	//	}

	//	public static void main(String[] args) { //count occurence of each character
	//		// Input - "This is an example"
	//		// output - {p=1, a=2, s=2, T=1, e=2, h=1, x=1, i=2, l=1, m=1, n=1} 
	//		Map<Character, Integer> charMap = new TreeMap<>();
	//		String myString = "This is an example";
	//		for(Character myChar: myString.toCharArray()) {
	//			if (!Character.isWhitespace(myChar)) {
	//				if (!charMap.containsKey(myChar)) {
	//					int initialCount= 1;
	//					charMap.put(myChar, initialCount);
	//				}else {
	//					charMap.put(myChar, charMap.get(myChar)+1);
	//				}
	//			}
	//		}
	//		for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
	//			Character key = entry.getKey();
	//			int val = entry.getValue();
	//			System.out.println(key+" : "+val );
	//		}
	//	}




	//	public static void main(String[] args) { //remove duplicates
	//		// Input - "abc","def","abc","mno","xyz","pqr","xyz","pqr"
	//		// output - "abc","def","mno","xyz","pqr"
	//		Set<String> uniqueStrings = new TreeSet<String>();
	//		List<String> wordsList = Arrays.asList("abc","def","abc","mno","xyz","pqr","xyz","pqr");
	//		for(String word: wordsList) {
	//			if(!uniqueStrings.contains(word)) {
	//				uniqueStrings.add(word);
	//			}
	//		}		
	//		System.out.println(uniqueStrings.toString());
	//	}

	//	public static void main(String[] args) { //reverse each words in string
	//		// Input - "reverse each word in a string"
	//		// output - "esrever hcae drow ni a gnirts"
	//
	//		String myString =  "reverse each word in a string";
	//		String[] strArr = myString.split(" ");
	//		String newString = "";
	//
	//		//		StringTokenizer stringTokenizer = new StringTokenizer(myString, " ");
	//		//		while (stringTokenizer.hasMoreElements()) {
	//		//			String str = (String) stringTokenizer.nextElement();
	//		//			String revString="";
	//		//			StringBuilder sb = new StringBuilder(str);
	//		//			revString = sb.reverse().toString();
	//		//			newString = newString + revString + " ";	
	//		//		}
	//
	//		for(int i=0; i< strArr.length;i++) {
	//			String word = strArr[i];
	//			String revString = "";
	//			for (int j = 0; j < word.length(); j++) {
	//				revString = word.charAt(j)+ revString;
	//			}
	//			newString = newString+revString+" ";
	//			revString="";
	//		}
	//		System.out.println("Reverse each words : "+ newString);
	//	}

	//	public static void main(String[] args) { //check anagrams
	//		// Input - str1= "Army" str2="Mary"
	//		// output - Army and mary are anagrams
	//
	//		String string1 = "Army";
	//		String string2 = "Mary";
	//		if (! (string1.length()==string2.length())) {
	//			System.out.println(string1 + " and "+ string2+ " are not anagrams");
	//		}
	//		char[] arr1= string1.toLowerCase().toCharArray();
	//		char[] arr2= string2.toLowerCase().toCharArray();
	//		
	//		Arrays.sort(arr1);
	//		Arrays.sort(arr2);
	//		
	//		if(Arrays.equals(arr1, arr2))
	//			System.out.println(string1 + " and "+ string2+ " are anagrams");
	//		else
	//			System.out.println(string1 + " and "+ string2+ " are not anagrams");
	//	}

	//	public static void main(String[] args) { //seperate letter, digit, and special chars
	//		// Input - "Welcome234To567Java89Programming0@#!!"
	//		// output - WelcomeToJavaProgramming, 234567890, @#!!
	//		String letterString="";
	//		String digitString="";
	//		String specialCharString="";
	//		String myString = "Welcome234To567Java89Programming0@#!!";
	//	    for(Character myChar: myString.toCharArray()) {
	//	    	if (Character.isLetter(myChar)) {
	//				letterString+=myChar;
	//			}else if (Character.isDigit(myChar)) {
	//				digitString += myChar;
	//			}else {
	//				specialCharString += myChar;
	//			}
	//	    }
	//	    System.out.println("Letters : "+letterString);
	//	    System.out.println("Digits : "+digitString);
	//	    System.out.println("Special Characters : "+specialCharString);
	//	}

	//	public static void main(String[] args) { //print duplicates
	//		// Input - "apple is fruit"
	//		// output - p i
	//		String myString = "apple is fruit";
	//		Set<Character> charSet = new HashSet<Character>();
	//		for(Character myChar: myString.toCharArray()) {
	//			if (Character.isLetter(myChar) ) {
	//				if(!charSet.contains(myChar)) {
	//					charSet.add(myChar);
	//				}else {
	//					System.out.println("Duplicate character : "+ myChar);
	//				}
	//			}
	//
	//		}
	//	}

	//	public static void main(String[] args) { //reverse string
	//		// Input - "hello"
	//		// output - "olleh"
	//		String myString = "hello";
	//		String revString = "";
	//		for(Character myChar : myString.toCharArray()){
	//			revString = myChar + revString;
	//		}
	//		System.out.println("Reverse String : "+ revString);
	//	}

	//	public static void main(String[] args) { //palindrome string
	//		// Input - "madam"
	//		// output - "madam"
	//		String myString = "madam";
	//		String revString = "";
	//		for(Character myChar : myString.toCharArray()){
	//			revString = myChar + revString;
	//		}
	//		if(myString.equals(revString)){
	//			System.out.println("String is a palindrome");
	//		}else{
	//			System.out.println("String is not a palindrome");
	//		}
	//	}

	//	  public static void main(String args[]) { //Anagrams
	//	    	String str1 = "listen";
	//			String str2 = "silent";
	//			if(areAnagrams(str1, str2)){
	//				System.out.println("Strings are a anagrams");
	//			}else{
	//				System.out.println("Strings are not a anagrams");
	//			}
	//	    }	    
	//	    public static boolean areAnagrams(String str1, String str2){
	//	        if(str1.length() != str2.length()){
	//			    return false;
	//			}
	//			int[] charCount = new int[256];
	//			for(int i=0; i<str1.length(); i++){
	//			    charCount[str1.charAt(i)]++;
	//			    charCount[str2.charAt(i)]--;
	//			}			
	//			for(int count : charCount){
	//			    if(count != 0){
	//			        return false;
	//			    }
	//			}
	//			return true;
	//	    }

	//	public static void main(String[] args) { //palindrome string
	//	// Input - "madam"
	//	// output - "madam"
	//	String myString = "madam";
	//	String revString = "";
	//	for(Character myChar : myString.toCharArray()){
	//		revString = myChar + revString;
	//	}
	//	if(myString.equals(revString)){
	//		System.out.println("String is a palindrome");
	//	}else{
	//		System.out.println("String is not a palindrome");
	//	}
	//}

	//	public static void main(String args[]) {//unique string and length of unique string
	//		String myString = "abcabcbb";
	//		int maxLength=0;
	//		Set<Character> mySet = new TreeSet<Character>();
	//		for(Character myChar : myString.toCharArray()){
	//			if(!Character.isWhitespace(myChar)){
	//				mySet.add(myChar);
	//				if(mySet.size()> maxLength){
	//					maxLength = mySet.size();
	//				}
	//			}else{
	//				mySet.removeAll(mySet);
	//			}
	//		}
	//		System.out.println("Longest sub string length "+ maxLength);
	//		System.out.println("Longest sub string "+ mySet.toString());
	//	}

	//	 public static void main(String args[]) {//compress string
	//	    	String myString = "aabcccccaaa";
	//	    	String newString = "";
	//			int count=1;
	//		      for(int i=0; i< myString.length(); i++){
	//		          if(i+1 < myString.length() && myString.charAt(i) == myString.charAt(i+1)){
	//		              count++;
	//		          }else{
	//		              newString += myString.charAt(i);
	//		              newString += count;
	//		              count = 1;
	//		          }
	//		      }
	//		     System.out.println("Compressed sub string length "+ newString); 
	//	    }

	//	public static void main(String args[]) {// tokenize words
	//		String myString = "Hello Java Word Programming";
	//		myString += " ";
	//		String newWord = "";
	//		for(int i=0; i< myString.length(); i++ ){
	//			char c = myString.charAt(i);
	//			if(!Character.isWhitespace(c)){
	//				newWord += c;
	//			}else{
	//				System.out.println("words : "+ newWord);
	//				newWord = "";
	//			}
	//		}
	//	}

	//	public static void main(String args[]) {// combination
	//
	//		String myString = "abc";
	//		String prefix = "";
	//		permute(myString, prefix);
	//	}    
	//	public static void permute(String str, String prefix){
	//		if(str.length()==0){
	//			System.out.println(prefix);
	//		}else{
	//			for(int i=0; i < str.length(); i++){
	//				String rem = str.substring(0,i) + str.substring(i+1);
	//				permute(rem, prefix+str.charAt(i));
	//			}
	//		}
	//	}


	//	 public static void main(String args[]) {	//vowel & consonant count        
	//	        String myString = "Hello World from Java";
	//	        int vowelCount = 0;
	//	        int consonantCount = 0;
	//	        for(int i=0; i<myString.length();i++){
	//	            char c = Character.toLowerCase(myString.charAt(i));
	//	            if( (c=='a') ||(c=='e') ||(c=='i')||(c=='o')||(c=='u')){
	//	                vowelCount++;
	//	            }else{
	//	                consonantCount++;
	//	            }
	//	        }
	//	        System.out.println("Vowels : "+ vowelCount);
	//	        System.out.println("Consonants : "+ consonantCount);
	//	    
	//	    }

//	public static void main(String args[]) {// pangram
//		String myString = "The quick brown fox jumps over the lazy dog";
//		System.out.println("String is a Pangram "+isPangram(myString));
//
//	}	    
//	public static boolean isPangram(String myString){
//		boolean[] seen = new boolean[26];
//		myString = myString.toLowerCase();
//		for(Character c : myString.toCharArray()){
//			if(c >= 'a' && c <='z'){
//				seen[c-'a'] = true;
//			}
//		}
//		for(boolean b : seen){
//			if(!b){
//				return false;
//			}
//		}
//		return true;
//	}
	
	 public static void main(String args[]) { // rotation of string
	        
	        String str1 = "waterbottle";
	        String str2 = "erbottlewat";
	      
	      if(str1.length() != str2.length()){
	          System.out.println("Strings are not equal");
	      }
	      String concatenated = str1+str2;
	      if(concatenated.contains(str1))
	         System.out.println("Strings are rotation");
	    
	    }
	    
	
}
