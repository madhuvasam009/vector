/**
 * 
 */
package dataTypes;
import java.util.Random;
/**
 * @author welcome
 *
 */
public class CricketScore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int over=20;
       int totalballs=over*6;
       int ballsperover=6;
       int wickets=0;
       int totalscore=0;
       int runs=8;
       int indivalruns=0;
       int ballsfaced=0;
       int strikerate=0;
       Random randomGenerator = new Random();
       for(int i=1;i<over;i++)
       {
    	   if(wickets==10)
    		   {
    		   break;
    		   }
    	   for(int j=1;j<=ballsperover;j++)
    	   {
    		   int runsperball= randomGenerator.nextInt(runs);
    		   System.out.println("runs per  ball is:"+runsperball);
    		   if(runsperball==7)
    		   {
    			   System.out.println("score of batsmen is:"+wickets+" is:"+indivalruns);
    			   System.out.println("wicket fall at "+i+"."+j+"overs");
    			   ballsfaced=((i*6)+j)-ballsfaced;
    			   System.out.println("balls faced by batsmen:"+ballsfaced);
    			   strikerate=runs*i-runs;
    			   System.out.println("strikerate of batsmen:"+strikerate);
    			   indivalruns=0;
    			   wickets++;
    			   if(wickets==10)
    			   {
    				   break;
    			   }
    			   
    			   
    		   }else
    		   {
    			   totalscore=totalscore+runsperball;
    			   indivalruns=indivalruns+runsperball;
    		   }
    		   
       }
    	   int oversCompleted=i+1;
    	   int ballscompleted=(oversCompleted)*6;
    	   System.out.println("score is:"+oversCompleted+"overs is:"+totalscore+"-"+wickets);
    	   System.out.println("score is:"+ballscompleted+"overs is:"+totalscore+"-"+wickets);
    	   float runsratsperover=totalscore/oversCompleted;
    	   System.out.println("runsratsperover is:"+runsratsperover);
    	   float remainingballs=totalballs-ballscompleted;
    	   System.out.println("remainingballs is:"+remainingballs);
    	   float remainingsovers=over-oversCompleted;
    	   System.out.println("remainingsovers is:" +remainingsovers);
       
       }
	
    	   
    	   
       
	}
	}


