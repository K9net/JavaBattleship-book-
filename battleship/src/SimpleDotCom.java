import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<String> locationsCells;
    private int numOfHits = 0;

    String checkYourself(String stringGuess) {
        String result = "Мимо";
        int index = locationsCells.indexOf(stringGuess);
        if(index >= 0) {
            locationsCells.remove(index);
            if (locationsCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        System.out.println(result);
        return result;
    }

    public void setLocationsCells(ArrayList<String> locationsCells) {
        this.locationsCells = locationsCells;
    }

    public int getNumOfHits() {
        return numOfHits;
    }
}
