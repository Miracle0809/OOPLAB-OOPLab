//Nguyen Viet Thang - 20215245
package OtherProjects.Lab01;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the length of array:");
        int len = keyboard.nextInt();
        int[] arr = new int[10];
        int sum = 0;
        System.out.println("Please enter the elements of array:");

        for (int i = 0; i < len; i++){
            arr[i] = keyboard.nextInt();
            sum += arr[i];
        }

        double avg_val = sum / len;
        System.out.println("The sum of array is: " + sum);
        System.out.println("The average value of array is: " + avg_val);

        for (int i = 0; i < len - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[min_idx] > arr[j]){
                    min_idx = j;
                }
                if (min_idx != i){
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("The array after sorting: ");
        for (int k = 0; k < len; k++){
            System.out.print(arr[k] + " ");
        }
    }
}