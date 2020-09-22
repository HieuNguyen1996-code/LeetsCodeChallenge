
public class rotateRight {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	public static void main(String[] args) {

	}
	 public ListNode rotateRight(ListNode head, int k) {
	    	ListNode currentNode = new ListNode(-1);
	    	ListNode tail = new ListNode(-1); 
	    	// finding kth node in the List 
	        // point the head and go through the whole list 
	        for(int i =0; i< k;i++){
	            // storing tail 
	            tail.next = head;
	            head = head.next;
	            
	            // making head point to next 
	            
	        }

	        currentNode = head;
	        
	        while(tail!= null){
	            currentNode.next = tail;
	            tail.next = tail;
	        }
	        return currentNode.next;
	    }

}
