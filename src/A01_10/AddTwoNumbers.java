package A01_10;

import A81_90.ListNode;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/

public class AddTwoNumbers {

	public static void main(String[] args){

		ListNode L1 = new ListNode(1);
		//L1.next = new ListNode(8);
		//L1.next.next = new ListNode(3);
		ListNode L2 = new ListNode(9);
		L2.next = new ListNode(9);
		//L2.next.next = new ListNode(4);
		ListNode Result = new ListNode(0);
		Result = AddTwoNumbersTest(L1, L2);
		System.out.println(Result);
	}

	private static ListNode AddTwoNumbersTest(ListNode l1, ListNode l2) {
		// TODO Auto-generated method stub
		ListNode Dump = new ListNode(0);
		ListNode Temp = Dump;
		int carry = 0;
		ListNode lt1 = l1;
		ListNode lt2 = l2;
		while(lt1 != null || lt2 != null){
			int a = (lt1 == null)?0:lt1.val;
			int b = (lt2 == null)?0:lt2.val;
			Temp.next = new ListNode((a+b+carry)%10);
			carry = (a+b+carry)/10;
			if(lt1 != null)lt1 = lt1.next;
			if(lt2 != null)lt2 = lt2.next;
			Temp = Temp.next;
			System.out.println("Temp is " + Temp.val + "; Carry is " + carry);
		}
		
		if(carry > 0){
			Temp.next = new ListNode(carry);
		}
		
		return Dump.next;
	}
	
}
