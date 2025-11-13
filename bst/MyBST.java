package bst;

// Check
import java.util.*;

public class MyBST<E extends Comparable<E>> {

	private MyTreeNode<E> root;

	public boolean isEmpty() {
		return root == null;
	}

	public boolean search(E key) {
		MyTreeNode<E> current = root;
		while (current != null) {
			if (key.compareTo(current.element) < 0) {
				current = current.left;
			} else if (key.compareTo(current.element) > 0) {
				current = current.right;
			} else
				return true; // found
		}
		return false; // key is not in the BST
	}

	public boolean insert(E element) {

		MyTreeNode<E> newTreeNode = new MyTreeNode<E>(element);

		if (!isEmpty()) {
			MyTreeNode<E> current = root;
			MyTreeNode<E> parent = root;

			while (current != null) {
				if (element.compareTo(current.element) < 0) {
					parent = current;
					current = current.left;
				} else if (element.compareTo(current.element) > 0) {
					parent = current;
					current = current.right;
				} else {
					return false; // duplication
				}
			}
			if (element.compareTo(parent.element) < 0) {
				parent.left = newTreeNode;
			} else {
				parent.right = newTreeNode;
			}

		} else { // the first element in this tree
			root = newTreeNode;
		}
		return true;
	}

	public void print() {
		dfs();
		// bfs();
	}

	public void bfs() {
		if (!isEmpty()) {
			Queue<MyTreeNode<E>> queue = new LinkedList<MyTreeNode<E>>();
			queue.add(root);
			while (!queue.isEmpty()) {
				MyTreeNode<E> tempNode = queue.poll();
				System.out.print(tempNode.element + " ");
				if (tempNode.left != null) {
					queue.add(tempNode.left);
				}
				if (tempNode.right != null) {
					queue.add(tempNode.right);
				}
			}
		}
	}

	private void dfs() {
		dfs(root);
	}

	// in-order LMR
	// pre-order MLR
	// post-order LRM

	private void dfs(MyTreeNode<E> current) {
		if (current != null) {
			dfs(current.left);
			dfs(current.right);
			System.out.print(current.element + " ");
		}
	}
}

class MyTreeNode<E> {
	E element;
	MyTreeNode<E> left;
	MyTreeNode<E> right;

	MyTreeNode(E element) {
		this.element = element;
	}

}
