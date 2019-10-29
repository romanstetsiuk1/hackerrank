import java.util.Scanner;

public class Task_10_JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        char[] charArray = s.toCharArray();
        String result = "";

        for (int i = start; i < end; i++) {
            result += charArray[i];
        }

        System.out.println(result);

    }

}
