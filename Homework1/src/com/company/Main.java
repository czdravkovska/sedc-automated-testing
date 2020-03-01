package com.company;


public class Main {


    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
    }

    private static void Task1() {
        System.out.println("Task 1 start");
        int i;
        i = 5;
        int j;
        j = 10;
        System.out.println(i);
        System.out.println(j);
        System.out.println("Task 1 end\r\n");
    }

    private static void Task2() {
        System.out.println("Task 2 start");
        int i;
        i = 10;
        int j;
        j = 5;
        double mult = i * j;
        String result = String.format("i=%d,j=%d,mult=%f", i, j, mult);
        System.out.println(result);
        System.out.println("Task 2 end\r\n");
    }

    private static void Task3() {
        System.out.println("Task 3 start");
        int i;
        i = 10;
        int j;
        j = 5;
        int  result  = i *j;
        int  sum = i + j;
        System.out.println("The sum of the given numbers:" + sum);
        System.out.println("The product of the given numbers:" + result);
        System.out.println("Task 3 end\r\n");
    }

     private static void Task4() {
         System.out.println("Task 4 start");
         int numberOne = 7;
         String name = "apple";
         int numberTwo = numberOne + 10;
         System.out.println(String.format("There are only %d apples on the table", numberOne));
         System.out.println(String.format("There are only %d apples now", numberTwo));
         System.out.println("Task 4 end\r\n");
    }

    private static void Task5() {
        System.out.println("Task 5 start");
        int x = 15;
        int y = 2;
        float result = (x + y) / y;
        System.out.println("Division = " + result);
        System.out.println("Task 5 end\r\n");
    }
}
