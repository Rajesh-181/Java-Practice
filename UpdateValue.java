class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class UpdateValue {
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

    void updateValue(int oldValue, int newValue) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
                return;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        UpdateValue list = new UpdateValue();

        list.add(10);
        list.add(20);
        list.add(30);

        list.updateValue(20, 99);

        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}