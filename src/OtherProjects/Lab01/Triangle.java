//Nguyen Viet Thang - 20215245
package OtherProjects.Lab01;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please, enter the height of the triangle.");
        int height = keyboard.nextInt();

        for (int i = 0; i < height; i++){

            for (int k = height - i; k > 1; k--){
                System.out.print(" ");
            }

            for (int j = 1; j <= (2*i + 1) ; j++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}