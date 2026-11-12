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
        public void insertSorted(int value) {
        ListNode newNode = new ListNode(value);

        if (head == null || value < head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null && temp.next.data < value) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int count() {
        int total = 0;
        ListNode temp = head;
        while (temp != null) {
            total++;
            temp = temp.next;
        }
        return total;
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
