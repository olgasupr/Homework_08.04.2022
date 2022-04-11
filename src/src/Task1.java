package src;

import java.util.Scanner;

public class Task1 {
    public void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number.");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++)
        if (i%2==1) {
            System.out.println(i);
        }
    }
}
