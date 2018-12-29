public abstract class Jessica { //Jessica is Morty's love interest
	
	public abstract void pick();

	// This method must be implemented by any class that extends Jessica
	public static void main(String[] args) {
		
		Brad Brad = new Brad();
		Brad.pick();
		
		Morty2 Morty2 = new Morty2();
		Morty2.pick();
		
		Jessica[] jessica = new Jessica[2];
		jessica[0] = Brad;
		jessica[1] = Morty2;
		
		for(Jessica obj : jessica) {
			obj.pick();
		}
	}
}
