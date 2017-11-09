import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        // Write the code here. You can run the code by 
        // selecting Run->Run File from the menu or by pressing Shift+F6
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int[] array = new int[number];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < number; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.println("The Fibonacci is " + Arrays.toString(array));

    }

}