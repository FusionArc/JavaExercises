package exercises;

	public class User {
		private int userId;
		private int age;
		private String fullName;
		private String liProfile;
		
		public User() { }

		public User(int userId, int age, String fullName, String liProfile) {
			this.userId = userId;
			this.age = age;
			this.fullName = fullName;
			this.liProfile = liProfile;
			
		}
		public int getUserId() {
			return userId;
		}

		public void setUserId(int newUserId) {
			this.userId = newUserId;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getLiProfile() {
			return liProfile;
		}

		public void setLiProfile(String liProfile) {
			this.liProfile = liProfile;
		}
		
	}

/*
 * Create a class with 4 attributes, 3 constructors (including a default
 * constructor), as well as getters and setters for each attribute and a
 * toString method DONT GENERATE THE GETTERS AND SETTERS (this is for your own
 * practice so avoid generating the getters and setter)
 */