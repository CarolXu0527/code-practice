package A21_30;

import A81_90.ListNode;

/*
 * 
Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

You may not alter the values in the nodes, only nodes itself may be changed.

Only constant memory is allowed.

For example,
Given this linked list: 1->2->3->4->5

For k = 2, you should return: 2->1->4->3->5

For k = 3, you should return: 3->2->1->4->5
 */

public class ReverseNodesinkGroup {
	
	public static void main(String[] args){
		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(3);
		list.next.next.next = new ListNode(4);
		list.next.next.next.next = new ListNode(5);
		
		System.out.println(reverseKGroup(list, 3));
	}
	
    public static ListNode reverseKGroup(ListNode head, int k) {
    	
    	if(head == null){
    		return null;
    	}
    	
    	ListNode dump = new ListNode(0);
    	ListNode tempNode = head;
    	int count = 0;
    	int[] tempVal = new int[k];
    	
    	while(tempNode!=null && count<k){
    		tempVal[count] = tempNode.val;
    		//System.out.println(tempVal[count]);
    		tempNode = tempNode.next;
    		count++;
    	}
    	
    	System.out.println("test" + count);
    	
    	tempNode = head;
    	
    	if(count == k){
        	for(int i = count-1;i>=0;i--){
        		tempNode.val = tempVal[i];
        		System.out.println(tempNode.val);
        		tempNode = tempNode.next;
        	}
        	
        	tempNode = reverseKGroup(tempNode,k);
    	}
    	
    	return head;
    }

}
