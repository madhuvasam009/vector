/**
 * 
 */
package java8.features.stream;

import java.util.ArrayList;

/**
 * @author welcome
 *
 */
public class FindExample {

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
	String findname =List.stream().filter(name->name.startsWith("m")).findAny().get();
	  System.out.println(" findname::::" +findname);

	}

}
