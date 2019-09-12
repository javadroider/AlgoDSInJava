/**
 * 
 */
package com.javadroider.linkedlists;

import com.javadroider.util.LinkedList;
import com.javadroider.util.Node;

/**
 *
 */
public class MiddleElement {

	private static Node middleElement(Node header) {

		Node fp = header, sp = header;

		while (fp != null) {
			fp = fp.next;
			if (fp == null) {
				return sp;
			}
			fp = fp.next;
			sp = sp.next;
		}

		return sp;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList ll = LinkedList.getFilledLinkedList();
		ll.print();
		System.out.println(middleElement(ll.getHead()));
	}

}
