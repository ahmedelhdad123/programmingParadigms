package com.proramming.paradigms.task1;

import java.util.function.BiFunction;

public class Task1 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> add= (x,y) -> x+y;
        int sum = add.apply(1,2);
        System.out.println(sum);
    }
}
/*
  JS
//Assign function
const add = (a, b) => a + b;
//Use function
console.log(add(3, 4));
 */
