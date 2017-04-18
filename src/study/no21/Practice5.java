/**
 * 
 */
package study.no21;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import study.no15.practice.Fibonacci;

/**
 * 使用callable接口，练习fibonacci
 * Practice5.java
 * @author sunny
 * 2017年4月18日上午8:32:28
 */
public class Practice5 implements Callable<Integer> {
	private int n=0;
	private Fibonacci fibo = new Fibonacci();
	public Practice5(int n){this.n=n;}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		List<Future<Integer>> list = new ArrayList<>();
		for(int i=1;i<5;i++){
			list.add(exec.submit(new Practice5(i*4)));
		}
		for(Future<Integer> fu:list){
			try {
				if(fu.isDone()){
					System.out.println(fu.get());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		exec.shutdown();
	}

	@Override
	public Integer call() throws Exception {
		int sum =0 ;
		for(int i=0;i<n;i++){
			sum+=fibo.next();
		}
		return sum;
	}

}
