/**
 * 
 */
package basic.exceptionHandiling;

/**
 * @author welcome
 *
 */
public class ExceptionClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//CustomExceptionMessage customExceptionMessage= new CustomExceptionMessage();
		//ExceptionCodeValue exceptionCodeValue=new ExceptionCodeValue ();   
 
		
		int principal=1000;
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
		try {
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
			try {
				
				System.out.println("nested try");
				 int number=10/0;
			}catch(Exception exception) {
				System.out.println("nested catch block we are getting exception::");
			}
			finally {
				
				System.out.println("nested finally");
			}

		} catch (ArithmeticException arithmeticException) {
			System.out.println("ExceptionClass::number Format exeption message is : " + arithmeticException.getMessage());
			arithmeticException.printStackTrace();
		} catch (NullPointerException nullPointerException) {
			System.out.println("ExceptionClass::number Format exeption message is : " + nullPointerException.getMessage());
			nullPointerException.printStackTrace();
		} catch (NumberFormatException numberFormatException) {
			System.out.println("ExceptionClass::number Format exeption message is : " + numberFormatException.getMessage());
			numberFormatException.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println("ExceptionClass::array IndexOutOfBounds exeption message is : " + arrayIndexOutOfBoundsException.getMessage());
			arrayIndexOutOfBoundsException.printStackTrace();
		} catch (Exception exception) {
			System.out.println("ExceptionClass:::exeption message is : " + exception.getMessage());
			exception.printStackTrace();
		} finally {
			System.out.println("we are in finally.");
		}
		int interestAmount = (principal * rateOfInterest * timePeriod) / 100;
		System.out.println("interestAmount :" + interestAmount);

		int totalAmount = principal + interestAmount;
		System.out.println("totalAmount : " + totalAmount);

	}
	}


