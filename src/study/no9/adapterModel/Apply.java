package study.no9.adapterModel;

public class Apply {
	public static void process(Processor p,Object s){
		System.out.println(p.name());
		System.out.println(p.process(s));
	}
}
