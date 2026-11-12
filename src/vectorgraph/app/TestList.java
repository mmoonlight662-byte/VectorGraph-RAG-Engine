package vectorgraph.app;
import vectorgraph.structures.MyLinkedList;

public class TestList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
list.insertSorted(5);
list.insertSorted(1);
list.insertSorted(9);
list.insertSorted(7);
list.insertSorted(3);
System.out.println(list);
System.out.println("Count: " + list.count());
    }
}
