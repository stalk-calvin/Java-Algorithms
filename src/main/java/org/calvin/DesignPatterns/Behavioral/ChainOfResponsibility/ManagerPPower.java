/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.ChainOfResponsibility;

class ManagerPPower extends PurchasePower {
    protected double getAllowable(){
        return BASE*10;
    }

    protected String getRole(){
        return "Manager";
    }
}
