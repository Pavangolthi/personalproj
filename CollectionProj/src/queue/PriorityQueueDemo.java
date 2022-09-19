package queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		System.out.println(q.peek());//null
		//System.out.println(q.element());//RE:NoSuchElementException
		for(int i = 0;i<=10; i++) {
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}

}
