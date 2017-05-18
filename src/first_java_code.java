/**
 * Created by Chaomin on 5/18/2017.
 */

import java.util.Scanner;

public class first_java_code
{
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String word;
        int number,i,sum;
        int[] nums;
        boolean areValidNumber = true;

        System.out.println("Please enter a int x(q for quit): ");
        word = keyboard.nextLine();
        if (word.equals("q")){
            System.out.println("See you next time!\n");
            System.out.println("End of the program !");
            System.exit(0);

        }

        number = Integer.parseInt(word);
        while (number < 0)
        {
            areValidNumber = false;
            System.out.println("please enter an positive number~");
            word = keyboard.nextLine();
        }


        while (areValidNumber) {

            number = Integer.parseInt(word);

            if (number < 0) {

                System.out.println("please enter an positive number");
                break;
            }

            nums = new int[number];

            for ( i = 0; i < nums.length; i++) {
                nums[i] = i + 1;
            }

            sum = 0;
            for (int n : nums) {
                sum += n;
            }

            System.out.format("Now print the sum from 1 to x: %d\n\n", sum);
            System.out.format("Please enter the next number ~(q for quit)\n");
            word = keyboard.nextLine();
            if (word.equals("q")){
                System.out.println("See you next time!\n");
                System.out.println("End of the program !");
                System.exit(0);

            }
            //System.out.println(sum);

        }
        System.out.println("End of the program");

    }
}
