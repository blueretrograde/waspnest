package org.example;

public class QueenWasp {
    public static void main(String[] args) {

        int hitPoints = 80;
        int attackDmg = 7;

        int newHP = hitPoints - attackDmg;


        System.out.println("Queen Wasp HP: "+ newHP + "/80");
    }
}
