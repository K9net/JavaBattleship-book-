import java.util.ArrayList;

public class DotComBust {
    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        //Создание 3 сайтов и присвоение им адресов
        DotCom one = new DotCom();
        one.setName("пет.ком");
        DotCom two = new DotCom();
        two.setName("платина.ру");
        DotCom three = new DotCom();
        three.setName("джава.раш");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Ваша цель - задудосить три сайта.");
        System.out.println("пет.ком, платина.ру, джава.раш");
        System.out.println("Попытайтесь сделать это за минимальное количество ходов.");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationsCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход: ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")) {
                break;
            }
            if(result.equals("Потопил")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("Вы задудосили все сайты!!!");
        if(numOfGuesses <= 18){
            System.out.println("Это заняло у вас всего " + numOfGuesses + " попыток.");
            System.out.println("Роскомнадзор вам не страшен)");
        } else{
            System.out.println("Это заняло у вас целых " + numOfGuesses + " попыток.");
            System.out.println("Роскомнадзор за вами уже выехал)");
        }
    }

}
