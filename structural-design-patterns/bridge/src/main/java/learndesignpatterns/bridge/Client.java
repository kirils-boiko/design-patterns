package learndesignpatterns.bridge;

public class Client {

	public static void main(String[] args) {
		FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());

		for (int i = 0; i < 10; i++) {
			collection.offer(i);
		}

		Integer temp;
		while ((temp = collection.poll()) != null) {
			System.out.println(temp);
		}
	}

}
