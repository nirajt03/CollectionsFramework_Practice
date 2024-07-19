package justPackage;

import java.awt.im.InputMethodHighlight;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class MyCharacter {

//	public static void main(String[] args) {
//		//char c = '1';
//		String myString = "Niraj @07";
//		char[] charArr = myString.toCharArray();
//
//		for (int i = 0; i < charArr.length; i++) {
//			if (Character.isDigit(charArr[i])) {
//				System.out.println(charArr[i] + " is an alphabet.");
//			}else if (Character.isLetter(charArr[i])) {
//				System.out.println(charArr[i] + " is an letter.");
//			}else if (Character.isWhitespace(charArr[i])) {
//				System.out.println(charArr[i] + " is an white space.");
//			}else {
//				System.out.println(charArr[i] + " is an symbol.");
//			}
//		}
//	}


//		public static void main(String[] args) { //OP - no of upper and loweer case words
//			 int upperCaseCounter = 0;
//			 int lowerrCaseCounter = 0;
//			 String myString = "My name is Niraj Tiwari";
//			String[] strArr = myString.split(" ");
//			for (String string : strArr) {
//				if (Character.isUpperCase(string.charAt(0))) {
//					upperCaseCounter++;
//				}else if (Character.isLowerCase(string.charAt(0))) {
//					 lowerrCaseCounter++;
//				}
//			}
//			System.out.println("Upper case letter count "+ upperCaseCounter);
//			System.out.println("Lower case letter count "+ lowerrCaseCounter);
//		}



//		public static void main(String[] args) { //OP - count occurance of Niraj
//			int wordCount = 0;
//			String myString = "My name is Niraj Tiwari, And Niraj is Automation Tester";
//			String[] strArr = myString.split(" ");
//			
//			for (String stringValue : strArr) {
//				if (stringValue.equalsIgnoreCase("Niraj")) {
//					wordCount++;
//				}
//			}
//			System.out.println("Niraj is occured "+ wordCount+ " times.");
//		}


//		public static void main(String[] args) { //OP - count occurance of each word
//			//Hashtable<String, Integer> myValueCounts = new Hashtable<String, Integer>();
//			TreeMap<String, Integer> myValueCounts = new TreeMap<String, Integer>();
//			String myString = "My name is Niraj Tiwari, And Niraj is Automation Tester";
//			String[] strArr = myString.split(" ");
//			
//			for (String stringValue : strArr) {
//				if (myValueCounts.containsKey(stringValue)) {
//					int wordCount = myValueCounts.get(stringValue);
//					wordCount++;
//					myValueCounts.put(stringValue, wordCount);
//				}else {
//					int count = 1;
//					myValueCounts.put(stringValue, count);
//				}
//			}
//			
//			//Set<Entry<String, Integer>> entry= myValueCounts.entrySet();
//			for (Map.Entry<String, Integer> entry : myValueCounts.entrySet()) {
//				String key = entry.getKey();
//				Integer val = entry.getValue();
//	
//			System.out.println(key + " - have occurance of : "+ val);
//			}	
//		}

//		public static void main(String[] args) {
//			
//			String myString = "My name is Niraj Tiwari";
//			int count = 0;
//			int lcount= 0;
//			for (int i = 0; i < myString.length(); i++) {
//				char c = myString.charAt(i);
//				if (Character.isUpperCase(c)) {
//					count++;
//				}else if (Character.isLowerCase(c)) {
//					lcount++;
//				}
//			}
//			System.out.println("Upper Case words count is "+count);
//			System.out.println("Lower Case words count is "+lcount);
//		}

//		public static void main(String[] args) {
//			
//			String myString = "My name is Niraj Tiwari";
//			int count = 0;
//			for (int i = 0; i < myString.length(); i++) {
//				char c = myString.charAt(i);
//				if (c == 'R' || c== 'r') {
//					count++;
//				}else if (Character.toUpperCase(c) == 'R') {
//					
//				}
//			}
//			System.out.println("Upper Case words count is "+count);
//		}


//		public static void main(String[] args) {
//			String myString = "My roll no is 32";
//			String newStr = "";
//			String digit = "";
//			for (int i = 0; i < myString.length(); i++) {
//				char c = myString.charAt(i);
//				if (Character.isDigit(c)) {
//					digit = digit+c;
//				}else if (Character.isLetter(c)) {
//					newStr = newStr+c;
//				}
//			}
//			
//			for (int i = 0; i < myString.length(); i++) {
//				if (Character.isDigit(myString.charAt(i))) {
//					digit = digit + myString.charAt(i);
//				}else if (Character.isLetter(myString.charAt(i)) || Character.isWhitespace(myString.charAt(i))) {
//                     newStr = newStr + myString.charAt(i);					
//				}
//			}
//			System.out.println("New String is "+digit+" "+newStr);
//		}

//		public static void main(String[] args) {	//		
//			String myString = "My name is Niraj Tiwari";
//			String lowerCase = "";
//			String upperCase = "";
//			for (int i = 0; i < myString.length(); i++) {
//				char c = myString.charAt(i);
//				if (Character.isUpperCase(c)) {
//					upperCase = upperCase+c;
//				}else if (Character.isLowerCase(c)) {
//	
//					lowerCase = lowerCase+c;
//				}
//			}	
//			System.out.println("New String is "+upperCase+" "+lowerCase);
//		}


//		public static void main(String[] args) {	
//					String myString = "My name is Niraj Tiwari";
//					String newStr = "";
//					for (int i = 0; i < myString.length(); i++) {
//						char c = myString.charAt(i);
//						if (!Character.isWhitespace(c)) {
//							newStr = newStr+c;
//						}
//					}
//					System.out.println("New String is "+newStr);
//		}


		public static void main(String[] args) {
	
			String myString = "My name is Niraj Tiwari";
			String newStr = "";
			for (int i = 0; i < myString.length(); i++) {
				char c = myString.charAt(i);
				if (Character.isLetter(c)) {
					newStr = c+ newStr;
				}
			}
			System.out.println("New String is "+newStr);
		}


//		public static void main(String[] args) {
//	
//			String myString = "My name is Niraj Tiwari";
//			String newStr = "";
//			for (int i = 0; i < myString.length(); i++) {
//				char c = myString.charAt(i);
//				if (Character.isUpperCase(c)) {
//					newStr = newStr + Character.toLowerCase(c);
//				}else {
//					newStr = newStr + Character.toUpperCase(c);
//				}
//			}
//			System.out.println("New String is "+newStr);
//		}

//		public static void main(String[] args) {
//	
//			String myString = "Malayalam";
//			String rev = "";
////			for (int i = 0; i < myString.length(); i++) {
////				char c = myString.charAt(i);
////				if (Character.isLetter(c)) {
////					rev = c+ rev;
////				}
////			}
//			
//			for (int i = 0; i < myString.length(); i++) {
//				if (Character.isLetter(myString.charAt(i))) {
//					rev = myString.charAt(i) + rev;
//				}
//			}		
//			if(myString.equalsIgnoreCase(rev)) {
//				System.out.println(myString + " is a Palindrome");
//			}else
//			   System.out.println(myString + " is NOT a Palindrome");
//		}
	
	
	
}
