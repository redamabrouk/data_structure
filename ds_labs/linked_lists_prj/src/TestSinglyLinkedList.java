

import ds.lists.SinglyLinkedList;

public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
       
       String s1="A";
       String s2="B";
       String s3="C";
       String s4="D";

        list.insertBegin(s1);
        list.insertBegin(s2);
        list.insertBegin(s3);
        list.insertEnd(s4);

        list.printList();

    }
}