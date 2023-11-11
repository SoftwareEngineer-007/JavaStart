package DotComGame;

import java.util.ArrayList;

public class SimpleDotCom {
    
    private ArrayList<String> locationCells;
    // private int numOfHits;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
    String result = "Мимо";

    int index = locationCells.indexOf(userInput);
    if (index >= 0) {
        locationCells.remove(index);

        if (locationCells.isEmpty()) {
            result = "Потопил!!!";
        } else {
            result = "Попал. Так держать";
        } // конец if
    } // конец внешнего if
    return result;
    } // конец метода
} // конец класса
