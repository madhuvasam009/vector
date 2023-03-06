/**
 * 
 */
package java8.features.stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;

/**
 * @author welcome
 *
 */
public class AggeratationExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> numbers= new ArrayList<>();
		numbers.add(9);
		numbers.add(8);
		numbers.add(7);
		numbers.add(6);
		numbers.add(5);
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		IntSummaryStatistics summaryStatistics=numbers.stream().mapToInt(number->{
			/* System.out.println("number :::"+number); */
			return number;}).summaryStatistics();
		System.out.println("summaryStatistics max :::" +summaryStatistics.getMax() );
		System.out.println("summaryStatistics min :::" +summaryStatistics.getMin() );
		System.out.println("summaryStatistics sum:::" +summaryStatistics.getSum());
		System.out.println("summaryStatistics count:::" +summaryStatistics.getCount());
		System.out.println("summaryStatistics average:::" +summaryStatistics.getAverage());
	}
}
	/*	int min=numbers.get(0);
		int max=numbers.get(0);
		for(int number:numbers)
		{
      if(min>number)
      {
    	  min=number;
    
      }
	}
		for(int number:numbers)
		{
      if(max<number)
      {
    	  max=number;
    	
      }

}
		System.out.println(" min is:: " + min);
		 System.out.println(" max is:: " + max);
	}
}*/
