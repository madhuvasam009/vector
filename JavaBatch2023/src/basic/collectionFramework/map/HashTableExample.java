/**
 * 
 */
package basic.collectionFramework.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author welcome
 *
 */
public class HashTableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable<String, String>	hashtable = new Hashtable<>();
		hashtable.put("1", "Mobile");
		hashtable.put("2", "Wallet");
		hashtable.put("3", "Bike");
		hashtable.put("4", "Laptop");
		hashtable.put("5", "Furniture");
		   Hashtable<String, String> hashTableCustomer = new Hashtable<>();
		   hashTableCustomer.put("6", "Book");
		   hashTableCustomer.put("7", "Pen");
		   hashtable.putAll(hashTableCustomer);
		   hashtable.containsKey("3");
		   Boolean contains=hashtable.containsKey("3");
		   System.out.println(contains);
		   Boolean containsAll=hashtable.containsKey(hashtable);
		   System.out.println(containsAll);
		   System.out.println(hashtable.entrySet());
		   System.out.println(hashtable.keySet());
		   System.out.println(hashtable.values());
		   for(Map.Entry<String, String> Name:hashtable.entrySet()) {
		        System.out.println(Name.getKey());
			   System.out.println(Name.getValue());
		      }
			}

	}
