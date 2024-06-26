package Default;

public class DynamicQueue {
	LinkedList l1 = new LinkedList();
	private int front, rear;

	public DynamicQueue() {

		front = rear = -1;
	}

	public boolean isEmpty() {
		return (front == -1 && rear == -1) || (front > rear);
	}

	public boolean isFull() {
		return rear == (l1.getcount() - 1);
	}

	public boolean insert(int data) {
		if (isFull()) {
			return false;
		}
		l1.insert(data);
		++rear;
		if (front == -1) {
			front = 0;
		}
		return true;
	}

	public int delete() {
		if (isEmpty()) {
			return -999;
		}
		return l1.popdisplay(front++);
	}
}
