package com.company.Lecture19;

public class Main {
    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>();

        heap.add(35);
        heap.add(567);
        heap.add(3);
        heap.add(98);

        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
    }
}
