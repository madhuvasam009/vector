/**
 * 
 */
package java8.features.stream;

/**
 * @author welcome
 *
 */
public class Products {
	String productName;
	String brand;
	String productType;
	float price;
	
	public static void main(String[] args) {
	
	}
		public Products() {
			
		}
	
        public Products(String productName,String brand,String productType,float price) {
        	this.productName=productName;
        	this.brand=brand;
		     this.productType=productType;
		     this.price=price;
			
			
		}
		/**
		 * @return the productName
		 */
		public String getProductName() {
			return productName;
		}
		/**
		 * @param productName the productName to set
		 */
		public void setProductName(String productName) {
			this.productName = productName;
		}
		/**
		 * @return the brand
		 */
		public String getBrand() {
			return brand;
		}
		/**
		 * @param brand the brand to set
		 */
		public void setBrand(String brand) {
			this.brand = brand;
		}
		/**
		 * @return the productType
		 */
		public String getProductType() {
			return productType;
		}
		/**
		 * @param productType the productType to set
		 */
		public void setProductType(String productType) {
			this.productType = productType;
		}
		/**
		 * @return the price
		 */
		public float getPrice() {
			return price;
		}
		/**
		 * @param price the price to set
		 */
		public void setPrice(float price) {
			this.price = price;
		}
	}

