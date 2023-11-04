package GuessGame;

public class Player {
    int number = 0; // здесь хранится вариант числа
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю это число " + number);
    }
}