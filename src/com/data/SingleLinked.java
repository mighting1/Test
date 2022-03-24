package com.data;

public class SingleLinked {
    public static void main(String[] args) {
        /*
        头插法
        将1-10个数字，10作为头，存进链表中
         */
        Node node1=new Node(1);
        for (int i=2;i<11;i++){
            Node node2=new Node(i,node1);
            node1=node2;
        }
        printNode(node1);
    }
    public static void printNode(Node node){
        while (node !=null){
            System.out.print(node.getData()+" ");
            node=node.getNext();
        }
    }

}
class Node{
    private int data;
    private Node next;
    public Node(){

    }
    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    public Node(int data){
        this(data,null);
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}




