//Remove nth Node
// Time Complexity :0(n)
// Space Complexity :0(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode HEAD=head, temp=head;

       while(n>0 && temp.next!=null){

           temp=temp.next;

           n--;

       }

       if(n==1) return HEAD.next;

       if(n>1) return null;

       while(temp.next!=null){

           temp=temp.next;

           head=head.next;

       }

       head.next=(head.next).next;

       return HEAD;
    }
}

//Reversed linked list
// Time Complexity :0(n)
// Space Complexity :0(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
        ListNode nextTemp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nextTemp;
        }
        return prev;
    }
}
