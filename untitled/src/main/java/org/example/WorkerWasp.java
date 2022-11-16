package org.example;

public class WorkerWasp {
    public static void main(String[] args) {

        int hitPoints = 68;
        int attackDmg = 10;

        int newHP = hitPoints - attackDmg;


        System.out.println("Worker Wasp HP: "+ newHP + "/68");

    }
}
