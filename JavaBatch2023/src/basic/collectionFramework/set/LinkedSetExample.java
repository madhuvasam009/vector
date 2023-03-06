/**
 * 
 */
package basic.collectionFramework.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author welcome
 *
 */
public class LinkedSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedsetExampleNames = new LinkedHashSet<>();
		linkedsetExampleNames.add("vasam");
		linkedsetExampleNames.add("veeraiah");
		linkedsetExampleNames.add("naveen");
		linkedsetExampleNames.add("sarojana");
		LinkedHashSet<String> linkedHashSetCustomer = new LinkedHashSet<>();
		linkedHashSetCustomer.add("vamshi");
		linkedHashSetCustomer.add("praveen");
		linkedHashSetCustomer.add("praveen");
		linkedHashSetCustomer.addAll(linkedHashSetCustomer);
		linkedHashSetCustomer.addAll(linkedHashSetCustomer);
		linkedHashSetCustomer.add("gani");
		linkedHashSetCustomer.add("gani");
	Boolean avalible=linkedsetExampleNames.contains("naveen");
	System.out.println(avalible);
	Boolean avaliblelist=linkedsetExampleNames.containsAll(linkedHashSetCustomer);
	System.out.println(avaliblelist);
	Boolean comparelist=linkedsetExampleNames.equals(linkedHashSetCustomer);
	System.out.println(comparelist);
	//arrayListNames.remove("naveen");
	
	System.out.println("LinkedsetListNames");
	if(!linkedHashSetCustomer.isEmpty()) {
	
		for(int i =0;i<linkedsetExampleNames.size();i++)
		{
			System.out.println("name is::"+linkedsetExampleNames);
	}

	}
 
	}

}
