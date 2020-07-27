package com.company;


public class Main {

  public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
  }

  static public void task1(){
    System.out.println("\t*** №1 ***");
    System.out.print("Создайте число.");
    Integer[] q1 = {17,171,7,433};String str1;
    System.out.println("Определите, является ли последняя цифра числа семеркой.");

    for(Integer i:q1) {
      str1 = i.toString();
      System.out.println(i+(!(str1.charAt(str1.length()-1)=='7')?" не":"")+" оканчивается на 7");
    }
  }

  static public void task2(){
    System.out.println("\t*** №2 ***");
    System.out.print("Имеется прямоугольное отверстие размерами a и b, определить, можно ли его");
    System.out.println(" полностью закрыть круглой картонкой радиусом r.");
    int[][] arr={{1,4},{4,5},{1,100},{4,1},{4,4}};
    int[] rArr={5,6,10,3,5};
    for(int i=0;i<arr.length;++i) {
      System.out.print("Картонка радусом ");
      System.out.print(rArr[i]+((arr[i][1]*arr[i][0]<rArr[i]*rArr[i])?" ":" не "));
      System.out.println("может закрыть дыру размером "+arr[i][1]+" на "+arr[i][0]);
    }
  }

  static public void task3(){
    System.out.println("\t*** №3 ***");
    System.out.print("Имеется целое число (любое), это число — сумма денег в рублях. Вывести");
    System.out.println(" это число, добавив к нему слово «рублей» в правильном падеже.");
    Integer[] q1 = {17,171,7,433};String str1;
    for(Integer i:q1) {
      str1 = i.toString();
      System.out.print("У нас имеется "+i+' ');
      if(str1.length()<2){
        switch (i){
          case 1: System.out.println("рубль"); break;
          case 2:
          case 3:
          case 4: System.out.println("рубля"); break;
          default:System.out.println("рублей");
        }
      }
      else if(str1.charAt(str1.length()-2)==1){
        System.out.println("рублей");
      }
      else switch(str1.charAt(str1.length()-1)){
          case '1': System.out.println("рубль"); break;
          case '2':
          case '3':
          case '4': System.out.println("рубля"); break;
          default:System.out.println("рублей");
        }
    }
  }

  static public void task4(){
    System.out.println("\t*** №4 ***");
    Integer[][] arr = {{31,12,2010},{28,2,2000},{28,2,2001},{18,2,2001},{27,7,2020}};
    for(Integer[] i:arr){
      System.out.print("Сегодня "+i[0]+'|'+i[1]+'|'+i[2]+" значит завтра ");
      if(i[0]<28) {
        System.out.println((i[0] + 1) + "|" + i[1] + "|" + i[2]);
      }
      else
      if(i[1]==2){
        if(i[2]%4!=0||i[0]==29){
          System.out.println(1 + "|" + (i[1]+1) + "|" + i[2]);
        }
        else System.out.println((i[0] + 1) + "|" + i[1] + "|" + i[2]);
      }
      else
        switch (i[1]){
          case 1:
          case 3:
          case 5:
          case 7:
          case 8:
          case 10:if(i[0]==31){
            System.out.println(1 + "|" + (i[1]+1) + "|" + i[2]);
          }
            break;
          case 12:if(i[0]==31){
            System.out.println(1 + "|" + 1 + "|" + (i[2]+1));
          }
            break;

          default:
            if(i[0]==30){
              System.out.println(1 + "|" + i[1]+1 + "|" + i[2]);
            }

        }

    }
  }

  static public void task5(){
    System.out.println("\t*** №5 ***");
    System.out.print("Имеются два дома размерами a на b и c на d. Имеется участок размерами ");
    System.out.print("e на f. Проверить помещаются ли эти дома на данном участке. Стороны домов —");
    System.out.println(" параллельны сторонам участка, в остальном размещение может быть любым.");
    int[][][] arrHouse = {{{3,4},{4,3}},{{2,2},{2,3}}};
    int[][] arrPlace = {{6,8},{4,4}};

    for(int i = 0;i<arrHouse.length;++i){
      System.out.print("Дома площадью "+arrHouse[i][0][0]+ " на " +arrHouse[i][0][1]+" и ");
      System.out.print(arrHouse[i][1][0]+ " на " +arrHouse[i][1][1]);
      System.out.print(" на участке "+arrPlace[i][0]+" на "+arrPlace[i][1]);
      boolean doesItCan=false;

    }
  }

}

