package com.javase.datastructureandalgorithm.queue;

/**
 * @author: Admin
 * @create: 2020/9/5 19:14
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        Node node1 = new Node(1,"zs");
        Node node2 = new Node(2,"ls");
        Node node3 = new Node(3,"ww");

        ll.add(node1);
        ll.add(node2);
        ll.add(node3);

        ll.print();
    }
}

class LinkedList {
    private Node head = new Node(0, "");

    public LinkedList() {
    }

    private int size;

    public void add(Node node) {
        Node temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }

    public void addOrder() {

    }

    public void print(){
        Node temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}

class Node {
    private int no;
    private String name;

    Node next;

    public Node(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
