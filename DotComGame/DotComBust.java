package DotComGame;

import java.util.*;

public class DotComBust {
// объявляем и инициализируем переменные, которые нам понадобятся
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>(); // ArrayList только для DotCom
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
// краткие инструкции для пользователя
        System.out.println("Ваша цель - потопить три 'сайта'.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        } // конец цикла
    } //конец метода setUpGame

    private void startPlaying() {
        while (!dotComsList.isEmpty()) { // пока список DotCom не станет пустым
            String userGuess = helper.getUserInput("Сделайте ход"); // получаем пользовательский ввод
            checkUserGuess(userGuess); // вызываем метод checkUserGuess
        } // конец while
        finishGame(); // вызываем метод 
    } // конец метода startPlaying method

    private void checkUserGuess(String userGuess) {
        numOfGuesses++; // никрементируем кол-во попыток, которые сдклал пользователь
        String result = "Мимо:("; // подразумеваем промах, пока не выяснили обратного

        for (DotCom dotComToTest : dotComsList) { // повторяем для всех объектов DotCom в списке
            result = dotComToTest.checkYourself(userGuess); // DotCom проверяет ход пользователя
            if (result.equals("Попал!")) {
                break; // выбираемся из цикла раньше времени
            }
            if (result.equals("Потопил!!!")) {
                dotComsList.remove(dotComToTest); // удаляем из списка "сайтов" и выходим из цикла
                break;
            }
        } // конец for
        System.out.println(result); // выводим результат
    } // конец метода

    private void finishGame() { 
// выводим сообщение для пользователя, как он прошел игру
        System.out.println("Все 'сайты' ушли ко дну! Хорошая работа!");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего " + numOfGuesses + " попыток.");
            System.out.println("Вы успели до того, как по вам открыли ответный огонь.");
        } else {
            System.out.println("Это заняло у вас довольно много времени. " + numOfGuesses + " попыток.");
            System.out.println("Рыбы водят хороводы вокруг вас))");
        }
    } // конец метода

    public static void main(String[] args) {
        DotComBust game = new DotComBust(); // создаем игровой объект
        game.setUpGame(); // подготовить игру
        game.startPlaying(); // начать главный игровой цикл
    } // конец метода
}