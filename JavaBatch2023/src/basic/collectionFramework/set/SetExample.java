/**
 * 
 */
package basic.collectionFramework.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author welcome
 *
 */
public class SetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<String> setExampleNames = new HashSet<>();
		setExampleNames.add("vasam");
		setExampleNames.add("veeraiah");
		setExampleNames.add("naveen");
		setExampleNames.add("sarojana");
		Set<String> setExampleCustomer = new HashSet<>();
		setExampleCustomer.add("vamshi");
		setExampleCustomer.add("praveen");
		setExampleCustomer.add("praveen");
		setExampleCustomer.addAll(setExampleCustomer);
		setExampleCustomer.addAll(setExampleCustomer);
		setExampleCustomer.add("gani");
		setExampleCustomer.add("gani");
	Boolean avalible=setExampleNames.contains("naveen");
	System.out.println(avalible);
	Boolean avaliblelist=setExampleNames.containsAll(setExampleCustomer);
	System.out.println(avaliblelist);
	Boolean comparelist=setExampleNames.equals(setExampleCustomer);
	System.out.println(comparelist);
	//arrayListNames.remove("naveen");
	
	System.out.println("setListNames");
	if(!setExampleCustomer.isEmpty()) {
	
		for(int i =0;i<setExampleNames.size();i++)
		{
			System.out.println("name is::"+setExampleNames);
	}

	}
 
}
}
