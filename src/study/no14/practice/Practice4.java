package study.no14.practice;

import java.util.Arrays;
import java.util.List;

public class Practice4 {

	public static void rotete(Shape shape){
		if(shape instanceof Circle){
			shape.draw();
		}//练习5
	}
	public static void main(String[] args) {
		
		Shape c = new Circle();
		/*Square s= (Square) c;
		s.draw();//练习3
*/		
		if(c instanceof Square){
			Square ss= (Square) c;
			ss.draw();//练习4
		}else{
			c.draw();
		}
		
		rotete(c);//练习5
		
		
		List<Shape> shapes = Arrays.asList(new Circle(),new Square(),new  Riangle() );
		
		for(Shape shape:shapes){
			shape.draw();
			
		}
	}

}
abstract class Shape{
	void draw(){ System.out.println(this+".draw()");}
	abstract public String toString();
}
class Circle extends Shape{

	@Override
	public String toString() {
		
		return "Circle";
	}
	
}
class Square extends Shape{

	@Override
	public String toString() {
		
		return "Square";
	}
}
class Riangle extends Shape{

	@Override
	public String toString() {
		
		return "Riangle";
	}
	
}