package justPackage;

public class MyArrayQues {

//	public static void main(String[] args) {
//		//char[] myArr = new char[] {'N','o',' ','J','a','m','e','s',' ','B','o','n','d'};
//		String myString = "My name is Niraj 27 Tiwari and i've created BomB frameworks";
//		char[] myArr = myString.toCharArray();
//		String noString="";
//		String letterString="";
//		for (int i = 0; i < myArr.length; i++) {	//			
//			if (Character.isAlphabetic(myArr[i])) {
//				letterString = letterString + myArr[i];			
//			}else if (Character.isDigit(myArr[i])) {
//				noString = noString + myArr[i];	
//			} 
//			//System.out.println("ASCII Values " + Character.codePointAt(myArr, i));
//		}
//		System.out.println("Nos first Followed by Letters "+ noString );
//		System.out.println(letterString.length());
//	}



//		public static void main(String[] args) {
//	
//			int[] myArr = new int[] {5,12,4,21,8,2,3,7,9,11};
//			for(int i=0; i<myArr.length;i++) {
//				if(myArr[i] %2 ==0)
//					System.out.println("Number is even - "+ myArr[i]);
//			}
//			for(int i=0; i<myArr.length;i++) {
//				if(myArr[i] %2 !=0)
//					System.out.println("Number is odd - "+ myArr[i]);
//			}
//	
//		}

//		public static void main(String[] args) {
//			int[] myArr = new int[] {5,12,4,21,8,2,3,7,9,14};
//	
//	//		for(int i=0; i<myArr.length;i++) {
//	//			if(myArr[i] > 9 && myArr[i] < 99)
//	//				System.out.println("Number is odd - "+ myArr[i]);
//	//		}
//	
//			for(int i=0; i<myArr.length;i++) {
//				if(myArr[i] % 10  == 2)
//					System.out.println("Number is divisible by 7 - "+ myArr[i]);
//			}
//		}


	//	public static void main(String[] args) {
	//
	//		int[] myArr = new int[] {5,12,4,21,8,2,3,7,9,14};
	//		
	//		for (int i = 0; i < myArr.length; i++) {
	//			//System.out.printf("%.2f\n",Math.sqrt(myArr[i]));
	//			System.out.printf("%.2f\n",Math.pow(myArr[i],3));
	//		}		
	//	}

	//	public static void main(String[] args) {
	//
	//		int[] myArr = new int[] {5,12,4,21,8,2,3,7,9,14};
	//		double sum=0;
	//		for (int i = 0; i < myArr.length; i++) {
	//			if(myArr[i]%2!=0) {
	//				sum += myArr[i];
	//			}
	//		}			
	//		System.out.println("Sum of even number is "+ sum);
	//	}

//		public static void main(String[] args) {
//		
//			   int[] myArr = new int[] {5, 12, 4, 21, 8, 2, 3, 7, 9, 14};
//			    int max = Integer.MIN_VALUE;
//			    int secondMax = Integer.MIN_VALUE;
//
//			    for (int i = 0; i < myArr.length; i++) {
//			        if (myArr[i] > max) {
//			            secondMax = max;
//			            max = myArr[i];
//			        } else if (myArr[i] > secondMax && myArr[i] < max) {
//			            secondMax = myArr[i];
//			        }
//			    }
//
//			    System.out.println("Max number is " + max);
//			    System.out.println("Second largest number is " + secondMax);
//			}
	
//	public static void main(String[] args) {
//		
//		  int number = 100;
//
//		   // Print the result
//	        if (isPalindrome(number)) {
//	            System.out.println(number + " is a palindrome.");
//	        } else {
//	            System.out.println(number + " is not a palindrome.");
//	        }
//
//		  
//		}
//	
//	public static boolean isPalindrome(int number) {
//		int originalNumber= number;
//		int revNumber = 0;
//		
//		while (number !=0 ) {
//			int digit = number % 10;
//			revNumber = revNumber * 10 + digit;
//			number = number/10;
//		}
//		
//		return originalNumber == revNumber;
//	}
		
	//	public static void main(String[] args) {
	//
	//		int[] myArr = new int[] {5,12,4,21,8,2,3,7,9,11};
	//		double sum=1;
	//		for (int i = 0; i < myArr.length; i++) {
	//			if(myArr[i]%2==0) {
	//				sum = sum * myArr[i];
	//			}
	//		}			
	//		System.out.println("Sum of even number is "+ sum);
	//	}


	//	public static void main(String[] args) {
	//
	//		int[] myArr = new int[] {5,12,4,21,8,2,3,7,9,11};
	//		int count=0;
	//		for (int i = 0; i < myArr.length; i++) {
	//			if(myArr[i]%2==0) {
	//				count++;
	//			}
	//		}			
	//		System.out.println("Count of even number is "+ count);
	//	}


