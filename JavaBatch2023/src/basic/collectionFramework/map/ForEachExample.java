/**
 * 
 */
package basic.collectionFramework.map;

import java.util.ArrayList;
import java.util.List;

/**
 * @author welcome
 *
 */
public class ForEachExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> listName= new ArrayList<>();
		listName.add("Madhu");
		listName.add("Veeraiah");
		listName.add("Sarojana");
		listName.add("Vasam");
		for(int i=0;i<listName.size();i++) {
			System.out.println(listName.get(i));
		}
	

	for( String Name:listName)
	{
		System.out.println(Name);

}
	}
	}
