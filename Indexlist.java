package com.company;

public class Indexlist {
    IndexNode head;
    IndexNode tail;
    private int size;

    //Method to return the size of the IndexList
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //Method to add a node to the end of the IndexList
    public void add(IndexNode node){
        if(head == null){
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.setNext(node);
        node.setPrev(tail);
        tail = node;
        size++;
    }

    //Method to add a node to any specific index of the IndexList
    public void insert(int index, IndexNode node){
        IndexNode current = head;
        int count = 0;
        while(count != index){
            current = current.getNext();
            count++;
        }
        if(current != head) {
            current.getPrev().setNext(node);
            node.setPrev(current.getPrev());
            current.setPrev(node);
            node.setNext(current);
        }
        else{
            current.setPrev(node);
            node.setNext(current);
            head = node;
        }
        size++;
    }
    //Method to remove a node from a specific index of the IndexList
    public void delete(int index){
        IndexNode current = head;
        int count = 0;
        while(count < index){
            count++;
            current = current.getNext();
        }
        if(index == 0){
            head = current.getNext();
            current.setNext(null);
            size--;
        }
        else if(index == size -1){
            tail = current.getPrev();
            current.setPrev(null);
            size--;
        }else{
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
            size--;
        }
    }

}
