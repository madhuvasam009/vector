/**
 * 
 */
package basic.exceptionHandiling;

/**
 * @author welcome
 *
 */

	public class ExceptionModel {
		private String name;
		private String gender;
		private long phoneNumber;
		private String location;
		private int age;
		private String fatherName;

		/**
		 * @return the phoneNumber
		 */
		public long getPhoneNumber() {
			return phoneNumber;
		}

		/**
		 * @param phoneNumber the phoneNumber to set
		 */
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		/**
		 * @return the location
		 */
		public String getLocation() {
			return location;
		}

		/**
		 * @param location the location to set
		 */
		public void setLocation(String location) {
			this.location = location;
		}

		/**
		 * @return the age
		 */
		public int getAge() {
			return age;
		}

		/**
		 * @param age the age to set
		 */
		public void setAge(int age) {
			this.age = age;
		}

		/**
		 * @return the fatherName
		 */
		public String getFatherName() {
			return fatherName;
		}

		/**
		 * @param fatherName the fatherName to set
		 */
		public void setFatherName(String fatherName) {
			this.fatherName = fatherName;
		}

		

		public ExceptionModel(String name, String gender) {
		this.name = name;
		this.gender = gender;

		}

		/**
		* @return the name
		*/
		public String getName() {
		return name;
		}

		/**
		* @param name the name to set
		*/
		public void setName(String name) {
		this.name = name;
		}

		/**
		* @return the gender
		*/
		public String getGender() {
		return gender;
		}

		/**
		* @param gender the gender to set
		*/
		public void setGender(String gender) {
		this.gender = gender;
		}

		}


