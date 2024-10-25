package Data_Types;

import java.util.Scanner;

// write a program to find the peri meter of the rectangle.
public class program6 {
	public static int perimeter(int length,int width) {
		int res = 2*(length+width);
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int width = in.nextInt();
		int res = perimeter(length,width);
		System.out.println(res);
	}

}
