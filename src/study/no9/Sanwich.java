package study.no9;
/**
 *  1.�������ø��๹��
 *  2. ���ó�ʼ������
 *  3. ���õ����๹�췽��
 * @author sdf
 *
 */
public class Sanwich extends PortableLunch {
	public Sanwich() {
		System.out.println("Sanwich()");
	}
	Bread bread = new Bread();
	Cheese cheese = new Cheese();
	Lettuce let = new Lettuce();
	public static void main(String[] args) {
		new Sanwich();
		
	}

}
class Meal{
	Meal(){
		System.out.println("Meal()");
	}
}
class Bread{
	Bread(){
		System.out.println("Bread()");
	}
}
class Cheese{
	Cheese(){
		System.out.println("Cheese()");
	}
}
class Lettuce{
	Lettuce(){
		System.out.println("Lettuce()");
	}
}
class Lunch extends Meal{
	Lunch(){
		System.out.println("Lunch()");
	}
}
class  PortableLunch extends Lunch{
	PortableLunch(){
		System.out.println("PortableLunch()");
	}
}
