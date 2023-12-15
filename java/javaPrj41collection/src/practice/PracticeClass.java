package practice;

import java.util.*;

import mob.Pokemon;

public class PracticeClass {

	/**
	 * List
	 */
	public void method1() {
		System.out.println("-------List-------");
		List list = new ArrayList();
		list.add(new Pokemon());
		list.add(10);
		list.add("hello. It's me");
		list.add(2, "새치기좀 할게요~");
		
		//toString() 사용하면 list에 있는 전체 데이터 조회 가능
		System.out.println(list); 
		list.clear();
		System.out.println(list); 		
	}

	/**
	 * Set
	 */
	public void method2() {
		System.out.println("-------Set-------");
		Set set = new HashSet();
		set.add("one");
		set.add("one");
		set.add(true);
		set.add(3);
		set.add(new ArrayList());
		set.add(new ArrayList());
		//순서 보장x, 중복x
		System.out.println(set); //길이 4
	}
	
	/**
	 * Map
	 */
	public void method3() {
		System.out.println("-------Map-------");
		
		Map map = new HashMap();
		map.put("name", "이준호");
		map.put("name", "삼준호");
		map.put("atk", 26);
		map.put("gender", 'M');
		
		System.out.println(map.get("name"));
		System.out.println(map.get(1));
		
		System.out.println(map); //{1=일, one=원, two=투, three=쓰리}
	}
	
	/**
	 * Stack
	 */
	public void method4() {
		System.out.println("-------Stack-------");
		Stack stack = new Stack();
		stack.push("ome");
		stack.push("ga");
		stack.push("ga");
		stack.push("gamel");
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
	}
	
	/**
	 * Queue
	 */
	public void method5() {
		System.out.println("-------Queue-------");
		
		Queue queue = new LinkedList();
		
		System.out.println(queue);
		queue.add("one");
		queue.add("two");
		queue.add("three");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
	}

}
