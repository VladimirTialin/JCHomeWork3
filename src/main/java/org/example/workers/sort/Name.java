package org.example.workers.sort;

import org.example.workers.Workers;

import java.util.Comparator;

public class Name implements Comparator<Workers> {
    @Override
    public int compare(Workers o1, Workers o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
