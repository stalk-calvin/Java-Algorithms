/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            int digit = (n - 1) % 26;
            char excel = (char) (digit + 65);
            result.insert(0, excel);
            n = (n - 1) / 26;
        }
        log.info("Conversion Done: " + result);
        return result.toString();
    }
}
