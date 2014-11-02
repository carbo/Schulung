package Ueb7;
public class MaximumVonZahlen {
	public int max(int i, int j) {
		return java.lang.Math.max(i, j);
	}
	
	public double max(double d, double e) {
		return java.lang.Math.max(d, e);
	}
	
	public static void main(String arg[]) {
		MaximumVonZahlen maximum = new MaximumVonZahlen();
		System.out.println(maximum.max(5, 4));
		System.out.println(maximum.max(5.8, 4.9));
	}
}