class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    static ListNode head;

    public static void main(String[] args) {
        ListNode x = new ListNode(0);
        ListNode y = new ListNode(1);
        ListNode z = new ListNode(2);
        ListNode a = new ListNode(3);

        x.next = y;
        y.next = z;
        z.next = a;

        head = x;

        System.out.println("Original List:");
        display();

        head = reverse();  // 🔥 update head

        System.out.println("Reversed List:");
        display();
    }

    public static void display() {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static ListNode reverse() {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
