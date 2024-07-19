package justPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class ArraysPractice {



//		public static void main(String args[]) { //common elements in arrays
//	
//			Integer[] arr1 = {4,2,3,1,6};
//			Integer[] arr2 = {6,7,8,4};
//			List<Integer> commonNos = new ArrayList<>();
//	
//			for(int i=0; i< arr1.length; i++){
//				for(int j=0; j<arr2.length; j++){
//					if(arr1[i].equals(arr2[j])){
//						commonNos.add(arr1[i]);
//					}
//				}
//			}
//			for(int nos : commonNos){
//				System.out.println("Common nos : "+ nos);
//			}
//		}

	//	public static void main(String args[]) { //Check common elements in arrays
	//
	//		Integer[] arr1 = {4,2,3,1,6};
	//		Integer[] arr2 = {6,7,8,4};
	//		// List<Integer> commonNos = new ArrayList<>();
	//
	//		// for(int i=0; i< arr1.length; i++){
	//		//     for(int j=0; j<arr2.length; j++){
	//		//         if(arr1[i] == arr2[j]){
	//		//             commonNos.add(arr1[i]);
	//		//         }
	//		//     }
	//		// }
	//
	//		// for(int nos : commonNos){
	//		//           System.out.println("Common nos : "+ nos);
	//		// }
	//
	//		List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
	//		List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
	//
	//		list1.retainAll(list2);
	//		for(int num : list1){
	//			System.out.println(num);
	//		}
	//	}

	//	public static void main(String args[]) { //Common list
	//		String[] arr1 = {"Java","JavaScript","C","C++"};
	//		String[] arr2 = {"Python","C#","Java","C++"};
	//		List<String> list1 = new ArrayList<>(Arrays.asList(arr1));
	//		List<String> list2 = new ArrayList<>(Arrays.asList(arr2));
	//		List<String> commonLang= list1.stream().filter(list2::contains).collect(Collectors.toList());
	//		System.out.println(commonLang);
	//	}

	//	public static void main(String args[]) { //first and last numbers
	//		Integer [] arr1 = {4,2,3,1,6};
	//		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr1));
	//		int first = list.get(0);
	//		int last = list.get(list.size()-1);
	//		System.out.println("First element " + first);
	//		System.out.println("Last element " + last);
	//	}

	//	public static void main(String args[]) { //find min max
	//
	//		Integer [] arr1 = {4,2,3,1,0,6,12,15,20};
	//		int maxNo = arr1[0];
	//		int minNo = arr1[0];
	//		for(int num : arr1){
	//			if(num> maxNo){
	//				maxNo = num;
	//			}
	//			if(num < minNo) {
	//				minNo = num;
	//			}
	//		}
	//		System.out.println("Max no : "+ maxNo);
	//		System.out.println("Min no : "+ minNo);
	//	}

	//	public static void main(String args[]) { //2nd max no
	//
	//		Integer [] arr1 = {4,2,3,1,0,6,12,15,20};
	//		int maxNo = arr1[0];
	//		int secondMax = arr1[0];
	//		for(int num : arr1){
	//			if(num> maxNo){
	//				secondMax = maxNo;
	//				maxNo = num;
	//			}else if(num > secondMax && num < maxNo){
	//				secondMax = num;
	//			}
	//		}
	//		System.out.println("Max no : "+ maxNo);
	//		System.out.println("2nd Max no : "+ secondMax);
	//	}

//		public static void main(String args[]) { //3nd highest nos
//			int temp, size;
//			Integer [] arr1 = {10,5,20,63,12,57,88,60};
//			for(int i = 0; i< arr1.length; i++){
//				for(int j=i+1; j < arr1.length; j++){
//					if(arr1[i] < arr1[j]){
//						temp=arr1[i];
//						arr1[i]=arr1[j];
//						arr1[j]=temp;
//					}
//				}
//			}
//           
//			//Arrays.sort(arr1);
//	
//			System.out.println("Third largest number is : "+ arr1[arr1.length - 3]);
//		}

	//	public static void main(String args[]) { //max element
	//		Integer [] arr1 = {25,11,7,75,56};
	//		int maxNo = arr1[0];
	//		for(int i = 0; i< arr1.length; i++){
	//			if(arr1[i] > maxNo){
	//				maxNo = arr1[i];
	//			}
	//		}
	//		System.out.println("Largest number is : "+ maxNo );
	//	}

	//	public static void main(String args[]) { //find pair of target
	//		int target = 9;
	//		Integer [] arr = {2,7,11,15,-2};
	//	   for(int i=0; i< arr.length;i++) {
	//		   for(int j=i+1; j < arr.length; j++) {
	//			   if(arr[i] + arr[j] == target) {
	//				   System.out.println("("+ arr[i]+" ; "+arr[j]+")");
	//			   }
	//		   }
	//	   }
	//	}

	//	public static void main(String args[]) { //find unique elements		
	//		Integer [] arr = {1,1,2,2,3,4,4,5};
	//		Set<Integer> intSet = new HashSet<Integer>();
	//	   for(int i=0; i< arr.length;i++) {
	//		  if(!intSet.contains(arr[i])) {
	//			  intSet.add(arr[i]);
	//		   }
	//		}
	//	   for(int num : intSet) {
	//	   System.out.println("Uniques values in array : "+ num);
	//	   }			   
	//	}


	//	public static void main(String args[]) { //find missing elements		
	//		int [] arr = {1,2,3,4,6};
	//		int n = 6;
	//		
	//		int expectedSum = n * (n+1)/2;
	//		int actualSum = 0;
	//		for(int num : arr) {
	//			actualSum += num;
	//		}
	//		int missingNo = expectedSum -actualSum;
	//		System.out.println("Missing no is : "+ missingNo );
	//	}

//	public static void main(String args[]) { //find unique elements		
//		int [] arr = {1,2,3,4,5,3};
//
//		for(int i=0; i<arr.length;i++) {
//			for(int j=i+1; j<arr.length;j++) {
//				if(arr[i] == arr[j]) {
//					System.out.println("Duplicate element is : " + arr[i]);
//				}
//			}
//		}
//	}

//	public static void main(String args[]) { //move zero to end
//		int [] arr = {0,1,0,3,12};
//        int index = 0;
//        for(int i=0; i< arr.length;i++) {
//        	if (arr[i] != 0 ) {
//				arr[index++] = arr[i];
//			}
//        }
//        while (index < arr.length) {
//        	arr[index++] = 0; 
//        }        
//        for(int num: arr) {
//        	System.out.println("num : "+ num);
//        }
//	}
	
//	public static void main(String args[]) { //move zero to start
//		int [] arr = {0,1,0,3,12};
//		int n = arr.length;
//        int index = n - 1; // Start from the end of the array
//
//        // Traverse the array and move non-zero elements towards the end
//        for (int i = n - 1; i >= 0; i--) {
//            if (arr[i] != 0) {
//                arr[index--] = arr[i];
//            }
//        }
//        // Fill the start of the array with zeros
//        while (index >= 0) {
//            arr[index--] = 0;
//        }
//        // Print the modified array
//        for (int num : arr) {
//            System.out.println("num: " + num);
//        }
//    }
	
//	public static void main(String args[]) { 
//	int [] arr = {1,2,3,4,2,1};
//	for(int i= 0; i< arr.length;i++) {
//		if ((i==0 || arr[i] > arr[i-1]) && (i==arr.length -1 || arr[i] > arr[i+1])) {
//			System.out.print("Peak Element is : "+arr[i]);
//		}
//	}
}
	

