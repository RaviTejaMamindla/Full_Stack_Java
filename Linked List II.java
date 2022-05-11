class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next == null)
            return head;
        if(left == right)
            return head;
        ListNode temp,prev,curr,next,lef,righ;
        temp=null;
        righ=null;
        lef=null;
        next=null;
        prev=head;
        curr=head.next;
        int c=1;
        while(c<right)
        {
            if(c<left)
            {
                lef=prev;
                //righ=lef.next;
                prev=curr;
                curr=curr.next;
                c++;
            }
            if(c==left)
            {
                righ=prev;
            }
            if(c>=left && c<=right)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                c++;
            }
        }
        if(lef != null && curr!=null){
            righ.next=curr;
            lef.next=prev;
        }
        else if(curr==null && lef!=null)
        {
            lef.next=prev;
            righ.next=null;
        }
        else if(curr!=null && lef==null)
        {
            head=prev;
            righ.next=curr;
        }
        else if(curr==null && lef==null)
        {
            head=prev;
            righ.next=null;
        }
        return head;
}
}