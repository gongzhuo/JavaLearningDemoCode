package linkList;

public class ConcretLinkedList implements OurLinkList {

	private Node head = null;

	public int add(Node node) {
		int length = 0;
		if (head == null) {
			head = node; // 增加一个节点
			return length + 1; // 返回数组长度
		}

		Node current; // 节点当前值
		if (head == null) {
			return length; // 如果链表首为空，返回数组长度
		}
		length++;
		current = head; // 将链表首赋给当前值
		while (current.next != null) {
			length++;
			current = current.next;
		}
		current.next = node; // 增加节点
		return length++; // 遍历链表，返回链表新长度
	}

	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	public int count() {
		int length = 0;
		Node current;
		if (head == null) {
			return length; // 如果链表首为空，返回数组长度
		}
		length++;
		current = head;
		while (current.next != null) {
			length++;
			current = current.next;
		}
		return length; // 遍历链表，返回链表长度
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
