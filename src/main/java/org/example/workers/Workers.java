package org.example.workers;

import java.util.Comparator;

public abstract class Workers implements Comparable<Workers>{
    private String surname;
    private String name;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public Workers(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }
    public abstract int salary();

    @Override
    public int compareTo(Workers w) {
        if(this.salary()==w.salary()) {
            return this.getName().compareToIgnoreCase(w.getName());
        }
        return Integer.compare(this.salary(),w.salary());
    }
}
