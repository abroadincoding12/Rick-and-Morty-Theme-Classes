public class JerrySmith { //Jerry is the father of Morty and Summer.

		private String kidsName;
		
		public JerrySmith(String name) {
			kidsName = name;
		}
	
			public void setName(String name) {
				kidsName = name;
			}
	
			public String getName() {
				return kidsName;
			}
	
			public void saying() {
				System.out.println("Your kids names are " + getName());
	}
}
