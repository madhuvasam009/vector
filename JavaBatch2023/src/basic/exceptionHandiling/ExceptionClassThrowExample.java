/**
 * 
 */
package basic.exceptionHandiling;

/**
 * @author welcome
 *
 */
public class ExceptionClassThrowExample {
	

	/**
	 * @param args
	 * @throws CustomExceptionMessage 
	 */
	public static void main(String[] args) throws CustomExceptionMessage {
		
		CustomExceptionMessage customExceptionMessage= new CustomExceptionMessage();
		ExceptionCodeValue exceptionCodeValue = new ExceptionCodeValue();
 
		
		int principal=1000;
		int rateOfInterest = 2;
		int timePeriod = 10;
		int[] names = new int[2];
		names[0] = 10;
		names[1] = 20;
		String  name="madhu";
		//System.out.println(names[-100]);
		// TODO Auto-generated method stub
		//ExceptionClass exceptionClass = new ExceptionClass();
		ExceptionModel exceptionModel = new ExceptionModel("madhu", "male");
		 //ExceptionModel exceptionModel=null;
		exceptionModel.setAge(27);
		exceptionModel.setLocation("warangal");
	    exceptionModel.setPhoneNumber(730846743);
		exceptionModel.setFatherName("vasam veeraiah");
		 
		try {
			int interestAmount = (principal * rateOfInterest * timePeriod) /100;
			System.out.println("interestAmount :" + interestAmount);

			int totalAmount = principal + interestAmount;
			System.out.println("totalAmount : " + totalAmount);
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
				 int number=10;
			}catch(Exception exception) {
				System.out.println("nested catch block we are getting exception::");
			}
			finally {
				
				System.out.println("nested finally");
			}

		} catch (ArithmeticException arithmeticException) {
		 	throw new  CustomExceptionMessage (exceptionCodeValue.arithmeticException,exceptionCodeValue.arithmeticExeptionMessage);   
			 
		} catch (NullPointerException nullPointerException) {
			
			throw	new CustomExceptionMessage (exceptionCodeValue.nullPointerException,exceptionCodeValue.nullPointerExceptionMessage);   
		}
		catch (NumberFormatException numberFormatException) {
			 			
			throw new CustomExceptionMessage (exceptionCodeValue.numberFormatException,exceptionCodeValue.numberFormatExceptionMessage);   
		
		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			
			throw	new CustomExceptionMessage (exceptionCodeValue.arrayIndexOutOfBoundsException,exceptionCodeValue.arrayIndexOutOfBoundsExceptionMessage);   
		
		} catch (Exception exception) {
			throw	new CustomExceptionMessage (exceptionCodeValue.Exception,exceptionCodeValue.ExeptionMessage);   
					 
		} finally {
			System.out.println("we are in finally.");
		}
		
		
		

	}

}
