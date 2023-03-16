package rikkei;

import java.util.ArrayList;

public class MyLinkedListTes {
    public static void main(String[] args) {
       MyLinkedList myLinkedList = new MyLinkedList();
       myLinkedList.addFirst(1);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(1);
        myLinkedList.add(2,2);

       myLinkedList.printList();
        System.out.println(myLinkedList);
    }
}
