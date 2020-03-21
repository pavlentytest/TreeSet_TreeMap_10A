package com.company;

import java.util.*;


public class Main {
    public static void main(String[] args) {


         /*
         Деревья -  структура данных в виде дерева (граф)
         Корень дерева - самый верхний узел
         Ребро дерева - связь между узлами
         Потомок (ребенок) - узел, который имеет родителя
         Родитель - узел, имеющий ребро, соед. с потомком
         Лист - узел, у которого нет потомков
         Высота дерева - длина самого длинного пути к листу
         Глубина листа - длина пути к корню

         В Java: TreeSet (множество, упорядочено по объекту)
         TreeMap - map (словарь) - ключ-значения  (упорядочено по ключу)

         Бинарное дерево (двоичное) - дерево, в котором для каждого узла не более 2 детей
         Полное бинарное дерево - у каждого узла = 2 потомка
         Сбалансированное бинарное дерево - когда для каждой вершины высота поддеревьев
         не более 1

          */

         ArrayList<Integer> arrayList = new ArrayList<>();
         TreeSet<Integer> treeSet = new TreeSet<>();

         for(int i=0;i<10000;i++) {
             arrayList.add(i);
             treeSet.add(i);
         }

         long start = System.nanoTime();
         for(int j=0;j<10000;j++) {
             arrayList.contains(j);
         }
         long end = System.nanoTime();
         long elapsed = end - start;
         System.out.println("ArrayList:"+elapsed);

        start = System.nanoTime();
        for(int j=0;j<10000;j++) {
            treeSet.contains(j);
        }
        end = System.nanoTime();
        elapsed = end - start;
        System.out.println("TreeSet:  "+elapsed);


        TreeMap<Integer,String> days = new TreeMap<>();
        days.put(3,"Понедельник");
        days.put(2,"Вторник");
        days.put(1,"Среда");

        // получаем все ключи
        System.out.println(days.keySet());
        // получаем все значения
        System.out.println(days.values());
        // Получить конкретное значение
        System.out.println(days.get(3)); // Понедельник

        // получить первое значение
        System.out.println(days.get(days.firstKey()));

        // получить последнее значения
        System.out.println(days.get(days.lastKey()));







    }

}
