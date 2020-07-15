package com.company;

public class Cup {

    private String color;
    private double volume;
    public double volumeOfLiquid;
    private String liquid;

    public Cup(){
        this.volume=0.2;
        this.volumeOfLiquid=0.15;
        this.color = "white";
        this.liquid = "green tea";
    }

    public Cup(String color,double volume){
        this.color=color;
        this.volume=volume;
    }
    public Cup(String color,double volume,String liquid, double volumeOfLiquid){
        this.color=color;
        this.volume=volume;
        this.volumeOfLiquid=volumeOfLiquid;
        this.liquid=liquid;
    }




    public void setVolume(double volume) {
        this.volume = volume;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public double getVolume(){
        return this.volume;
    }
    public String getLiquid(){
        return this.liquid;
    }
    public void fillCup(String liquid,double volumeOfLiquid){
        if(volumeOfLiquid<0) {
            System.out.println("ERROR: Invalid value");
            return;
        }
        if(liquid!=this.liquid){
            this.liquid=liquid;
            this.volumeOfLiquid = 0;
        }
        if(this.volumeOfLiquid+volumeOfLiquid<=this.volume)
            this.volumeOfLiquid+=volumeOfLiquid;
        else
            this.volumeOfLiquid=this.volume;
    }
    public void emptyCup(){
        this.liquid = null;
        this.volumeOfLiquid = 0;
    }
    public void allOut(){
    System.out.println("This cup is "+color);
    System.out.println("It's volume is "+volumeOfLiquid+" L");
    System.out.println(volumeOfLiquid!=volume?"This cup contains "  +volumeOfLiquid + " milliliters of "+liquid:"It's full of "+liquid);
    }


}
