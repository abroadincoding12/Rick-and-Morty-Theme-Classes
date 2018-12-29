import java.util.Scanner;

public class Supernova { //Member of The Vindicators

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MillionAnts MillionAntsObject = new MillionAnts();
		System.out.println("Tell me thou name ");
		String temp = input.nextLine();
		MillionAntsObject.setName(temp);
		MillionAntsObject.saying();
			
	}
}
