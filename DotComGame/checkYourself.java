package DotComGame;

public String checkYourself(String stringGuess) {
    int guess = Integer.parseInt(stringGuess); //преобразуем String в int
    String result = "Мимо";

    for (int cell : locationCells) {
        if (guess == cell) { // сравниваем ход пользователя с элементом массива
            result = "Попал!"; // обнаружили попадание
            numOfHits++;
            break;
        } // конец if
    } // конец for

    if (numOfHits == locationCells.length) {
        result = "Потопил";
    } // конец if

    System.out.println(result);

    return result; // возвращаем результат в вызывающий метод
}
