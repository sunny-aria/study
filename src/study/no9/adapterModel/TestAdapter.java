package study.no9.adapterModel;

public class TestAdapter {

	public static void main(String[] args) {
		String s = "������ģʽ";
		StringFilter filter= new StringFilter();
		AdapterFormat format = new AdapterFormat(filter);
		
		Apply.process(format, s);
		
		
	}

}
