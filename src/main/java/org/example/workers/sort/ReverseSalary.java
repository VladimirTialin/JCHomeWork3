package org.example.workers.sort;

import org.example.workers.Workers;
import java.util.Comparator;


public class ReverseSalary implements Comparator<Workers> {

    @Override
    public int compare(Workers o1, Workers o2) {
        return Integer.compare(o2.salary(),o1.salary());
    }
}
