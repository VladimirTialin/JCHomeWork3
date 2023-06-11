package org.example.workers.sort;

import org.example.workers.Workers;

import java.util.Comparator;

public class ReverseName implements Comparator<Workers> {
    @Override
    public int compare(Workers o1, Workers o2) {
        return o2.getName().compareToIgnoreCase(o1.getName());
    }
}
