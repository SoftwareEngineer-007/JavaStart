package DotComGame;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        DotCom dot = new DotCom(); // создаем экземпляр класса

        int[] locations = {2, 3, 4}; // создаем массив для местоположения DotCom'a
        dot.setLocationCells(locations); // вызываем сеттер

        String userGuess = "2"; // делаем ход от имени пользователя
        String result = dot.checkYourself(userGuess);
    }
}