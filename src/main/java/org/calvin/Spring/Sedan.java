/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.Spring;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service("sedan")
public class Sedan implements Car {
    private String color;

    @Override
    public String getSize() { return "Medium"; }
    @Override
    public int getNumberOfWheels() { return 4; }
    @Override
    public String getColor() { return color; }

}
