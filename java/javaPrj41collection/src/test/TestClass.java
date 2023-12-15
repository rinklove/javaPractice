package test;

import java.util.*;

import mob.Pokemon;

public class TestClass {

	//List -> 리스트는 인터페이스랍니다~
	public void method1() {
		//유사 배열
		System.out.println("리스트");
		List list = new ArrayList<>();
	
		//데이터 넣기
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(new Pokemon());
		
		//데이터 빼기
		Pokemon result =(Pokemon) list.get(3);
		System.out.println(list .get(0));
		System.out.println(list .get(3));
		System.out.println(result);
		
	}
	
	//Set
	public void method2() {
		System.out.println("셋");
		Set set = new HashSet();
		
		//데이터 넣기
		set.add(new Pokemon());
		System.out.println(set);
		System.out.println(set.iterator());
		
	}
	
	//Map
	public void method3() {
		System.out.println("맵맵맵");
		Map map = new HashMap();
		//데이터 넣기
		map.put("first", new Pokemon());
		
		//데이터 반환
		System.out.println(map.get("first"));
		System.out.println(map.values());
		
	}
	
	//Stack
	public void method4() {
		System.out.println("스택쌓자~");
		Stack stack = new Stack();
		//데이터 넣기
		stack.add(new Pokemon());
		
		//데이터 반환
		Object result = stack.pop();
		System.out.println(result);
	}
	
	//Queue
	public void method5() {
		System.out.println("QQQQQ");
		LinkedList queue = new LinkedList();
		queue.add(new Pokemon());
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
