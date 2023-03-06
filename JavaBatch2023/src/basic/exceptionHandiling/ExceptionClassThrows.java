/**
 * 
 */
package basic.exceptionHandiling;

/**
 * @author welcome
 *
 */
public class ExceptionClassThrows {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ArithmeticException,NullPointerException,NumberFormatException,ArrayIndexOutOfBoundsException{
		// TODO Auto-generated method stub
		int principal = 1000;
		int rateOfInterest = 2;
		int timePeriod = 10;
		int[] names = new int[2];
		names[0] = 10;
		names[1] = 20;
		String  name="100";
		//System.out.println(names[-100]);
		// TODO Auto-generated method stub
		// ExceptionClass exceptionClass = new ExceptionClass();
		ExceptionModel exceptionModel = new ExceptionModel("madhu", "male");
		 //ExceptionModel exceptionModel=null;
		exceptionModel.setAge(27);
		exceptionModel.setLocation("warangal");
		exceptionModel.setPhoneNumber(730846743);
		exceptionModel.setFatherName("vasam veeraiah");
		// ExceptionModel exceptionModel = null;
		 
			System.out.println("int value is::"+Integer.parseInt(name));
			System.out.println("name : " + exceptionModel.getName());
			System.out.println("gender : " + exceptionModel.getGender());
			System.out.println("phoneNumber : " + exceptionModel.getPhoneNumber());
			System.out.println("location : " + exceptionModel.getLocation());
			System.out.println("age : " + exceptionModel.getAge());
			System.out.println("fatherName : " + exceptionModel.getFatherName());
			for (int i = 0; i < names.length; i++) {
				System.out.println("i : " + i + " names.length : " + names.length);
				System.out.println("names :[" + i + "] :" + names[i]);
			}

			int calucation = (principal * rateOfInterest) / timePeriod;
			System.out.println("calucation : " + calucation);
			
		int interestAmount = (principal * rateOfInterest * timePeriod) / 100;
		System.out.println("interestAmount :" + interestAmount);

		int totalAmount = principal + interestAmount;
		System.out.println("totalAmount : " + totalAmount);
	}}

	

	


