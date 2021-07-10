package com.ak.adventures;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

public class ReverseLinkedList {
    public static void main(String[] args){
        ListNode tail = new ListNode(8);
        ListNode mid = new ListNode(0, tail);
        ListNode head = new ListNode(7, mid);
        System.out.println(head);
        System.out.println(reverseLink(head));
    }
    public static ListNode reverseLink(ListNode head){
        ListNode curr=head, prev=null, rev=null;
        while(curr!=null){
            rev = new ListNode(curr.val, prev);
            prev = rev;
            curr = curr.next;
            System.out.println(rev);
        }
        return rev;
    }
}
