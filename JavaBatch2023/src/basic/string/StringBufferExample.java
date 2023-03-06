/**
 * 
 */
package basic.string;

/**
 * @author welcome
 *
 */
public class StringBufferExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String fullName = "Vasam Madhu";
		 String surName  = "Vasam";

		 StringBuffer stringbuffer = new StringBuffer("Warangal");
		 stringbuffer.append(fullName).append(surName);
		 System.out.println(stringbuffer);
		 System.out.println(stringbuffer.reverse());
		 
	}

}
