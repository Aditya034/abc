package Default;

public class DynamicStack {

	int size;
	int top;
	LinkedList l1 = new LinkedList();

	@SuppressWarnings("unchecked")
	public DynamicStack() {
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == l1.getcount();
	}

	public boolean push(int data) {
		if (isFull()) {
			return false;
		}
		l1.insert(data);
		++top;
		return true;
	}

	public int pop() {
		if (isEmpty()) {
			return -999 ;
		}
		return l1.popdisplay(top--);
	}

	public int peek() {
		if (isEmpty()) {
			return -999 ;
		}

		return l1.popdisplay(top);

		/*
		 * T val = pop(); push(val); return val;
		 */
	}
}
