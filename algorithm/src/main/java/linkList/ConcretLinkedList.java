package linkList;

public class ConcretLinkedList implements OurLinkList{
	
	private Node head = null;

	public int add(Node node) {
		int length = 0;
		if(head == null){
			head = node;
			return length + 1;
		}
		
		Node current;
		if(head == null){
			return length;
		}
		length++;
		current = head;
		while(current.next != null){
			length++;
			current = current.next;
		}
		current.next = node;
		return length++;
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
		if(head == null){
			return length;
		}
		length++;
		current = head;
		while(current.next != null){
			length++;
			current = current.next;
		}
		return length;
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
	public String toString(){
		Node current = head;
		String result = "";
		while(current != null){
			result += current.toString();
			current = current.next;
		}
		return result;
		
	}

}
