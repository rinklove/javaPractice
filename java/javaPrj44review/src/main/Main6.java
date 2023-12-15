package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main6 {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		User a = new User("user1", "1111");
		User b = new User("user2", "2222");
		User c = new User("user3", "3333");
		
		map.put(a.getId(), a);
		map.put(b.getId(), b);
		map.put(c.getId(), c);
		
		System.out.println(map);
		
		 Set keySet = map.keySet();
		 
		 for(Object s : keySet) {
			 System.out.println(s);
		 }
	}
}
