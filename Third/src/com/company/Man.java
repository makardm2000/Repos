package com.company;

public class Man {
    public String name;
    public int age;
    public boolean driverLicense;
    Man(){
        name="Unknown";
        age = -1;
        driverLicense=false;
    }
    Man(String name,int age,boolean driverLicense){
        this.driverLicense=driverLicense;
        this.age=age;
        this.name=name;
    }

}
