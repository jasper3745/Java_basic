package day28;

import java.util.ArrayDeque;
import java.util.Deque;

public class Day28Deque {
    public static void main(String[] args){
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("첫 진우");
        deque.addLast("마지막 진우");
        deque.addFirst("VIP 진우");

        System.out.println("앞 첫 번째 → " + deque.peekFirst());
        System.out.println("뒤 첫 번째 → " + deque.peekLast());

        System.out.println("\ndeque.removeFirst() → " + deque.removeFirst());
        System.out.println("\ndeque.removeLast() → " + deque.removeLast());

        System.out.println("\n남은 손님 수 → " + deque.size());
    }
}
