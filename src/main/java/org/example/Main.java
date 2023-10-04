package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter n:");
        int n=input.nextInt();
         int[] array=new int[n];
         for(int i=0;i<n-1;i++){
             System.out.println("enter number"+(i+1));
             array[i]=input.nextInt();
         }
         for (int i=0;i<n;i++){
             for(int j=0;j<n-1;j++){
                 if(array[j]>array[j+1]){
                     int temp=array[j];
                     array[j]=array[j+1];
                     array[j+1]=temp;

                 }
             }
         }
            for(int i=0;i<n;i++)
            {

                System.out.println(array[i]);
            }
    }
}