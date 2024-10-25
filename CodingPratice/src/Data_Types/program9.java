package Data_Types;

import java.util.Scanner;
//convert celsius to farenheit.
public class program9 {
	public static double convertCelsiusToFarenheit(double celsius) {
		return (celsius* 9/5)+32;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double celsius = in.nextInt();
		double res = convertCelsiusToFarenheit(celsius);
		System.out.println(res);
	}

}
