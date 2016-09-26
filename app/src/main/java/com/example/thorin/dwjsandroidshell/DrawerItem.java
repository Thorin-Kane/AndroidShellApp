package com.example.thorin.dwjsandroidshell;

/**
 * Created by Thorin on 9/25/2016.
 */
public class DrawerItem {
    String ItemName;

    public DrawerItem(String itemName, int imgResID) {
        super();
        ItemName = itemName;
    }

    public String getItemName() {
        return ItemName;
    }
    public void setItemName(String itemName) {
        ItemName = itemName;
    }
}
