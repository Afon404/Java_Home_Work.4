package org.example;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//  Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
class task3 {
    public static void main(String[] args) {




        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        int sum = linkedList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);


    }
}







