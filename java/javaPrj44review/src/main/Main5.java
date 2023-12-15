package main;

import java.util.LinkedList;
import java.util.Queue;

public class Main5 {

	public static void main(String[] args) {
		Queue q = new LinkedList();
		
		q.add(new User("user1", "1111"));
		q.add(new User("user2", "2222"));
		q.add(new User("user3", "3333"));
		
		System.out.println(q);
	}
}
