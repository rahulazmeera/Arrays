package arrayss;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingForEachloopinArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ArrayList<Integer> crunchifyList = new ArrayList<Integer>();
		 
		// add 4 different values to list
		crunchifyList.add(9);
		crunchifyList.add(8);
		crunchifyList.add(7);
		crunchifyList.add(6);
		
		crunchifyList.forEach((hi)->{
		
			System.out.print(hi);
		});		
		
		
		
	}
		
}	
		
		
		
		
		
	


