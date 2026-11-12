package vectorgraph.app;
import vectorgraph.structures.MyLinkedList;

public class TestList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.insertEnd(1);
        list.insertEnd(3);
        list.insertEnd(5);
        System.out.println(list);
        System.out.println("3 found: " + list.search(3));
        System.out.println("4 found: " + list.search(4));
    }
}
