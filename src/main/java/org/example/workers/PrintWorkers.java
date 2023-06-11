package org.example.workers;

import java.util.List;

public class PrintWorkers {
    public static void print(List<Workers> workersList){
        for (Workers w:workersList) {
            System.out.println(w);
        }
    }
    public static void print(ArrayWorkers workers){
        for (Workers w:workers) {
            System.out.println(w);
        }
    }



}
