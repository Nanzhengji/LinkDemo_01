package demo2;

public class Link {
	class Node {
		private String data;
		private Node next;
		public Node(String data) {
			this.data = data;
		}

		//添加节点,如果此节点的下一个节点为空就添加,否则就移到下一节点处添加
		public void add(Node newNode) {
			if(this.next == null) {
				this.next = newNode;
			}else {
				this.next.add(newNode);
			}
		}

		//输出节点值
		public void printData() {
			System.out.println("节点值为:"+this.data + "\t");
			if(this.next != null) {
				this.next.printData();
			}
		}

		//查询节点值是否存在
		public boolean search(String data) {
			if(data.equals(this.data)) {
				return true;
			}else {
				if(this.next != null) {
					return this.next.search(data);
				}else {
					return false;
				}
			}
		}

		//删除节点
		public void delete(Node previous,String data) {
			if(this.data.equals(data)) {
				previous.next = this.next;
			}else {
				if(this.next != null) {
					this.next.delete(this, data);
				}
			}
		}
		
	}

	private Node root;
	//为节点添加数据,如果根为空,则把它作为根节点,否则把它加在根节点之后
	public void addNode(String data) {
		Node newNode = new Node(data);
		if(root == null) {
			root =newNode;
		}else {
			root.add(newNode);
		}
	}

	//打印节点数据值
	public void printNode() {
		if(this.root != null) {
			this.root.printData();
		}
	}

	//判断链表中是否包含某数据
	public boolean contains(String data) {
		return this.root.search(data);
	}

	//删除节点
	public void delete(String data) {
		if(this.contains(data)) {
			if(this.root.data.equals(data)) {
				this.root=this.root.next;
			}else {
				this.root.next.delete(root, data);
			}
		}
	}
}
