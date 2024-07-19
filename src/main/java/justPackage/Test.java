package justPackage;

import java.time.chrono.MinguoChronology;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Test {



	//	public static void main(String[] args) {
	//
	//		Map<Character , Integer> myMap = new TreeMap<>();
	//		String myString = "aabbcccdd";
	//		
	//		for (int i = 0; i < myString.length(); i++) {
	//		      	char c = myString.charAt(i);
	//		      	if (myMap.containsKey(c)) {
	//					int charCount = myMap.get(c);
	//					charCount++;
	//					myMap.put(c, charCount);
	//				}else {
	//					int count = 1;
	//					myMap.put(c , count);
	//				}
	//		}
	//		String newString = "";
	//		for (Map.Entry<Character, Integer> entry : myMap.entrySet()) {
	//			Character c = entry.getKey();
	//			Integer val = entry.getValue();
	//			newString = newString+c+String.valueOf(val);
	//			
	//		}
	//		System.err.println(newString);
	//	}


	//	public static void main(String[] args) {		
	//		String myString = "ABCxyz093#@%";
	//		String lowerCaseLetter= "";
	//		String upperCaseLetter= "";
	//		String number= "";
	//		String specialCharacters= "";
	//		
	//		for (int i = 0; i < myString.length(); i++) {
	//			char c = myString.charAt(i);
	//			if (Character.isLetter(c)) {
	//				if (Character.isLowerCase(c)) {
	//					lowerCaseLetter += c;
	//				}else if (Character.isUpperCase(c)) {
	//					upperCaseLetter +=c;
	//				} 
	//			}else if (Character.isDigit(c)) {
	//				number += c;
	//			}else if (!Character.isLetterOrDigit(c)) {
	//				specialCharacters += c;
	//			}
	//		}
	//		
	//		System.out.println("Lower Case Letter : "+ lowerCaseLetter);
	//		System.out.println("Upeer Case Letter : "+ upperCaseLetter);
	//		System.out.println("Number : "+ number);
	//		System.out.println("Special Character : "+ specialCharacters);
	//	
	//	}

	//	public static void main(String[] args) {
	//
	//
	//		String myString = "00612764";
	//		String newString  = "";
	//
	//		for (int i = 0; i < myString.length(); i++) {
	//			char c = myString.charAt(i);
	//			if (Character.isDigit(c)) {
	//				if (!(c=='0')) {
	//					newString += c;
	//				}
	//			}
	//		}
	//		System.out.println("Without Preceeding zeros : " + newString);
	//
	//	}


	//	public static void main(String[] args) {
	// 
	//		Map<Character , Integer> myMap = new TreeMap<>();
	//
	//		String myString = "Appleeeeenn";
	//		String dupStr  = "";
	//		for (Character myChar : myString.toLowerCase().toCharArray()) {
	//			if (!myMap.containsKey(myChar)) {
	//				int count = 1;
	//				myMap.put(myChar, count);
	//			}else {
	//				dupStr = dupStr + myChar;
	//			}
	//		}
	//		
	//		System.out.println("Duplicate String : "+ dupStr);
	//	}

	//	public static void main(String[] args) {
	//        List<Integer> numbers = Arrays.asList(11, 11, 18, 20, 24, 85, 66, 13);
	//        

	//        List<Integer> numbersStartingWithOne = numbers.stream()
	//                .filter(n -> Integer.toString(n).startsWith("1"))
	//                .collect(Collectors.toList());
	//        System.out.println("Numbers starting with 1: " + numbersStartingWithOne);
	//        
	//        numbers.stream().filter(n -> Integer.toString(n).startsWith("1"))
	//        .collect(Collectors.toList());
	//        
	//        numbers.stream().filter(n ->  n%2 == 0).collect(Collectors.toList());
	//
	//       
	//      int  sumOfEvenNumbers =   numbers.stream().filter(n -> n%2 == 0)
	//       .mapToInt(Integer::intValue)
	//       .sum();
	//      
	//      int  sumOfOddNumbers =   numbers.stream().filter(n -> n%2 != 0)
	//    	       .mapToInt(Integer::intValue)
	//    	       .sum();
	//      
	//      System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
	//      System.out.println("Sum of odd numbers: " + sumOfOddNumbers);
	//    }


	//	public static void main(String[] args) {
	//		int[] arr = {5,1,8,4,9,1,5};
	//		
	//		Set<Integer> mySet = new HashSet<Integer>();
	//		int sum = 0;
	////		for(int i= 0; i<arr.length;i++) {
	////			if(!mySet.contains(arr[i])) {
	////				mySet.add(arr[i]);
	////				sum = sum + arr[i];
	////			}
	////		}
	//		
	//		for(int num: arr) {
	//			if(!mySet.contains(num)) {
	//				mySet.add(num);
	//				sum = sum + num;
	//			}
	//		}
	//		System.out.println("Sum of distinct nos : "+sum);
	//	}


	//	public static void main(String[] args) {
	//		String myString = "Hello";
	//		for(Character myChar : myString.toCharArray()){
	//			for(int i=0;i<2;i++) {
	//				System.out.print(myChar);
	//			}
	//		}
	//	}

	//	public static void main(String[] args) {
	//		int[] arr = {1,2,3,4,5,6,7,8,9};
	//		int evenSum = 0;
	//		int even = 0;
	//		int oddSum = 0;
	//		int odd = 0;
	//		for(int num : arr) {
	//			if(num % 2 == 0) {
	//				evenSum = evenSum + num; 
	//				even++;
	//			}else if(num % 2 != 0) {
	//				oddSum = oddSum + num;
	//				odd++;
	//			}
	//		}
	//		System.out.println("Sum of Even Nos : "+ evenSum);
	//		System.out.println("Sum of Odd Nos : "+ oddSum);
	//		
	//		System.out.println("No of Even Nos : "+ even);
	//		System.out.println("No of Odd Nos : "+ odd);
	//	}

	//	public static void main(String[] args) {
	//		String myString = "characters";
	//		String newString = "";
	//		for(Character myChar: myString.toCharArray()) {
	//			if(!newString.contains(myChar.toString())) {
	//				newString += myChar;
	//			}
	//		}
	//		System.out.println("Unique chars : "+ newString);
	//		
	////		Set<Character> mySet = new TreeSet<>();
	////		for(Character myCharacter : myString.toCharArray()) {
	////			if(!mySet.contains(myCharacter)) {
	////				mySet.add(myCharacter);
	////			}
	////		}
	////		System.out.println(mySet.toString());
	//	}


//	public static void main(String[] args) {
//		int a = 10, b = 20;
//		//		int temp = a;
//		//		a = b;
//		//		b = temp;
//
////		a= a+ b;
////		b= a-b;
////		a= a-b;
//		
//		a = a^b;
//		b = a^b;
//		a = a^b;
//		System.out.println("value of a : "+ a);
//		System.out.println("value of b : "+ b);
//	}

}
