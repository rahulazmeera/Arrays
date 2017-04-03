package arrayss;

import java.util.HashMap;
import java.util.Set;

public class Hashmapping {

	public static void main(String a[]) {
		// TODO Auto-generated method stub

	HashMap<Integer,String> First=new HashMap<Integer,String>();
	
	First.put(45, "Rahul");
	First.put(66, "Hello");
	First.put(77, "Kiing");
	//First.remove(66);
	
	First.replace(77, "JAi");
	//ths is print the whole set of the map
	System.out.println(First);
	
	
	Set<Integer> k=First.keySet();
	//Using the Advanced For loop to retrive each key from the map set
	for(Integer key:k){
		System.out.println(key);}
		
		
		HashMap<Integer, String> Second=new HashMap<Integer,String>();
		Second.put(1, "King");
		Second.put(2, "hello");
        Second.put(3, "Hey");
        First.putAll(Second);
        Second.put(6, "You");
        
        //this is used to copy the one content of the element to the other element
        
        First.putAll(Second);
        
        System.out.println(First);
        System.out.println(Second);
        
	
	}
	
	
	
	
	}


