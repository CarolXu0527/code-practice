package A21_30;

import A81_90.ListNode;

public class MergekSortedLists {
	
	public static void main(String args[]){
		ListNode[] lists = new ListNode[3];
		
		lists[0] = new ListNode(1);
		lists[0].next = new ListNode(2);
		lists[0].next.next = new ListNode(6);
		lists[0].next.next.next = new ListNode(9);
		
		lists[1] = new ListNode(4);
		lists[1].next = new ListNode(5);
		lists[1].next.next = new ListNode(8);
		lists[1].next.next.next = new ListNode(11);
		
		lists[2] = new ListNode(2);
		lists[2].next = new ListNode(5);
		lists[2].next.next = new ListNode(8);
		lists[2].next.next.next = new ListNode(12);
		
		System.out.println("result is : " + mergeKLists(lists));
		
	}
	
    public static ListNode mergeKLists(ListNode[] lists) {
    	if(lists.length==0){return null;}
    	if(lists.length==1){return lists[0];}
    	
    	return RecursiveMKL(lists,0,lists.length-1);
    }

	private static ListNode RecursiveMKL(ListNode[] lists, int i, int j) {
		// TODO Auto-generated method stub
		
		if(i == j){
			return lists[i];
		}
		
		if(i<j){
			System.out.println(i + " " + (i+j)/2 + " " + ((i+j)/2+1) + " " + j);
			ListNode temp1 = RecursiveMKL(lists, i, (i+j)/2);
			ListNode temp2 = RecursiveMKL(lists, ((i+j)/2+1), j);
			return Conquer(temp1, temp2);
		}else{
			return null;
		}
		
	}

	private static ListNode Conquer(ListNode temp1, ListNode temp2) {
		// TODO Auto-generated method stub

		ListNode Dump = new ListNode(0);
		ListNode tempDump = Dump;
		while(temp1!=null && temp2!=null){
			if(temp1.val<=temp2.val){
				tempDump.next = temp1;
				temp1 = temp1.next;
				System.out.println(tempDump.next.val);
			}else{
				tempDump.next = temp2;
				temp2 = temp2.next;
				System.out.println(tempDump.next.val);
			}
			
            tempDump = tempDump.next;
		}
		
		tempDump.next = (temp1!=null)?temp1:temp2;
		System.out.println(tempDump.next.val);
		
		return Dump.next;
		
	}
}
