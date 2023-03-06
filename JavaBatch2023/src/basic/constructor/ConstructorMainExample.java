/**
 * 
 */
package basic.constructor;

/**
 * @author welcome
 *
 */
public class ConstructorMainExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ConstructorExample constructorExample = new ConstructorExample("Madhu","Vasam","m",27,'M',970134621);
		ConstructorMainExample ConstructorMainExample= new ConstructorMainExample();
		constructorExample.setGender('m');
		constructorExample.setContactNumber(807449640);
		ConstructorMainExample.displayDetails(constructorExample);
	}

	private void displayDetails(ConstructorExample constructorExample) {
		
		System.out.println("First Name is :::"+constructorExample.getFirstName());
		System.out.println("Last Name is :::"+constructorExample.getLastName());
		System.out.println("Middle Name is :::"+constructorExample.getMiddleName());
		System.out.println("Age is :::"+constructorExample.getAge());
		System.out.println("Gender is :::"+constructorExample.getGender());
		System.out.println("Contact Number is :::"+constructorExample.getContactNumber());
		
	}
}
