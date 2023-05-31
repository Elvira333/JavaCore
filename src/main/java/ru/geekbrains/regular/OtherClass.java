package ru.geekbrains.regular;

public class OtherClass {
    /**
     *  Функция сложения
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма чисел a и b
     */
    public static int add(int a, int b){
        return a+b;
    }

    /**
     * Функция деления
     * @param a делимое
     * @param b делитель
     * @return частное a и b, без проверки еа переполнение переменной
     */
    public static int div(int a, int b){
        return a/b;
    }

    /**
     * Функция умножения
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение a и b
     */
    public static int mul(int a, int b){
        return a*b;
    }

    /**
     * Функиия разности
     * @param a
     * @param b
     * @return
     */
    public static int sub(int a, int b){
        return a-b;
    }
}
