package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.offer(firstQueue.poll());
        deque.offer(firstQueue.poll());
        deque.offer(secondQueue.poll());
        deque.offer(secondQueue.poll());

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()){
            firstQueue.offer(deque.pollLast());
            deque.offer(firstQueue.poll());
            deque.offer(firstQueue.poll());
            secondQueue.offer(deque.pollLast());
            deque.offer(secondQueue.poll());
            deque.offer(secondQueue.poll());
        }
        return deque;
    }
}
//
//

// 7 6 8 3 1 2 5 5