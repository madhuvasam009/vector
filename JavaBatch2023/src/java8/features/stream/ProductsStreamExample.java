/**
 * 
 */
package java8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author welcome
 *
 */
public class ProductsStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 ArrayList<Products> productsList= new ArrayList<>();
    productsList.add(new Products("iphone 13", "apple", "mobile phone",7000f));
    productsList.add(new Products("realme g12", "oppo", "mobile phone", 25000f));
    productsList.add(new Products("titan 2", "titan", "watch", 75000f));
    productsList.add(new Products("puma shoe", "puma", "shoe", 10000f));
    productsList.add(new Products("samsung galaxy 12", "samsung", "tablet", 100000f));
    
    productsList.stream().filter(device->device.getProductType().equalsIgnoreCase("mobile phone")).
    forEach(device->System.out.println(device.getProductName()+ ":::::" +device.getPrice()));
    
    System.out.println("=========================================-====");
    
    List<Products> mobilelist=productsList.stream().filter(device->device.getProductType().
    		equalsIgnoreCase("mobile phone")).collect(Collectors.toList());
    mobilelist.forEach(device->System.out.println(device.getProductName()+ ":::::" + device.getPrice()));
   
    System.out.println("============================================");
     
     List<Float> mobilepricelist= productsList.stream().
    		 filter(device->device.getProductType().
     equalsIgnoreCase("mobile phone")).map(device ->{
      float value=device.getPrice()+(device.getPrice()*18/100);
      float discount=(value*5)/100;
      float finalprice=value-discount;
      return finalprice;})
     .collect(Collectors.toList());
     mobilepricelist.forEach(device->System.out.println("price " + device));	 
     
     System.out.println("============================================");
     
    List<Products> deviceMobilePriceList = productsList.stream()
    		 .filter(device -> device.getProductType().equalsIgnoreCase("mobile phone")).
    		 map(device -> {
    		 float value =device.getPrice()+ (device.getPrice()*18/100);
    		 float discout = (value * 5/100);
    		 float finalprice = value - discout;
    		 device.setPrice(finalprice);
    		 return device;})
    		 .collect(Collectors.toList());
    		 deviceMobilePriceList.forEach(device -> System.out.println(device.getProductName() + " : " + device.getPrice()));
	 
	}

}
