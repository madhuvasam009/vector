/**
 * 
 */
package basic.abstractInterface;

/**
 * @author welcome
 *
 */
public class InterfaceMainExample implements InterfaceExample,InterfaceAddress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InterfaceMainExample interfaceMainExample = new InterfaceMainExample();
		LoginDetails loginDetails=interfaceMainExample.setLoginDetails();
		interfaceMainExample.loginDetails(loginDetails);
		interfaceMainExample.displayDetails();
		interfaceMainExample.address();
		
	}

	
	 private LoginDetails setLoginDetails(){
		   LoginDetails loginDetails = new LoginDetails();
		   loginDetails.setUserName("MadhuTechnology");
		   loginDetails.setPassword("abc");
		   return loginDetails;
	 }
	@Override
	public void displayDetails() {
		System.out.println("Company registered in year :::2012");
		System.out.println("Company registered in place:: : Hyderabad");
		System.out.println("Company Main Branch::: Warangal");
		
	}

	@Override
	public void loginDetails(LoginDetails loginDetails) {
		System.out.println("Main userName is :::" +loginDetails.getUserName() );
		System.out.println("Main password is :::" +loginDetails.getPassword() );
		String  fullName=InterfaceExample.fullName;
		System.out.println("fullName is :::"+fullName);
		 String  Name=InterfaceAddress.Name;
		 System.out.println("fullName is :::"+Name);
	}


	@Override
	public void address() {
		
		System.out.println("Company Address is ::: 1-26, Warangal,506330");
	}

}
