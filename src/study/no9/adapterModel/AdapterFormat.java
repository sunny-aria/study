package study.no9.adapterModel;
/**
 * ������ģʽ���������ת���ࣨ�ӿڣ����ԣ��̳���Ҫʵ�ֵ������ӿڣ�
 * �������Խӿڽ���ת����ִ�����Եķ���
 * @author sdf
 *
 */
public class AdapterFormat implements Processor {
	private StringFilter filter; //filter �����ǽӿڣ������
	public AdapterFormat(StringFilter filter) {
		this.filter = filter;
	}

	@Override
	public String name() {
		return filter.name();
	}

	@Override
	public String process(Object input) {
		return filter.process(input.toString());
	}

}
