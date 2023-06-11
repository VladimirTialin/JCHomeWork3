package org.example.workers.sort;

import org.example.workers.Workers;

import java.util.Comparator;

public class Surname implements Comparator<Workers> {
    @Override
    public int compare(Workers o1, Workers o2) {
            return o1.getSurname().compareToIgnoreCase(o2.getSurname());
    }
}
