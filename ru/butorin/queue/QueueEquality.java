package ru.butorin.queue;

import java.util.Queue;
import java.util.ArrayDeque;

public class QueueEquality<T> {
    public static <T> boolean processQueue(Queue<T> queue, int i, int j) {
        if (i < 0 || j < 0 || j <= i || i >= queue.size() || j >= queue.size()) throw new IllegalArgumentException("Неверное значение индексов.");
        if (i == j) return true;

        Queue<T> tempQueue = new ArrayDeque<>(queue);

        for (int k = 0; k < i; k++) {
            tempQueue.poll();
        }
        T e = tempQueue.poll();
        for (int k = i+1; k <= j; k++) {
            T t = tempQueue.poll();
            if (t != e) return false;
            e = t;
        }

        return true;
    }
}
