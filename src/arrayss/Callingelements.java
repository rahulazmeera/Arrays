package arrayss;

public class Callingelements {

	
	public void CallArray(){
		
		

		int a[]= {1,2,3,4,5,6,7,8,9};
		String b[]={"Rahul","Siddu","ammu","naik"};
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			//System.out.println(b[i]);
		}
		//System.out.println(b[2]);
	//	System.out.println(a[5]);
		
		
		
		
	}
	public void addingIntoArray(){
		
		String[] stringArray = new String[10];

		for(int i=0; i < stringArray.length; i++) {
		    stringArray[i] = "String no " + i;
		}

		for(int i=0; i < stringArray.length; i++) {
		    System.out.println( stringArray[i] );
		}
		
		
	}
	
	public void foreachloop(){
		System.out.println("Hear is the EACH LOPP");
		int[] intArray = new int[10];

		for(int theInt : intArray) {
		    System.out.println(theInt);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Callingelements e=new Callingelements();
		e.addingIntoArray();
		e.CallArray();
		e.foreachloop();
		
		
	}

}
