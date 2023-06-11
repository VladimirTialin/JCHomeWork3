package org.example.workers;

import java.util.Iterator;

public class ArrayWorkers implements Iterable<Workers> {
    private Workers[] worker;

    public ArrayWorkers(Workers[] worker) {
        this.worker=worker;
    }
    public void RandomFillWorkers(){
        RandomBaseWorkers.FillBases(worker);
    }

    @Override
    public Iterator<Workers> iterator() {
        return new Iterator<Workers>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<worker.length;
            }

            @Override
            public Workers next() {
                return worker[index++];
            }
        };
    }

    public static class PrintWorkers {
        public static void print(){

        }
    }
}

