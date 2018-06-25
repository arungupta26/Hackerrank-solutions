package com.hackerrank.datastructure.linkdList;


import java.util.Scanner;

public class CompareLinkedList {

    int CompareLists(Node headA, Node headB) {
        if (headA == null && headB == null) {
            return 1;
        }
        while (headA.data == headB.data) {
            if (headA.next == null) {
                if (headB.next == null) {
                    return 1;
                } else {
                    return 0;
                }
            }
            headA = headA.next;
            headB = headB.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CompareLinkedList s = new CompareLinkedList();
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int count = sc.nextInt();
            Node headA = null;
            while (count-- > 0) {

                headA = s.Insert(headA, sc.nextInt());
            }

            int countB = sc.nextInt();
            Node headB = null;
            while (countB-- > 0) {

                headB = s.Insert(headB, sc.nextInt());
            }

            System.out.println("Test case "+ i);
            System.out.println(s.CompareLists(headA, headB));
        }
    }

    Node Insert(Node head, int data) {
        if (head == null) {
            head = new Node();
            head.data = data;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node();
            node.next.data = data;
        }
        return head;
    }
}
