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
		// TODO Auto-generated method stub
		return false;
	}

	public int count() {
		return this.length; // 返回链表长度
	}

	public boolean exist(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	public int add(OurLinkList list) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int add(Node node, int i) {
		// TODO Auto-generated method stub
		return 0;
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
