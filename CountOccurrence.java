class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class CountOccurrence {
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

    int countOccurrence(int value) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == value) {
                count++;
            }
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {
        CountOccurrence list = new CountOccurrence();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(1);
        list.add(2);

        System.out.println(list.countOccurrence(1));
    }
}