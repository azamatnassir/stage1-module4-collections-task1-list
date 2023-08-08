package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer num : sourceList) {
            if (num % 2 == 0)
                linkedList.addLast(num);
            else
                linkedList.addFirst(num);
        }
        return linkedList;
    }
}
