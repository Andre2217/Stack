
public class Stack {
	Node top;

	public Stack() {
		top = null;
	}

	public void push(int num) {
		Node fresh = new Node(num);
		fresh.next = top;
		top = fresh;
	}

	public void pop() {
		if (top != null) {
			Node item = top;
			top = top.next;
			item.next = null;
		} else {
			System.out.println("Empty stack");
		}
	}

	public int peek() {
		return top.num;
	}

	public void show() {
		Node current = top;
		while (current != null) {
			System.out.print(current.num + " ");
			current = current.next;
		}
		System.out.println();
	}
}
