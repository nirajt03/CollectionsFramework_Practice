package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.concurrent.atomic.AtomicBoolean;

//This example demonstrates how to create an ArrayList using the ArrayList() constructor 
//and add new elements to an ArrayList using the add() method.
public class CreateArrayListExample {
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>(); 
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		System.out.println(fruits.toString());
		
		List<String> myList = new ArrayList<>();
		myList.add("");
		myList.add("");
		
		List<Integer> otherList = Arrays.asList(1,2,2,3,3,3,5);
		for (Integer intghg : otherList) {
			System.out.println("Integer at Index : "+intghg );
		}
		otherList.add(7);
	}
}
