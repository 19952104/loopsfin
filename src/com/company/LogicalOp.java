package com.company;

public class LogicalOp {

    public void printToHundred(int number) {

        for (int i = number; i <= 100; i++) {
            System.out.println("Numarul este " + i);
        }
    }

    public void printFromHundred(int first, int second) {
        for (int i = first; i >= second; i--) {
            System.out.print(i + ",");
        }
    }

    public void printHundred(int a) {

        for (int i = a; i <= -100; i++) {
            System.out.println("Numarul este " + i);
        }
        ;
    }
    //Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
    // atunci numaratoarea sa fie de la y la x).

    public void printTheGreatest(int b, int c) {
        for (int i = b; b > c; c++) {
            //System.out.println("Numarul este " + c);
        }
        System.out.println("Numarul esteee " + c);
    }

    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void evenNumber(int d) {
        for (int i = d; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " ");
                System.out.println("Even numbers from 1 to " + d + "are :");
            }
        }
    }

    public void oddNumber(int e) {
        for (int i = e; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " ");
                System.out.println("Odd number from 1 to " + e + "are :");
            }
        }
    }

    public void calculateSum(int num) {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println(suma);


    }

    public void calculateAverage(int m) {

        float average = 0;
        int sum = 0;
        for (int i = m; i <= 100; i++) {
            sum += i;
            average = sum / (100 - m);
        }
        System.out.println(sum);
        System.out.println(average);


    }

    public void rightTriangle(int n) {

        int rows = 5;
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}




