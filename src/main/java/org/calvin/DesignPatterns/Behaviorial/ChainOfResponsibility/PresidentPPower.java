/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behaviorial.ChainOfResponsibility;

class PresidentPPower extends PurchasePower {
    protected double getAllowable(){
        return BASE*60;
    }

    protected String getRole(){
        return "President";
    }
}
