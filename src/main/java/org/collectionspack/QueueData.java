package org.collectionspack;

import java.util.Queue;

import java.util.concurrent.LinkedBlockingQueue;

public class QueueData {

    public static void main(String args[]){

        Queue linkedQueue = new LinkedBlockingQueue();

        linkedQueue.add(1);

        linkedQueue.add(2);

        linkedQueue.add(3);

        linkedQueue.add(4);

        linkedQueue.add(5);

        System.out.println(linkedQueue);

        linkedQueue.remove();

        System.out.println("Remove the value from Queue using remove()"+linkedQueue);

        System.out.println("Get the 1st element from the Queue using element():"+linkedQueue.element());

        linkedQueue.offer(6);

        linkedQueue.offer(7);

        System.out.println("Adding the Queue element using offer():"+linkedQueue);

        linkedQueue.poll();

        System.out.println("Remove the 1st element using pull()"+linkedQueue);

        System.out.println("Get the 1st element from the Queue using peek():"+linkedQueue.peek());

    }

}

