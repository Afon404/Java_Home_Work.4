package org.example;
import java.util.LinkedList;

public class getModulTask2 {


    public static void enqueue(LinkedList<Integer> list, int num) {// помещает элемент в конец очереди
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) { // возвращает первый элемент  и удаляет его
        int num = list.get(0);
        list.remove(0);
        return num;
    }


    public static int first(LinkedList<Integer> list) { // возвращает первый элемент не удаляя
        int num = list.get(0);
        return num;
    }

    public static int getRandomNumber() { // генерируем случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
