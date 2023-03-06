/**
 * 
 */
package java8.features;

/**
 * @author welcome
 *
 */
@FunctionalInterface
public interface CustomerInfo {
	public void customerDetails();
	
 default public void supplyProducts() {
		  
	 System.out.println("default method from interface");
	  }
	static  public void purchaseProducts() {
		  
		System.out.println("static method");
	  }

	
	 
	
}
