package DotComGame;

public class DotComBust {
    public static void main(String[] args) {
        int numOfGuesses = 0; // следит за кол-вом ходов пользователя
        GameHelper helper = new GameHelper(); 
    
        DotCom theDotCom = new DotCom(); // создаем объект
        int randomNum = (int) (Math.random() * 5); // генерация первой ячейки
    
        int[] locations = {randomNum, randomNum + 1, randomNum + 2}; // формирование массива ячеек
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
