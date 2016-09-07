package linkList;

public class Node {
	/**
	 * 节点的值
	 */
	public int value;
	/**
	 * 下一个节点
	 */
	public Node next;
	
	public static int count = 0;
	private final int id;
	
	public Node(int value){
		this.value = value;
		count++;
		id = count;
	}
	
	@Override
	public String toString(){
		return "[" + value + "]" + "->";
	}
}
