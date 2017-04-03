package arrayss;

import java.util.ArrayList;
import java.util.Arrays;

public class AddiigElemntAtendofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 /*   // Create an ArrayList that holds references to String
	    ArrayList<String> names = new ArrayList<String>();

	    // Capacity starts at 10, but size starts at 0
	    System.out.println("initial size: " + names.size() );

	    // Add three String references
	    names.add("Amy");
	    names.add("Bob");
	    names.add("Cindy");
	    names.add(0, "kukka");
	    names.add(4, "Nakka");
	    System.out.println("new size: " + names.size() );
	       
	    // Access and print out the Objects
	    for ( int j=0; j<names.size(); j++ ){
	     String a[] ={ names.get(j) };
	   
	     System.out.println(Arrays.toString(a)); 
	*/
		ArrayList<Integer> number=new ArrayList<Integer>();
		
		
		number.add(3);
		number.add(6);
		number.add(5);
        number.add(8);	
        number.add(0);
        number.remove(0);
        for(int j=0; j<number.size();j++){
        
        	int[] k={number.get(j)};
        	
        	
        System.out.print(Arrays.toString(k));
        
        }
		
		
		
		
		
		
		
		
	    }
		

	}


