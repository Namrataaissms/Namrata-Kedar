package Overriding_programs;

public class Vehicle {
    void wash() {
        System.out.println("Wash the vehicle at home");
    }
    }
    class Bike extends Vehicle {
        void wash() {
            System.out.println("wash the vehicle at garage");
        }

        public static void main(String args[]){
            Bike b = new Bike();
            b.wash();
        }
    }

