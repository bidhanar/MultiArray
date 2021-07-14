package com.company;

public class Main {
    public static void main(String[] args) {
//Creating a new multiarray
        MultiArray array = new MultiArray();
//Test code
        array.add(1);
        array.add(32);
        array.add(2.1f);
        array.add(32.4f);
        array.add('m');
        array.add('k');
        array.add("Bidhan");
        array.insert(3,"Arya");
        array.insert(2,21);
        array.insert(3,4);
        array.insert(2,43.5f);
        array.insert(0,'k');
        array.delete(0);
        array.delete(4);
        array.printArray();
        for(int i=0; i<array.length(); i++){
            System.out.println(java.util.Optional.ofNullable(array.get(i)));
        }
    }
}
