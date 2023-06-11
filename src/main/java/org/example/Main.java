package org.example;

import org.example.workers.ArrayWorkers;
import org.example.workers.PrintWorkers;
import org.example.workers.RandomBaseWorkers;
import org.example.workers.sort.*;
import org.example.workers.Workers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Workers> workers=new ArrayList<>();
        RandomBaseWorkers.FillBases(workers,10);
        Comparator<Workers> surname =new Surname();
        Comparator<Workers> reverseName= new ReverseName();
        Comparator<Workers> reverseSurname =new ReverseSurname();
        Comparator<Workers> reverseSalary= new ReverseSalary();

        //в) ** Реализовать интерфейсы для возможности сортировки массива (обратите ваше внимание на интерфейсы Comparator, Comparable)
        System.out.println("\nСортировка по зарплате и имени");
        Collections.sort(workers);
        PrintWorkers.print(workers);
        System.out.println("\nСортировка по фамилии");
        Collections.sort(workers,surname);
        PrintWorkers.print(workers);
        System.out.println("\nСортировка по зарплате по убыванию");
        Collections.sort(workers,reverseSalary);
        PrintWorkers.print(workers);
        System.out.println("\nСортировка по имени по убыванию");
        Collections.sort(workers,reverseName);
        PrintWorkers.print(workers);
        System.out.println("\nСортировка по фамилии по убыванию");
        Collections.sort(workers,reverseSurname);
        PrintWorkers.print(workers);
        // г) ** Создать класс, содержащий массив сотрудников, и реализовать возможность вывода данных с использованием foreach.
        ArrayWorkers arrayWorkers=new ArrayWorkers(new Workers[5]);
        arrayWorkers.RandomFillWorkers();
        System.out.println("Массив сотрудников и сортировка foreach");
        PrintWorkers.print(arrayWorkers);
    }
}
