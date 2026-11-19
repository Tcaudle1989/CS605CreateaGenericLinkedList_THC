

public class Main {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		GenericLinkedList Integer1 = new GenericLinkedList();
		GenericNode <Integer> Int = new GenericNode <Integer>();
		Int.setData(0);
		GenericLinkedList Double1 = new GenericLinkedList();
		GenericNode <Double> Doub = new GenericNode <Double>();
		Doub.setData(0.0);
		GenericLinkedList String1 = new GenericLinkedList();
		GenericNode <String> Str = new GenericNode <String>();
		Str.setData("String");
		Integer1.addNode(Int);
		Double1.addNode(Doub);
		String1.addNode(Str);
		GenericLinkedList intList = new GenericLinkedList();
		for (int i = 0; i <= 4; i++) {
			GenericNode <Integer> loopNode = new GenericNode <Integer>();
			loopNode.setData(i);
			intList.addNode(loopNode);
		}
		System.out.println("Generic List Contents:");
		GenericNode <Integer> nodeLoop = intList.getList();
		while (nodeLoop  != null) {
			System.out.println(nodeLoop.getData());
			nodeLoop = nodeLoop.getNextNode();
		}

	}//end main

}//end class
