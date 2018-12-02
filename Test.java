package demo2;

public class Test {

	public static void main(String[] args) {
		Link link = new Link();
		link.addNode("A");
		link.addNode("B");
		link.addNode("C");
		link.addNode("D");
		link.addNode("E");
		link.printNode();
		System.out.println("查询是否包含d:"+link.contains("d"));
		System.out.println("查询是否包含D:"+link.contains("D"));
		link.delete("B");
		link.printNode();
	}

}
