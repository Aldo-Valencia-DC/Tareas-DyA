package org.example;
public class Main {
    public static void main(String[] args) {
        // Crear los nodos
        Node head = new Node(0);
        Node node20 = new Node(20);
        Node node23 = new Node(23);
        Node node19 = new Node(19);
        Node node57 = new Node(57);
        Node node67 = new Node(67);
        Node node99 = new Node(99);

        // Conexiones entre los nodos
        head = node20;

        node20.left = node23;
        node20.middle = node19;
        node20.right = null;

        node23.left = null;
        node23.middle= node57;
        node23.right= null;

        node19.left = null;
        node19.middle = null;
        node19.right= node67;

        node67.right = null;
        node67.middle= node99;
        node67.left= null;

        // Imprimir los nodos
        System.out.println("Nodo 99: " + head.middle.right.middle.value);
        System.out.println("Nodo 57: " + head.left.middle.value);
    }
}