/**
 * 
 */
package java8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author welcome
 *
 */
public class SquareNumberExample {

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
		List<Integer> squarenumber=numbers.stream().map(number ->number+number).collect(Collectors.toList());
		List<Integer> cubeNumbe=numbers.stream().map(number->number*number*number).collect(Collectors.toList());
		System.out.println("squarenumber is::" + squarenumber);
		System.out.println("cubeNumbe is::" + cubeNumbe);
	}

}
