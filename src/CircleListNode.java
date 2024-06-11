public class CircleListNode {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1, null)))));
        ListNode listNode2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode listNode3 = new ListNode(1, new ListNode(1, null));
        System.out.println(valid(listNode1));
        System.out.println(valid(listNode2));
        System.out.println(valid(listNode3));
    }

    private static boolean valid(ListNode listNode) {
        ListNode slow = listNode;
        ListNode fast = listNode;
        while (slow != null && fast.next != null) {
            if (slow.val == fast.next.val) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}

class ListNode {
    int val;

    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
