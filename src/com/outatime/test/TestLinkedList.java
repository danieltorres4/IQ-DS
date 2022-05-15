package com.outatime.test;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        Integer temporal;
        LinkedList<Integer> myLinkedList = new LinkedList<>();

        myLinkedList.add(5);
        myLinkedList.add(2);
        myLinkedList.add(4);
        myLinkedList.add(6);
        myLinkedList.add(8);

        /*
        Printing the elements
         */
        System.out.println("Linked list:\n");
        for(int i = 0; i < myLinkedList.size(); i++){
            System.out.println(myLinkedList.get(i));
        }

        /*
        We use a for loop with two vars: start var is used to store the value to be placed in
        the location of end's value.
        Var temporal is used to store end's value and then placed it in the start's value position.
         */
        for (int start = 0, end = myLinkedList.size() - 1; start < end; start++, end--){
            temporal = myLinkedList.get(start);
            myLinkedList.set(start, myLinkedList.get(end));
            myLinkedList.set(end, temporal);
        }

        /*
        Printing
         */
        System.out.println("\n\nLinked list reversed:\n");
        for(int i = 0; i < myLinkedList.size(); i++){
            System.out.println(myLinkedList.get(i));
        }

    }
}
