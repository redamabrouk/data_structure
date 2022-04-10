

import ds.lists.SinglyLinkedList;

public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<String>();
       
       String s1="A";
       String s2="B";
       String s3="C";
       String s4="D";

        list.insertBegin(s1);
        list.insertEnd(s2);
        list.insertEnd(s3);
        list.insertEnd(s4);

        list.printList();
        list.removeBegin();
        list.printList();

    }
}