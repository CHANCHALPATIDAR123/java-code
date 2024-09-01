package ArrayList;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

class RemoveDuplicates {
    // Corrected method signature to accept ArrayList<T>
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> arrayList) {
        // Using LinkedHashSet to remove duplicates while preserving the order
        return new ArrayList<>(new LinkedHashSet<>(arrayList));
    }

    public static void main(String[] args) {
        // Creating an ArrayList with duplicate elements
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 3, 2));
        
        // Calling the method to remove duplicates
        ArrayList<Integer> uniqueList = removeDuplicates(arrayList);
        
        // Printing the unique elements
        System.out.println(uniqueList);
    }
}