package study.no11.practice;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * ����linkedList ����
 * LinkedListPractice.java
 * @author sunny
 * 2016��11��3������8:16:27
 */
public class LinkedListPractice {

	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=0;i<10;i++){
			ListIterator<Integer> iterator = list.listIterator(list.size()/2);
			list.add(iterator.nextIndex(),i);
		}
		System.out.println(list);
	}
}
