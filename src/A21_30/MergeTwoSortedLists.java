package A21_30;

import A81_90.ListNode;

/*
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists {
	
	public static void main(String[] args) {
		ListNode L1 = new ListNode(1);
		L1.next = new ListNode(6);
		L1.next.next = new ListNode(9);
		L1.next.next.next = new ListNode(12);
		ListNode L2 = new ListNode(4);
		L2.next = new ListNode(7);
		L2.next.next = new ListNode(11);
		L2.next.next.next = new ListNode(17);
		System.out.println(mergeTwoLists(L1, L2));
	}
	
	
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	
    	ListNode Dump = new ListNode(0);
    	ListNode Temp = Dump;
    	
    	ListNode TL1 = l1;
    	ListNode TL2 = l2;
    	
    	if(TL1==null){return TL2;}
    	if(TL2==null){return TL1;}
    	
    	while(TL1.next!=null || TL2.next!=null){
    		
    		if(TL1.val<TL2.val){
    			Temp.next = TL1;
    			TL1=TL1.next;
    			System.out.println(Temp.next.val);
    		}else{
    			Temp.next=TL2;
    			TL2=TL2.next;
    			System.out.println(Temp.next.val);
    		}
    		Temp = Temp.next;
    	}
    	
    	Temp = (TL1 != null)?TL1:TL2;
    	
		return Dump.next;
        
    }

}
