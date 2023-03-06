/**
 * 
 */
package dataTypes;

/**
 * @author welcome
 *
 */
public class MethodTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5250;
		  int b=3416;  
		

		 
		  MethodTypes madhu=new MethodTypes();
		  madhu.collegeInformation();
		  madhu.totalMark();
		  madhu.percentages(a,b);
		  madhu.familymemberInformation();
		  madhu.dailyactivites();
		  
}
	private void collegeInformation() {
		
	System.out.println("college name is mallareddy inistitute of technology and engineering ");
	System.out.println("address is hyderabad ");
	
	}
	private void totalMark() {
		
		  System.out.println("total marks out of 5250 get 3416");
	}

	
	private float percentages( int a,int b ) 
	{
	
		
		float percentages = ((a*100)/b);
		System.out.println("percentage :"+percentages);
		return percentages;
		
		
	}
	private void familymemberInformation() {
		
		System.out.println("fathername is :Veeraih");
		System.out.println("mothername is :Sarojana");
		System.out.println("villagename is:kothagudem");
		System.out.println("pincode is:506330");
		System.out.println("post is: sangem");
		System.out.println("mandal is: sangem");
		System.out.println("district is:warangal");
		System.out.println("state is:telangana");
		}
	
private void dailyactivites() {
	System.out.println("daily wake at : 5 am");
	System.out.println("excerise do 1 hours daily");
	System.out.println(" he doing tiffen: 9 am ");
	System.out.println("reading some books between 10 to 2 pm");
	System.out.println("launch time 3 pm");
	System.out.println("at 4pm take cup of coffife");
	System.out.println(" evening 5 t 7pm is doing games");
	System.out.println("dinner time is: 8 pm");
	System.out.println("sleeping at 11 pm daily");
}
}
	
