package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prevnode = head;
        ListNode currnode = head;

        if (head == null) return head;

        while (currnode != null) {
            if (prevnode.val == currnode.val) {
                currnode = currnode.next;
            } else {
                prevnode.next = currnode;
                prevnode = currnode;
                currnode = currnode.next;
            }
        }

        prevnode.next = null;
        return head;
    }
}

public class Main {
    public static void main(String[] args) {

        // Input: [1,1,2,3,3]
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        Solution sol = new Solution();
        head = sol.deleteDuplicates(head);

        // Print output
        System.out.print("Output: ");
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
    }
}