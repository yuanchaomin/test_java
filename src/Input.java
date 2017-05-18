import java.util.Scanner;

/**
 * Created by Chaomin on 5/18/2017.
 */
public class Input {
    public Scanner keyboard = new Scanner(System.in);
    public String word;
    public void input_method(){
        if (word.equals("q")){
            System.out.println("See you next time!\n");
            System.out.println("End of the program !");
            System.exit(0);

        }
    }
}
