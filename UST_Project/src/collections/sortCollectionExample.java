package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class sortCollectionExample {
	
public static void main(String[] args)
{

	ArrayList<String> animals = new ArrayList<String>();
		animals.add("tiger");
        animals.add("lion");
        animals.add("cat");
        animals.add("snake");
        animals.add("mongoose");
        animals.add("elephant");
        
        Collections.sort(animals,Collections.reverseOrder());

        System.out.println(animals);
        
}
}