class MergeSortedList {
    public ListNode SortedMerge(ListNode A, ListNode B)
    {
        if(A == null) return B;
        if(B == null) return A;

        if(A.val < B.val)
        {
            A.next = SortedMerge(A.next, B);
            return A;
        }
        else
        {
            B.next = SortedMerge(A, B.next);
            return B;
        }

    }
}