package com.leecode;

import java.util.Objects;

/**
 * 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 *
 * @author wyh
 * @version 1.0
 * @date 2020/9/12 9:15
 */
public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remainder = 0;
        int wholeNumber = 0;
        int l1Val = 0;
        int l2Val = 0;
        int result = 0;
        ListNode firstNode = null;
        ListNode currentNode = null;

        while (Objects.nonNull(l1) || Objects.nonNull(l2) || wholeNumber > 0) {
            if (Objects.nonNull(l1)) {
                l1Val = l1.val;
                l1 = l1.next;
            } else {
                l1Val = 0;
            }
            if (Objects.nonNull(l2)) {
                l2Val = l2.val;
                l2 = l2.next;
            } else {
                l2Val = 0;
            }
            result = l1Val + l2Val + wholeNumber;
            remainder = result % 10;
            wholeNumber = result / 10;
            ListNode resultNode = new ListNode(remainder);
            if (null != firstNode) {
                currentNode.next = resultNode;
                currentNode = resultNode;
            } else {
                firstNode = resultNode;
                currentNode = resultNode;
            }
        }
        return firstNode;
    }
}
