package ru.geekbrains.regular;

public class Decorator {

    public static String decorate(int a){
        /**
         * Метод декорирует число, добавляя к нему строку
         * при помощи функция форматирования строк
         */
        return String.format("Держи число: %d.", a);
    }
}
