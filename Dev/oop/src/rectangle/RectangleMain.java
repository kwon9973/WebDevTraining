package rectangle;

import org.w3c.dom.css.Rect;

public class RectangleMain {
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		
		calculateArea(rec);
		calculatePerimeter(rec);
		System.out.println(isSquare(rec));
	}
	
	public static void calculateArea(Rectangle rec) {
		rec.area = rec.height * rec.width;
		System.out.println(rec.area);
	}
	public static void calculatePerimeter(Rectangle rec) {
		rec.perimeter = (rec.height*2) + (rec.width*2);
		System.out.println(rec.perimeter);
	}
	public static boolean isSquare(Rectangle rec) {
		if(rec.width == rec.height) {
			rec.isSquare = true;
			return true;
		}else {
			rec.isSquare = false;
			return false;
		}
	}
	
	
}
