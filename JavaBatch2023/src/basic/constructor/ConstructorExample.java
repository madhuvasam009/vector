/**
 * 
 */
package basic.constructor;

/**
 * @author welcome
 *
 */
public class ConstructorExample {
	
  
	private String firstName;
	private String lastName;
	private String middleName;
	private int Age;
	private char Gender;
	private long contactNumber;
	
	public  void constructorExample() {
		
	}
	
	public    ConstructorExample() {
		
	}
public    ConstructorExample(String firstName, String lastName) {
	      
	this.firstName = firstName;
	this.lastName = lastName;
		
	}

public    ConstructorExample(String firstName, String lastName,String middleName,int Age,char Gende,long contactNumber) {
    
	this.firstName = firstName;
	this.lastName = lastName;
	this.middleName=middleName;
	this.Age=Age;
	this.Gender=Gende;
	this.contactNumber=contactNumber;
	
	
		
	}

/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}

/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}

/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}

/**
 * @return the middleName
 */
public String getMiddleName() {
	return middleName;
}

/**
 * @param middleName the middleName to set
 */
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}

/**
 * @return the age
 */
public int getAge() {
	return Age;
}

/**
 * @param age the age to set
 */
public void setAge(int age) {
	Age = age;
}

/**
 * @return the gender
 */
public char getGender() {
	return Gender;
}

/**
 * @param gender the gender to set
 */
public void setGender(char gender) {
	Gender = gender;
}

/**
 * @return the contactNumber
 */
public long getContactNumber() {
	return contactNumber;
}

/**
 * @param contactNumber the contactNumber to set
 */
public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}

	

}
