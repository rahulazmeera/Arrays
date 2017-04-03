package arrayss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HasssetAddingItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          HashSet A=new HashSet();
          
          A.add("s");
          A.add("king");
          A.add("me");
          A.add("l");
          System.out.print(A);
         System.out.println(A);
          //it will clear all the elements in the set
          //A.clear();
          
          // Creating a TreeSet of HashSet elements
          Set<String> tset = new TreeSet<String>(A);
      
          // Displaying TreeSet elements
          System.out.println("TreeSet contains: ");
          for(String temp : tset){
             System.out.println(temp);}
          
          
          //Iterating Through every element of the set 
          Iterator<String> it = A.iterator();
          while(it.hasNext()){
             System.out.println(it.next());
        
          
          }

}
}
