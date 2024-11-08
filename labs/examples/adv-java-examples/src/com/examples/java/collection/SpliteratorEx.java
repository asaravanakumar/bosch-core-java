package com.examples.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/*
 * Designed for traversing and partitioning elements for efficient parallel processing.
 *
 * Suitable for parallel processing of collections with the Stream API.
 */
public class SpliteratorEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Spliterator<String> spliterator = list.spliterator();

        // Using trySplit to get another Spliterator
        Spliterator<String> secondHalf = spliterator.trySplit();

        // Process elements in the first Spliterator
        spliterator.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("First half: " + s);
            }
        });

        // Process elements in the second Spliterator
        secondHalf.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Second half: " + s);
            }
        });
    }
}

