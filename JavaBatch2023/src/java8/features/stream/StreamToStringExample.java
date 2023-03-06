/**
 * 
 */
package java8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author welcome
 *
 */
public class StreamToStringExample {

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
		List.stream().filter(name->name.startsWith("k")).map(name->name.toUpperCase()).forEach(System.out::println);
		List.stream().findFirst().ifPresent(System.out::println);
		StringBuffer namesdata= new StringBuffer();
		  for(String names:List)
		  {
			  namesdata.append(names.toUpperCase()).append("||");
		  }
		  String Data= namesdata.substring(0,namesdata.length()-2);
		  System.out.println("Data is::" + Data);
		String data=List.stream().map(name->name.toUpperCase()).collect(Collectors.joining("||"));
		List<String> Streamdata=List.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println("data is::" + data );
		System.out.println("Streamdata is::" + Streamdata );
	}

}
