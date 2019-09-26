package org.calvin.Arrays;

import lombok.Data;

@Data
public class Interval {
    int start;
    int end;

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}
