package main;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Main4 {

	public static void main(String[] args) {
		
		//여러개의 객체를 관리할 컬렉션
				Stack<User> stack  = new Stack();
				//메뉴 객체 여러개 만들고 위에서 만근 컬렉션 담기
				stack.push(new User("user1", "1111"));
				stack.push(new User("user2", "2222"));
				stack.push(new User("user3", "3333"));
				//컬렉션에 들어있는 여러개의 객체 전부 다 출력
				System.out.println(stack);
	}
}
