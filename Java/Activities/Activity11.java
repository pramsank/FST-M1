package src.Activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Black");
        hash_map.put(2, "Blue");
        hash_map.put(3, "Green");
        hash_map.put(4, "Yellow");
        hash_map.put(5, "Red");
        hash_map.put(6, "White");

        // Print the Map
        System.out.println("The Original map: " + hash_map);

        // Remove one colour
        hash_map.remove(4);
        // Map after removing a colour
        System.out.println("After removing Yellow: " + hash_map);

        // Check if green exists
        if(hash_map.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }

        // Print the size of the Map
        System.out.println("Number of pairs in the Map is: " + hash_map.size());
    }
}
