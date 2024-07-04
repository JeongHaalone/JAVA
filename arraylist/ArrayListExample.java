package arraylist;
import java.util.ArrayList; // Import the ArrayList class from java.util package

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        // The diamond operator <> infers the type from the declaration
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the end of the list
        fruits.add("Apple");  // Index 0
        fruits.add("Banana"); // Index 1
        fruits.add("Cherry"); // Index 2

        // Print the entire ArrayList
        // ArrayList overrides toString() for easy printing
        System.out.println("Fruits: " + fruits);

        // Access an element by its index (0-based)
        System.out.println("First fruit: " + fruits.get(0));

        // Modify an element at a specific index
        fruits.set(1, "Blueberry"); // Replaces "Banana" with "Blueberry"

        // Remove an element by its value
        // If multiple elements match, removes the first occurrence
        fruits.remove("Cherry");

        // Check if an element exists in the ArrayList
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Contains Apple? " + hasApple);

        // Get the current size of the ArrayList
        // Size changes dynamically as elements are added or removed
        System.out.println("Number of fruits: " + fruits.size());

        // Iterate(continue) through the ArrayList using an enhanced for loop
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear all elements from the ArrayList
        fruits.clear();
        System.out.println("After clearing, size: " + fruits.size()); // Will print 0
    }
}