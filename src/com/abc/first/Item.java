package com.abc.first;

public class Item {

    // 'com.abc.first.Item'  will create both the class 'Item' while creating the com.abc.first packagee at the samee time
    //do this by creaitng new class and inputting com.abc.first.Item

    private String type;

    public Item (String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" + "type='" + type + '\'' + '}';
    }
}
