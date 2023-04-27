package org.example;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

import static org.example.getModulTask2.*;
import static org.example.task1.getRandomNumber;

// Методы находятся в getModulTask2.

//  Реализуйте очередь с помощью LinkedList со следующими методами:
//  enqueue() — помещает элемент в конец очереди,
//  dequeue() — возвращает первый элемент из очереди и удаляет его,
//  first() — возвращает первый элемент из очереди, не удаляя.


public class task2 {


        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < 10; i++) {
                enqueue(list, getRandomNumber()); //заполняем случайными числами
                
            }
            
            System.out.println("Randomlist: " +list);


            System.out.println(dequeue(list)); // удалилим первый элемент
            System.out.println(list);

            System.out.println(first(list)); // вывели первый элемент
            System.out.println(list);
        }


    }



