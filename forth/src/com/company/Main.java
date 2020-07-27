package com.company;


public class Main {

    public static void main(String[] args) {
	  System.out.println("\t*** №1 ***");
	  System.out.print("Создайте число.");
	  Integer[] q1 = {17,171,7,433};
	  System.out.println("Определите, является ли последняя цифра числа семеркой.");
      String str1;
	  for(Integer i:q1) {
      str1 = i.toString();
      System.out.println(i+(!(str1.charAt(str1.length()-1)=='7')?" не":"")+" оканчивается на 7");
	  }
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

}
