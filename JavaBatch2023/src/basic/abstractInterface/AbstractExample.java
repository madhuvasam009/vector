/**
 * 
 */
package basic.abstractInterface;

/**
 * @author welcome
 * @param <LoginDetails>
 *
 */
public abstract class AbstractExample{


	public void loginDetails(LoginDetails loginDetails){
		System.out.println("userName is :::" +loginDetails.getUserName() );
		System.out.println("password is :::" +loginDetails.getPassword() );
		 
	 }

	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}

}
