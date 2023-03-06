/**
 * 
 */
package basic.exceptionHandiling;

/**
 * @author welcome
 *
 */
public class CustomExceptionMessage extends Exception{
    private int exceptioncode;
    private String exceptionmessage;
  
 public CustomExceptionMessage() {
	 
 }
public CustomExceptionMessage(int exceptioncode,String exceptionmessage) {
	 this.exceptioncode=exceptioncode;
	 this.exceptionmessage=exceptionmessage;
	 System.out.println(exceptioncode);
		System.out.println(exceptionmessage);
	 	 
 }
/**
 * @return the exceptioncode
 */
public int getExceptioncode() {
	return exceptioncode;
}
/**
 * @param exceptioncode the exceptioncode to set
 */
public void setExceptioncode(int exceptioncode) {
	this.exceptioncode = exceptioncode;
}
/**
 * @return the exceptionmessage
 */
public String getExceptionmessage() {
	return exceptionmessage;
}
/**
 * @param exceptionmessage the exceptionmessage to set
 */
public void setExceptionmessage(String exceptionmessage) {
	this.exceptionmessage = exceptionmessage;
}
 
 }
 
