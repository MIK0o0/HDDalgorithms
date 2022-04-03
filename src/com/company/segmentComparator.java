package com.company;

import java.util.Comparator;

public class segmentComparator implements Comparator<Task> {
    private int headSegemnt;
    public segmentComparator(int headSegemnt){
        this.headSegemnt = headSegemnt;
    }
    @Override
    public int compare(Task p1, Task p2) {
        int tym = Math.abs(p1.getSegment() - headSegemnt) - Math.abs(p2.getSegment()- headSegemnt);
        if (tym == 0){
            return 0;
        }else if (tym > 0){
            return 1;
        }else {
            return -1;
        }
    }
}
