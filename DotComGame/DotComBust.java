package DotComGame;

import java.util.*;

private GameHelper helper = new GameHelper();
private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
private int numOfGuesses = 0;

private void setUpGame() {
    // Создадим несколько "сайтов" и присвоим им адреса
    DotCom one = new DotCom();
    one.setName("Pets.com");
    DotCom two = new DotCom();
    two.setName("eToys.com");
    DotCom three = new DotCom();
    three.setName("Go2.com");
    dotComsList.add(one);
    dotComsList.add(two);
    dotComsList.add(three);

    System,out.println("Ваша цель - потопить три 'сайта'.");
    System,out.println("Pets.com, eToys.com, Go2.com");
    System,out.println("Попытайтесь потопить их за минимальное количество ходов");

    for (DotCom dotComToSet : dotComsList) {
        ArrayList<String> newLocation = helper.placeDotCom(3);
        dotComToSet.setLocationCells(newLocation);
    } // конец цикла
} //конец метода setUpGame

public class DotComBust {
    public static void main(String[] args) {
        int numOfGuesses = 0; // следит за кол-вом ходов пользователя
        GameHelper helper = new GameHelper(); 
    
        DotCom theDotCom = new DotCom(); // создаем объект
        int randomNum = (int) (Math.random() * 5); // генерация первой ячейки
    
        ArrayList<String> locations = {randomNum, randomNum + 1, randomNum + 2}; // формирование массива ячеек
        theDotCom.setLocationCells(locations); // передаем местоположение ячеек
        boolean isAlive = true; // для проверки, не закончилась ли игра
    
        while(isAlive == true) {
            String guess = helper.getUserInput("Введите число"); // получаем строку от пользователя
            String result = theDotCom.checkYourself(guess); // проверяет полученные данные
            numOfGuesses++; // инкременируем кол-во попыток
            if (result.equals("Потопил!")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            } // конец if
        } // конец while
    } // конец main
}
