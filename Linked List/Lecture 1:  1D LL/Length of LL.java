Date: 19.03.25
class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int count =0;
        Node temp = head; // storing head in temp variable
        
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    
}
