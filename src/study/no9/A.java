package study.no9;

/**
 * 1.���ø��๹���ʱ�򣬵��ó��󷽷������ʵ����ķ���
 * @author sdf
 */
public class A extends Father{
	private int a = 1;
	@Override
	void print() {
		System.out.println("print A.a"+a);
	}
	public static void main(String[] args) {
		A a = new A();
		a.print();
	}
}
