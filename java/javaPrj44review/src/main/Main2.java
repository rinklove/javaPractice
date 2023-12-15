package main;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		//객체를 관리할 컬렉션
		List<User> list = new ArrayList<>();
		
		//유저 객체 생성 후 컬렉션에 담기
		list.add(new User("lee1", "1234"));
		list.add(new User("kim1", "1234"));
		list.add(new User("hong1", "1234"));
		
		System.out.println(list);
		System.out.println();
		System.out.println(list.get(0).getId());
		System.out.println(list.get(0).getPwd());
	}
}
