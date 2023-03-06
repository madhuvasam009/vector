/**
 * 
 */
package dataTypes;

/**
 * @author welcome
 *
 */
public class CricketOver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
      int firstoverscore=10;
      int secondtoverscore=20;
      int thirdtoverscore=19;
      int fourthoverscore=17;
      int fifthoverscore=15;
      int sixthtoverscore=11;
      int seventhoverscore=1;
      int eightoverscore=14;
      int ninthoverscore=6;
      int tenoverscore=1;
      int Totalscore=firstoverscore+secondtoverscore+thirdtoverscore+ fourthoverscore+ fifthoverscore+
    		  sixthtoverscore+seventhoverscore+eightoverscore+ninthoverscore+ tenoverscore;
      System.out.println("Totalscore"+""+Totalscore);
      for(i=1;i<=10;i++) {
    	  
    	  for(j=1;j<=6;j++) {
    		  while(i==6 && i==2 && j==5)
    		  {
    			  System.out.println("the player take four for  fourth over second ball");
    			  break;
    		  }
    		  if(i==4 && i==3 && j==5)
    		  {
    			  System.out.println("the player take four for  third over first ball");
   
    		  }
    	  }
    	  if(i==3) {
    		 System.out.println("no runs");
    	  }
      }
    	  
	}

}
