/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String.pojo.json;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MenuItem {
    private String id;
    private String label;
}
