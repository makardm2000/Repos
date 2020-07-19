package com.company;

public class Car {
    public String color;
    private String brand;
    short maxSpeed;
    short curSpeed;
    byte curGear;
    boolean trailerMount;
    double weight;
    static byte numberOfWheels;
    Man[] passengers = new Man[4];
    {
        numberOfWheels =4;
        curGear = 0;
        curSpeed = 0;
        passengers[0] = new Man("Alex",21,false);
        passengers[1] = new Man("Ivan",19,true);
        passengers[2] = new Man("Dasha",40,false);
        passengers[3] = new Man("Misha",39,true);
    }

    Car(){
        color = "white";
        brand = "KIA";
        maxSpeed=200;
        trailerMount =false;
        weight = 75;
    }

    Car(String color,String brand,int maxSpeed,boolean trailerMount, double weight){
        this.weight=weight;
        this.color = color;
        this.brand = brand;
        this.trailerMount = trailerMount;
        this.maxSpeed=(short)maxSpeed;

    }

    public short getCurSpeed() {
        return curSpeed;
    }

    public short getMaxSpeed() {
        return maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public byte getCurGear() {
        return curGear;
    }

    public double getWeight() {
        return weight;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setCurSpeed(int speed){
        curSpeed=(short)speed;
    }
    public void setCurGear(byte gear){
        curGear=gear;
    }
    public void printAllMainCarData(){
        System.out.println("This car is "+color+' '+brand+". It's maximum speed is "+maxSpeed+". Weight - "+weight+".");
        System.out.println("Current speed is "+curSpeed+". Current gear is "+curGear+'.');

    }
    private void changeGear(){
        if(curGear<0) curGear=-1;else
        if(curSpeed==0) curGear=0;else
        if(curSpeed<20) curGear=1;else
        if(curSpeed<40) curGear=2;else
        if(curSpeed<60) curGear=3;else
        if(curSpeed<80) curGear=4;else
            curGear=5;
    }
    private void changeSpeed(int speed){
        if(curSpeed+speed>maxSpeed){
            curSpeed=maxSpeed;
        }
        else
            if(curSpeed+speed<-10) curSpeed=-1;
            else curSpeed+=speed;
        changeGear();
    }
    public void accelerating(int max){
        System.out.println("Car is accelerating");
        do {
            System.out.println("Current speed: " + curSpeed + "\nCurrent gear: " + curGear);
            changeSpeed(10);
        }while(max>curSpeed);
}
    public void setPassenger(String name,int age,boolean driverLicense,int place){
        this.passengers[place]=new Man(name,age,driverLicense);
    }
    public void printAllMainPassengersData(){
        for(Man i:passengers) {
            if(i==null) continue;
            System.out.print((i==passengers[0]?"Driver":"Passenger")+" is "+i.name+" age "+i.age+',');
            System.out.println(" who"+ (i.driverLicense?" can":" can't")+" drive car.");
        }
    }
    public void mySort(){
        for(Man i:passengers)if(i==null){
            System.out.println("Sorry, but it's only alpha-version. You need all 4 passengers to activate this function :(((");
            return;
        }

        Man temp=null;
        for(int i=0;i<passengers.length-1;++i){//Да, коряво... Да, можно было сделать лучше... НО ОНО РАБОТАЕТ!

            if(((passengers[i].age)<(passengers[i+1].age))){
                temp = passengers[i];
                passengers[i]=passengers[i+1];
                passengers[i+1]=temp;
            }
        }

        if(!passengers[0].driverLicense){
            for(int i=1;i<passengers.length;++i){
                if(passengers[i].driverLicense){
                    temp=passengers[i];
                    passengers[i]=passengers[0];
                    passengers[0]=temp;
                    break;
                }
        }

        for(int i=1;i<passengers.length-1;++i){
            if(((passengers[i].age)<(passengers[i+1].age))){
                temp = passengers[i];
                passengers[i]=passengers[i+1];
                passengers[i+1]=temp;
            }
        }
        }
    }
}
