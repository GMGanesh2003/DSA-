✅ APPROACH 1 — Brute Force (Length / Index Method)

Your idea: count size, then go to size/2.
Correct.

✔ Steps:

Traverse list → get length n.

Traverse again until index = n/2.

Return that node.

✔ Time: O(n + n) = O(n)
✔ Space: O(1)
✔ Code:
public ListNode middleNode(ListNode head) {
    int length = 0;
    ListNode curr = head;

    // count size
    while (curr != null) {
        length++;
        curr = curr.next;
    }

    int mid = length / 2;

    // go to mid index
    curr = head;
    for (int i = 0; i < mid; i++) {
        curr = curr.next;
    }

    return curr;
}


This is simple and guaranteed to work.

✅ APPROACH 2 — Optimal (Slow & Fast Pointer)

This is the one interviewers expect.

✔ Steps:

slow → moves 1 step

fast → moves 2 steps

When fast reaches end → slow is at middle

✔ Time: O(n)
✔ Space: O(1)
✔ Code:
public ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow; // middle
}


This is the optimal and easiest to remember.
