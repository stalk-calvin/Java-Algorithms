/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Behavioral.ChainOfResponsibility;

abstract class PurchasePower {
    protected static final double BASE = 500;
    protected PurchasePower reportTo;

    abstract protected double getAllowable();
    abstract protected String getRole();

    public void setReportTo(PurchasePower reportTo) {
        this.reportTo = reportTo;
    }

    public void processRequest(PurchaseRequest request){
        if (request.getAmount() < this.getAllowable()) {
            System.out.println(this.getRole() + " will approve $" + request.getAmount());
        } else if (reportTo != null) {
            reportTo.processRequest(request);
        } else {
            System.out.println(this.getRole() + " unable to approve $" + request.getAmount());
        }
    }
}
