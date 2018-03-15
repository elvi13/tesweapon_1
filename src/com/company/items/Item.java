package com.company.items;

public class Item {
    enum Type {
        Weapon, Armor
    }

    /////////////////

    int id;
    Type type;



    Item(int id_, Type type_) {
        id = id_;
        type = type_;
    }
    public int getId () {
        return id;
    }
}
