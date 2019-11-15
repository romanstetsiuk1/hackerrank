package Tasks_11_20;

import java.util.Scanner;

public class Task_12_JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder inputString = new StringBuilder(a);

        if (inputString.toString().equals(inputString.reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
