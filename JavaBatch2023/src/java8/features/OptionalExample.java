/**
 * 
 */
package java8.features;

import java.util.Optional;

/**
 * @author welcome
 *
 */
public class OptionalExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] names = {"","","",""};
		String []namesArray=new String[10];
	Optional <String> name =Optional.ofNullable(namesArray[5]) ;
		System.out.println("name is::" + name );
		if(name.isPresent()) {
			System.out.println("name in upper class::" + namesArray[5].toUpperCase() );
			
	}
		if(null!=namesArray[5]) {
			
			System.out.println("name in upper class::" + namesArray[5].toUpperCase() );
			
		}

}
}
