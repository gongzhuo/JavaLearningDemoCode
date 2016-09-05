package linkList;

public interface OurLinkList {
	/**
	 * 增加一个节点
	 * @param node 增加的节点对象
	 * @return 节点的序号
	 */
	public int add(Node node);
	/**
	 * 删除最后一个节点
	 * @return 如果成功返回true，失败返回false
	 */
	public boolean remove();
	/**
	 * 若存在，则删除第i个节点
	 * @param i 待删除的节点序列号
	 * @return 删除成功返回true，失败返回false
	 */
	public boolean remove(int i);
	/**
	 * 统计链表长度
	 * @return 链表长度，链表为空返回0
	 */
	public int count();
	/**
	 * 检查传入节点是否存在，定义存在：若节点的value相同则认为是同一个节点
	 * @param node 传入待检测的节点
	 * @return true 如果节点已经存在， false如果不存在
	 */
	public boolean exist(Node node);
	
}
