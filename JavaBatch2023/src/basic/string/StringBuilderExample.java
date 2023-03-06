/**
 * 
 */
package basic.string;

/**
 * @author welcome
 *
 */
public class StringBuilderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String fullName = "Vasam Madhu";
		 String surName  = "Vasam";

		 StringBuilder stringbuilder = new StringBuilder("Warangal");
		 stringbuilder.append(fullName).append(surName);
		 System.out.println(stringbuilder);
		 System.out.println(stringbuilder.reverse());
		 

	}

}
