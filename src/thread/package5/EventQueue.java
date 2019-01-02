package src.thread.package5;

import java.util.LinkedList;

import static java.lang.Thread.currentThread;

public class EventQueue {
    private final int max;

    static class Event {

    }

    private final LinkedList<Event> eventQueue = new LinkedList<>();
    private final static int DEFAULT_MAX_EVENT = 10;

    public EventQueue() {
        this(DEFAULT_MAX_EVENT);
    }

    public EventQueue(int max) {
        this.max = max;
    }

    public void offer(Event event) {
        synchronized (eventQueue) {
            while (eventQueue.size() >= max) {
                try {
                    console(" the queue is full.");
                    eventQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            eventQueue.addLast(event);
            eventQueue.notifyAll();
            console(" the new event is submitted:" + eventQueue.size());
        }
    }

    public void take() {
        synchronized (eventQueue) {
            while (eventQueue.isEmpty()) {
                try {
                    console(" the queue is empty.");
                    eventQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Event event = eventQueue.removeFirst();
            eventQueue.notifyAll();
            console(" the event " + event + "is handled.:" + eventQueue.size());
        }
    }

    private void console(String message) {
        System.out.printf("%s:%s\n", currentThread().getName(), message);
    }
}
