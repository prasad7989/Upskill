/**
 RemoveDuplicate
 * Definition for singly-linked list.

 */
class RemoveDuplicate {
    public ListNode deleteDuplicates(ListNode head) {
        public ListNode deleteDuplicates(ListNode head) {
            //  reset any member data you declared, as
            // the same Solution instance will be reused for each test case.
            if(head == null) return null;
            ListNode result = null;
            ListNode begin = null;
            while(head != null){
                int num = head.val;
                if(head.next != null && head.next.val == num){
                    while(head != null && head.val == num) head = head.next;
                }
                else{
                    if(result == null){
                        result = head;
                        begin = result;
                    }
                    else{
                        result.next = head;
                        result = result.next;
                    }
                    head = head.next;
                    result.next = null;
                }
            }
            return begin;

        }
    }
}