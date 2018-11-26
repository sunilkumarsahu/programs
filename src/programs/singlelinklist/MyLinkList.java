package programs.singlelinklist;

public class MyLinkList<T> {
	private Node<T> head;

	public MyLinkList() {
		head = null;
	}

	public void add(T data) {
		Node<T> node = new Node<>(data);
		if (head == null) {
			head = node;
		}

		Node<T> current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = node;
	}

	public void add(T data, int index) {
		if (index < 0) {
			throw new IndexOutOfBoundsException();
		}
		Node<T> node = new Node<>(data);
		if (index == 0 && head == null) {
			head = node;
			return;
		}

		Node<T> current = head;

		for (int i = 0; i < index && current.next != null; i++) {
			current = current.next;
		}

		node.next = current.next;
		current.next = node;
	}

	public T get(int index) {
		if (index < 0 || head == null) {
			return null;
		}
		Node<T> current = head;
		for (int i = 0; i < index; i++) {
			if (current.next == null) {
				return null;
			}
			current = current.next;
		}
		return current.data;
	}

	public boolean remove(T data) {
		if (head == null) {
			return false;
		}
		Node<T> current = head;
		Node<T> prev = null;

		if (current != null && data.equals(current.data)) {
			// increment head
			head = head.next;
			return true;
		}

		while (current != null && !data.equals(current.data)) {
			prev = current;
			current = current.next;
		}

		if (current == null) {
			// Data not fount in the list.
			return false;
		}

		prev.next = current.next;
		return true;

	}

	public boolean remove(int position) {
		if (head == null || position < 0) {
			return false;
		}
		if (position == 0) {
			head = head.next;
			return true;
		}

		Node<T> current = head;

		for (int i = 0; current != null && i < position - 1; i++) {
			// Move till the previous node.
			current = current.next;
		}

		if (current == null || current.next == null) {
			// Index out of bounds.
			return false;
		}
		current.next = current.next.next;
		return true;
	}

	public T getMiddle() {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head.data;
		}

		Node<T> one = head;
		Node<T> two = head;

		while (one != null && one.next != null) {
			one = one.next.next;
			two = one.next;
		}

		return two.data;
	}

}
