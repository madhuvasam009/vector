/**
 * 
 */
package java8.features;

import java.util.ArrayList;

/**
 * @author welcome
 *
 */
public class LamdaExpressionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> arrayList = new ArrayList<>();
       arrayList.add("vasam");
       arrayList.add("madhu");
       arrayList.add("sarojana");
       //LamdaExpressionExample lamdaExpressionExample = new LamdaExpressionExample();
       arrayList.forEach((String name )->{
			System.out.println("lamda name is::" + name );
			String name1 ="";
			arrayList.forEach(madhu ->System.out.println(" lamda single line name is::" + name1 ));
       });
       //lamdaExpressionExample.displayData(arrayList);
       
       
	}
	public void displayData( ArrayList<String> arrayList)
	{
		 ArrayList<String> arrayListName = new ArrayList<>();
		
		  for (String name : arrayListName) {
		  
		  System.out.println("for loop name is::" + name );
		  if(name.startsWith("v"))
		  {
			  arrayListName.add("vasam");
		  }
		 
		
	       arrayList.forEach((String c)->{
			System.out.println("lamda name is::" + name );
	});
	       
	       arrayList.forEach(madhu ->System.out.println(" lamda single line name is::" + name));
	}
}
}
