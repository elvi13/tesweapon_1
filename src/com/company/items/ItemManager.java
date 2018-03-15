package com.company.items;

public class ItemManager {
    public static Item CreateItemById (int id){
        switch (id){
            case 1 : return new Weapon(10, id);
            case 2 : return new Weapon(5, id);
            case 3 : return new Armor(id, 2);
            case 4 : return new Armor(id, 4);
            default: return null;
        }
    }
}
