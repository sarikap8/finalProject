package model_linklist;

import java.util.*;
//this class does not need a main method
public class Stack {
	private LinkedList lifo;

	//constructor that sets the LinkList to null to make an exmpty lifo type linkedlist.
	public Stack() {
		lifo = null;
	}

	//get current lifo object value in the stack and throw the exception if the object doesn't exist.
	public Object getObject() {
		if (lifo == null) {
			throw new NoSuchElementException();
		} else
			return lifo.getObject();
	}

	//add an object to the stack (at the top)
	public void push(Object value) {
		lifo = new LinkedList(value, lifo);
		// because lifo is a parameter, a new lifo is created through the existing one.
	}

	//removes obejct from TOP of stack
	public Object pop() {
		Object value = null;

		if (lifo != null) {
			value = lifo.getObject();
			lifo = lifo.getPrevious();
		}

		return value;
	}

	//loop that converts stack into string that can interact with the user. 
	public String toString() {
		String stackToString = "[";

		LinkedList node = lifo;
		while (node != null) {
			stackToString += node.getObject();
			node = node.getPrevious();
			if (node != null)
				stackToString += ", ";
		}
		stackToString += "]";
		return stackToString;
	}

}
