package arrayss;

import java.util.Arrays;

public class AddinginArrays {

	
	public static void insertIntoArray(
	        int[] array, int insertIndex, int newValue){

	    //move elements below insertion point.
	    for(int i=array.length-1; i > insertIndex; i--){
	        array[i] = array[i-1];
	    }

	    //insert new value
	    array[insertIndex] = newValue;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] ints   = new int[20];

		insertIntoArray(ints, 0, 10);
		insertIntoArray(ints, 1, 23);
		insertIntoArray(ints, 9, 67);
		
		
	
		
		///this is first code 

		int[] ints1   = new int[20];

		int insertIndex = 10;
		int newValue    = 123;

		//move elements below insertion point.
		for(int i=ints1.length-1; i > insertIndex; i--){
		    ints1[i] = ints1[i-1];
		}

		//insert new value
		ints1[insertIndex] = newValue;

		System.out.println(Arrays.toString(ints1));
		//testing git comment
	}

}
