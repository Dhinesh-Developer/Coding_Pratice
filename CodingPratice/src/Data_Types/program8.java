package Data_Types;

import java.util.Scanner;
// write a program to find the circumference of circle.
public class program8 {
	public static double circleCircumference(double radius) {
		return 2*3.14*radius;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double radius = in.nextInt();
		double res = circleCircumference(radius);
		System.out.println(res);
	}

}
