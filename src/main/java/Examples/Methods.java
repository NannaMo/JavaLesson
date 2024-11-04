package Examples;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Print the number: ");
        //зчитування значення від користувача
        int num = scan.nextInt();
        //виклик методу
        findEvenOdd(num);
    }


    public static void findEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}