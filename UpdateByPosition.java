class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class UpdateByPosition {
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

    void updateAtPosition(int position, int newValue) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (index == position) {
                temp.data = newValue;
                return;
            }
            index++;
            temp = temp.next;
        }

        System.out.println("Position not found");
    }

    public static void main(String[] args) {
        UpdateByPosition list = new UpdateByPosition();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.updateAtPosition(2, 100);

        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}