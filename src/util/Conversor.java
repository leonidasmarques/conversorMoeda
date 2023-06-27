package util;

public class Conversor {
	
	public static double taxa;
	
	public static double converter(double a, double b) {
		taxa = a * b / 100 * 6;
		return a * b + taxa;
	}
	
	
}
