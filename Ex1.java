import java.util.Scanner;

//Yuna Frolov
//Aviya Amar

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the height of the ladder:");
		int nLadderHeight = sc.nextInt();
		while(nLadderHeight <= 0){
			System.out.println("The number is invalid, pelase enter a positive number: ");
			nLadderHeight = sc.nextInt();
		}
		System.out.println("The number of possible ways to get off the ladder is: "+numberOfWays(nLadderHeight, 0));

		sc.close();
	}

	// a recursive function that counts the number of ways to get off a ladder
	public static int numberOfWays(int nLadderHeight, int nNumberOfWays){

		//if there is no height left, add a way
		if(nLadderHeight == 0)
			nNumberOfWays++;
		//else if there is still height to climb off, count the number of ways (going 1 space or 2 spaces per time)
		else if(nLadderHeight > 0)
			nNumberOfWays = numberOfWays(nLadderHeight-1, nNumberOfWays)+numberOfWays(nLadderHeight-2, nNumberOfWays);

		return nNumberOfWays;
	}

}
