package org.example;

public class Wasp {

    int HitPoints;
    int damage;
    String name;

    public Wasp(int HitPoints, int damage, String name){
        this.HitPoints= HitPoints;
        this.damage= damage;
        this.name = name;
    }
    public static void main(String[] args) {

    Wasp QueenWasp = new Wasp (80, 7, "Queen Wasp");
    Wasp WorkerWasp = new Wasp (68, 10, "Worker Wasp");
    Wasp DroneWasp = new Wasp(60, 12,"Drone Wasp");




        System.out.println(QueenWasp.HitPoints + " " + QueenWasp.damage + " " + QueenWasp.name);
        System.out.println(WorkerWasp.HitPoints + " " + WorkerWasp.damage + " " + WorkerWasp.name);
        System.out.println(DroneWasp.HitPoints + " " + DroneWasp.damage + " " + DroneWasp.name);




    }
}
