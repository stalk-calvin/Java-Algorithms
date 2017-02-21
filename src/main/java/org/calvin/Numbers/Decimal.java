/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Numbers;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Decimal {
    public static double brokenCalculation(double funds) {
        int itemsBought = 0;
        for (double price = .10; funds >= price; price += .10) {
            funds -= price;
            itemsBought++;
        }
        log.info(itemsBought + " items bought.");
        log.info("Change: $" + funds);
        return funds;
    }

    public static BigDecimal bigDecimalCalculation(BigDecimal funds) {
        if (funds == null) return funds;
        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemsBought = 0;
        for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price
                .add(TEN_CENTS)) {
            itemsBought++;
            funds = funds.subtract(price);
        }
        log.info(itemsBought + " items bought.");
        log.info("Money left over: $" + funds);
        return funds;
    }

    public static int integerCalculation(int funds) {
        int itemsBought = 0;
        for (int price = 10; funds >= price; price += 10) {
            itemsBought++;
            funds -= price;
        }
        log.info(itemsBought + " items bought.");
        log.info("Money left over: " + funds + " cents");
        return funds;
    }
}
