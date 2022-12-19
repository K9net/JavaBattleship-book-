import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationsCells;
    private String name;


    public void setLocationsCells(ArrayList<String> locationsCells) {
        this.locationsCells = locationsCells;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationsCells.indexOf(userInput);
        if (index >= 0) {
            locationsCells.remove(index);
            if(locationsCells.isEmpty()){
                result = "Потопил";
                System.out.println("Вы потопили " + getName());
            } else{
                result = "Попал";
            }
        }
        return result;
    }
}
