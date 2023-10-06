package com.interview.test;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Initiator");
        Player player2 = new Player("Receiver");

        player1.setPartner(player2);
        player2.setPartner(player1);

        Thread thread1;
        thread1 = new Thread(player1);
        Thread thread2 = new Thread(player2);

        thread1.start();
        thread2.start();
    }
}

