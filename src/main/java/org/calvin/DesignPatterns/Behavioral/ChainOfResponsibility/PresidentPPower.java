/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.ChainOfResponsibility;

class PresidentPPower extends PurchasePower {
    protected double getAllowable(){
        return BASE*40;
    }

    protected String getRole(){
        return "President";
    }
}
