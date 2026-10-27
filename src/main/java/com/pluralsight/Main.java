package com.pluralsight;

import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Make a scanner
        Scanner scanner = new Scanner(System.in);

        // Array of quotes
        List<String> quotes = new ArrayList<String>();

        // Adds quotes to list
        quotes.add(
                "The audacity of hope! In the end, that is God's greatest gift to us... - Obama"
        );
        quotes.add(
                "That which does not kill us makes us stronger. - Friedrich Nietzsche "
        );
        quotes.add(
                "He who has a why to live can bear almost any how. - Friedrich Nietzsche "
        );
        quotes.add(
                "You have your way. I have my way. As for the right way, " +
                        "the correct way, and the only way, it does not exist - Friedrich Nietzsche "
        );
        quotes.add(
                "You must have chaos within you to give birth to a dancing star. - Friedrich Nietzsche "
        );
        quotes.add(
                "When you look into an abyss, the abyss also looks into you. - Friedrich Nietzsche "
        );
        quotes.add(
                "Convictions are more dangerous enemies of truth than lies. - Friedrich Nietzsche "
        );
        quotes.add(
                "Convictions are more dangerous enemies of truth than lies. - Friedrich Nietzsche "
        );
        quotes.add(
                "Stay hungry. Stay foolish. - Steve Jobs"
        );
        quotes.add(
                "Your time is limited, so don't waste it living someone else's life. - Steve Jobs"
        );

        // Loop until you get a valid response to the prompt
        int response = 0;
        boolean running = true;

        while (running) {
            System.out.println("-> Please select a number for a quote (1-10)");
            try {
                response = scanner.nextInt();
                scanner.nextLine();
                if (response < 1 || response > quotes.size()) {
                    System.out.println("-> Input is out of range MUST be (1-10)");
                } else {
                    // Print out the response
                    System.out.println(quotes.get(response - 1));

                    // Prompt if the user wants another quote
                    System.out.println("\n-> Do you want to see another quote? (Y/N)");
                    String response2 = scanner.nextLine();
                    if (response2.equalsIgnoreCase("N")) {
                        running = false;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("-> Invalid input, please try again");
            }
        }
    }


}