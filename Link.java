package demo2;

public class Link {
	//定义一个节点数据结构(内部类)
	class Node {
		private String data;
		private Node next;
		public Node(String data) {
			this.data = data;
		}
		
		//打印链表
		public void print() {
			System.out.println("节点值:"+this.data);
			if(this.next != null) {
				this.next.print();
			}
		}
		//添加节点方法
		public void add(Node newNode) {
			if(this.next != null) {
				this.next.add(newNode);
			}else {
				this.next=newNode;
			}
		}
		
		//查找元素方法
		public boolean search(String data) {
			if(this.data.equals(data)) {
				return true;
			}else {
				if(this.next !=null) {
					return this.next.search(data);
				}else {
					return false;
				}
			}
		}
		
		//删除节点
		public void delete(Node previous, String data) {
			if(this.data.equals(data)) {
				previous.next = this.next;
			}else {
				if(this.next != null){
					this.next.delete(this, data);
				}
			}
		}
		
<<<<<<< HEAD

=======
		
		
		
>>>>>>> 46a8d0f6dcc4d3011f7bfe6232a7eea4b6fd0fdf
	}
	private Node root;
	//外部的打印链表
	public void printNode() {
		if(this.root != null) {
			this.root.print();
		}
	}
	//添加节点
	public void addNode(String data) {
		Node newNode =new Node(data);
		if(this.root == null) {
			this.root = newNode;
		}else {
			this.root.add(newNode);
		}
	}
	//查找元素是否存在
	public boolean contains(String data) {
		return this.root.search(data);
	}
	//删除节点
	public void deleteNode(String data) {
		
		if(this.contains(data)){
			if(this.root.data.equals(data)) {
				this.root = this.root.next;
			}else {
				if(this.root.next != null) {
					this.root.next.delete(root, data);
				}
			}
		}
	}
}
