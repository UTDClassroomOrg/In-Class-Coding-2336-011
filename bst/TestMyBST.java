package bst;

public class TestMyBST {

	public static void main(String[] args) {
		MyBST<Integer> bst = new MyBST<Integer>();
		bst.insert(50);
		bst.insert(27);
		bst.insert(67);
		bst.insert(90);
		bst.insert(61);
		bst.insert(76);
		bst.insert(95);
		bst.insert(20);
		bst.insert(41);
		System.out.println(bst.search(45));
		System.out.println(bst.search(67));
		bst.print();
	}

}
