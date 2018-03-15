package com.company.items;

public class Weapon extends Item {
    int attack;
    int id;
    Weapon(int attack_, int id_){
        super(id_, Type.Weapon);
        attack = attack_;
        id = id_;
    }
    public int getdamage () {
        return attack;
    }

}
