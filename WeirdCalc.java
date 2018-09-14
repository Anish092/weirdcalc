import java.util.Scanner;

public class WeirdCalc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float num, num2, num3;
		float ave;
		num = 1;
		num2 = 1;



		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		try{
		    num = keyboard.nextFloat();
		}
		catch(NumberFormatException ex){

	    }

		System.out.print("Please enter second number: ");
		try{
		    num2 = keyboard.nextFloat();
		}
		catch(NumberFormatException ex){

		}


		System.out.printf("%50s", "Sum:");
		System.out.printf("%24.0f", num + num2);
		System.out.println();

		System.out.printf("%50s", "Difference:");
		System.out.printf("%24.0f", num - num2);
		System.out.println();

		System.out.printf("%50s", "Product:");
		System.out.printf("%24.0f", num * num2);
		System.out.println();

		System.out.printf("%50s", "Average:");
		System.out.printf("%27.2f", ((num + num2)/2));
		System.out.println();

		System.out.printf("%50s", "Difference:");
		System.out.printf("%24.0f", Math.abs(num - num2));
		System.out.println();

		System.out.printf("%50s", "Maximum:");
		System.out.printf("%24.0f", Math.max(num, num2));
		System.out.println();

		System.out.printf("%50s", "Minimum:");
		System.out.printf("%24.0f", Math.min(num, num2));
		System.out.println();




	}

}

