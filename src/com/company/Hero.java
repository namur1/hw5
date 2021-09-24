package com.company;

public class Hero {
    private int Health;
    private int Damage;
    private String HeroesAttackType;

    public Hero(int health, int damage, String heroesAttackType) {
        Health = health;
        Damage = damage;
        HeroesAttackType = heroesAttackType;
    }

    public void onlyHealthAndDamage(int health, int damage) {
        Health = health;
        Damage = damage;
    }

    public int getHealth() {
        return Health;
    }

    public int getDamage() {
        return Damage;
    }

    public String getHeroesAttackType() {
        return HeroesAttackType;
    }
}