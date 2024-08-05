package practiceQuestions;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NumbersQues {

	public static void main1(String[] args) { //Find odd/even number
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number to check:");
		int number = scanner.nextInt();

		//		if (number % 2 ==0) {
		//			System.out.println("Number is Even");
		//		} else if (number % 2 !=0) {
		//			System.out.println("Number is Odd");
		//		}

		//		if((number ^ 1) == number + 1) {
		//			System.out.println("Number is Even");
		//		} else if ((number ^ 1) != number+1) {
		//			System.out.println("Number is Odd");
		//		}

		if((number & 1) == 0) {
			System.out.println("Number is Even");
		} else if ((number & 1) != 0) {
			System.out.println("Number is Odd");
		}

		scanner.close();
	}


	public static void main2(String[] args) {//find prime numbers in first 25 numbers
		for (int i = 0; i < 25; i++) {
			if (isPrime(i)) {
				System.out.println(i+" number is Prime no");
			}
		}
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main3(String[] args) {//fibonacci series
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int number = scanner.nextInt();

		int num1= 0;int num2= 1;
		for(int i = 0; i<=number;i++) {
			System.out.print(num1+ " ");
			int num3 = num1+num2;
			num1=num2;
			num2=num3;
		}
		scanner.close();
	}

	public static void main4(String[] args) {//swap nos 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number:");
		int a = scanner.nextInt();
		System.out.print("Enter second number:");
		int b = scanner.nextInt();

		//		int temp = a;
		//		a = b;
		//		b =temp;

		//		a=a+b;
		//		b=a-b;
		//		a=a-b;

		a=a^b;
		b=a^b;
		a=a^b;

		System.err.println("First number "+a );
		System.err.println("Second number "+b );
		scanner.close();
	}

	public static void main5(String[] args) {//find factorial

		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter number to find factorial:");
		int number = scanner.nextInt();
		int factorial=1;
		for(int i=1; i<=number;i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of "+ number+ " is - " +factorial);
		scanner.close();
	}

	public static void main6(String[] args) {//reverse number
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number to reverse");
		int number = scanner.nextInt();

		int reverse = 0;
		while (number >0) {
			int rem = number % 10;
			number = number / 10;
			reverse = reverse*10 + rem;
		}
		System.out.println("Reverse of number is - "+reverse);
		scanner.close();
	}
	
	public static void main7(String[] args) {//amstrong number
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number to find Anstrong number");
		int number = scanner.nextInt();
		
		int sum = 0;
		int temp = number;
		while(number > 0) {
			int rem = number % 10;
			number = number / 10;
			sum = sum + (rem * rem * rem);
		}		
		if(sum == temp) {
			System.out.println("Number is a Amstrong Number");
		}else {
			System.out.println("Number is Not a Amstrong Number");
		}
		scanner.close();
	}
	
	public static void main8(String[] args) {// sum of digits
		
		int num = 234568;
		int sum = 0;
		while(num > 0) {
			int rem = num % 10;
			num = num / 10;
			sum += rem;
		}
		System.out.println("Sum of Digits - "+sum );	
	}
	
	public static void main9(String[] args) {//no of digits
		int num = 234568;//-1234568
		int count = 0;
		if (num == 0) {
			count = 1;
		}else if (num < 0) {
			num = num * -1;
		}
		while(num>0) {
			num = num/10;
			count++;			
		}
		System.out.println("No of Digits: " + count);
	}
	
	public static void main10(String[] args) {//palindrome number
		int num = 122;
		int sum = 0;
		int temp = num;
		while(num > 0) {
			int rem = num % 10;
			num = num /10;
			sum = sum * 10 + rem;
		}
		if(temp == sum) {
			System.out.println("Number is Palindrome Number");
		}else {
			System.out.println("Number is Not Palindrome Number");
		}
	}
	
	public static void main(String[] args) {//find unique digits from a number
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = scanner.nextInt();
		Set<Integer> uniqueDigit = new TreeSet<Integer>();
		while(num > 0) {
			int rem = num % 10;
			num = num / 10;
			if (!uniqueDigit.contains(rem)) {
				uniqueDigit.add(rem);
			}
		}
		scanner.close();
		System.out.println("Unique Digits: "+uniqueDigit.toString());
	}
	
	
}

