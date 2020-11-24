/**
 Sort a linked list using insertion sort.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode cur = head;
        while(cur != null) {
            ListNode start = head;
//skip all elements from the sorted part which are smaller than the current
            while(start.val <  cur.val && start != cur) {
                start = start.next;
            }

            int prev = cur.val;
// insert cur element in its position in the sorted part and move all elements after it  until we reach cur
            while(start != cur.next) {
                int tmp = start.val;
                start.val = prev;
                prev = tmp;
                start = start.next;
            }
            cur = cur.next;
        }
        return head;
    }
}