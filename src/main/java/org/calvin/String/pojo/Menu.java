/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String.pojo;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Menu {
    @SerializedName("header")
    private String header = null;

    @SerializedName("items")
    private List<MenuItem> menuItems = new ArrayList<>();
}