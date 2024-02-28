package wondrous;

import java.util.ArrayList;
import java.util.List;

public class Wondrous {

    private final int MY_MAGIC_NUMBER = 42;

    public List<Integer> wondrous(int start) {
        int current = start;
        List<Integer> sequence = new ArrayList<Integer>();
        
        if (start < 1) {
            throw new IllegalArgumentException("Start cannot be less than 1");
        }

        if (start == 1) {
            return sequence;
        }

        while (true) {
            sequence.add(current);
            if (current == 1) break;
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current = (current * 3) + 1;
            }
        }

        return sequence;
    }

}