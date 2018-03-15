package com.company.items;

public class Armor extends Item {
    int defence;
    Armor (int id, int defence_){
        super(id, Type.Armor);
        defence = defence_;
    }
    public int getDefence () {
        return defence;
    }
}
