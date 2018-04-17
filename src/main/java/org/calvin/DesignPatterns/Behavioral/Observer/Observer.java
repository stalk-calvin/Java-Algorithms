/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.Observer;

public abstract class Observer {
    protected Subject subj;
    public abstract void update(int in);
}
