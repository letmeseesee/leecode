package com.leecode;

import java.util.Objects;

/**
 * 两个升序链表合并为一个新的 升序 链表
 *
 * @author wyh
 * @version 1.0
 * @date 2020/9/1 21:45
 */
public class mergeTwoLists {
    public static void main(String[] args) {
        ListNode firstNode = new ListNode(1);
        ListNode firstNode1 = new ListNode(2);
        ListNode firstNode2 = new ListNode(4);
        firstNode.next = firstNode1;
        firstNode1.next = firstNode2;

        ListNode secondNode = new ListNode(1);
        ListNode secondNode1 = new ListNode(3);
        ListNode secondNode2 = new ListNode(4);
        secondNode.next = secondNode1;
        secondNode1.next = secondNode2;

        System.out.println(mergeTwoLists(firstNode,secondNode));
    }
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
}
