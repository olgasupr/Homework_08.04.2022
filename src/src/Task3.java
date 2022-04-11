package src;

import java.util.Scanner;

public class Task3 {
    public void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number.");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i*=2) {
            System.out.println(i);
        }
    }
}
