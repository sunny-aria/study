package study.no9.celuomodel;
/**
 * ���Բ���ģʽ
 * @author Administrator
 *
 */
public class TesModeltCeluo {
	
	public static void run(Run run){
		run.run();
	}
	
	public static void main(String[] args) {
		Run[] run = {new People(),new Qiuyin()};
		for(Run r:run){
			run(r);
		}
	}

}
