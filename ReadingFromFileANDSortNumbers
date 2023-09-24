package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                FileInputStream input = new FileInputStream(in.readLine());
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))){
            List<Integer> list = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                int i = Integer.parseInt(line);
                if (i%2 == 0) {
                    list.add(i);
                }
            }
            list.sort(Comparator.naturalOrder());
            for (Integer i: list) {
                System.out.println(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
