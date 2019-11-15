package Tasks_11_20;

import java.util.Scanner;

public class Task_13_JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] inputA = a.toLowerCase().toCharArray();
        char[] inputB = b.toLowerCase().toCharArray();

        char compare;
        int countA, countB;

        for (int charNr = 0; charNr < inputA.length; charNr++) {

            compare = inputA[charNr];
            countA = 0;
            countB = 0;

            for (int countInputA = 0; countInputA < inputA.length; countInputA++) {
                if (compare == inputA[countInputA]) {
                    countA++;
                }
            }
            for (int countInputB = 0; countInputB < inputA.length; countInputB++) {
                if (compare == inputB[countInputB]) {
                    countB++;
                }
            }
            if (countA != countB) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
