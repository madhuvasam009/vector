/**
 * 
 */
package java8.features.stream;

import java.util.ArrayList;

/**
 * @author welcome
 *
 */
public class MatchingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> List = new ArrayList<>();
		List.add("vasam");
		List.add("madhu");
		List.add("sarojana");
		List.add("ramya");
		List.add("sathya");
		List.add("madhu");
		List.add("shiva");
		
		/* Boolean record= List.stream().anyMatch(name->name.equals("madhu")); */
		Boolean record= List.stream().allMatch(name->name.equalsIgnoreCase("Madhu"));
			 
		 
			/* Boolean record=List.stream().noneMatch(name->name.equals("Madhu")); */
		if(record) 
		{
		 List.add("madhu");	
		}
		System.out.println("record is avalible:::" +record);
		System.out.println("record is avalible for contains :::" +List.contains("madhu"));
	}

}
