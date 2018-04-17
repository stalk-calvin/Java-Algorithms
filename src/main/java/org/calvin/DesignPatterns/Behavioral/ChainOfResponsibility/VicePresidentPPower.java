/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.ChainOfResponsibility;

class VicePresidentPPower extends PurchasePower {
    protected double getAllowable(){
        return BASE*40;
    }

    protected String getRole(){
        return "Vice President";
    }
}
