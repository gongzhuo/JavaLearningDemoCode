package linkList;

public class ConcretLinkedList implements OurLinkList {

	private Node head = null;
	private int length = 0;

	public int add(Node node) {
		if (head == null) {
			head = node; // 增加一个节点
			return ++length; // 返回数组长度
		}

		node.next = head;
		head = node;
		return ++length;
	}

	public boolean remove() {
		if (head == null) {
			return false;
		}
		head = head.next;
		length--;
		return true;
	}

	public boolean remove(int i) {
		if (i <= 0 || i > length) {
			return false;
		}
		Node p = head;
		int j = 1;
		while (j < i - 1) {
			p = p.next;
			++j;
		}
		p.next = p.next.next;
		length--;
		return true;

	}

	public int count() {
		return this.length; // 返回链表长度
	}

	public boolean exist(Node node) {
		Node p = head;
		int j = 0;
		while (j < length) {
			if (p.value == node.value) {
				return true;
			}
			p = p.next;
			++j;
		}

		return false;
	}

	public int add(ConcretLinkedList list) {

		if (head == null) {
			head = list.head;
			return list.length;
		}

		Node p = head;
		int i = 1;
		while (i < length) {
			p = p.next;
			i++;
		}
		p.next = list.head;
		return length += list.length;
	}

	public int add(Node node, int i) {
		if (i <= 0 || i > length) {
			return -1;
		}
		Node p = head;
		int j = 1;
		while (j < i - 1) {
			p = p.next;
			++j;
		}
		Node temp = node;
		temp.next = p.next;
		p.next = temp;
		length++;
		return 1;
	}

	@Override
	public String toString() {
		Node current = head;
		String result = "";
		while (current != null) {
			result += current.toString(); // 将链表返回值转化为字符型
			current = current.next;
		}
		return result;

	}

}
