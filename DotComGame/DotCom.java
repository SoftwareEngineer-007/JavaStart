package DotComGame;

import java.util.*;

public class DotCom {
    
    private ArrayList<String> locationCells; //ArrayList с ячейками описывающими местоположение
    private String name; // имя "сайта"

    public void setLocationCells(ArrayList<String> loc) { // сеттер обновляющий местоположение "сайта"
        locationCells = loc;
    }

    public void setName(String n) { // простой сеттер
        name = n;
    }

    public String checkYourself(String userInput) {
    String result = "Мимо";

    int index = locationCells.indexOf(userInput);
    if (index >= 0) {
        locationCells.remove(index); // применяем метод remove из ArrayList для удаления элемента

        if (locationCells.isEmpty()) { // проверка, все ли адреса были разгаданы
            result = "Потопил!!!";
            System.out.println("Ой, вы потопили " + name + " :("); // сообщение пользователю о потоплении
        } else {
            result = "Попал. Так держать";
        } // конец if
    } // конец внешнего if
    return result; // возвращаем результат
    } // конец метода
} // конец класса
