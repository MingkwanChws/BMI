package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float weight;
        float high;
        float BMI;
        Scanner kmitl = new Scanner (System.in);
        System.out.println("Enter weight");
        weight = kmitl.nextFloat();
        System.out.println("Enter high(m)");
        high = kmitl.nextFloat();
        BMI = weight/(high*high);
        System.out.printf("BMI = %.2f\n", BMI);
        if (BMI < 18.5) {

            System.out.println("Underweight");
        }else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Healthy");
        }else if (BMI>=25 && BMI<=29.9) {
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
