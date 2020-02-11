package com.company;

import java.io.*;
import java.util.Scanner;

/*

0611 Класс StringHelper
Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.
Пример: Амиго -> АмигоАмигоАмигоАмигоАмиго

Требования:
1. Методы класса StringHelper должны возвращать строку.
2. Методы класса StringHelper должны быть статическими.
3. Методы класса StringHelper должны быть public.
4. Метод multiply(String s, int count) должен возвращать строку повторенную count раз.
5. Метод multiply(String s) должен возвращать строку повторенную 5 раз.

*/

// public class ConsoleReader
public class Main {
    public static String multiply(String s) {
        String result = "";
        for (int i = 0; i < 5; i++)
            result +=s;
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for (int j=0; j<count; j++)
            result +=s;
        return result;
    }

    public static void main(String[] args) {

    }
}










