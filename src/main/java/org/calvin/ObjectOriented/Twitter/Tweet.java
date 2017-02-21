/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.ObjectOriented.Twitter;

import lombok.Data;

@Data
public class Tweet {
    private static int timeStamp=0;

    private int id;
    private int time;
    private Tweet next;

    Tweet(int id) {
        this.id = id;
        time = timeStamp++;
        next = null;
    }
}
