package study.no13.practice;

import java.util.Scanner;

/**
 * 使用scanner 类扫描一个字符串
 * Practice20.java
 * @author sunny
 * 2016年11月24日上午7:40:03
 */
public class Practice20 {
	int a;
	long b;
	float c;
	double d;
	String f;
	
	public Practice20(String str) {
		Scanner scan = new Scanner(str);//使用Scanner 扫描输入的字符串，Scanner 还可以接收很多Readable，可以尝试。
		a=scan.nextInt();
		b=scan.nextLong();
		c=scan.nextFloat();
		d=scan.nextDouble();
		f=scan.next();
	}
	@Override
	public String toString() {
		return "Practice20 [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", f=" + f + "]";
	}
	public static void main(String[] args) {
		Practice20 p20 = new Practice20("1 2 3.0 4.0 sunny");
		System.out.println(p20);
		
		Scanner s = new Scanner("12 , 42, 78, 99, 42");
		s.useDelimiter("\\s*,\\s*");
		while(s.hasNext()){
			System.out.println(s.next());
		}
		
	}
}
