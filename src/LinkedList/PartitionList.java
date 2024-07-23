//Question: 86
//Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
//
//You should preserve the original relative order of the nodes in each of the two partitions.

package LinkedList;

import LinkedList.RemoveNthNodeFromEndOfList.ListNode;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode beforeHead = new ListNode(0);
        ListNode afterHead = new ListNode(0);
        ListNode before = beforeHead;
        ListNode after = afterHead;
        
        for (; head != null; head = head.next) {
        	if (head.val < x) {
        		before.next = head;
        		before = head;
        	}
        	else {
        		after.next = head;
        		after = head;
        	}
        }
        after.next = null;
        before.next = afterHead.next;
        
        return beforeHead.next;
    }
}
