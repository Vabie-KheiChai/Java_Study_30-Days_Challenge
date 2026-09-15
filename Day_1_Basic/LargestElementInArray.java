/* public class LargestElementInArray {
    public static void main(String args[]) {
        int[] numbers = { 55, 66, 77, 90, 22, 11, 88 };
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The largest number :" + max);
    }
} */

public class LargestElementInArray {
    public static void main(String args[]) {
        int[] numbers = { 55, 66, 77, 99, 22, 11, 88 };
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The largest numbers : " + max);
    }
}