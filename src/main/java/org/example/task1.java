package org.example;
import java.util.LinkedList;
import java.util.Random;
import java.util.random.RandomGenerator;

// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод,
// который вернёт «перевёрнутый» список.
public class task1 {

        public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < 10; i++) {
                list.add(getRandomNumber());
            }
            System.out.println(list);


            for (int i = 0; i < 10; i++) {
                System.out.print(list.getLast() + ", ");
                list.removeLast();

            }
        }

        public static int getRandomNumber() {
            double x = (Math.random() * 99);
            int num = (int) x;
            return num;

        }


}


