package study.no11.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Practice12 {
	public static void main(String[] args) {
		List<Integer> la = new ArrayList<Integer>();
		List<Integer> lb = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++){
			la.add(i);
		}
		
		//ʹ��listIterator(int index) �������list
		//ListIterator ����ʹ��previous() or next() ��ǰ���һ�������
		ListIterator<Integer> iterator = la.listIterator(la.size());
		
		while(iterator.hasPrevious()){
			lb.add(iterator.previous());
		}
		
		System.out.println(lb);
		
	}
}
