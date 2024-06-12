package com.coding;

public class Person {
    String name;
    int age;



    static int population;
    public Person(String name,int age){
        population++;
        this.name=name;
        this.age=age;
    }
//    public static void checkStaticKeyword(com.coding.Person p){
//
//        System.out.println(p.age);
//    }
    public static void checkStaticKeyword(){
        Person p3=new Person("vishnu",23);
        System.out.println(p3.age);
    }
    public static int getPopulation() {
        return population;
    }
}
