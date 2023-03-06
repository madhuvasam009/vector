/**
 * 
 */
package basic.keywords;

/**
 * @author welcome
 *
 */
public class FinalKeywordExample extends ParentClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    String Name="madhu";
    Name = Name.concat("vasam");
   
    System.out.println("Name is::"+Name);

	}
	@Override
	public void displayDetails() {
		System.out.println("ChildClass");
   }
	@Override
	public void display() {
		System.out.println("Child abstract");
}
}
