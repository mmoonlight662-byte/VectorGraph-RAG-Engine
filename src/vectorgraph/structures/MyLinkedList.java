package vectorgraph.structures;
public class MyLinkedList {
    public ListNode head;

    public MyLinkedList() {
        head = null;
    }

    public void insertEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public boolean search(int value) {
        ListNode temp = head;
        while (temp != null) {
                        if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public String toString() {
        String result = "";
        ListNode temp = head;
        while (temp != null) {
            result = result + temp.data + " -> ";
            temp = temp.next;
        }
        return result + "NULL";
    }
}
