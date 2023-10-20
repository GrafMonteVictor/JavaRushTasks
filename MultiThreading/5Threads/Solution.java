package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) throws InterruptedException {
    }

    static class Thread1 extends Thread {
        public void run() {
            while (true) {

            }
        }
    }
    static class Thread2 extends Thread {
        public void run() {
            while (true) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }

    static class Thread3 extends Thread {
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    static class Thread4 extends Thread implements Message {
        public void run() {
            while (true) {
                if (isInterrupted()) {
                    break;
                }
            }
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    static class Thread5 extends Thread {
        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
                String s = reader.readLine();
                int sum = 0;
                while (!s.equals("N")) {
                    sum = sum + Integer.parseInt(s);
                    s = reader.readLine();
                }
                System.out.println(sum);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}