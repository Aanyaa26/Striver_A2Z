Date: 16.0924

class Solution {
    static Node constructLL(int arr[]) {
        Node head = new Node (arr[0]);
        Node mover = head;
        for(int i =1; i< arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
