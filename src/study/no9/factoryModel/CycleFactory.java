package study.no9.factoryModel;
/**
 * ���������ϵ��õ��Ǵ����������ù����������ɽӿڵ�ĳ��ʵ�ֵĶ���
 * @author Administrator
 *
 */
public interface CycleFactory {
		Cycle getCycle(String message);
		
		//���Խӿ��ڲ��࣬public ��
		class SunnyInnerFactoryImpl implements CycleFactory{

			@Override
			public Cycle getCycle(String message) {
				return new Unicycle(message);
			}
			
		}
}
