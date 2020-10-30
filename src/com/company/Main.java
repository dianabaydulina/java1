package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	float a,b;
        Scanner in = new  Scanner(System.in);
        System.out.println("Введите число a: ");
        a = in.nextFloat();
        System.out.println("Введите число b: ");
        b = in.nextFloat();

        if (a>b)
        {
            System.out.println("Число " + a + " Больше");
        }
        else if (a<b)
        {
            System.out.println("Число " + b + " Больше");
        }
        else {
            System.out.println("Числа равны");
        }

    }
}
/*package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	float a,b;
        Scanner in = new  Scanner(System.in);
        a = in.nextFloat();
        b = in.nextFloat();

        if (a>b)
        {
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }

    }

 */
