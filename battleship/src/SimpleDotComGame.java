import java.util.Random;
import java.util.Scanner;

public class SimpleDotComGame {
    public static void main(String[] args) {

        int numOfGuessess = 0;
        boolean isAlive = true;
        SimpleDotCom dot = new SimpleDotCom();
        GameHelper gm = new GameHelper();
        int k = (int) (Math.random() * 5);
        int[] cells = {k, k+1, k+2};
        Scanner in = new Scanner(System.in);
        while (isAlive){
            String result = dot.checkYourself(gm.getUserInput("Введите число"));
            numOfGuessess++;
            if(result.equals("Потопил"))
            {
                isAlive = false;
                System.out.println("Попыток " + numOfGuessess);
            }
        }

    }
}
