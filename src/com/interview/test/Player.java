package com.interview.test;

public class Player implements Runnable{
    private final String name;
    private Player partner;
    private int sentMessagesCount;
    private int receivedMessagesCount;

    public Player(String name) {
        this.name = name;
    }

    public void setPartner(Player partner) {
        this.partner = partner;
    }

    public synchronized void sendMessage(String message) {
        if (sentMessagesCount < 10) {
            sentMessagesCount++;
            System.out.println(name + " sent: " + message);
            partner.receiveMessage(message);
        }
    }

    public synchronized void receiveMessage(String message) {
        if (receivedMessagesCount < 10) {
            receivedMessagesCount++;
            System.out.println(name + " received: " + message);
            if (receivedMessagesCount == 10) {
                System.out.println(name + " has received 10 messages. Exiting.");
                System.exit(0);
            }
            sendMessage(message + receivedMessagesCount);
        }
    }
    @Override
    public void run() {
        if (partner == null) {
            System.out.println(name + " does not have a partner.");
            return;
        }

        // The initiator sends the first message.
        if (name.equals("Initiator")) {
            sendMessage("Hello");
        }
    }
}
