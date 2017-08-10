package A21_30;

import A81_90.ListNode;

/*
 * Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */

public class SwapNodesinPairs {
	
	public static void main(String[] args) {
		ListNode L1 = new ListNode(1);
		L1.next = new ListNode(6);
		L1.next.next = new ListNode(9);
		//L1.next.next.next = new ListNode(12);
		System.out.println(swapPairs(L1));
	}
	
    public static ListNode swapPairs(ListNode head) {
    	
    	if(head==null){
    		return null;
    	}
    	
    	if(head.next!=null){
    		int temp = head.val;
    		head.val = head.next.val;
    		head.next.val = temp;
    		System.out.println(head.val + " " + head.next.val);
    		head.next.next = swapPairs(head.next.next);
    	}
    	return head;   
    }

}