	//	public static void main(String[] args) {
	//
	//		int[] myArr = new int[] {5,12,4,21,8,2,3,7,9,11};
	//		int max=myArr[0];
	//		int min=myArr[0];
	//		for (int i = 0; i < myArr.length-1; i++) {
	//			if(myArr[i]> max)
	//				max=myArr[i];
	//			if (myArr[i]<min) {
	//				min=myArr[i];
	//			}
	//		}
	//		System.out.println("Max of array is "+max);
	//		System.out.println("Min of array is "+min);
	//	}


	//	public static void main(String[] args) {
	//		char[] myArr = new char[] {'N','O','2','6',' ','S','o','u','n','d'};
	//		for (int i = 0; i < myArr.length; i++) {
	//			if (Character.isUpperCase(myArr[i])) {
	//				System.out.println(myArr[i]+"- Character is Upper case");
	//			}
	//		}
	//		for (int j = 0; j < myArr.length; j++) {
	//			if(Character.isDigit(myArr[j])) {
	//				System.out.println(myArr[j]+" is digit");
	//			}
	//		}
	//	}


	//	public static void main(String[] args) {
	//		char[] myArr = new char[] {'N','O','2','6',' ','S','o','u','n','d'};
	//		String newString="";
	//		for (int i = 0; i < myArr.length; i++) {
	//			if (Character.isUpperCase(myArr[i])) {
	//				newString += myArr[i];
	//			}
	//		}
	//		System.out.println("new string - "+newString);
	//	}

	//	public static void main(String[] args) {
	//		char[] myArr = new char[] {'N','O','2','6',' ','S','o','u','n','d'};
	//		String newString="";
	//		for (int i = 0; i < myArr.length; i++) {
	//			if (Character.isUpperCase(myArr[i])) {
	//				newString += Character.toLowerCase(myArr[i]);
	//			}else if (Character.isLowerCase(myArr[i])) {
	//				newString += Character.toUpperCase(myArr[i]);				
	//			}
	//		}
	//		System.out.println("new string - "+newString);
	//	}


	//	public static void main(String[] args) {
	//		char[] myArr = new char[] {'N','O','2','6',' ','S','o','u','n','d'};
	//		String newString="";
	//		for (int i = 0; i < myArr.length; i++) {
	//			if (Character.isUpperCase(myArr[i])) {
	//				newString += Character.toLowerCase(myArr[i]);
	//			}else if (Character.isLowerCase(myArr[i])) {
	//				newString += Character.toUpperCase(myArr[i]);				
	//			}else {
	//				newString += myArr[i];
	//			}
	//		}
	//		System.out.println("new string - "+newString);
	//	}


	//	public static void main(String[] args) {
	//		String[] strArr = new String[] {"THIS", "ONE","DOING","HELLO","AM","I","HI BYE","ROCK","TALK","TOY"};
	//		for (int i = 0; i < strArr.length; i++) {
	////			if (strArr[i].length() %2 == 0) {
	////				System.out.println("Even length string - "+strArr[i]);
	////			}
	//			
	//			if (strArr[i].startsWith("TH")) {
	//				System.out.println("String starts with TH - "+strArr[i]);
	//			}
	//			
	//			if (strArr[i].endsWith("ING")) {
	//				System.out.println("String ends with ING - "+strArr[i]);
	//			}
	//		}
	//	}

	//	public static void main(String[] args) {
	//		String[] strArr = new String[] {"THIS", "ONE","DOING","HELLO","AM","I","HI BYE","ROCK","TALK","TOY"};
	//		String newString ="";
	//		for (int i = 0; i < strArr.length; i++) {
	//			
	//             String str = strArr[i];
	//             if(str.length()>=3) {
	//            	  char f = str.charAt(0);
	//                  char l = str.charAt(str.length()-1);
	//                  String midString = str.substring(1, str.length()-1);
	//                  newString += l + midString+ f + " ";      
	//             }
	//           
	//		}
	//		System.out.println("New String - "+ newString);
	//	}

	//	public static void main(String[] args) {
	//		String[] strArr = new String[] {"THIS", "ONE","DOING","HELLO","AM","I","HI BYE","ROCK","TALK","TOY"};
	//		String revString ="";
	//		for (int i = 0; i < strArr.length; i++) {
	//			String str = strArr[i]+" ";
	//			for (int j = 0; j < str.length(); j++) {
	//				char c = str.charAt(j);
	//				revString = c +  revString ;
	//			}
	//		}
	//		System.out.println("Reverse string - "+ revString);        
	//	}

//		public static void main(String[] args) {
//			
//			String[] strArr = new String[] {"THIS", "ONE","DOING","HELLO","AM","I","HI BYE","ROCK","TALK","TOY"};
//			String revString ="";
//			for (int i = 0; i < strArr.length; i++) {
//				String str = strArr[i]+" ";
//				for (int j = 0; j < str.length(); j++) {
//					char c = str.charAt(j);
//					revString = c +  revString ;
//				}
//			}
//			System.out.println("Reverse string - "+ revString);        
//		}


}
