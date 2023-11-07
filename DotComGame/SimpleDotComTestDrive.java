package DotComGame;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom(); // создаем экземпляр класса

        int[] locations = {2, 3, 4}; // создаем массив для местоположения DotCom'a
        dot.setLocationCells(locations); // вызываем сеттер

        String userGuess = "2"; // делаем ход от имени пользователя
        String result = dot.checkYourself(userGuess);
        String testResult = "Неудача";
        if (result.equals("Попал!")) {
            testResult = "Пройден"; // если ход(2) возвращает строку "Попал" - все работает
        }

        System.out.println(testResult); // напечатать результат
    }
}