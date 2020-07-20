package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's create some cars");
        Car kia=new Car();
        Car bmw=new Car("Black","BMW",250,false,100);
        Car.setSpeedLimit(100);
        kia.printAllMainCarData();
        bmw.printAllMainCarData();
        kia.printAllMainPassengersData();
        System.out.println("Hmmm... Driver hasn't driver license. Let's fix it!");
        System.out.println("***LET'S SORT THEM***");
        kia.mySort();
        kia.printAllMainPassengersData();
        System.out.println("Let's change passenger");
        kia.setPassenger("Viktor",50,true,2);
        kia.printAllMainPassengersData();
        System.out.println("    ***LET'S SORT THEM***");
        kia.mySort();
        kia.printAllMainPassengersData();
        System.out.println("\n\n");
        Car[] array1 = new Car[3];


        for(int i = 0;i<array1.length;++i){
            array1[i]=new Car();
        }

        Car[] array2 = {new Car("Blue","Audi",220,true,90),
                new Car("Yellow","Mazda",190,false,80)};

        System.out.println("Array 1:");
        for(Car i:array1){
            System.out.println();
            i.printAllMainCarData();
            System.out.println();
        }
        System.out.println("Array 2:");
        for(Car i:array2){
            System.out.println();
            i.printAllMainCarData();
            System.out.println();
        }
        kia.accelerating(100);
        kia.printAllMainCarData();


    }}
