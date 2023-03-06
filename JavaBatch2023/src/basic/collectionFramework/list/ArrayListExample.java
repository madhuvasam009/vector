/**
 * 
 */
package basic.collectionFramework.list;

import java.util.ArrayList;

/**
 * @author welcome
 *
 */
public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String[] arrayNames=new String[10];
//		arrayNames[0]="madhu";
//		arrayNames[1]="vasam";
//		for(int i =0;i<arrayNames.length;i++)
//		{
//			System.out.println(i);
//		}
		ArrayList<String> arrayListNames = new ArrayList<String>();
		arrayListNames.add("vasam");
		arrayListNames.add("veeraiah");
		arrayListNames.add("naveen");
		arrayListNames.add(1,"sarojana");
	ArrayList<String> arrayListCustomer = new ArrayList<String>();
	arrayListCustomer.add("vamshi");
	arrayListCustomer.add("praveen");
	arrayListCustomer.add("praveen");
    arrayListNames.addAll(arrayListCustomer);
	arrayListNames.addAll(2,arrayListCustomer);
	arrayListCustomer.add("gani");
	Boolean avalible=arrayListNames.contains("naveen");
	System.out.println(avalible);
	Boolean avaliblelist=arrayListNames.containsAll(arrayListCustomer);
	System.out.println(avaliblelist);
	Boolean comparelist=arrayListNames.equals(arrayListCustomer);
	System.out.println(comparelist);
	//arrayListNames.remove("naveen");
	
	System.out.println("arrayListNames");
	if(!arrayListCustomer.isEmpty()) {
		System.out.println("for loop");
	
		for(int i =0;i<arrayListNames.size();i++)
		{
			System.out.println("name is::"+arrayListNames.get(i));
	}
		System.out.println("for each");
		for(String names:arrayListNames) {
			System.out.println("names is:::"+names);

	}
	}
}
}
