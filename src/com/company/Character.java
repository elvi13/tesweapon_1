package com.company;

import com.company.items.Armor;
import com.company.items.Item;
import com.company.items.Weapon;

import java.util.ArrayList;

public class Character {
    int hp;
    ArrayList<Item> items;


    int defence;

    Character(int hp_, ArrayList<Item> items_){
        hp = hp_;
        items = items_;
        recalcArmor();
    }
    Weapon getWeapon (){
        for(Item item: items){
            if (item instanceof Weapon){
                Weapon ret = (Weapon)item;
                return ret;
            }
        }
        return null;
    }
    int getArmor() {
        return defence;
    }


    int recalcArmor () {
        defence = 0;
        for (Item item: items){
            if (item instanceof Armor){
                Armor r;
                r = (Armor) item;
                defence = defence + r.getDefence();
            }

        }
        return defence;
    }

    int getArmor2 () {
        int defence2 = 0;
        for (Item item: items){
            if (item instanceof Armor){
                Armor r;
                r = (Armor) item;
                defence2 = defence2 + r.getDefence();
            }

        }
        return defence2;
    }


    Weapon getWeapon (int id){
        for (Item item: items) {
            if (item instanceof Weapon) {
                Weapon ret = (Weapon)item;
                if ( ret != null) {
                    if (ret.getId() == id) {
                        return ret;
                    }
                }
            }
        }
        return null;
    }
void addItem (Item item){
        items.add(item);
}
}
