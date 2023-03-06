/**
 * 
 */
package basic.collectionFramework.list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author welcome
 *
 */
public class LinkedListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedListNames = new LinkedList<String>();
		linkedListNames.add("vasam");
		linkedListNames.add("veeraiah");
		linkedListNames.add("naveen");
		linkedListNames.add(1,"sarojana");
		LinkedList<String> linkedListCustomer = new LinkedList<String>();
		linkedListCustomer.add("vamshi");
	linkedListCustomer.add("praveen");
	linkedListCustomer.add("praveen");
	linkedListNames.addAll(linkedListCustomer);
	linkedListNames.addAll(2,linkedListCustomer);
	linkedListCustomer.add("gani");
	Boolean avalible=linkedListNames.contains("naveen");
	System.out.println(avalible);
	Boolean avaliblelist=linkedListNames.containsAll(linkedListCustomer);
	System.out.println(avaliblelist);
	Boolean comparelist=linkedListNames.equals(linkedListCustomer);
	System.out.println(comparelist);
	//arrayListNames.remove("naveen");
	
	System.out.println("arrayListNames");
	if(!linkedListCustomer.isEmpty()) {
	
		for(int i =0;i<linkedListNames.size();i++)
		{
			System.out.println("name is::"+linkedListNames.get(i));
	}

	}
	}

}
