/**
 * 
 */
package dataTypes;

/**
 * @author welcome
 *
 */
public class FibonaciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rent=4000;
		 int dailyexpence=1000;
		 int vechile=2000;
		 int kitchen =2000;
		 int clothrent=5000;
		 int Totalexpenduture = rent+dailyexpence+vechile+kitchen+clothrent;
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
    }
	
  }
	


