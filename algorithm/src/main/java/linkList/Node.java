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
	
	public Node(int value){
		this.value = value;
	}
	
	@Override
	public String toString(){
		return "[" + value + "]" + "->";
	}
}
