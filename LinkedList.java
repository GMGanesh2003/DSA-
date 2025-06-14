
1	Reverse a Linked List	Easy	Classic question to test basics
2	Detect Cycle in a Linked List	Medium	Tests fast and slow pointers
3	Merge Two Sorted Linked Lists	Easy	Used in merge sort, very common
4	Find the Middle of a Linked List	Easy	Pointer logic, basis of many problems
5	Remove N-th Node from End	Medium	Tests edge cases, pointer mastery

📚 Let's Learn Linked List From Scratch
🔹 Step 1: What is a Linked List?
A Linked List is a linear data structure where elements (nodes) are connected using pointers. Each node contains:


class Node {
    int val;
    Node next;
}
val = value/data of the node

next = pointer to next node

Unlike arrays, elements are not stored in contiguous memory.

✅ Let's Go Through Each Top Question with Code & Explanation
1️⃣ Reverse a Linked List
Problem: Reverse the linked list so that head becomes tail.

🔸 Logic:
Use 3 pointers: prev, curr, next

Loop through the list and reverse the links.

✅ Java Code:
java
Copy
Edit
public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
        ListNode next = curr.next; // store next
        curr.next = prev;          // reverse current node
        prev = curr;               // move prev forward
        curr = next;               // move curr forward
    }

    return prev; // new head
}
2️⃣ Detect Cycle in Linked List
Problem: Check if there is a loop in the list.

🔸 Logic:
Use Floyd’s Cycle Detection Algorithm (slow & fast pointers).

If slow == fast → cycle exists.

✅ Java Code:
java
Copy
Edit
public boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) return true;
    }

    return false;
}
3️⃣ Merge Two Sorted Lists
Problem: Given two sorted linked lists, merge them.

🔸 Logic:
Use dummy node, compare and attach smaller node.

✅ Java Code:
java
Copy
Edit
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;

    while (list1 != null && list2 != null) {
        if (list1.val < list2.val) {
            current.next = list1;
            list1 = list1.next;
        } else {
            current.next = list2;
            list2 = list2.next;
        }
        current = current.next;
    }

    // Attach remaining
    current.next = (list1 != null) ? list1 : list2;

    return dummy.next;
}
4️⃣ Find the Middle Node
Problem: Return the middle node of the list.

🔸 Logic:
Use slow and fast pointers.

When fast reaches end, slow is in middle.

✅ Java Code:
java
Copy
Edit
public ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
}
5️⃣ Remove Nth Node from End
Problem: Remove the N-th node from the end of list.

🔸 Logic:
Use two pointers with n gap.

Move both until fast reaches end.

✅ Java Code:
java
Copy
Edit
public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode fast = dummy, slow = dummy;

    // move fast n+1 steps ahead
    for (int i = 0; i <= n; i++) {
        fast = fast.next;
    }

    // move both till fast reaches end
    while (fast != null) {
        fast = fast.next;
        slow = slow.next;
    }

    // delete the node
    slow.next = slow.next.next;

    return dummy.next;
}
🧠 Summary
Concept	Technique Used
Reverse	Iterative Pointers
Cycle Detection	Floyd’s Algorithm
Merge	Dummy Node Technique
Middle Node	Fast & Slow Pointer
Remove Nth Node	Two-pointer with gap
