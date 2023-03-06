/**
 * 
 */
package java8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author welcome
 *
 */
public class EmptyStringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> List = new ArrayList<>();
		List.add("vasam");
		List.add("madhu");
		List.add("sarojana");
		List.add("ramya");
		List.add("");
		List.add("sathya");
		List.add("madhu");
		List.add("shiva");
		  long nonemptynames=0;
		  long emptynames=0;
	   for(String names:List) {
		   
		   if(!names.equalsIgnoreCase(""))
		   {
		   System.out.println("names is::" + names );
		   nonemptynames++;
	   }
	}
	   System.out.println("nonemptyString is::" + nonemptynames );
	   emptynames = List.stream().filter(names->names.isEmpty()).count();
	  System.out.println("emptynames is::" + emptynames);
	  List<String> nonemptyname = List.stream().filter(names->!names.isEmpty()).collect(Collectors.toList());
	  System.out.println("nonemptyname is::" + nonemptyname);
	  Set<String> nonempty = List.stream().filter(names->!names.isEmpty()).collect(Collectors.toSet());
	  System.out.println("nonempty is::" + nonempty);
}
	
	

}
