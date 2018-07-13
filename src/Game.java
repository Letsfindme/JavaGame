import java.util.Random;
import java.util.Scanner;


public class Game {

	static Random rn = new Random();
	static int carte = rn.nextInt(10) + 1;
		
	
	
	
	public static int choisir(int a ) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("1:Ace , 2:Jack , 3:Queen, 4:Jack , 5:Queen, 6:Jack , 7:Queen, 8:Jack , 9:Queen, 10:Queen");
		System.out.println("choose a card between 1 and 10: ");
		a = sc.nextInt();
		return(a);
		
	}
	
	private static void nextInt() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
		int a =0;
		int answer = 0;
		
		
		while (answer != carte) {
			
			answer = choisir(a);
			
			if (answer == carte) {
				System.out.println("you win!!!!!!!!!!!");
			}
			else {
				
				System.out.println("choose againe");
			}
		
		}
		
		
	}
}
