package com.leecode;

import java.util.Objects;

/**
 * @author wyh
 * @version 1.0
 * @date 2020/9/3 21:48
 */
public class MergeKLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (Objects.nonNull(l1) && Objects.nonNull(l2)) {
            ListNode firstNode = new ListNode();
            ListNode headNode = firstNode;
            do {
                if (l1.val > l2.val) {
                    firstNode.next = new ListNode(l2.val);
                    firstNode = firstNode.next;
                    l2 = l2.next;
                } else if (l2.val > l1.val) {
                    firstNode.next = new ListNode(l1.val);
                    firstNode = firstNode.next;
                    l1 = l1.next;
                } else {
                    firstNode.next = new ListNode(l1.val);
                    firstNode = firstNode.next;
                    firstNode.next = new ListNode(l2.val);
                    firstNode = firstNode.next;
                    l1 = l1.next;
                    l2 = l2.next;
                }
                if (Objects.isNull(l1)) {
                    firstNode.next = l2;
                    break;
                }
                if (Objects.isNull(l2)) {
                    firstNode.next = l1;
                    break;
                }
            } while (Objects.nonNull(l1));
            return headNode.next;
        } else if (Objects.nonNull(l1)) {
            return l1;
        } else {
            return l2;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 1) {
            return lists[0];
        }
        ListNode current = null;
        for (int i = 0; i < lists.length; i++) {
            current = mergeTwoLists(lists[i], current);
        }
        return current;
    }
}
