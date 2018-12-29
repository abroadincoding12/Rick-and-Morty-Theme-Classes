import java.util.Scanner;

public class NoobNoob { //Member of The Vindicators

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 1;
		
		do {
			try {
				System.out.println("Enter a number: ");
				int n1 = input.nextInt();
				System.out.println("Enter another number: ");
				int n2 = input.nextInt();
				int sum = n1/n2; //we're dividing numbers, can't you tell?
				System.out.println(sum);
			}
			catch(Exception n) {
				System.out.println("Try again dingus");
				x = 2;
		}
	}while (x == 1);
  }
}
