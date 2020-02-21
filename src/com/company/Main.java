package com.company;

public class Main {

    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        int number = 101;
        op.printToHundred(21);

        int first = 100;
        int second = 20;
        op.printFromHundred(10, 2);

        int a = -101;
        op.printHundred(-105);

        int b = 10;
        int c = 5;
        op.printTheGreatest(10, 6);

        int d = 100;
        op.evenNumber(21);

        int e = 100;
        op.oddNumber(21);

        int num = 100;
        op.calculateSum(88);

        int m = 98;
        op.calculateAverage(9);

        //int n = 5;
        op.rightTriangle(5);
    }
}
