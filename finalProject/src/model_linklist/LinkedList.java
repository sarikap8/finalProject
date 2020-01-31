package model_linklist;

public class LinkedList {
	private Object opaqueObject;
	private LinkedList prevNode;
	private LinkedList nextNode;

	public LinkedList(Object opaqueObject, LinkedList node) {
		setObject(opaqueObject);
		setPrevNode(node);
		setNextNode(null);
	}

	public void setObject(Object opaqueObject) {
		this.opaqueObject = opaqueObject;
	}

	public void setPrevNode(LinkedList node) {
		this.prevNode = node;
	}

	public void setNextNode(LinkedList node) {
		this.nextNode = node;
	}

	public Object getObject() {
		return opaqueObject;
	}

	public LinkedList getPrevious() {
		return prevNode;
	}

	public LinkedList getNext() {
		return nextNode;
	}
}
