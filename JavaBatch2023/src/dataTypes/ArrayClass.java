/**
 * 
 */
package dataTypes;

/**
 * @author welcome
 *
 */
public class ArrayClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
 String[]names={"madhu","kinnera","vasu","mahesh","good"
	};
 int[]ages= { 20,23,24,25,29};
   for(i=0;i<names.length;i++) {
	   System.out.println("name of i:"  +names[i]);
	   
   }
   int[] age=new int[10];
   String[] namesi=new String[5];
   names[0]="madhu";
   names[1]="kinnera";
   names[2]="vasu";
   names[3]="mahesh";
   names[4]="good";
  
   for(i=0;i<names.length;i++) {
	   System.out.println("name of i" +names[i]);
   
}
	}
}
