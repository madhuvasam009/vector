/**
 * 
 */
package basic.exceptionHandiling;

/**
 * @author welcome
 *
 */
public class ExceptionHandiling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int total;
		int num1=10;
		int num2=0;
		int num3=9;
		int sum=num1+num2;
		int[]names=new int[2];
	
		
		try {
			for(int i=0;i<=names.length;i++) {
				System.out.println("i is::"+i+"names.length"+names.length);
				System.out.println("names is :::"+names[i]);
			}
		
			
		}
		catch(Exception exception)
		{
			System.out.println("I have exception Error in my progam "+exception.getMessage());
			exception.printStackTrace();
		
		}finally {
			System.out.println(" I am in Practice Exception Handiling in program");
		
}
		try {
			
			
			System.out.println("the result of sum::"+sum);
			int total1=(num1+num3)/num2;
			System.out.println("the result of total1::"+total1);
			
		}
		catch(Exception exception)
		{
			System.out.println("I have exception Error in my progam "+exception.getMessage());
			exception.printStackTrace();
			
		}finally {
			System.out.println(" I am in Practice Exception Handiling in program");
		
}
}}

	


    
     
	
	





