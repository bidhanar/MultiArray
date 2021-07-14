package com.company;

public class IndexNode {
    private int index;
    private char arrayType;
    IndexNode prev;
    IndexNode next;

    public IndexNode(int index, char arrayType) {
        this.index = index;
        this.arrayType = arrayType;
    }

    public char getArrayType() {
        return arrayType;
    }

    public void setArrayType(char arrayType) {
        this.arrayType = arrayType;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public IndexNode getPrev() {
        return prev;
    }

    public void setPrev(IndexNode prev) {
        this.prev = prev;
    }

    public IndexNode getNext() {
        return next;
    }

    public void setNext(IndexNode next) {
        this.next = next;
    }
}