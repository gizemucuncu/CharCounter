package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String input = scanner.nextLine().toLowerCase();

        Map<Character, Integer> letterCount = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            letterCount.put(ch, letterCount.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
        }
    }
}
