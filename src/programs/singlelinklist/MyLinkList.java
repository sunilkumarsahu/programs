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
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(node);
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

		for (int i = 0; i < index && current.getNext() != null; i++) {
			current = current.getNext();
		}

		node.setNext(current.getNext());
		current.setNext(node);
	}
	
	public T get(int index) {
		if (index < 0 || head == null) {
			return null;
		}
		Node<T> current = head;
		for (int i = 0; i < index; i++) {
			if (current.getNext() == null) {
				return null;
			}
			current = current.getNext();
		}
		return current.getData();
	}

	public boolean remove(T data) {
		if (head == null) {
			return false;
		}
		
		Node<T> current = head;
		Node<T> prev = head;

		if (data.equals(head.getData())) {
			head = head.getNext();
			return true;
		}
		
		while (current.getNext() != null) {
			prev = current;
			current = current.getNext();
			if (data.equals(current.getData())) {
				
			}
		}
		return false;
		
	}

	public boolean remove(int position) {
		return false;
	}



	public T getMiddle() {
		return null;
	}

}
