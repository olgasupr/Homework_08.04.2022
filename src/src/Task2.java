package src;

import java.util.Scanner;

public class Task2 {
    public void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the 1st number.");
        int a = scanner.nextInt();
        System.out.println("Please enter the 2nd number, which should be greater than the 1st one.");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Job completed.");
            return;
        }
        int sum = 0;
            for (int i = a; i <= b; i++) {
                sum+=i;
                System.out.println(i);
            }
        System.out.println("The sum is : " + sum);
        }
}



