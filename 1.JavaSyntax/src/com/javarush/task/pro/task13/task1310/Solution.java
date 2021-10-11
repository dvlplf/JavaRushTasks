package com.javarush.task.pro.task13.task1310;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* 
Успеваемость студентов-2
Успеваемость студентов-2
В классе Solution объявлено поле grades типа HashMap<String, Double>, где ключ — имя и фамилия студента,
 а значение - его средняя оценка. На этот раз твоя задача — реализовать методы:
printStudents, который выводит только имена всех студентов (ключ коллекции);
getAverageMark, который возвращает средний балл всех студентов.

Requirements:
1. В классе Solution нужно инициализировать публичное статическое поле grades типа HashMap<String, Double>.
2. Метод printStudents должен выводить всех студентов (имя и фамилия) из коллекции grades с новой строки.
3. Метод getAverageMark должен возвращать средний балл всех студентов из коллекции grades.
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.print("Средний балл группы: " + getAverageMark());

    }

    public static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        for (String key: grades.keySet()){
            Double value = grades.get(key);
            System.out.println(key);
        }
    }

    public static Double getAverageMark() {
        double sum = 0;
        for (Double value: grades.values()){
            sum += value;
        }
        return sum / grades.size();
    }
}
