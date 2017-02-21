/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.Observer;

public abstract class Observer {
    protected Subject subj;
    public abstract void update(int in);
}
