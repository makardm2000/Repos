package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");
        Cup cupOfTea = new Cup();

        System.out.println(" volume of cup is "+cupOfTea.getVolume());
        System.out.println(" color of this cup is "+cupOfTea.getColor());
        System.out.println(" liquid in the cup is "+cupOfTea.getLiquid());
        System.out.println(" volume of liquid in the cup is "+cupOfTea.volumeOfLiquid);

        System.out.println("Let's create new cup!");
        Cup cupOfCoffee = new Cup("green",0.3,"coffee",0.18);
        System.out.println(" color of this cup is "+cupOfCoffee.getColor());
        System.out.println("Let's do some magic!");
        cupOfCoffee.setColor("blue");
        System.out.println(" Now color of this cup is "+cupOfCoffee.getColor());
        System.out.println(" volume of cup is "+cupOfCoffee.getVolume());
        System.out.println(" liquid in the cup is "+cupOfCoffee.getLiquid());
        System.out.println(" volume of liquid in the cup is "+cupOfCoffee.volumeOfLiquid);
        System.out.println("\n\n");
        System.out.println("*** NEW TASK ***\n");
        System.out.println("Let's check our cup of coffee:");
        cupOfCoffee.allOut();
        System.out.println("Let's make this cup empty");
        cupOfCoffee.emptyCup();
        cupOfCoffee.allOut();
        System.out.println("This cup is empty... It doesn't look well. \nLet's fix it!");
        cupOfCoffee.fillCup("Vodka",0.5);
        cupOfCoffee.allOut();
        System.out.println(cupOfCoffee.getLiquid()=="Vodka"?"Нау ит лукс вэлл! Хэв э грэйт дэй виз "+cupOfCoffee.getLiquid()+" май диар комрад :)":"Now it looks well. Have a nice day with "+cupOfCoffee.getLiquid()+"!");

    }
}
