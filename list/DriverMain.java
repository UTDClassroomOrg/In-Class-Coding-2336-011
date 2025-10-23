package list;

public class DriverMain {

	public static void main(String[] args) {
		MyLinkedList mylist = new MyLinkedList();
		mylist.addLast("h");
		mylist.print();
		mylist.addLast("e");
		mylist.print();
		mylist.addLast("l");
		mylist.print();
		mylist.addLast("l");
		mylist.print();
		mylist.addLast("o");
		mylist.print();	
		mylist.addFirst("a");
		mylist.addFirst("b");
		mylist.addFirst("c");
		mylist.addFirst("d");
		mylist.print();	
		System.out.println(mylist.getElement(4));
		mylist.remove("d");
		mylist.remove("l");
		mylist.print();	
		mylist.remove("e");
		mylist.print();	
		mylist.remove("b");
		mylist.print();	
		mylist.remove("h");
		mylist.print();	
	
		

	}

}
