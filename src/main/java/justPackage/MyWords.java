package justPackage;

import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class MyWords {

	//		public static void main(String[] args) {
	//			String myString = "My name is Niraj Tiwari";
	//	
	//			StringTokenizer st = new StringTokenizer(myString," ");
	//			while (st.hasMoreElements()) {
	//	
	//				String str = st.nextToken();
	//	
	//				System.out.println("My Stirng is "+ str);
	//			}
	//		}

	//	public static void main(String[] args) {
	//		String myString = "My name is Niraj Tiwari";
	//
	//		String[] strArr = myString.split(" ");
	//		for (int i = 0; i < strArr.length; i++) {
	//			System.out.println("My String is "+ strArr[i]);
	//		}
	//	}


	//		public static void main(String[] args) {
	//			String myString = "My name is Niraj Tiwari";
	//			//myString +=" ";
	//			String wordString = "";
	//			for (int i = 0; i < myString.length(); i++) {
	//				char c = myString.charAt(i);
	//				if (!Character.isWhitespace(c)) {
	//					wordString = wordString + c;
	//				}else {
	//					System.out.println("My String is "+ wordString);
	//					wordString = "";
	//				}
	//			}
	//		}

	//	public static void main(String[] args) {
	//		String myString = "My name is Niraj Tiwari and I don't know Malayalam language";
	//		myString +=" ";
	//		String wordString = ""; 
	//		String revString= "";
	//		for (int i = 0; i < myString.length(); i++) {
	//			char c = myString.charAt(i);
	//			if (!Character.isWhitespace(c)) {
	//				wordString = wordString + c;
	//				revString = c + revString;
	//			}else {
	//				if (wordString.equalsIgnoreCase(revString)) {
	//					System.out.println("Palindrome word in the String is "+ wordString);
	//				}			
	//				wordString = "";
	//				revString ="";
	//			}
	//		}
	//	}

	//	public static void main(String[] args) {
	//		String myString = "My name is Niraj Tiwari and i've created BomB frameworks";
	//		myString +=" ";
	//		String wordString = "";
	//		for (int i = 0; i < myString.length(); i++) {
	//			char c = myString.charAt(i);
	//			if (!Character.isWhitespace(c)) {
	//				wordString = wordString + c;
	//			}else {
	//				char s = wordString.charAt(0);
	//				char e = wordString.charAt(wordString.length()-1);
	//				if (s == e ) {
	//					System.out.println("Special words is "+ wordString);
	//				}				
	//				wordString = "";
	//			}
	//		}
	//	}

	//	public static void main(String[] args) {
	//		String myString = "My name is Niraj Tiwari and i've created BomB frameworkshmmm";
	//		myString +=" ";
	//		String wordString = "";
	//		int longestWord = 0;
	//					for (int i = 0; i < myString.length(); i++) {
	//						char c = myString.charAt(i);
	//						if (!Character.isWhitespace(c)) {
	//							wordString = wordString + c;
	//						}else {
	//						    int	wordLength = wordString.length();
	//							if (wordLength > longestWord ) {
	//								longestWord = wordLength;
	//							}			
	//							wordString = "";
	//						}
	//					}
	//		System.out.println("Longest word in string is "+ longestWord +" "+ wordString);
	//	}

	//		public static void main(String[] args) {
	//			String myString = "My name is Niraj Tiwari and i've created BomB frameworkshmmm";
	//			myString +=" ";
	//			String wordString = "";
	//			int count = 0;
	//			for (int i = 0; i < myString.length(); i++) {
	//				char c = myString.charAt(i);
	//				if (!Character.isWhitespace(c)) {
	//					wordString = wordString + c;
	//				}else {
	//				    if(wordString.equalsIgnoreCase("Niraj")) {
	//				    	count++;
	//				    }
	//					wordString = "";
	//				}
	//			}
	//			System.out.println("String match found for Niraj is " + count);
	//			//System.out.println("Longest word in string is "+ longestWord +" "+ wordString);
	//		}

	//		public static void main(String[] args) {
	//			Hashtable<String, Integer> countRef = new Hashtable<>();
	//			String myString = "My name is Niraj Tiwari and Niraj is Automation Test Engineer";
	//			myString +=" ";
	//			String wordString = "";
	//			for (int i = 0; i < myString.length(); i++) {
	//				char c = myString.charAt(i);
	//				if (!Character.isWhitespace(c)) {
	//					wordString = wordString + c;
	//				}else {
	//					if (countRef.containsKey(wordString)) {
	//						int wordCount = countRef.get(wordString);
	//						wordCount++;
	//						countRef.put(wordString, wordCount);
	//					}else {
	//						int count = 1;
	//						countRef.put(wordString, count);
	//					}
	//					wordString = "";
	//				}
	//			}
	//			
	//			for (Map.Entry<String, Integer> entry : countRef.entrySet()) {
	//				String key = entry.getKey();
	//				Integer val = entry.getValue();
	//				System.out.println(key + " - have occurance of : "+ val);		}
	//		
	//		}


	//		public static void main(String[] args) {
	//			Map<String, Integer> countRef = new TreeMap<>();
	//			String myString = "My name is Niraj Tiwari and Niraj is Automation Test Engineer";
	//			myString +=" ";
	//			String wordString = "";
	//			for (int i = 0; i < myString.length(); i++) {
	//				char c = myString.charAt(i);
	//				if (!Character.isWhitespace(c)) {
	//					wordString = wordString + c;
	//				}else {
	//					if (countRef.containsKey(wordString)) {
	//						int wordCount = countRef.get(wordString);
	//						wordCount++;
	//						countRef.put(wordString, wordCount);
	//					}else {
	//						int count = 1;
	//						countRef.put(wordString, count);
	//					}
	//					wordString = "";
	//				}
	//			}
	//			
	//			for (Map.Entry<String, Integer> entry : countRef.entrySet()) {
	//				String key = entry.getKey();
	//				Integer val = entry.getValue();
	//				System.out.println(key + " - have occurance of : "+ val);		}
	//		}

	//		public static void main(String[] args) {
	//			String myString = "My name is Niraj Tiwari and Niraj is Automation Test Engineer";
	//			myString +=" ";
	//			String wordString = "";
	//			String newString = "";
	//			for (int i = 0; i < myString.length(); i++) {
	//				char c = myString.charAt(i);
	//				if (!Character.isWhitespace(c)) {
	//					wordString = wordString + c;
	//				}else {
	//					if(wordString.equals("Niraj")) {
	//						newString = newString +"Ajay" + " ";
	//					}else {
	//						newString = newString + wordString + " ";
	//					}
	//					wordString = "";
	//				}	
	//			}
	//			System.out.println("New string is - "+ newString);
	//		}

	//		public static void main(String[] args) {
	//			String myString = "My name is Niraj Tiwari and Niraj is Automation Test Engineer";
	//			myString +=" ";
	//			String wordString = "";
	//			String newString = "";
	//			for (int i = 0; i < myString.length(); i++) {
	//				char c = myString.charAt(i);
	//				if (!Character.isWhitespace(c)) {
	//					wordString = wordString + c;
	//				}else {
	//					if(!wordString.equals("Niraj")) {
	//						newString = newString + wordString + " ";
	//					}
	//					wordString = "";
	//				}	
	//			}
	//			System.out.println("New string is - "+ newString);
	//		}

	//		public static void main(String[] args) {
	//			String myString = "My name is Niraj Tiwari and Niraj is Automation Test Engineer";
	//			myString +=" ";
	//			String wordString = "";
	//			String newString = "";
	//			for (int i = 0; i < myString.length(); i++) {
	//				char c = myString.charAt(i);
	//				if (!Character.isWhitespace(c)) {
	//					wordString = wordString + c;
	//				}else {
	//					if(Character.isUpperCase(wordString.charAt(0))) {
	//						newString = newString + wordString.replace(wordString.charAt(0), Character.toLowerCase(wordString.charAt(0)))+ " ";		
	//					}else {
	//						newString = newString + wordString.replace(wordString.charAt(0), Character.toUpperCase(wordString.charAt(0)))+ " ";		
	//					}
	//					wordString = "";
	//				}	
	//			}
	//			System.out.println("New string is - "+ newString);
	//		}

	//	public static void main(String[] args) {
	//		String myString = "My name is Niraj Tiwari and Niraj is Automation Test Engineer";
	//		myString +=" ";
	//		String wordString ="";
	//		String newString = "";
	//		for (int i = 0; i < myString.length(); i++) {
	//			char c = myString.charAt(i);
	//			if (!Character.isWhitespace(c)) {
	//				wordString = wordString + c;
	//			}else {	
	//				char first = wordString.charAt(0);
	//				char last = wordString.charAt(wordString.length()-1);
	//				String middle = wordString.substring(1, wordString.length()-1);
	//				newString = newString + last + middle + first + " ";	
	//				wordString = "";
	//			}	
	//		}
	//		System.out.println("New string is - "+ newString);
	//	}


	//		public static void main(String[] args) {
	//			String myString1 = "Army";
	//			String myString2 = "Mary";
	//			
	//			char[] arr1= myString1.toLowerCase().toCharArray();
	//			char[] arr2= myString2.toLowerCase().toCharArray();
	//			
	//			Arrays.sort(arr1);
	//			Arrays.sort(arr2);
	//						
	//			System.out.println("String are Anagrams - "+Arrays.equals(arr1, arr2));
	//		}


	//	public static void main(String[] args) {// count each vowel and its occurence
	//		//Given a string, create a new string without vowels and print that string.
	//
	//		String myString = "My name is Niraj Tiwari and Niraj is Automation Test Engineer";
	//		myString += " ";
	//		List<Character> myVowels = new ArrayList<Character>();	
	//					for (int i = 0; i < myString.length(); i++) {
	//						char c = myString.charAt(i);	
	//						c  = Character.toUpperCase(c);
	//						if ((c == 'A') || (c =='E') || (c =='I')|| (c =='O')|| (c =='U')) {
	//							myVowels.add(c);
	//						}					
	//					}
	//					
	//					System.out.println("Vowels in the String : " + myVowels.toString());
	//					System.out.println("Vowel count is : "+ myVowels.size());
	//			
	//					TreeMap<Character, Integer> map = new TreeMap<>();
	//			
	//					for (Character character : myVowels) {
	//						if (map.containsKey(character)) {
	//							int vowelCount =  map.get(character);
	//							vowelCount++;
	//							map.put(character, vowelCount);
	//						}else {
	//							int vowelCount =1;
	//							map.put(character, vowelCount);
	//						}
	//					}
	//					Character mostOccured = ' ';
	//					int higestCount = 0;
	//					for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	//						Character key = entry.getKey();
	//						Integer val = entry.getValue();
	//						if (val> higestCount) {
	//							higestCount = val;
	//							mostOccured = key;
	//						}
	//						System.out.println("Occurence for vowel is : "+ key + " "+ val);
	//					}
	//					System.out.println("Most Occurred vowel is : "+ mostOccured + " count is " +higestCount);
	//	}

	//		public static void main(String[] args) {// reverse case of each word at first index
	//			//Given a string, create a new string without vowels and print that string.
	//	
	//			String myString = "My name is Niraj Tiwari and Niraj is Automation Test Engineer";
	//	
	//			String[] myArrStrings = myString.split(" ");
	//			String newStr = "";
	//			
	//			for (int i = 0; i < myArrStrings.length; i++) {
	//				char c = myArrStrings[i].charAt(0);
	//				String remainingWord = myArrStrings[i].substring(1);
	//				if (Character.isUpperCase(c)) {
	//					newStr = newStr+  Character.toLowerCase(c)  +remainingWord + " ";
	//				}else {
	//					newStr = newStr+  Character.toUpperCase(c)  +remainingWord + " ";
	//				}
	//			}
	//	
	//			System.out.println("Reversed Case for each Word at index 0 - "+ newStr);
	//		}


	//		public static void main(String[] args) {// reverse each word
	//			//Given a string, create a new string without vowels and print that string.
	//	
	//			String myString = "My name is Niraj Tiwari and Niraj is Automation Test Engineer";
	//	
	//			StringTokenizer stringTokenizer = new StringTokenizer(myString, " ");
	//			String newString = "";
	//			while (stringTokenizer.hasMoreElements()) {
	//				String str = (String) stringTokenizer.nextElement();
	//				StringBuilder sb = new StringBuilder(str);
	//				newString = sb.reverse()+ " " + newString;
	//			}
	//	
	//			System.out.println("Reverse string in reverse order - " + newString);
	//		}


	//		public static void main(String[] args) {// reverse each word 
	//			String myString = "My name is Niraj Tiwari and Niraj is Automation Test Engineer";
	//	
	//			StringTokenizer stringTokenizer = new StringTokenizer(myString, " ");
	//			String newString = "";
	//			while (stringTokenizer.hasMoreElements()) {
	//				String str = (String) stringTokenizer.nextElement();
	//				String revWord = "";
	//				for (int i = 0; i < str.length(); i++) {
	//					char c = str.charAt(i);
	//					revWord = c + revWord;				
	//				}
	//				newString = revWord+ " " + newString;
	//			}
	//			System.out.println("Reverse string in reverse order - " + newString);
	//		}


	//		public static void main(String[] args) {// max occurence of word in a Array
	//	
	//			List<String> myList = Arrays.asList("Foo", "The", "Foo","foo", "the", "niraj");
	//			TreeMap<String, Integer> myMap = new TreeMap<String, Integer>();
	//			for (String string : myList) {
	//				//string = string.toUpperCase();
	//				if (!myMap.containsKey(string)) {
	//	                int count = 1;
	//	                myMap.put(string, count);
	//				}else {
	//					int wordCount =myMap.get(string);
	//					wordCount++;
	//					myMap.put(string, wordCount);
	//				}
	//			}
	//			int maxOccurance = 0;
	//			String reqString = "";
	//			for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
	//				String key = entry.getKey();
	//				Integer val = entry.getValue();
	//				if(val>maxOccurance) {
	//					maxOccurance = val;
	//					reqString=key;
	//				}
	//			}
	//			System.out.println("Most Occurence is "+ maxOccurance+ " of Word is "+ reqString);
	//		}



//	public static void main(String[] args) {
//		String myString = "abcdabcbb";
//		Set<Character> charSet = new TreeSet<Character>();
//        int maxLength=0;
//		for (int i = 0; i < myString.length(); i++) {
//			if (!Character.isWhitespace(myString.charAt(i))) {
//			    charSet.add(myString.charAt(i));
//			    if (charSet.size() > maxLength) {
//			    	 maxLength = charSet.size();
//				}			   
//			}else {
//				charSet.removeAll(charSet);
//			}
//		}
//		System.out.println("Longest String : " + maxLength);
//	}

	

}






