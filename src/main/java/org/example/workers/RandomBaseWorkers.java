package org.example.workers;

import java.util.List;
import java.util.Random;

public class RandomBaseWorkers {
    private static final String [] surName={"Иванов","Петров","Сидоров","Кулибин","Пушкин"};
    private static final String [] name={"Иван","Петр","Владимир","Светослав","Анатолий","Ян","Роман"};
    private static final Random rnd=new Random();

    public static void FillBases(List<Workers> workersList, int count){
        for (int i = 0; i < count; i++) {
            workersList.add(newBasesWorkers());
        }
    }
    public static void FillBases(Workers[] workers){
        for (int i = 0; i < workers.length; i++) {
            workers[i]=newBasesWorkers();
        }
    }
    public static Workers newBasesWorkers(){
        Workers worker=null;
        String  surNames=surName[rnd.nextInt(surName.length)];
        String names=name[rnd.nextInt(name.length)];
        int salary= rnd.nextInt(5,15);
        boolean salaryType=rnd.nextBoolean();
        if(salaryType) worker= new FixedPay(surNames,names,salary*10000);
        else worker=new HourlyPay(surNames,names,salary*100);
        return worker;
    }
}
