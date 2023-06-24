package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder stringBuilder = new StringBuilder();
        int count = evenElements.size();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(evenElements.removeFirst());
            evenElements.removeFirst();
            count--;
        }
        return stringBuilder.toString();
    }

    private String getDescendingElements() {
        StringBuilder stringBuilder = new StringBuilder();
        int count = descendingElements.size();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(descendingElements.pollLast());
        }
        return stringBuilder.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}