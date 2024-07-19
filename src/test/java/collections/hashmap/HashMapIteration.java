package collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteration {
	

    public static void main(String[] args)
    {
        // Creating a HashMap
        Map<String, String> foodTable = new HashMap<>();
 
        // Inserting elements to the adobe HashMap
        // Elements- Key value pairs using put() method
        foodTable.put("A", "Angular");
        foodTable.put("J", "Java");
        foodTable.put("P", "Python");
        foodTable.put("H", "Hibernate");
 
        // Iterating HashMap through for loop
        for (Map.Entry<String, String> set :foodTable.entrySet()) {
 
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = "+ set.getValue());
        }
    }
    
    // Main driver method
    public static void main1(String[] args)
    {
        // Creating hash map
        Map<Character, String> charType = new HashMap<>();
 
        // Inserting data in the hash map.
        charType.put('J', "Java");
        charType.put('H', "Hibernate");
        charType.put('P', "Python");
        charType.put('A', "Angular");
 
        // Iterating HashMap through forEach and
        // Printing all. elements in a Map
        charType.forEach((key, value)
                -> System.out.println(key + " = " + value));
    }


    public static void main2(String[] arguments)
    {
        // Creating Hash map
        Map<Integer, String> intType = new HashMap<>();
 
        // Inserting data(Key-value pairs) in hashmap
        intType.put(1, "First");
        intType.put(2, "Second");
        intType.put(3, "Third");
        intType.put(4, "Fourth");
 
        // Iterator
        Iterator<Entry<Integer, String> > new_Iterator = intType.entrySet().iterator();
 
        // Iterating every set of entry in the HashMap
        while (new_Iterator.hasNext()) {
            Map.Entry<Integer, String> new_Map = (Map.Entry<Integer, String>)new_Iterator.next();
 
            // Displaying HashMap
            System.out.println(new_Map.getKey() + " = "
                               + new_Map.getValue());
        }
    }
       

    public static void main5(String[] arguments)
    {
        // Creating hash map
        Map<Integer, String> intType = new HashMap<>();
 
        // Inserting data(key-value pairs) in HashMap
        // Custom inputs
        intType.put(1, "First");
        intType.put(2, "Second");
        intType.put(3, "Third");
        intType.put(4, "Fourth");
 
        // Iterating every set of entry in the HashMap, and
        // printing all elements of it
        intType.entrySet().stream().forEach(input
            -> System.out.println(input.getKey() + " : "
                                  + input.getValue()));
    }
}
