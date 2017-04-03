package arrayss;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysTostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*int[]   ints = new int[100];

		for(int i=0; i < ints.length; i++){
		    ints[i] = 100-i;
		    if(i%2==0){
		    	System.out.println(i+"even");
		    	
		    }else{
		    	System.out.println(i+"OOdd");
		    }
		}

		System.out.println(java.util.Arrays.toString(ints));
		
		
		
		

	} */ Scanner a=new Scanner(System.in);
		 Scanner b=new Scanner(System.in);
         int n=b.nextInt();
      int[] arr=new int[n];
       int i;
     
          for(i=0;i<n;i++){
        	 
              arr[i]=b.nextInt();
              
              
          }
    
           for(i=arr.length-1;i>=0;i--){
        	   System.out.print(" "+arr[i]);
           }
	} 
		
	}
