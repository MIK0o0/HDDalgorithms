package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    processesGenerator generator = new processesGenerator();
    int max = 180;
    //generator.generator(100,300,max);
    ArrayList<Task> tasks = generator.reader();

    FCFS fcfs = new FCFS();
    System.out.println(fcfs.fcfsAlgo(tasks));

    SSTF sstf = new SSTF();
        System.out.println(sstf.sstfAlgo(tasks));
    }
}
