package org.example;
/**
 * <h1>singly-linked list</h1>
 *     int val; <br>
 *     ListNode next; <br>
 *     ListNode() {} <br>
 *     ListNode(int val) { this.val = val; } <br>
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; } <br>
 */
public class ListNode {
    private int val;
    private ListNode next;
    public ListNode() {
    };

    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
