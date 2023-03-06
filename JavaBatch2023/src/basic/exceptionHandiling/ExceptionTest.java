/**
 * 
 */
package basic.exceptionHandiling;

/**
 * @author welcome
 *
 */
public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int rent=4000;
		 int dailyexpence=1000;
		 int vechile=2000;
		 int kitchen =2000;
		 int clothrent=5000;
		 int Totalexpenduture = rent+dailyexpence+vechile+kitchen+clothrent;
		 System.out.println("Totalexpenduture is:::"+Totalexpenduture);
		 try {
			
			 if( rent== 4000 && dailyexpence==2000 && vechile==2000 && kitchen==2000 && clothrent==5000)
			 {
				 System.out.println("Totalexpenduture is 15000");
			 }
			 else if(Totalexpenduture>14000)
			 {
				 System.out.println("Totalexpenduture monthly is high");
			 }
			 else if(Totalexpenduture<=14000)
			 {
				 System.out.println("Totalexpenduture monthly is less");
			 }
        
	}catch(Exception exception) {
		System.out.println("Exception message is:::"+exception.getMessage());
		exception.printStackTrace();
	}finally {

		System.out.println("Totalexpenduture monthly is high");
}
	
	}
}
