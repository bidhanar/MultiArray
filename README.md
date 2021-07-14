# MultiArray

## INTRODUCTION

When we study about data structures, the first data structures that we encounter
are arrays and linked list. Both of these data structures have their pros and cons.
The concept of Multi Array tries to take the benefit of the perks of both these data
structures. In this paper we discuss the working of Multi Array Data Structure. The
table of contents are as follows:
1. MULTI ARRAY PROPERTIES
2. SHORTCOMINGS OF MULTI ARRAY
3. UNDERSTANDING THE WORKING OF MULTI ARRAY
4. CONCLUSION
Let us study these in detail.

## MultiArray Properties

Multi array can store any type of data as per the implementation. In the following
implementation, we store four types of data, int, float, char and String. The addition,
insertion and deletion in multi array is like addition, insertion and deletion in linked
list. The iteration in multi array is like that in arrays. That is, they iterate with time
complexity of O(1). Since it acts like an array, random access is possible, but also
the size of array is fixed, which can be automatically enlarged in implementation.
Before iteration, after all the additions and deletions have been done, the linked list
backing the array needs to be converted to an array, and so in worst case, if one
needs to iterate over the array after each addition or deletion, then the multi array
acts like an array. But in the average case, it performs much better than an array.

## Shortcomings of MultiArray

Despite the ability of multi arrays to take the best of both arrays and linked list, it
does present some shortcomings. Since data types of any type can be stored, while
retrieving, the data type should be known to the user, because when the get()
method returns the variable, it expects the variable type used to store the returned
data to match the data type of the returned variable, and if this is not the case,
compiler may throw a runtime error.</br>
However this can be avoided by using Generics in Java. Another problem that
arises is the space. Since this data structure adds with the rate similar to that of a
linked list, it doesn ’ t delete the array elements, just moves their references, and all
the delete commands result in wastage of Data. If space is not a problem, then
multi array acts better than both arrays and linked list.

## Understanding the working of MultiArray

Multi array uses arrays and linked list as the backing data structure, and builds
upon them. For every data type, an array is created. These arrays are used to store
data, and hence their size is prefixed, which can be set to automatically enlarge
when required. All of these arrays are connected through a linked list. The linked list
is a list of IndexNodes. The IndexNode calss consists of two fields. A character and
an integer. The character is used to differentiate the different data types, and their
corresponding arrays, and the integer is used to access the elements from the
respective array. While adding a new element, the element is added to thecorresponding array, and its index is stored in the Indexnode, which gets connected
by a linked list. Lets take an example to understand this better.
We take only two data types for this demonstration, an int and a float. We have two
arrays, intArray, and floatArray. Also, we have a node class, and a linked list. </br>
Suppose we add 1 to the array, now</br>
intArray = {1}, floatArray = {}, linkedList = { ( ‘ i ’ , 0)}</br>
Next we add 23 to the array, now</br>
intArray = {1,23}, floatArray = {}, linkedList = { ( ‘ i ’ , 0) --> ( ‘ i ’ , 1)}</br>
Next, we add 2.3f to the array, now</br>
intArray = {1,23}, floatArray = {2.3}, linkedList = { ( ‘ i ’ , 0) --> ( ‘ i ’ , 1) --> ( ‘ f ’ , 0)}</br>
Next, we add 4 to the array, now</br>
```intArray = {1,23,4}, floatArray = {2.3}```</br>

linkedList = { ( ‘ i ’ , 0) --> ( ‘ i ’ , 1) --> ( ‘ f ’ , 0) --> ( ‘ i ’ , 2)}</br>
And so on.</br>

Similarly, when an element is inserted, the same steps are followed. The element is
added to the end of the respective array and the node is inserted at the required
position, for example,</br>
We insert 43.5f at index 2, now</br>
intArray = {1,23,4}, floatArray = {2.3,43.5},</br>
linkedList = { ( ‘ i ’ , 0) --> ( ‘ i ’ , 1) --> ( ‘ f ’ , 1) -- > ( ‘ f ’ , 0) --> ( ‘ i ’ , 2)}</br>
Since the number is always inserted at the end of the array, the order of this</br>
operation is O(1), also the order of inserting at the front or end of a linked list is
O(1), and for somewhere in between, for average case, is much better than O(n). </br>

For deleting an element, one simply needs to remove the required node, and no
changes in the array is required, and hence, the deletion is of the order same as
that of a linked list. For example, we delete the element at index 3, now,</br>
intArray = {1,23,4}, floatArray = {2.3,43.5},</br>
linkedList = { ( ‘ i ’ , 0) --> ( ‘ i ’ , 1) --> ( ‘ f ’ , 1) -- > ( ‘ i ’ , 2)}</br>
These are the methods to add, insert and delete data from the data structure. Some
other methods are created to access the data, and print the array, etc.
After all the data manipulations, the linked list needs to be converted to an array for
faster access to data, This operation is of the order O(n), and should be done only
when required to access data. Otherwise, if used everytime a data element is
added or removed, the multi array acts like an array.

## Conclusion
MultiArray can be used to create a dynamic array, which can store different types of
data, without compromising speed, however it comes with some problems of space
and data type errors, and hence, should be used carefully.

## For more details, read the pdf
