package part2;

import java.util.Scanner;

public class prac8 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("The number of 9's in the array is: " + arrayCount9(arr));
    }
    public static int arrayCount9(int[] num) {
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 9) {
                count++;
            }
        }
        return count;
    }
}
