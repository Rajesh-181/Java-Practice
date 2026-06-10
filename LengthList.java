class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class LengthList {
    Node head;

    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    int length() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {
        LengthList list = new LengthList();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Length = " + list.length());
    }
}