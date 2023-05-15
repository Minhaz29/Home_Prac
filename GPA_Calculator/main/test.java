package main;
import java.util.Scanner;

import GPA.GPA_cal;
public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GPA_cal grd = new GPA_cal();

        System.out.println("Please Input how many subject are there: ");
        int n = sc.nextInt();
        System.out.println("Please Input the Marks below.");
        double grad;
        double grad2 = 0;
        for(int i =0; i<n;i++){
            int marks = sc.nextInt();
            grad=grd.grade(marks);
            if(grad==0) {
                System.out.println("Fail!");
                break;
            }
            grad2= grad + grad2;
        }
        System.out.printf("Your GPA grade is is: %.1f",grad2/n);
    }
}