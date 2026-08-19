package com.example;
public class App{
    public static void main(String[] args) {
    System.out.println("===CI/CD pipeline Execution(no Maven!)===");
    System.out.println("Hello world from Raw jenkins!");
    System.out.println("Calculation Result (5+10):"+add(5 ,10));

    }
public static int add(int a,int b){
    return a+b;
}
}