package org.example.workers.sort;

import org.example.workers.Workers;

import java.util.Comparator;

public class ReverseSurname implements Comparator<Workers>{
    @Override
    public int compare(Workers o1, Workers o2) {
        return o2.getSurname().compareToIgnoreCase(o1.getSurname());
    }
}