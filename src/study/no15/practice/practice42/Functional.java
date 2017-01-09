package study.no15.practice.practice42;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 将函数对象用作策略
 * Functional.java
 * @author sunny
 * 2017年1月9日上午8:27:05
 */
public class Functional {
	
	public static<T> T reduce(Iterable<T> seq,Combiner<T> combiner){
		Iterator<T> it = seq.iterator();
		if(it.hasNext()){
			T result = it.next();
			while(it.hasNext()){
				result = combiner.combine(result, it.next());
			}
			return result;
		}
		return null;
	}
	public static<T> Collector<T> forEach(Iterable<T> seq,Collector<T> func){
		for(T t:seq){
			func.function(t);
		}
		return func;
	}
	
	public static<R,T> List<R> transform(Iterable<T> seq,UnaryFunction<R,T> func){
		List<R> result = new ArrayList<R>();
		for(T t:seq){
			result.add(func.function(t));
		}
		return result;
	}
	
	public static<T> List<T> filter(Iterable<T> seq,UnaryPredicate<T> pred){
		List<T> result = new ArrayList<T>();
		for(T t:seq){
			if(pred.test(t)){
				result.add(t);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {

	}

}
//不同类型的函数对象
interface Combiner<T> {T combine(T x,T y);}
interface UnaryFunction<R,T>{ R function(T x);}
interface Collector<T> extends UnaryFunction<T,T>{
	T result();
}
interface UnaryPredicate<T>{ boolean test(T x);}