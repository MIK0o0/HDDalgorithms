package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class CSCAN {
    public int cscanAlgo(ArrayList<Task> list){
        ArrayList<Task> tasks = list;
        ArrayList<Task> queue = new ArrayList<>();
        int time = 0;
        int result = 0;
        int headSegment = 0;
        while (tasks.size() != 0 || queue.size() != 0){
            if (queue.isEmpty()){
                queue.add(tasks.get(0));
                tasks.remove(0);
                if (time < queue.get(0).getArrivalTime()) {
                    time = queue.get(0).getArrivalTime();
                }
            }
            if (!tasks.isEmpty()) {
                while (tasks.get(0).getArrivalTime() <= time) {
                    queue.add(tasks.get(0));
                    tasks.remove(0);
                    if (tasks.isEmpty()){
                        break;
                    }
                }
            }
            Collections.sort(queue,new scanComparator(headSegment));
            if ( queue.get(0).getSegment()>= headSegment) {
                int tym = Math.abs(headSegment - queue.get(0).getSegment());
                result += tym;
                time += tym;
                headSegment = queue.get(0).getSegment();
                queue.remove(0);
            }else {
                time++;
                result++;
                headSegment++;
            }
            if (headSegment >= Main.max){
                headSegment = 0;
            }

        }
        return result;
    }
}
