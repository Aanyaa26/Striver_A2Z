Date: 16.09.24

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


Revisited - 19.03.25
class Solution {
    static Node constructLL(int arr[]) {
        // initialising head of the ll
        Node head = new Node(arr[0]); // assigned the head with first element of the ll
        Node mover = head; // As head must not get tamperred , hence stored in a pointer type variable which is note fixed and hence changes as soon as pointer moves forward
        
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]); // assigning temp with ith element of array
            mover.next = temp; // pointing mover (initially which was head) to the next temp node
            mover = temp; // making mover pointer assigned to the current temp node
        }
        return head;
    }
}
