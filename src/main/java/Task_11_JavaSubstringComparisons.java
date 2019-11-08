import java.util.Scanner;

public class Task_11_JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        char[] inputString = s.toCharArray();
        String[] splitInputString = new String[inputString.length - k + 1];

        for (int i = 0; i < inputString.length; i++) {
            String tmp = "";
            for (int j = 0; j < k; j++) {
                if ((i + j) < inputString.length) {
                    tmp += inputString[i + j];
                }
                if (tmp.length() == k) {
                    splitInputString[i] = tmp;
                }
            }
        }

        for (int i = 0; i < splitInputString.length - 1; i++) {
            for (int j = i + 1; j < splitInputString.length; j++) {
                if (splitInputString[i].compareTo(splitInputString[j]) > 0) {
                    String tmp = splitInputString[i];
                    splitInputString[i] = splitInputString[j];
                    splitInputString[j] = tmp;
                }
            }
        }

        smallest = splitInputString[0];
        largest = splitInputString[splitInputString.length - 1];

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
