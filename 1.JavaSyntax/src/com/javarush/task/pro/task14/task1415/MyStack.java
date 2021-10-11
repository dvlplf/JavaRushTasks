package com.javarush.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Стек в домашних условиях
В классе MyStack нужно реализовать свою версию структуры хранения данных стек на базе ArrayList.
Все элементы хранятся в приватном списке storage. Твоя задача реализовать все объявленные методы
 класса MyStack.
Где метод push(String) добавляет элемент в начало списка storage. Метод pop() возвращает первый
 элемент списка storage, а потом удаляет его из этого списка. Метод peek() возвращает первый элемент
  списка storage.
Метод empty() проверяет, не пустой ли список storage. Метод search(String) ищет элемент в списке
storage и возвращает его индекс. Если элемента нет в списке — возвращает -1.


Requirements:
1. Метод push(String) должен быть реализован согласно условию.
2. Метод pop() должен быть реализован согласно условию.
3. Метод peek() должен быть реализован согласно условию.
4. Метод empty() должен быть реализован согласно условию.
5. Метод search(String) должен быть реализован согласно условию.
*/

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        return storage.remove(0);
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        return storage.size() == 0;
    }

    public int search(String s) {
        String[] strings = (String[]) storage.toArray();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(s)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        myStack.push("4");
        myStack.push("5");

        System.out.println(myStack.search("2"));

        for(String elem: myStack.storage){
            System.out.println(elem);
        }
    }
}
