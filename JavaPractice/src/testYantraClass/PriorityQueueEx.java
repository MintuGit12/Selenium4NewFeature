package testYantraClass;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("Ram");
		pq.add("Shayam");
		pq.add("Aman");
		pq.add("Amit");
		pq.add("tarun");
		System.out.println(pq.poll());
		System.out.println(pq);

	}

}
