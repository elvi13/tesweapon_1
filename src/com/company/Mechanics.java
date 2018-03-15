package com.company;

public class Mechanics {
    static void DoAttack (Character target, Character attacker) {
        if (target.getArmor() <= attacker.getWeapon().getdamage())
            target.hp = target.hp - (attacker.getWeapon().getdamage() - target.getArmor());
    }
    static void DoAttack (Character target, Character attacker, int id){
        int armor = target.getArmor();
        int damage = attacker.getWeapon(id).getdamage();
        if (armor <= damage)
            target.hp = target.hp - (damage - armor);
    }


    static void DoAttack2 (Character target, Character attacker, int id){
        if (target.getArmor2() <= attacker.getWeapon(id).getdamage())
            target.hp = target.hp - (attacker.getWeapon(id).getdamage() - target.getArmor2());
    }
}
