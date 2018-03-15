package com.company;

import com.company.items.Item;
import com.company.items.ItemManager;
import com.company.items.Weapon;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item> vasyaItems = new ArrayList<>();
        vasyaItems.add(ItemManager.CreateItemById(1));
        vasyaItems.add(ItemManager.CreateItemById(2));
        vasyaItems.add(ItemManager.CreateItemById(3));


        ////////////////////хуй//////////////////////////
        ArrayList<Item> petyItems = new ArrayList<>();
        petyItems.add(ItemManager.CreateItemById(2));
        petyItems.add(ItemManager.CreateItemById(4));

        Character Vasya = new Character(55, vasyaItems);
        Character Petya = new Character(50, petyItems);



        Mechanics.DoAttack(Petya, Vasya);
        System.out.println(Petya.hp);



        for (int i = 0; i < 50000000; i ++ )
            Petya.addItem(ItemManager.CreateItemById(3));
        Petya.recalcArmor();

        long old = System.currentTimeMillis();
        for(int i = 0 ; i< 10; i++) {
            Mechanics.DoAttack(Petya, Vasya, 2);
        }
        System.out.println(Petya.hp);
        System.out.println(System.currentTimeMillis() - old);

        old = System.currentTimeMillis();
        for(int i = 0 ; i< 10; i++) {
            Mechanics.DoAttack2(Petya, Vasya, 2);
        }
        System.out.println(Petya.hp);
        System.out.println(System.currentTimeMillis() - old);

    }
}
