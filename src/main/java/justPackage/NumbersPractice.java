package justPackage;


public class NumbersPractice {

	//	public static void main(String args[]) { //swap two numbers
	//		int a =10;
	//		int b =20;
	//
	//		// int temp = a;
	//		// a=b;
	//		// b=temp;
	//		// System.out.println("After swapping, a = "+a+" and b = "+b);
	//
	//		// a=a+b;
	//		// b=a-b;
	//		// a=a-b;
	//		// System.out.println("After swapping, a = "+a+" and b = "+b);    
	//
	//		a=a^b;
	//		b=a^b;
	//		a=a^b;
	//		System.out.println("After swapping, a = "+a+" and b = "+b);
	//	}

	//	public static void main(String args[]) { // fibonacci Series: first 10
	//	       // 0,1,1,2,3,5,8,13,21,34,55 etc
	//	   int upperBound = 10;
	//	   int num1=0, num2=1;
	//		   for(int i =0; i<=upperBound; i++) {
	//			   System.out.print(" "+ num1);
	//			   int num3 = num2 + num1;
	//			   num1 = num2;
	//			   num2 = num3;
	//		   }
	//	}

	public static void main(String args[]) { //amstrong number
		//intput - 153 {(1*1*1)+(5*5*5)+(3*3*3)} = 153

		int num = 153;
		int sum = 0;
		int temp = num;
		while (num > 0) {
			int result	= num % 10;
			num = num / 10;
			sum = sum + (result * result * result);
		}

		if(temp == sum) {
			System.out.println("Number is Amstrong Number");
		}else {
			System.out.println("Number is not a Amstrong Number");
		}
	}

	//	public static void main(String args[]) { // Palindrome number
	//		int num = 121;
	//		int rev = 0;
	//	    int temp =num;
	//	    while(num > 0) {
	//	        int rem = num % 10;
	//	    	num = num / 10;
	//	    	rev = (rev * 10) + rem;
	//	    }	    
	//	    if (temp==rev) {
	//			System.out.println("No is Palindrome");
	//		}else {
	//			System.out.println("No is not a palindrome");
	//		}
	//	}

	//	public static void main(String[] args) { // sum of digits - 24
	//	int num = 987;
	//	int sum = 0;
	//	while(num > 0) {
	//		int rem = num % 10;
	//		num = num / 10;
	//		sum = sum + rem;
	//	}
	//	System.out.println("Sum of digits : "+ sum);
	//}

	//	public static void main(String[] args) {  // count digits
	//		int num = 29845315;
	////		int count = 0;
	////		while(num != 0) {
	////			num = num /10;
	////			count++;
	////		}
	//		String digitString= Integer.toString(num);
	//		//String digitString= String.valueOf(num);
	//		int count = digitString.length();
	//		System.out.println("Count of digits : "+ count);
	//	}

	//	public static void main(String args[]) { // Factorial number
	//		int num = 5;
	//		int fact = 1;
	//		for(int i=1; i<=num ; i++) {
	//			fact = fact * i;
	//		}
	//		System.out.println("Factorial of num "+ num +" is "+ fact);
	//	}


	//	public static void main(String args[]) { // odd/even number
	//		int num = 7;
	////		if(num % 2 == 0) {// brute force method
	////			System.out.println("Number is Even Number");
	////		}else if (num %2 != 0) {
	////			System.out.println("Number is Odd Number");
	////		}	
	//		
	//		if((num ^ 1) == num +1) { // XOR operator
	//			System.out.println("Number is Even Number");
	//		}else if ((num ^ 1) != num +1) {
	//			System.out.println("Number is Odd Number");
	//		}
	//	}

	//	public static void main(String[] args) { // prime nums
	//		int lowerBound = 0;
	//		int upperBound = 20;
	//		
	//		for(int i = lowerBound; i<upperBound;i++) {
	//			if (isPrime(i)) {
	//				System.out.println(i+ " no is prime number");
	//			}
	//		}
	//	}
	//	public static boolean isPrime(int num) {
	//		if(num <= 1) {
	//			return false;
	//		}
	//		for(int i=2; i < num;i++) {
	//			if (num % i == 0) {
	//				return false;
	//			}
	//		}		
	//		return true;
	//	}

	//	public static void main(String[] args) { //largest no amnong 3 nums
	//		int num1 = 7, num2  = 15, num3 = 11;
	//		if(num1 >= num2 && num1 >= num3) {
	//			System.out.println(num1 + " is largest number");
	//		}
	//		if(num2 >= num1 && num2 >= num3) {
	//			System.out.println(num2 + " is largest number");
	//		}
	//		if(num3 >= num1 && num3 >= num2) {
	//			System.out.println(num3 + " is largest number");
	//		}
	//	}




}


