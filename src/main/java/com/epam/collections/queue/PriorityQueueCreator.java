package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(firstList);
        list.addAll(secondList);
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.addAll(list);
        return queue;
    }
}
