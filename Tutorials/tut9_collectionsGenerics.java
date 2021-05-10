import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class tut9_collectionsGenerics {
    public static void main(String[] args) {

// Alternative for lists:

// *****************1*********************
        // Collection vals = new ArrayList();   // non-indexed, any datatype, duplicates accepted
        // vals.add("Hi");
        // vals.add(2.45);
        // vals.add(3);
        // System.out.println(vals);

        // Iterator it = vals.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
        
// *****************2*********************
        // List vals = new ArrayList();     // indexed, any datatype, duplicates accepted
        // vals.add(1.242);
        // vals.add("Hi");
        // vals.add(2,3);  // index and element
        // System.out.println(vals);

        // for (Object o : vals) {
        //     System.out.println(o);
        // }

// *****************3*********************
        // List<Integer> vals = new ArrayList<>();      // indexed, same datatype, duplicates accepted
        // vals.add(1);
        // vals.add(2);
        // vals.add(2,3);  // index and element
        // System.out.println(vals);

        // Collections.sort(vals);
        // Collections.reverse(vals);
        // Collections.shuffle(vals);

        // for (Object o : vals) {
        //     System.out.println(o);
        // }

// *****************4*********************
        // Set<Integer> vals = new HashSet<>();    // non-indexed, same datatype, duplicates not accepted
        // vals.add(3);  
        // vals.add(2);
        // vals.add(3);  // index and element
        // vals.add(1);
        // vals.add(2);
        // System.out.println(vals);

        // for (Object o : vals) {
        //     System.out.println(o);
        // }

// *****************5*********************
            Map<String, String> myMap = new HashMap<>();
            myMap.put("myName", "Navin");
            myMap.put("actor", "John");
            myMap.put("ceo", "Marisa");
            myMap.put("actor", "Akshay");

            System.out.println(myMap.get("ceo"));
            System.out.println(myMap.get("lol"));
            
            Set<String> keys = myMap.keySet();
            for (String key : keys) {
                System.out.println(key + " : " + myMap.get(key));
            }
    }
    
}