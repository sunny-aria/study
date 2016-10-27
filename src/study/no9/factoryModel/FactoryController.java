package study.no9.factoryModel;
/* *
 * ģ��ҵ�񳡾����й�����������
 * 16-10-26 8:11
 * */
public class FactoryController {

	//�˷����൱��Service������
	public static  String getMessage(String message){
		CycleFactory factory = null;
		//���ݴ������Ϣ���ͽ��ж�Ӧ��ҵ����
		if("1".equals(message)){
			factory = new BicycleFactoryImpl();
		}else{
			factory  = new UnicycleFactoryImpl();
		}
		Cycle cycle = factory.getCycle(message);//����������ô�����������ĳ���ӿڵľ����ʵ�ֶ�����ʵ�ֶ������ҵ���߼��Ĵ���
		return cycle.run();
	}
	
	public static void main(String[] args) {
		//�˴��൱��Controller ���ҵ�������ղ��������ҵ����
//		String message ="<xml>factory</xml>";
		String message ="1";
		System.out.println(getMessage(message));
		
	}

}
