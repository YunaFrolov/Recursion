import java.util.Scanner;

//Yuna Frolov
//Aviya Amar

public class Ex2 {

	//main function, receives two number, then sends to recursive function to calculate their multiplication
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		double dFirstNumber = sc.nextDouble();
		double dSecondNumebr = sc.nextDouble();
		
		System.out.println("The multiplication is: "+multiplyTwoNumbers(dFirstNumber, dSecondNumebr, 0));
		sc.close();
	}

	//a recursive function that calculates the multiplication between two given numbers
	public static double multiplyTwoNumbers(double dFirstNumber, double dSecondNumebr, double dMultiplicationResult){

		//if both numbers are not zero (or reached the end of the chain when second number is 0)
		if(dFirstNumber != 0 && dSecondNumebr != 0){
			//add first number second-number times
			dMultiplicationResult = multiplyTwoNumbers(dFirstNumber, dSecondNumebr-1, dMultiplicationResult+dFirstNumber);
		}
		return dMultiplicationResult;
	}
}
