/**
 * 
 */
package basic.polymorphism;

/**
 * @author welcome
 *
 */
public class OverloadingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OverloadingExample overloadingExample = new OverloadingExample();
		overloadingExample.displayDetails();
		overloadingExample.displayDetails("Madhu Vasam");
		overloadingExample.displayDetails(19, 29);
		overloadingExample.displayDetails(19, 4.9f);
		overloadingExample.displayDetails(5.9f, 7.9f);
	}
	private void displayDetails() {
		
		System.out.println("No parameters/arguments method");
		
	}
   private void displayDetails(String name) {
	   
	   System.out.println("One  parameters/arguments method is ::: " + name);
	}
   private void displayDetails(int firstnumber, int secondnumber) {
	   
	   int total=firstnumber+secondnumber;
	   
	   System.out.println("Two parameters/arguments method int,int ::: " + total);
	}
   private void displayDetails(int firstnumber, float secondnumber) {
	   
	   float total=firstnumber+secondnumber;
	   
	   System.out.println("Two parameters/arguments method is int,float ::: " + total);
  	}
   private void displayDetails(float firstnumber, float secondnumber) {
	   
	   float total=firstnumber+secondnumber;
	   
	   System.out.println("Two parameters/arguments method is float,float ::: " + total);
 	}


}
