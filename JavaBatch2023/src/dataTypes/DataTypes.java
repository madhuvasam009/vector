/**
 * 
 */
package dataTypes;

/**
 * @author welcome
 *
 */
public class DataTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =  10;
		int b = 5;
		int sum =a+b;
		int diffrence =a-b;
		int division =a%b;
		int mul =a *b;
		 
		if (a<=b) {
			System.out.println("print the equal operator");
		}
		if(b>a) {
			System.out.println("less than equql");
		}
 if(a>=b) {
	 System.out.println("greater than equal");
 }
 if(sum!=20) {
	 System.out.println("sum of a and b" +sum);
	 }
	
	if(diffrence<=1) {
		System.out.println(" diffrence is a and b" +diffrence);
	}
	if(division<=10){
		System.out.println("divdision" +division);
	}
if(mul<=10){
	System.out.println("mul" +mul);
}

for(int i=0;i<a;i++) {
	System.out.println("print sum increment number" +  i++);
}
for(int i=0;i<a;i--) {
	System.out.println("print sum increment number" +  +i--);
	}
}
}
