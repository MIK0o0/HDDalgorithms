package com.company;

import java.util.ArrayList;

public class Main {
    static int max = 180;

    public static void main(String[] args) {
    processesGenerator generator = new processesGenerator();
    //generator.generator(100,300,max);
    ArrayList<Task> tasks = generator.reader();

    FCFS fcfs = new FCFS();
    System.out.println(fcfs.fcfsAlgo(tasks));

    SSTF sstf = new SSTF();
        System.out.println(sstf.sstfAlgo(tasks));

    SCAN scan = new SCAN();
        System.out.println(scan.scanAlgo(generator.reader()));

    CSCAN cscan = new CSCAN();
        System.out.println(cscan.cscanAlgo(generator.reader()));
}

}
