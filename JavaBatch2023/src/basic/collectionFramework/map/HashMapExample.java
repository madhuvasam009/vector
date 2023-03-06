/**
 * 
 */
package basic.collectionFramework.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author welcome
 *
 */
public class HashMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashMap<String, String>	hashMap = new HashMap<>();
   hashMap.put("1", "Mobile");
   hashMap.put("2", "Wallet");
   hashMap.put("3", "Bike");
   hashMap.put("4", "Laptop");
   hashMap.put("5", "Furniture");
   HashMap<String, String> hashMapCustomer = new HashMap<>();
   hashMapCustomer.put("6", "Book");
   hashMapCustomer.put("7", "Pen");
   hashMap.putAll(hashMapCustomer);
   hashMap.containsKey("3");
   Boolean contains=hashMap.containsKey("3");
   System.out.println(contains);
   Boolean containsAll=hashMap.containsKey(hashMap);
   System.out.println(containsAll);
   System.out.println(hashMap.entrySet());
   System.out.println(hashMap.keySet());
   System.out.println(hashMap.values());
   for(Map.Entry<String, String> Name:hashMap.entrySet()) {
        System.out.println(Name.getKey());
	   System.out.println(Name.getValue());
      }
	}
}
