
public class AddTwoNumbers {
	public static void main (String[] args ) { 
		
		
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2 ) { 
		 ListNode solution = new ListNode(0);
	        ListNode l3 = solution;
	        
	        int remain = 0; 
	         
	        while(l1 != null || l2 != null){
	            // if the number does not exist then automatically set to 0
	            // otherwise set it to list variable 
	            int l1_val = (l1 != null ) ? l1.val: 0;
	            int l2_val = (l2 != null ) ? l2.val: 0; 
	            
	            int current_sum = l1_val + l2_val + remain; 
	            remain = current_sum/10; 
	            int last_digit = current_sum%10; 
	            
	            ListNode newNode = new ListNode(last_digit);
	            l3.next = newNode;
	            
	            if(l1 != null ) l1 = l1.next; 
	            if(l2 != null ) l2 = l2.next;
	             
	            l3 = l3.next;
	        }
	        
	        if(remain > 0 ) {
	            ListNode newNode = new ListNode(remain); 
	            l3.next = newNode;
	            l3 = l3.next;
	        
	        }
	        
	        return solution.next;
	}

}