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
    int val;
    ListNode next;
    public ListNode() {
    };

    public ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
