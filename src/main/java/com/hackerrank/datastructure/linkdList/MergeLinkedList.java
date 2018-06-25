package com.hackerrank.datastructure.linkdList;

public class MergeLinkedList {

    static Node Insert(Node head, int data) {
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

    public static void main(String[] args) {


        int a[] = {1, 3, 5, 7, 9};
        int b[] = {2, 4, 6};

        Node nodeA = null;
        Node nodeB = null;


        for (int i : a) {
            System.out.println("Inserting I::" + i);
            nodeA = Insert(nodeA, i);
        }

        for (int i : b) {
            nodeB = Insert(nodeB, i);
        }

        Node result = MergeLists2(nodeA, nodeB);

        while (result != null) {
            System.out.println(result.data);
            result = result.next;
        }


    }

    static Node MergeLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        if (headA == null) {
            return headB;
        }
        if (headB == null) {
            return headA;
        }
        if (headA.data < headB.data) {
            headA.next = MergeLists(headA.next, headB);
            return headA;
        } else {
            headB.next = MergeLists(headA, headB.next);
            return headB;
        }
    }

    static Node MergeLists2(Node headA, Node headB) {

        if (headA == null && headB == null)
            return null;

        if (headA == null )
            return headB;


        if (headB == null)
            return headA;

        Node result = null;

        while (headA != null && headB != null) {
            if (headA.data < headB.data) {
                result=   Insert(result, headA.data);
                headA = headA.next;
            } else {

                result=  Insert(result, headB.data);
                headB = headB.next;

            }

        }

        while (headA != null) {
            result= Insert(result, headA.data);
            headA = headA.next;
        }


        while (headB != null) {
            result=    Insert(result, headB.data);
            headB = headB.next;
        }

        return result;

    }


}
