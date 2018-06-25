package com.hackerrank.datastructure.linkdList.reversePrint;



import java.util.Scanner;

public class Solution {


    // This is a "method-only" submission.
    // You only need to complete this method.

    void ReversePrint(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        String out = "";
        if (head != null) {
            out = head.data + "";
            head = head.next;
        }

        while (head != null) {
            out = head.data + "\n" + out;
            head = head.next;
        }
        if (!out.isEmpty()) {
            System.out.println(out);
        }


    }


    Node Reverse(Node head) {
        if (head == null) {
            return null;
        }
        Node node = null;
        while (head != null) {
            Node i = node;
            node = new Node();
            node.data = head.data;
            node.next = i;
            head = head.next;
        }
        return node;
    }


    int CompareLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method

        headA=headA.next;

        while(headA.next!=null && headB.next !=null)
        {
            if(headA.data == headB.data)
            {
                //do nothing
            }
            else{
                return 0;
            }
            headA=headA.next;
            headB=headB.next;

        }

        if(headA.next == null && null == headB.next)
            return 1;
        else
            return 0;

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


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter No. of test cases::");
        int testCase = sc.nextInt();
        Solution s = new Solution();

        while (testCase-- > 0) {
           // System.out.println("Enter No. of element::");

            int count = sc.nextInt();
            Node head = null;
            while (count-- > 0) {
                head = s.Insert(head, sc.nextInt());
            }



           // s.ReversePrint(head);
          //  s.Reverse(head);
          //  System.out.println(  s.CompareLists(head,head));
        }
    }
}
