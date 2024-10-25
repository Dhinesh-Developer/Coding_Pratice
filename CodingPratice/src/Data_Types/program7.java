package Data_Types;

import java.util.Scanner;
// write a program to find the circle area.
public class program7 {
	public static double circleArea(double radius) {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double radius = in.nextInt();
		double res = circleArea(radius);
		System.out.println(res);
	}

}
