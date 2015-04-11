package UebGenerics;
import java.awt.*;
public class PointEqual implements Equality<Point> {

	@Override
	public boolean equal(Point obj1, Point obj2) {
		if((obj1.x == obj2.x) && (obj1.y == obj2.y)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Point[] punkt = {new Point(1, 1), new Point(1, 1), new Point(2,2)};
		PointEqual punktE = new PointEqual();
		for(int i=0; i < 2; i++) {
			if(punktE.equal(punkt[i], punkt[i+1])) {
				System.out.println("Gleicher Punkt");
			} else {
				System.out.println("Verschiedene Punkte");
			}
		}
	}

}
