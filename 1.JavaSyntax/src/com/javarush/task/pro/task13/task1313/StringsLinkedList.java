package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node(null);
    private Node last = new Node(null);
    private int size = 0;

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {

    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;


        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(String value) {
            this.value = value;
        }
    }
}
