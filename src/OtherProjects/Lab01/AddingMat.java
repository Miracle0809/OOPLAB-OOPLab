//Nguyen Viet Thang - 20215245
package OtherProjects.Lab01;
import java.util.Scanner;

public class AddingMat {
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int row, col;
        int[][] arr1 = new int[10][10];
        int[][] arr2 = new int [10][10];
        int[][] ans = new int [10][10];

        System.out.println("Please enter the number of row and column of two array: ");
        row = keyboard.nextInt();
        col = keyboard.nextInt();

        System.out.println("Please enter the elements of the 1st array:");
        for (int i = 0; i < row; i++){
            for (int j = 0;j < col; j++){
                arr1[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Please enter the elements of the 2rd array:");
        for (int i = 0; i < row; i++){
            for (int j = 0;j < col; j++){
                arr2[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("The matrix after adding two given array is:");
        for (int i = 0; i < row; i++){
            for (int j = 0;j < col; j++){
                ans[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
