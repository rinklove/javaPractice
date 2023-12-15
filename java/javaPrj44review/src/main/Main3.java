package main;

import java.util.HashSet;
import java.util.Set;

public class Main3 {

	public static void main(String[] args) {
		
		//여러개의 객체를 관리할 컬렉션
		Set<User> set = new HashSet();
		//메뉴 객체 여러개 만들고 위에서 만근 컬렉션 담기
		set.add(new User("user1", "1111"));
		set.add(new User("user2", "2222"));
		set.add(new User("user2", "3333"));
		//컬렉션에 들어있는 여러개의 객체 전부 다 출력
		System.out.println(set);
		
		for(User u : set) {
			System.out.println(u);
		}
		
	}
}

