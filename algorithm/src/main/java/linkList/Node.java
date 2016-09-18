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

	public Node(int value) {
		this.value = value;
		count++; // count值表示此次程序启动新建的节点数
		id = count; // 将最新的count值赋给ID，ID表示每个节点被创造出来的顺序
	}

	@Override
	public String toString() {
		return "[" + count + " " + id + " " + value + "]" + "->";
	}
}
