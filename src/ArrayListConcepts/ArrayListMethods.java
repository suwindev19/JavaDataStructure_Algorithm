package ArrayListConcepts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {
    public static void main(String[] args) {
//        String s1 = "Ramen  "; //5
//        String s2 = new String("Takoyaki"); //8
////        System.out.println(s1.length());
////        System.out.println(s1.charAt(4));
////        System.out.println(s1.substring(2));
////        System.out.println(s1.concat(" " + s2));
//        System.out.println(s1.indexOf("men"));
//        System.out.println(s1.indexOf('m', 3));
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s1.toLowerCase());
//        System.out.println(s1.trim());
//        System.out.println(s1.replace('m', 'f'));

//        ArrayList<E> ar3 = new ArrayList<E>(); // Generally you don't use this. E is for generic.
//
//        // Employee class Objects;
//        Employee e1 = new Employee("Su", 23, "Software Developer");
//        Employee e2 = new Employee("Somo", 24, "Software Developer - Java");
//        Employee e3 = new Employee("Susan", 23, "Software Developer - Front End");
//
//        // create arrayList
//        ArrayList<Employee> ar4 = new ArrayList<Employee>();
//        ar4.add(e1);
//        ar4.add(e2);
//        ar4.add(e3);
//
//        // Iterator to traverse the values
//        Iterator<Employee> it1 =  ar4.iterator();
//        // iterator works on the basis of indexes, therefore use while loop instead of for loop
//        while(it1.hasNext()){
//            Employee emp =  it1.next();
//            System.out.println(emp.name);
//            System.out.println(emp.age);
//            System.out.println(emp.department);
//
//        }

        //**********************************
        // addAll()
//        ArrayList<String> ar5 = new ArrayList<String>();
//        ar5.add(("Java"));
//        ar5.add("Spring Boot");
//        ar5.add("Open Source");
//
//        ArrayList<String> ar6 = new ArrayList<String>();
//        ar6.add(("Tokyo"));
//        ar6.add("Osaka");
//        ar6.add("Nagoya");
//
//        ar5.addAll(ar6);
//        for(int i = 0; i < ar5.size(); i++){
//            System.out.print(ar5.get(i) + " ");
//        }
//        System.out.println("*****************");
//        ar5.removeAll(ar6);
//        for(int i = 0; i < ar5.size(); i++){
//            System.out.print(ar5.get(i) + " ");
//        }
//        //retainAll()
//
        ArrayList<String> ar7 = new ArrayList<String>();
        ar7.add(("Java"));
        ar7.add("Spring Boot");
        ar7.add("Open Source");

        ArrayList<String> ar8 = new ArrayList<String>();
        ar8.add(("Tokyo"));
        ar8.add("Osaka");
        ar8.add("Spring Boot");
        //***
        System.out.println("**************");
        ar7.retainAll(ar8);
        for(int i = 0; i < ar7.size(); i++){
            System.out.print(ar7.get(i) + " ");
        }



    }
}
