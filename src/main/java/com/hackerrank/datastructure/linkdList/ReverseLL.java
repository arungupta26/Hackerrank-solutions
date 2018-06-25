package com.hackerrank.datastructure.linkdList;

public class ReverseLL {


    static Node Reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {

        int a[] = {1, 3, 5, 7, 9};
        int b[] = {2, 4, 6};

        Node nodeA = null;


        for (int i : a) {
            nodeA = Insert(nodeA, i);
        }

        System.out.println(Reverse(nodeA));

    }

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

}


