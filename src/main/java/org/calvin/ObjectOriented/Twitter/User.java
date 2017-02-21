/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.ObjectOriented.Twitter;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class User {
    private int id;
    private Set<Integer> followed;
    private Tweet tweetHead;

    User(int id) {
        this.id = id;
        followed = new HashSet<>();
        follow(id); // first follow itself
        tweetHead = null;
    }

    void follow(int id) {
        followed.add(id);
    }

    void unfollow(int id) {
        followed.remove(id);
    }

    // everytime user post a new tweet, add it to the head of tweet list.
    void post(int id) {
        Tweet t = new Tweet(id);
        t.setNext(tweetHead);
        tweetHead = t;
    }
}
