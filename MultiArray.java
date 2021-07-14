package com.company;

 public class MultiArray {

     //Create the required array and the indexes
     private int[] intArray = new int[10];
     private float[] floatArray = new float[10];
     private char[] charArray = new char[10];
     private String[] stringArray = new String[10];
     private int intIndex, floatIndex, charIndex,stringIndex;
     private IndexNode[] nodeArray = new IndexNode[30];

     //Creating the LinkedList containing the index of the data elements
     Indexlist list = new Indexlist();

     //Methods to add elements to the end of MultiArray
     public void add(int i){
         try {
             intArray[intIndex] = i;
         }
         catch (Exception e){
             int[] newIntArray = new int[intArray.length * 2];
             System.arraycopy(intArray,0,newIntArray,0,intArray.length);
             intArray = newIntArray;
             intArray[intIndex] = i;
         }
         IndexNode node = new IndexNode(intIndex,'i');
         list.add(node);
         intIndex++;
     }
     public void add(float f){
         try {
             floatArray[floatIndex] = f;
         }
         catch (Exception e){
             float[] newFloatArray = new float[floatArray.length * 2];
             System.arraycopy(floatArray,0,newFloatArray,0,intArray.length);
             floatArray = newFloatArray;
             floatArray[floatIndex] = f;
         }
         IndexNode node = new IndexNode(floatIndex,'f');
         list.add(node);
         floatIndex++;
     }
     public void add(char c){
         try {
             charArray[charIndex] = c;
         }
         catch (Exception e){
             char[] newCharArray = new char[charArray.length * 2];
             System.arraycopy(charArray,0,newCharArray,0,intArray.length);
             charArray = newCharArray;
             charArray[charIndex] = c;
         }
         IndexNode node = new IndexNode(charIndex,'c');
         list.add(node);
         charIndex++;
     }
     public void add(String s){
         try {
             stringArray[stringIndex] = s;
         }
         catch (Exception e){
             String[] newStringArray = new String[stringArray.length * 2];
             System.arraycopy(stringArray,0,newStringArray,0,intArray.length);
             stringArray = newStringArray;
             stringArray[stringIndex] = s;
         }
         IndexNode node = new IndexNode(stringIndex,'s');
         list.add(node);
         stringIndex++;
     }

     //Methods to insert element at a specific index in MultiArray
     public void insert(int index, float f){
         if(index>=list.getSize() || list.getSize() == 0){
             System.out.println("Invalid function used!!");
             return;
         }
         try {
             floatArray[floatIndex] = f;
         }
         catch (Exception e){
             float[] newFloatArray = new float[floatArray.length * 2];
             System.arraycopy(floatArray,0,newFloatArray,0,intArray.length);
             floatArray = newFloatArray;
             floatArray[floatIndex] = f;
         }
         IndexNode node = new IndexNode(floatIndex, 'f');
         list.insert(index,node);
         floatIndex++;

     }
     public void insert(int index, char c){
         if(index>=list.getSize() || list.getSize() == 0){
             System.out.println("Invalid function used!!");
             return;
         }
         try {
             charArray[charIndex] = c;
         }
         catch (Exception e){
             char[] newCharArray = new char[charArray.length * 2];
             System.arraycopy(charArray,0,newCharArray,0,intArray.length);
             charArray = newCharArray;
             charArray[charIndex] = c;
         }
         IndexNode node = new IndexNode(charIndex, 'c');
         list.insert(index,node);
         charIndex++;

     }
     public void insert(int index, String s){
         if(index>=list.getSize() || list.getSize() == 0){
             System.out.println("Invalid function used!!");
             return;
         }
         try {
             stringArray[stringIndex] = s;
         }
         catch (Exception e){
             String[] newStringArray = new String[stringArray.length * 2];
             System.arraycopy(stringArray,0,newStringArray,0,intArray.length);
             stringArray = newStringArray;
             stringArray[stringIndex] = s;
         }
         IndexNode node = new IndexNode(stringIndex, 's');
         list.insert(index,node);
         stringIndex++;

     }
     public void insert(int index, int i){
         if(index>=list.getSize() || list.getSize() == 0){
             System.out.println("Invalid function used!!");
             return;
         }
         try {
             intArray[intIndex] = i;
         }
         catch (Exception e){
             int[] newIntArray = new int[intArray.length * 2];
             System.arraycopy(intArray,0,newIntArray,0,intArray.length);
             intArray = newIntArray;
             intArray[intIndex] = i;
         }
         IndexNode node = new IndexNode(intIndex, 'i');
         list.insert(index,node);
         intIndex++;

     }

     //Method to delete an element at a specific index
     public void delete(int index){
         if(index >= list.getSize() || list.getSize() == 0){
             System.out.println("List index out of bounds");
             return;
         }
         list.delete(index);
     }

     //Method to convert the backing IndexList to nodeArray
     public void convert(){
         int count=0;
         IndexNode current = list.head;
         while(current !=null){
             try {
                 nodeArray[count] = current;
             }
             catch (Exception e){
                 IndexNode[] newNodeArray = new IndexNode[nodeArray.length * 2];
                 System.arraycopy(nodeArray,0,newNodeArray,0,intArray.length);
                 nodeArray = newNodeArray;
                 nodeArray[count] = current;
             }
             count++;
             current = current.getNext();
         }
     }

     //Method to print the nodeArray
     public void printArray(){
         convert();
         System.out.print("[ ");
         for(int i=0; i<nodeArray.length && nodeArray[i] != null; i++){
             if(nodeArray[i].getArrayType() == 'i'){
                 System.out.print(intArray[nodeArray[i].getIndex()] + " ");
             }
             else if(nodeArray[i].getArrayType() == 'f'){
                 System.out.print(floatArray[nodeArray[i].getIndex()] + " ");
             }else if(nodeArray[i].getArrayType() == 'c'){
                 System.out.print(charArray[nodeArray[i].getIndex()] + " ");
             }else if(nodeArray[i].getArrayType() == 's'){
                 System.out.print(stringArray[nodeArray[i].getIndex()] + " ");
             }
         }
         System.out.print("]");
     }

     //Method to print the MultiArray without converting
     public void printMultiArray(){
         IndexNode current = list.head;
         while(current != null){
             char t = current.getArrayType();
             if(t == 'i'){
                 System.out.println(intArray[current.getIndex()]);
             }
             else if(t == 'f'){
                 System.out.println(floatArray[current.getIndex()]);
             }
             else if(t == 'c'){
                 System.out.println(charArray[current.getIndex()]);
             }
             else if(t == 's'){
                 System.out.println(stringArray[current.getIndex()]);
             }
             current = current.getNext();
         }
     }

     //Method to get an element from the array
     public <T> T get(int i){
         convert();
         char c = nodeArray[i].getArrayType();
         if(c == 'i'){
             return (T) new Integer(intArray[nodeArray[i].getIndex()]);
         }
         else if(c == 'f'){
             return (T) new Float(floatArray[nodeArray[i].getIndex()]);
         }
         else if(c == 'c'){
             return (T) new Character(charArray[nodeArray[i].getIndex()]);
         }else{
             return (T) new String(stringArray[nodeArray[i].getIndex()]);
         }
     }

     //Method to get the length of the MultiArray
     public int length(){
         return list.getSize();
     }


 }
