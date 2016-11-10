package study.no12.practice;

import study.no12.practice.Practice10.MyExcepitonOne;
import study.no12.practice.Practice10.MyExceptionTwo;

/**
 * 异常，测试fillinStackTrace() .抛出新异常，重新抛出异常的区别
 * Practice10.java
 * @author sunny
 * 2016年11月10日上午7:57:32
 */
public class Practice10 {

	public static class MyExcepitonOne extends Exception{}
	
	public static class MyExceptionTwo extends Exception{}
	
	void g() throws MyExcepitonOne{
		throw new MyExcepitonOne();
	}
	
	void f() throws MyExceptionTwo{
		try{
			g();
		}catch(MyExcepitonOne one){
			one.printStackTrace(System.err);
			throw new MyExceptionTwo(); //抛出一个新的异常和调用fillinstackTrace()效果类似
		}
	}
	void ff() throws Throwable{
		try{
			g();
		}catch(MyExcepitonOne one){
			one.printStackTrace(System.err);
			throw one.fillInStackTrace(); //调用fillinStackTrace()的这一行就成了异常新发生地了。
		}
	}
	
	void fff() throws MyExcepitonOne{
		try{
			g();
		}catch(MyExcepitonOne one){
			one.printStackTrace(System.out);
			throw one; //重新抛出异常，异常信息打印不变，不能发现异常新发生地
		}
	}
	
	public static void main(String[] args) {
		Practice10 p10 = new Practice10();
		try {
			p10.f();
		} catch (MyExceptionTwo e) {
			e.printStackTrace(System.err);
		}
		
			try {
				p10.ff();
			} catch (Throwable e) {
				e.printStackTrace(System.err);
			}
			
			try{
				p10.fff();
			}catch(Exception e){
				e.printStackTrace(System.out);
			}
	}
}
