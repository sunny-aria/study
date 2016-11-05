package study.no11.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("a","a");
		map.put("b","b");
		map.put("c","c");
		Iterator<String> ite = map.keySet().iterator();
		while(ite.hasNext()){
			String key =ite.next();
			System.out.println("key:"+key+" value:"+map.get(key));
		}
	}

	
}