// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

package com.madhurima;

public class DeleteWithoutHeadPointer {
}

class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}


class SolutionDeleteWithoutHeadPointer
{
    void deleteNode(Node del)
    {
        Node curr = del;
        Node fast = del.next;

        while(fast != null){
            curr.data = fast.data;
            curr.next = fast.next;
            curr = curr.next;
            fast = fast.next;
        }


    }
}
