/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.NullObject;

import java.io.OutputStream;

public class NullOutputStream extends OutputStream {
    public void write(int b) {
        // do nothing
    }
}
