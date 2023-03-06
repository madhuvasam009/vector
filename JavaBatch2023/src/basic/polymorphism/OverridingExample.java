/**
 * 
 */
package basic.polymorphism;

/**
 * @author welcome
 *
 */
public class OverridingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 
		OverridingExample overridingExample = new OverridingExample();
		overridingExample.Display();
		
		
		
	}
	
	private void Display(){
		
		System.out.println("Display");
		
		ChildClass childClass = new ChildClass();
		childClass.displayDetails();
		
		
		ParentClass parentClass = new ParentClass();
		parentClass.displayDetails();
		
		
		ParentClass parentClass1 = new ChildClass();
		parentClass1.displayDetails();
		
	
		
		
	}

}
