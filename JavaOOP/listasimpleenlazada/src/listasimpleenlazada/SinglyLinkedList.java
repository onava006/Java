package listasimpleenlazada;

public class SinglyLinkedList {
	public Node head;
	public SinglyLinkedList() {
		// su codigo aqui
	}
	
	public void add(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		} else {
			Node runner = head;
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
		}
	}
	public void remove() {

		if(head == null) {
			return;
		} else {
			Node currentNode = head;
			while(currentNode.next.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = null;
		}
	}
	public String printValues() {
		String output = "";

		if (head != null) {
			Node currentNode = head;
			while (currentNode != null) {
				output += "[" + String.valueOf(currentNode.value) + "]";
				currentNode = currentNode.next;
			}
		}
		return output;
	}
}
