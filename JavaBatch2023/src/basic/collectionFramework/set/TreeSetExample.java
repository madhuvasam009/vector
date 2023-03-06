/**
 * 
 */
package basic.collectionFramework.set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author welcome
 *
 */
public class TreeSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> setExampleNames = new TreeSet<>();
		setExampleNames.add("abhi");
		setExampleNames.add("vasam");
		setExampleNames.add("veeraiah");
		setExampleNames.add("naveen");
		setExampleNames.add("sarojana");
		System.out.println("name is::"+setExampleNames);
    Boolean avalible=setExampleNames.contains("naveen");
	System.out.println(avalible);
	System.out.println("TreesetListNames");
	//arrayListNames.remove("naveen");
	
	
	if(!setExampleNames.isEmpty()) {
	
		for(int i =0;i<setExampleNames.size();i++)
			
		{
			System.out.println("name is::"+setExampleNames);
	}

	}
 
}
	}

 
