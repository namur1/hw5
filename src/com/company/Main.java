package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setChooseBossDefence("Phisical");
        boss.setHealth(1000);
        boss.setDamage(100);
        System.out.println(boss.getHealth() + ", " + boss.getDamage() + ", " + boss.getChooseBossDefence());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + " " + createHeroes()[i].getDamage() + " " + createHeroes()[i].getHeroesAttackType());

        }

    }

    public static Hero[] createHeroes() {
        Hero heroPhisical = new Hero(200, 25, "Phisical");
        Hero heroMagical = new Hero(210, 20, "Magical");
        Hero heroKinetic = new Hero(250, 30, "Kinetic");

        Hero[] superHero = {heroPhisical , heroMagical, heroKinetic};
        return superHero;
    }
}