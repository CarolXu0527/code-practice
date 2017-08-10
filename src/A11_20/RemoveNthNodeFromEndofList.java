package A11_20;

import A81_90.ListNode;

public class RemoveNthNodeFromEndofList {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		System.out.println(removeNthFromEnd(head, 3));
	}
	
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode Temp = head;
    	int count = 1;
    	
    	while(Temp.next!=null){
    		Temp = Temp.next;
    		count++;
    	}
    	
    	int remove = count - n + 1;
    	
    	if(remove < 1){
    		return null;
    	}
    	
    	
    	ListNode Result = new ListNode(0);
    	Result.next = head;
    	Temp = Result;
    	
    	for(int i = 0; i<remove-1; i++){
    		Temp = Temp.next;
    	}
    	
    	if(remove == count){
    		Temp.next = null;
    	}else{
    		Temp.next = Temp.next.next;
    	}
    	
		return Result.next;
        
    }

}
